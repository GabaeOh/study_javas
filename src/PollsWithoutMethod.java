import java.util.Scanner;
public class PollsWithoutMethod {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        String[] answers = {"" ,"","","" };
        String[][] polls= {
                                {"1.교수는 수업 전 강의 목표를 명확히 제시하였습니까?"}, 
                                {"(1).전혀 아니다" + "(2)아니다" +"(3)그렇다" +"(4)매우그렇다"},
                                {"2.강의의 내용은 체계적이고 성의 있게 구성되었는가?"}, 
                                {"(1).전혀 아니다" + "(2)아니다" +"(3)그렇다" +"(4)매우그렇다"},
                                {"3.교수는 강의 내용에 대해 전문적 지식이 있었는가?"}, 
                                {"(1).전혀 아니다" + "(2)아니다" +"(3)그렇다" +"(4)매우그렇다"},
                                {"4.강의 진행 속도는 적절하였는가?"}, 
                                {"(1).전혀 아니다" + "(2)아니다" +"(3)그렇다" +"(4)매우그렇다"}
        };

        int count = 0;
        for(int second = 0; second < polls.length; second=second+2){
            System.out.println(polls[second][0]);
            System.out.println(polls[1][0]);
            answers[count] = myObj.nextLine();
            count = count+1;
            System.out.println();
        }
        System.out.println("------결과 출력------");
        System.out.println();
        System.out.println("------결과 제출------");
        for(int result=0; result < answers.length; result++){
            System.out.println(answers[result]+"");
           }
        
        System.out.println();
        // return 0;
    }
}