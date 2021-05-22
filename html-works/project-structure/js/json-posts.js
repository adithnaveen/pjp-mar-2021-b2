const URL = "https://jsonplaceholder.typicode.com/posts/";

function getPostById() {
    let postId = document.querySelector("#post-id").value;
 
    fetch(URL +postId)
        .then((resp) =>resp.json())
        .then(resp => {
            console.log("Fetching Data... ");
            putDataToId("userid", resp.userId);
            putDataToId("title", resp.title);
            putDataToId("body", resp.body);
            document.querySelector("#post-id").value =""; 
            document.querySelector("#post-id").focus();
        })
        .catch(err => console.warn("Erro ", err)); 
}

function getAllPosts() {

    fetch(URL)
        .then(resp => resp.json())
        .then(resp => {
            resp.forEach(post => {
                console.log(post.userId +", " + post.title)
            })
        })
    }

function postData() {

    
    let obj = {}; 
    obj.id = getFieldValueById("id");
    obj.title = getFieldValueById("title");
    obj.body = getFieldValueById("body");

    fetch(URL, 
        {
            method:"POST", 
            body:JSON.stringify(obj), 
            headers : {
                "Content-Type": "application/json"    
            }
        })
        .then(resp => resp.json())
        .then(resp => console.log(resp))
        .catch(err => console.log(err))
}
