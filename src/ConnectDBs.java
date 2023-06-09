import java.sql.*; //import은 sql

public class ConnectDBs {
    public static void main(String[] args) {
        try {
            // - MySQL workbench 실행 : JDBC
            // - User/password와 접속 IP:port 접속
            String url = "jdbc:mysql://127.0.0.1:3306/db_cars"; // 마지막은 db이름으로 "db_cars"
            // localhost도 가능하나 IP주소를 넣는게 보다 좋음

            // jdbc : java DB connetion , 'https://www.naver.com/'의 구조와 유사 / 원격으로 db_cars에 연결하는 구조를 나열

            String user = "root";
            String password = "!yojulab*";

            //DB 연결
            Connection connection = DriverManager.getConnection(url, user, password);
            System.out.println("DB연결 성공\n");

            // - query Edit
            Statement statement = connection.createStatement();

            String query = " SELECT * FROM factorys"; 
            ResultSet resultSet = statement.executeQuery(query); // 결과값 리턴 , selct만 resulset으로 받음(select 테이블 형식으로 나오니깐)

            while(resultSet.next()){ // next: 뭉치를 던져줌 
                // resultSet.getString("COMPANY_ID");
                // resultSet.getString("COMPANY");
                System.out.println(resultSet.getString("COMPANY_ID")+""+resultSet.getString("COMPANY") );
            }


            //SELECT COUNT(*) AS CNT FROM factorys;
            query = "SELECT COUNT(*) AS CNT FROM factorys";
            resultSet = statement.executeQuery(query);
            int totalCount = 0;
             while(resultSet.next()){ // next: 뭉치를 던져줌 
                System.out.println(resultSet.getInt("CNT"));
                totalCount = resultSet.getInt("CNT");
            }


            /*  - 값이 테이블로 나오지 않음
            INSERT INTO factorys
            (COMPANY_ID, COMPANY) 
            VALUE 
            ('CAR-01', 'AUDI');
            */

            // 변수화 시키는게 좋음 
            String companyId = "CAR-01";
            String company = "AUDI";
            query = "INSERT INTO factorys " +  // 중복 에러 발생으로 IGNORE 사용
                    "(COMPANY_ID, COMPANY) " +
                    "VALUE " + 
                    "('"+companyId+"', '"+company+"') " ;//''를 꼭 넣어줘야 함 

            int count = statement.executeUpdate(query); //결과값이 없기때문에 resultset으로 넘길필요 없어 update를 사용, workbench에서 update된거 확인 

            
            //data 수정
            /*
             UPDATE factorys
            SET COMPANY = '패러리'
            WHERE COMPANY_ID = 'CAR-01';
             */

            company = "패러리";
            query = "UPDATE factorys " +
                    "SET COMPANY = '"+company+"' " +
                    "WHERE COMPANY_ID = '"+companyId+"' ";

            count = statement.executeUpdate(query);

            //삭제
             /*
            DELETE FROM factorys
            WHERE COMPANY_ID = 'CAR-01';
             */

            query = "DELETE FROM factorys " +
                    "WHERE COMPANY_ID = '"+companyId+"' ";

            count = statement.executeUpdate(query);

            System.out.println();

        } catch (Exception e) {
            System.out.println(e.getMessage());
            // TODO: handle exception
        }
        System.out.println();
    }
}
