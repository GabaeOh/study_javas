package cars;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

//statment와 connection을 뱉어내는 
public class DBConnections {
    // return 데이터 타입:Statement  
    public Statement createconnection(String url, String user, String password){
         Statement statement;
        try {
            Connection connection = DriverManager.getConnection(url, user, password);
            System.out.println("DB연결 성공\n");
            Statement statement = connection.createStatement();

        } catch (Exception e) {
            // TODO: handle exception
        }
        return  statement;
    }
}
