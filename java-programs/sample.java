import java.io.FileInputStream;
import java.util.Properties;
import java.sql.*; 


interface DBTypes {
    String DRIVER = "driver";
    String USER = "user"; 
    String PASSWORD = "password"; 
    String URL = "url"; 
}


class GetConnection {
    private Properties prop; 
    private Connection conn = null; 
    public GetConnection() {
        prop = new Properties(); 
        prop.load(new FileInputStream("db.properties"));

    }

    public boolean getMySQLConnection() {

        //2.  loading external driver 
        Class.forName(DBTypes.DRIVER); 
        String url  = getProp(DBTypes.URL); 
        String user = getProp(DBTypes.USER); 
        String  password = getProp(DBTypes.PASSWORD); 

         
        return checkConnection( DriverManager.getConnection(url, user, password)); 

    }

    public String getProp(String key) {
        return prop.getProperty(key); 
    }

    public boolean checkConnection(Connection conn) {
        return conn != null; 
    }

}


 

db.properties
----------------------------
url= "jdbc:mysql://localhost:3306/sapdb"
user = "root"
password = "something"
-------------------------------------------

