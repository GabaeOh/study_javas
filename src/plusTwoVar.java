import java.util.Scanner; 
public class plusTwoVar {
    public static void main(String[] args) {
        @SuppressWarnings("resource") // 사용된 Scanner 위에서 추가 해야지 clode가 됨
        Scanner myObj = new Scanner(System.in);

        int A = 0;
        int B = 0;
        A = myObj.nextInt(); 
        B = myObj.nextInt();

        System.out.println(A + B);
    }
}
