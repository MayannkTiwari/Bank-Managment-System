package connection;
import java.sql.*;

public class connection {
    Connection connection;
    public Statement statement;
    public connection() {
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/bankSystem","root","P@ssw0rd");
            statement = connection.createStatement();


        }catch(Exception e){
            e.printStackTrace();

            
        }

    }
    
}
