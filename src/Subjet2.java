import java.util.Scanner;
public class Subjet2 {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        String answer ="";
        String[] answers = {"" ,"" };
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
            // 답항을 찍어주는 방법
            System.out.println(polls[second+1][0]);
            

            // System.out.print("답하기");
            // answers[count] = myObj.nextLine();
 

            // count = count + 1 ;
            // System.out.println();
        }
        // for(int first=0; first<answers.length; first++ ){
        //     System.out.print(answers[first]+",");
        // }


        System.out.println();
        // return 0;
    }
}
