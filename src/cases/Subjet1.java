package cases;
import java.util.Scanner;
public class Subjet1 {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        String answer ="";
        String[] answers = {"" ,"" };
        String[][] polls= {
            {"1.문항"}, 
            {"(1).답항","(2)답항","(3)답항"},
            {"2.문항"}, 
            {"(1).답항","(2)답항","(3)답항"}
        };

        int count = 0;
        for(int second = 0; second < polls.length;  second=second+2){
            System.out.println(polls[second][0]);
            // 답항을 찍어주는 방법

            System.out.print("답하기");
            answers[count] = myObj.nextLine();


            count = count + 1 ;
            System.out.println();
        }
        for(int first=0; first<answers.length; first++ ){
            System.out.print(answers[first]+",");
        }


        System.out.println();
        myObj.close();
        // return 0;
    }
}
