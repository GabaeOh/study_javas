package PollsWithDBInTerminal.terminalpolls;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashMap;
import java.util.Scanner;

//메서드화
// PollList_1 pollList_1 =  new PollList_1();
// pollList_1.PollList_1(statement, connection, user_id);


public class PollList_1 {
    public String PollList_1(Statement statement, Connection connection,String user_id) throws SQLException {

        String query;
        String Statement;
        String query2;
        String Statement2;
        Scanner scanner = new Scanner(System.in);
         
        HashMap<String, String> carOptionInfor = new HashMap<>();


        //delete
        query = " DELETE FROM statistics\n" + //
                "WHERE USER_ID = '"+user_id+"';";

        // 문제 받기
        query = "SELECT QUESTION\n" + //
                "FROM questions\n" + //
                ";";
        ResultSet resultSet = statement.executeQuery(query);

        //delete
        ResultSet resultSet2 = statement.executeQuery(query2);
        query = " DELETE FROM statistics\n" + //
                "WHERE USER_ID = '"+user_id+"';";

        while (resultSet.next()) {
            statement = connection.createStatement();
            System.out.println(resultSet.getString("QUESTION"));

             
            query2 = "SELECT ANSWER\n" + //
                    "FROM answers;";
            ResultSet resultSet2 = statement.executeQuery(query2);
            while (resultSet2.next()) {
                // 답항 뽑기
                System.out.print(resultSet2.getString("ANSWER"));
            
            }
            System.out.println( );
            System.out.print("답 : ");
            String anw = scanner.nextLine();
            


            // INSERT 
            Commons commons = new Commons();
            String statPK = commons.generateUUID();
            query = "INSERT INTO statistics\n" + //
                    "(USER_ID, QUESTION_ID, ANSWER_ID, STATISTICS_ID)\n" + //
                    "value\n" + //
                    "('"+user_id+"', 'Q_03', 'A_04', '"+ statPK +"');";
            int count = statement.executeUpdate(query); //확인용
        }
        return query;
    }
}
