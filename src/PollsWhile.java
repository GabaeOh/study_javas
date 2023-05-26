

import java.util.Scanner;

public class PollsWhile {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in); // 변수 선언
        String answer = "";
        System.out.println("선택에 따라 안내글을 보여드립니다");
        System.out.println("(E)xit: 종료" + "(P)oll: 설문시작" + "(S)tatistic:설문 통계");
        System.out.println("선택입력:");
        boolean loops = true;
        while (loops) {
            answer = myObj.nextLine();
            if (answer.equals("p") || answer.equals("Poll")) {
                System.out.println("------설문시작-----");
                // break;
            } else if (answer.equals("s") || answer.equals("Statistic") ) {
                System.out.println("------설문통계------");
                // break;
            } else if (answer.equals("Exit ") ||  answer.equals("E") ) {
                System.out.println("------설문종료-----"); 
                break;
            }
            // break;
        }
    }
}
