
import java.sql.ResultSet;
import java.util.HashMap;
import java.util.Scanner;

public class Praticepolls {

    public String[][] Polls() {

        Scanner scanner = new Scanner(System.in);

        String surveyorName = scanner.nextLine();
        String[][] polls = {
                { "1.교수는 수업 전 강의 목표를 명확히 제시하였습니까?" },
                { "(1).전혀 아니다", "(2)아니다", "(3)그렇다", "(4)매우그렇다" },
                { "2.강의의 내용은 체계적이고 성의 있게 구성되었는가?" },
                { "(1).전혀 아니다", "(2)아니다", "(3)그렇다", "(4)매우그렇다" },
                { "3.교수는 강의 내용에 대해 전문적 지식이 있었는가?" },
                { "(1).전혀 아니다", "(2)아니다", "(3)그렇다", "(4)매우그렇다" },
                { "4.강의 진행 속도는 적절하였는가?" },
                { "(1).전혀 아니다", "(2)아니다", "(3)그렇다", "(4)매우그렇다" }
        };
        int totalQuestions = polls.length / 2;
        int[] answers = new int[totalQuestions];
        return polls;

    }

    답항 뽑기 query="select answer from answers";

    ResultSet resultSet = statement.executeQuery(query);

    Statement statement = connection.createStatement();
    ResultSet resultSet;
    String query;

    while(resultSet.next())
    {
        System.out.print(resultSet.getString(answers));
    }

    // sql문
    // 문제값만 출력
    SELCT answerid, answerid,
            FROM
    통계
        group
    by userid

    // 답항
    SELECT FROM ANSWERS;

    HashMap<String, String> contents = new HashMap<>(); // 문항과 설문자의 답을 담기'
    contents.put(string.valueOf(),) // key value , 설문문항id랑 설문자의 넘버와 해쉬 맵

    q.답은 db안에
    있는 답을
    쓰는 건가?q.해쉬맵

}
