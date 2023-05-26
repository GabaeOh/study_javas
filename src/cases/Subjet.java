package cases;
import java.util.Scanner;
public class Subjet {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        String answer ="";
        String[] answers = {"" ,"" };

        System.out.println("1.교수는 수업 전 강의 목표를 명확히 제시하였습니까?");
        System.out.println("(1).전혀 아니다" + "(2)아니다" +"(3)그렇다" +"(4)매우그렇다");
        answers[0] = myObj.nextLine();

        System.out.println("2.강의의 내용은 체계적이고 성의 있게 구성되었는가?");
        System.out.println("(1).전혀 아니다" + "(2)아니다" +"(3)그렇다" +"(4)매우그렇다");
        System.out.print("답하기");
        answers[1] = myObj.nextLine();

        System.out.println("3.교수는 강의 내용에 대해 전문적 지식이 있었는가?");
        System.out.println("(1).전혀 아니다" + "(2)아니다" +"(3)그렇다" +"(4)매우그렇다");
        System.out.print("답하기");
        answers[2] = myObj.nextLine();

        System.out.println("4.강의 진행 속도는 적절하였는가?");
        System.out.println("(1).전혀 아니다" + "(2)아니다" +"(3)그렇다" +"(4)매우그렇다");
        System.out.print("답하기");
        answers[3] = myObj.nextLine();

        for(int first=0; first<answers.length; first++ ){
            System.out.print(answers[first]+",");
        }
        System.out.println();
        // return 0;
    }



}
