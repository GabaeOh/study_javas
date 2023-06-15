package surveys;

import java.sql.ResultSet;
import java.sql.Statement;

public class Statistics {
    public int getRespondents (Statement statement){ //Stament는 파라미터 
        try {
            System.out.println("---- 통계 ----");
            // -- 총 설문자 4명 
            String query = "SELECT  COUNT(*) AS CNT \n" + //
                    "FROM (\n" + //
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
            System.out.println(e.getMessage());
        }
        return 0;
    }
}
