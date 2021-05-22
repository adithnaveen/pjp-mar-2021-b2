
function putDataToId(id, data) {
    document.querySelector("#"+id).innerHTML = data;
}

function getFieldValueById(field) {
    return document.getElementById(field).value
}

