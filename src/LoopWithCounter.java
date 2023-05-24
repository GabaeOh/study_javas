public class LoopWithCounter {
    public static void main(String[] args) {
        int A = 5;
        int B = 1;
        int C = 1;
        System.out.println(B);
        while (C < A) {
        B = B + 1;
        C = C + 1 ;
        System.out.println(B);

        }
        
        // 간결하게 코드
        int d = 1;
        while (d < 6){
            System.out.println(d);   
            d = d + 1;      
        }
         
    }
}



