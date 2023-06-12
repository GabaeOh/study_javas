import java.util.Scanner;

public class CarsWithDB {
    public static void main(String[] args) {
        try {
          Scanner scanner = new Scanner(System.in);
          String workkey = "P";
            while(!workkey.equals("E")){
                System.out.println("선택 입력 : ");
                workkey = scanner.nextLine();
            }
          

        } catch (Exception e) {
            // TODO: handle exception
            System.out.println();
        }
        System.out.println();
    }
}
