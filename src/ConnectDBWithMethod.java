import java.sql.*;

import cars.FactoryDMLs;

public class ConnectDBWithMethod {
    public static void main(String[] args) {
        Connection connection;
        Statement statement;
        try {
            // - MySQL workbench 실행 : JDBC
            // - User/password와 접속 IP:port 접속
            String url = "jdbc:mysql://127.0.0.1:3306/db_cars";
            String user = "root";
            String password = "!yojulab*";

            connection = DriverManager.getConnection(url, user, password);
            System.out.println("DB연결 성공\n");

            // - query Edit // 쿼리문을 띄울수 있는 edit창이 statement
            statement = connection.createStatement();
            String query = "SELECT * FROM factorys";
            FactoryDMLs factoryDMLs = new FactoryDMLs(); //인스턴스화, function화 된 FactoryDMLs을 사용하기 위해 
            ResultSet resultSet = factoryDMLs.selectStatements(statement, query);
            while (resultSet.next()) {
                System.out.println(resultSet.getString("COMPANY_ID") + resultSet.getString("COMPANY"));
            }

            // SELECT COUNT(*) AS CNT FROM factorys;
            query = "SELECT COUNT(*) AS CNT FROM factorys";
            resultSet = factoryDMLs.selectStatements(statement, query);
            int totalCount = 0;
            while (resultSet.next()) {
                System.out.println(resultSet.getInt("CNT"));
                totalCount = resultSet.getInt("CNT");
            }

            /*
            INSERT INTO factorys
            (COMPANY_ID, COMPANY) 
            VALUE 
            ('CAR-01', 'AUDI');
            */
            String companyId = "CAR-01";
            String company = "AUDI" ;
            query = "INSERT INTO factorys " +
                    "(COMPANY_ID, COMPANY) " +
                    " VALUE " +
                    "('"+companyId+"', '"+company+"') ";
            
            int count = factoryDMLs.insertStatemants(statement, query); // 메서드를 불러 오는 것
            System.out.println();

            statement.close(); //자원 반납 -> 인스턴스 시킨 순서의 반대로 진행해야함 
            connection.close(); 
            
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println(e.getMessage());
        } finally{ //에러가 든 아니든 무조건 실행이 되는 것 ex) 자원 반납

        }
        System.out.println();
    }
}
