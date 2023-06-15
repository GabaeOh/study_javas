import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class SurveysApp {
    public static void main(String[] args) {
        try {
            // - MySQL workbench 실행 : JDBC
            // - User/password와 접속 IP:port 접속
            String url = "jdbc:mysql://127.0.0.1:3306/db_survey"; // 마지막은 db이름으로 "db_cars"
            // localhost도 가능하나 IP주소를 넣는게 보다 좋음

            // jdbc : java DB connetion , 'https://www.naver.com/'의 구조와 유사 / 원격으로 db_cars에 연결하는 구조를 나열

            String user = "root";
            String password = "!yojulab*";

            //DB 연결
            Connection connection = DriverManager.getConnection(url, user, password);
            System.out.println("DB연결 성공\n");

            // - query Edit
            Statement statement = connection.createStatement();
           
            System.out.println("---- 통계 ----");
            // -- 총 설문자 4명 
            String query = " FROM (\n" + //
                    "\t\tSELECT RESPONDENTS_ID, count(*) CNT\n" + //
                    "\t\tFROM statistics\n" + //
                    "\t\tGROUP BY RESPONDENTS_ID\n" + //
                    "        ) AS T_STATIC\n" + //
                    ";"; 
            ResultSet resultSet = statement.executeQuery(query); 
            while(resultSet.next()){ 
                System.out.println(" -- 총 설문자 : " + resultSet.getString("CNT") );
            }
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println(e.getMessage());
        }
        
    }
}
