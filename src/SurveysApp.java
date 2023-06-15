import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import surveys.Statistics;

public class SurveysApp {
    public static void main(String[] args) {
        try {
            // - MySQL workbench 실행 : JDBC
            // - User/password와 접속 IP:port 접속
            String url = "jdbc:mysql://127.0.0.1:3306/db_survey"; 
            // localhost도 가능하나 IP주소를 넣는게 보다 좋음

            // jdbc : java DB connetion , 'https://www.naver.com/'의 구조와 유사 / 원격으로 db_cars에 연결하는 구조를 나열

            String user = "root";
            String password = "!yojulab*";

            //DB 연결
            Connection connection = DriverManager.getConnection(url, user, password);
            System.out.println("DB연결 성공\n");

            // - query Edit
            Statement statement = connection.createStatement();
           
            //통계 - 총 설문자 표시  
            Statistics statistics = new Statistics(); //메서드화 시킬려면 무조건 인스턴스
            statistics.getRespondents(statement);

        } catch (Exception e) {
            // TODO: handle exception
            System.out.println(e.getMessage());
        }
        
    }
}
