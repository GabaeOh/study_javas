import java.util.Scanner;
public class Subjet {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        String answer ="";
        String[] answers = {"" ,"" };

        System.out.println("1.문항");
        System.out.println("(1).답항"+"(2)답항"+"(3)답항");
        answers[0] = myObj.nextLine();

        System.out.println("2.문항");
        System.out.println("(1).답항"+"(2)답항"+"(3)답항");
        System.out.print("답하기");
        answers[1] = myObj.nextLine();

        for(int first=0; first<answers.length; first++ ){
            System.out.print(answers[first]+",");
        }
        System.out.println();
        // return 0;
    }
    
}
