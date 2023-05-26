import java.util.Scanner;
public class PollsWhile {
    public static void main(String[] args) {
        Scanner my = new Scanner(System.in); // 변수 선언
        String answer = "";

        System.out.println("선택에 따라 안내글을 보여드립니다");
        System.out.println("(E)xit: 종료" + "(P)oll: 설문시작" + "(S)tatistic:설문 통계");
        System.out.println("선택입력:");
        boolean loops = true;

        while (loops) {
            answer = my.nextLine(); // 입력 받는 것 
            if (answer.equals("p") || answer.equals("Poll")) { // 'OR'은 ||을 사용
                System.out.println("------설문시작-----");
            } else if (answer.equals("s") || answer.equals("Statistic") ) {
                System.out.println("------설문통계------");
            } else if (answer.equals("Exit ") ||  answer.equals("E") ) {
                System.out.println("------설문종료-----"); 
                break;  // 설문종료이기에 break
            }
        }
    }
}
