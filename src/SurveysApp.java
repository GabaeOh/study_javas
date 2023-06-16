import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.HashMap;
import java.util.Scanner;

import com.mysql.cj.x.protobuf.MysqlxPrepare.Execute;

import commons.Commons;
import surveys.Statistics;

public class SurveysApp {
    public static void main(String[] args) {
        try {
            // - MySQL workbench 실행 : JDBC
            // - User/password와 접속 IP:port 접속
            String url = "jdbc:mysql://127.0.0.1:3306/db_survey";
            // localhost도 가능하나 IP주소를 넣는게 보다 좋음

            // jdbc : java DB connetion , 'https://www.naver.com/'의 구조와 유사 / 원격으로 db_cars에
            // 연결하는 구조를 나열

            String user = "root";
            String password = "!yojulab*";

            // DB 연결
            Connection connection = DriverManager.getConnection(url, user, password);
            System.out.println("DB연결 성공\n");

            // - query Edit
            Statement statement = connection.createStatement();

            System.out.println("---- 설문자가능 명단 ----");
            // -- - 설문자 가능 명단(가입 완료)
            // -- 1. 홍길동, 2.장길산, 3.신사임당, ...
            String query = "SELECT *\n" + //
                    "FROM respondents ;";
            ResultSet resultSet = statement.executeQuery(query);
            int number = 1; // 이름 앞에 순번을 넣어주기 위함
            Scanner scanner = new Scanner(System.in);

            HashMap<String, String > respondentsInfo = new HashMap<String, String>();
        
            while (resultSet.next()) {
                System.out.print(number + "." + resultSet.getString("respondents") + ", ");
                respondentsInfo.put(String.valueOf(number), resultSet.getString("respondents_ID")); // 번호와 설문자pk를 이어주는 해쉬맵
                number++;
            }
            System.out.println();
            //설문자 선택
            System.out.println("설문자 선택 : ");
            String respondent = scanner.nextLine();
            // -- 설문 시작
            // -- -------- 참조 : poll contents example -------------
            // -- 1. 교수는 수업 전 강의 목표를 명확히 제시하였습니까?
            // -- (1)전혀 아니다. (2)아니다. (3)그렇다. (4)매우그렇다.
            // -- 2. 강의의 내용은 체계적이고 성의있게 구성되었는가?
            // -- (1)전혀 아니다. (2)아니다. (3)그렇다. (4)매우그렇다.
            System.out.println("---- 설문 시작 ----");
            query = "SELECT *\n" + //
                    "FROM questions\n" + //
                    ";";
            resultSet = statement.executeQuery(query);
            number = 1; // 이름 앞에 순번을 넣어주기 위함
            Statement statement_second = connection.createStatement(); // 답항을 받기 위한 
            Commons commons = new Commons();
            while (resultSet.next()) {
                System.out.println(number + "." + resultSet.getString("questions"));
               

                query = "SELECT T_CHO.CHOICE_ID, T_CHO.CHOICE\n" +
                        "FROM question_choice AS T_QUES\n" +
	                    "INNER JOIN choice AS T_CHO\n" +
	                    "ON T_QUES.CHOICE_ID = T_CHO.CHOICE_ID\n" +
                        "AND QUESTIONS_ID = 'Q2'\n";
                ResultSet resultSet_second= statement_second.executeQuery(query);
                int number_second = 1; // 이름 앞에 순번을 넣어주기 위함
                HashMap<String, String> choiceInfor = new HashMap<String, String>();
                while (resultSet_second.next()) {
                    System.out.print(number_second + "." + resultSet_second.getString("CHOICE") + ", ");
                    choiceInfor.put(String.valueOf(number_second), resultSet_second.getString("CHOICE_ID")); 
                    number_second++ ; //답변에 대한 순번
                }
                resultSet_second.close();
                System.out.println();
                //INSERT문 작성 -> 답변을 한 문항에 대한답변을 다 받고(출력까지되어서) INSERT
                System.out.println("답항 선택 : ");
                String choice_key = scanner.nextLine(); // 1, 2, 3으로 답변 
                query = "INSERT INTO statistics\n" + //
                        "(STATISTICS_ID, RESPONDENTS_ID, QUESTIONS_ID , CHOICE_ID)\n" + //
                        "VALUES\n" + //
                        "('"+commons.generateUUID()+"', '"+ respondentsInfo.get(respondent) +"', '"+resultSet.getString("QUESTIONS_ID")+"', '"+choiceInfor.get(choice_key)+"');";
                int result =  statement_second.executeUpdate(query);
                number++; //질문에 대한 순번
            }
            System.out.println();
            // 통계 - 총 설문자 표시
            Statistics statistics = new Statistics(); // 메서드화 시킬려면 무조건 인스턴스
            statistics.getRespondents(statement);

        } catch (Exception e) {
            // TODO: handle exception
            System.out.println(e.getMessage());
        }

    }
}
