// Scanner 외부에서 Terminal에서 값을 받을 수 있게 하는 기능, 입력하는 기능
import java.util.Scanner; // class 밖에서 선언
public class Scanners {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in); //이 라인을 넣어야 함 
        // Create a Scanner object
        // System.out.println("Enter username");

        // String userName = myObj.nextLine(); // Read user input
        // System.out.println("Username is: " + userName); // Output user input
        
        int first = 0;
        int second = 0;
        first = myObj.nextInt(); //숫자를 입력할거면 nextInt를 넣어야함
        second = myObj.nextInt();
        System.out.println(first+","+second); // 글자를 통짜로 만들어주는 기능 +","+
        myObj.close(); // 사용된 Scanner의 자원을 반납해줘야 함 / close해 줘야 함 
        // return 0;
    }

    public String nextLine() {
        return null;
    }
}
