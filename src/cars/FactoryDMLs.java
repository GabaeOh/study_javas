
package cars;
//쿼리문만 statment만 던지고 결과(resultset)가 계속 오는 function 만들기 

import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class FactoryDMLs { 
    // select문의 result는 table로 오니, 자바에서 table로 받을수 있는게 
    public ResultSet selectStatements(Statement statement, String query) throws SQLException {
    ResultSet resultSet = statement.executeQuery(query);
    return resultSet;

    }
    
    // insert의 메서드화
    // result의 데이터 타입이 int임 (int count)
    public int insertStatemants(Statement statement, String query) throws SQLException{ // throw는 에러가 나면 책임을 main 코드에 던져버림
        int count = statement.executeUpdate(query);
        return count; 
    }
}
