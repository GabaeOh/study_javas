package cars;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.management.Query;

public class AnyStatement {
    public ResultSet selectStatement(Statement statemt, String qy) throws SQLException{
        ResultSet resultSet = statemt.executeQuery(qy); //액션
        return resultSet; //리턴해야하는 값이 resultset
    }
}
