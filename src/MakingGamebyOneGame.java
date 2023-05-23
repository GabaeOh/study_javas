public class MakingGamebyOneGame {
    public static void main(String[] args) {
        String A = "1" ; 
        String B = " "; 
        String C = "2";
        String D = "0";
        B = A ; // 112
        A = C;  //212
        C = B; // 201
        B = D;
        
        System.out.println( A);
        System.out.println( B);
        System.out.println( C);

    }
    
}
