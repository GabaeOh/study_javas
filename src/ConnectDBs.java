import java.sql.*; //import은 sql
public class ConnectDBs {
    public static void main(String[] args) {
        try {
            // - MySQL workbench 실행 : JDBC
            // - User/password와 접속 IP:port 접속
            String url = "jdbc:mysql://localhost:3306/db_cars"; // 마지막은 db이름으로 "db_cars"
            String user = "root";
            String password = "!yojulab*";

            //DB 연결
            Connection connection = DriverManager.getConnection(url, user, password);
            System.out.println("DB연결 성공\n");

            // - query Edit
            Statement statement = connection.createStatement();

            String query = " SELECT * FROM factorys"; 
            ResultSet resultSet = statement.executeQuery(query); // 결과값 리턴

            while(resultSet.next()){ // next: 뭉치를 던져줌 
                // resultSet.getString("COMPANY_ID");
                // resultSet.getString("COMPANY");
                System.out.println(resultSet.getString("COMPANY_ID")+""+resultSet.getString("COMPANY") );
            }
            System.out.println();
        } catch (Exception e) {
            // TODO: handle exception
        }
    }
}
