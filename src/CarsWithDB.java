import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.HashMap;
import java.util.Scanner;

import javax.lang.model.util.ElementScanner14;

import commons.Commons;

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
            while (!workkey.equals("E")) {
                System.out.print("선택 입력 : ");
                workkey = scanner.nextLine();

                // 차이름 명단(O를 선택했을때 )
                if (workkey.equals("O")) {
                    System.out.println("- 차 이름 명단");

                    // 회사명과 브랜드명을 연결한 쿼리
                    query = "SELECT T_FAC.COMPANY, T_CAR_INFOR.CAR_NAME\n" + //
                            "\t, T_CAR_INFOR.CAR_INFOR_ID\n" + //
                            "FROM (factorys AS T_FAC\n" + //
                            "\tJOIN car_infors AS T_CAR_INFOR\n" + //
                            "\tON T_FAC.COMPANY_ID = T_CAR_INFOR.COMPANY_ID)";

                    ResultSet resultSet = statement.executeQuery(query); // 결과

                    int number = 1; // 추가적으로 부여하는 순번

                    Statement statement2 = connection.createStatement(); // edit창 2개 띄웠으니깐, statement도 2개
<<<<<<< HEAD
                    ResultSet resultSet2; // 결과 값도 한개 더 받아야되니깐
                    String query2;
                    HashMap<String, String> carNumberMap = new HashMap<>();
=======
                    ResultSet resultSet2; //결과 값도 한개 더 받아야되니깐
                    String query2; 
                    ""
>>>>>>> cc16993ed3595c635740ad8ebbe747a9d2829a3a

                    while (resultSet.next()) {
                        System.out.print(number + ". " +
                                resultSet.getString("COMPANY") + " - " +
                                resultSet.getString("CAR_NAME") + ": ");

                        String carInforId = resultSet.getString("CAR_INFOR_ID");// 변수화 -> while문에서 2번이나 사용하기때문에
                        carNumberMap.put(String.valueOf(number), carInforId); // 해쉬맵에 값을 넣는 put / valueOf = 넘버를 스트링으로
                                                                              // 바꿔주는/ key : 가상의 순번, value : pk

                        // 옵션과 회사명+브랜명을 붙여주게금 옵션명과 뽑아온 쿼리
                        query2 = "SELECT T_OPT_INFOR.OPTION_NAME\n" + //
                                "FROM option_infors AS T_OPT_INFOR\n" + //
                                "\tJOIN `options` AS T_OPTS\n" + //
                                "    ON T_OPT_INFOR.OPTION_INFOR_ID = T_OPTS.OPTION_INFOR_ID \n" + //
                                "    AND T_OPTS.CAR_INFOR_ID = '" + resultSet.getString("CAR_INFOR_ID") + "'"; // 변수을 넣을
                                                                                                               // 때는 '"+
                                                                                                               // +"' 안에
                                                                                                               // 넣기

                        resultSet2 = statement2.executeQuery(query2); // 테이블로 값을 받아내기

                        // 옵션이 한개이상이여도 같은행에 옵션들이 붙도록
                        while (resultSet2.next()) {
                            System.out.print(resultSet2.getString("OPTION_NAME") + ", ");
                        }

                        number = number + 1; // 순번 값 +1씩 증가
                        System.out.println(); // 줄바꿈이 일어남
                    }
                    // - 차명 번호 입력
                    // pk 값과 가상의 번호(1.,2.,3.,...)에 대한 서로 번호를 연결시켜줘야 함
                    System.out.print("- 차 이름 명단 : ");
                    String CarNumer = scanner.nextLine();
                    // System.out.print("차명 pk : "+ carNumberMap.get(CarNumer));

                    // 선택 가능 옵션들 / 옵션을 선택할 수 있는 번호를 받기
                    System.out.println("- 선택 가능 옵션들");
                    query = "SELECT OPTION_INFOR_ID, OPTION_NAME\n" + //
                            "FROM option_infors";
                    resultSet = statement.executeQuery(query);
                    number = 1;
                    HashMap<String, String> carOptionInfor = new HashMap<>(); // 순번과 옵션pk(OPTION_INFOR_ID)를 연결 // KEY 랑
                                                                              // VALUE값을 연결시켜주기 위해 해쉬맵 사용
                    while (resultSet.next()) { // 번호와 옵션명을 출력
                        System.out.print(number + ", " + resultSet.getString("OPTION_NAME") + ",");
                        carOptionInfor.put(String.valueOf(number), resultSet.getString("OPTION_INFOR_ID")); // 순번과 옵션
                                                                                                            // pk연결하여 값
                                                                                                            // 추가
                        number = number + 1; // 순번 증가 시키기
                    }
                    System.out.println();

                    System.out.print("- 추가 옵션 선택 : ");
                    String optionNumber = scanner.nextLine(); // 옵션을 선택할 수 있는 스캐너
                    System.out.println(carNumberMap.get(CarNumer) + "," + carOptionInfor.get(optionNumber)); // CAR_INFOR_ID과
                                                                                                             // 옵션
                                                                                                             // PK(OPTION_INFOR_ID)를
                                                                                                             // 연결, 원하는
                                                                                                             // 옵션을
                                                                                                             // 해당차(CAR_INFOR_ID)
                                                                                                             // 에 정보를
                                                                                                             // 넣어줘야 되서
                    String carPk = carNumberMap.get(CarNumer);
                    String optionPk = carOptionInfor.get(optionNumber);

                    // DELETE 옵션
                    query = " DELETE FROM `options`\n" + //
                            "WHERE CAR_INFOR_ID = '" + carPk + "' AND OPTION_INFOR_ID = '" + optionPk + "'";
                    int count = statement.executeUpdate(query); // select문을 제외하고는 executeUpdate

                    // INSERT 옵션
                    Commons commons = new Commons();
                    String optionId = commons.generateUUID();
                    query = "INSERT INTO `OPTIONS`\n" +
                            "(OPTION_ID, CAR_INFOR_ID, OPTION_INFOR_ID)\n" +
                            "value\n" +
                            "('" + optionId + "', '" + carPk + "', '" + optionPk + "')"; // 자연발생적으로 유니크한 id를 만들어냄
                    // UUID를 사용한 이유는 해당 테이블의 PK값이기때문에 응용프로그램에서 PK값은 임의적으로 추가를 못하기때문에 UUID를 사용함
                    // 만약 PK값이 아니라면 변수화 시켜서 변수명을 넣으면 됨
                    count = statement.executeUpdate(query);

                    System.out.println();

                    // 통계 (S를 선택했을때)
                } else if (workkey.equals("S")) {
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
                                resultSet.getInt("CNT"));
                    }

                } else {
                    System.out.println("----- 작업 키 확인: 입력한 값 : " + workkey);
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