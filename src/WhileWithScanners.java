import java.util.Scanner;

public class WhileWithScanners {
    // 콜센터 업무 안내 작성
    public static void main(String[] args) {
        // Try Catch문 사용
        try {
            Scanner myObj = new Scanner(System.in); // 변수 선언은 시작점에 하는것이 좋음
            String answer = "";

            System.out.println("안내입니다");
            boolean loops = true; // while이 계속 도는 조건은 true임 true= 1
            while (loops) { // while이 true일때 돌기때문에 변수 loops
                System.out.println("1-대출, 2-예금, 3-종료");
                System.out.print("입력 하세요: ");
                answer = myObj.nextLine();
                if (answer.equals("1")) { // 문자는 "=="로 비교 불가 .equals("")로 비교 해야 함
                System.out.println("대출 업무입니다.");

                } else if (answer.equals("2")) { // 3번 물어볼꺼니깐 else if
                    System.out.println("예금 업무입니다.");
                } else {
                    System.out.println("업무가 종료됩니다.");
                    break; // 업무가 종료가 되니 break /없다면 계속 while문이 계속 돌기 때문
                }
            }
        } catch (Exception e) {
            System.out.println();
        } finally {
            System.out.println();
        }
        System.out.println();
        // return 0;
    }

}
