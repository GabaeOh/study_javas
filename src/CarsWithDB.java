import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

import javax.lang.model.util.ElementScanner14;

public class CarsWithDB {
    public static void main(String[] args) {
        try {
          // - MySQL workbench 실행 : JDBC
          // - User/password와 접속 IP:port 접속
          String url = "jdbc:mysql://127.0.0.1:3306/db_cars";
          String user = "root";
          String password = "!yojulab*";

          Connection connection = DriverManager.getConnection(url, user, password);
          System.out.println("DB연결 성공\n");

          // - query Edit
          Statement statement = connection.createStatement();
          // 쿼리 초기화 
          String query = "";
        

          // 작동 키 
          Scanner scanner = new Scanner(System.in);
          String workkey = "P";
            while(!workkey.equals("E")){
                System.out.print("선택 입력 : ");
                workkey = scanner.nextLine();

                // 차이름 명단(O를 선택했을때 )
                if (workkey.equals("O")){
                    System.out.println("- 차 이름 명단");
                    query = "SELECT T_FAC.COMPANY, T_CAR_INFOR.CAR_NAME\n" + //
                            "\t, T_CAR_INFOR.CAR_INFOR_ID\n" + //
                            "FROM (factorys AS T_FAC\n" + //
                            "\tJOIN car_infors AS T_CAR_INFOR\n" + //
                            "\tON T_FAC.COMPANY_ID = T_CAR_INFOR.COMPANY_ID)";

                    ResultSet resultSet = statement.executeQuery(query); // 결과 

                    int number = 1; // 추가적으로 부여하는 순번

                    Statement statement2 = connection.createStatement(); // edit창 2개 띄웠으니깐, statement도 2개
                    ResultSet resultSet2; //결과 값도 한개 더 받아야되니깐
                    String query2; 

                    while (resultSet.next()) {
                        System.out.print( number + ". " +
                            resultSet.getString("COMPANY") + " - " +
                            resultSet.getString("CAR_NAME") + ": " );
                        // 옵션과 회사명+브랜명을 붙여주게금 옵션명과 뽑아온 쿼리
                        query2 = "SELECT T_OPT_INFOR.OPTION_NAME\n" + //
                                "FROM option_infors AS T_OPT_INFOR\n" + //
                                "\tJOIN `options` AS T_OPTS\n" + //
                                "    ON T_OPT_INFOR.OPTION_INFOR_ID = T_OPTS.OPTION_INFOR_ID \n" + //
                                "    AND T_OPTS.CAR_INFOR_ID = '"+ resultSet.getString("CAR_INFOR_ID")+"'";
                                // 변수을 넣을 때는 '"+ +"' 안에 넣기 
                        resultSet2 = statement2.executeQuery(query2); //테이블로 값을 받아내기

                        // 옵션이 한개이상이여도 같은행에 옵션들이 붙게금 
                        while(resultSet2.next()){
                            System.out.print(resultSet2.getString("OPTION_NAME") +", "); 
                        }

                        number = number +1 ; // 순번 값 +1씩 증가 
                        System.out.println(); //줄바꿈이 일어남 
                    }

                    // 통계 (S를 선택했을때)
                } else if(workkey.equals("S")){
                    System.out.println("- 통계 시작 -");
                    // 쿼리 추가 
                    query = "SELECT T_FAC.COMPANY, T_CARS_INFO.CAR_NAME, COUNT(*) AS CNT\n" + //
                            "FROM (factorys AS T_FAC\n" + //
                            "\tINNER JOIN car_infors AS T_CARS_INFO\n" + //
                            "    ON T_FAC.COMPANY_ID = T_CARS_INFO.COMPANY_ID)\n" + //
                            "    INNER JOIN `options` AS T_OPT\n" + //
                            "    ON T_CARS_INFO.CAR_INFOR_ID = T_OPT.CAR_INFOR_ID\n" + //
                            "GROUP BY T_FAC.COMPANY_ID, T_CARS_INFO.CAR_INFOR_ID "; 
                    ResultSet resultSet = statement.executeQuery(query); // 결과 
                    while (resultSet.next()) {
                        System.out.println(resultSet.getString("COMPANY") + ", " +
                        resultSet.getString("CAR_NAME") + ", " +
                        resultSet.getInt("CNT") );
                    }

                } else{
                    System.out.println("----- 작업 키 확인: 입력한 값 : "+ workkey);
                }
            }
            System.out.println("----- 작업종료 ------");

        } catch (Exception e) {
            // TODO: handle exception
            System.out.println();
        }
        System.out.println();
    }
}
