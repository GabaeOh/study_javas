// 구구단 2단 만들기 
public class Gugudan {
    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        System.out.println( b );
        while(a * b < 18) {
            //int c = a * b ;
            // System.out.println(c); 
            a = a + 1 ;
            int c = a * b ;
            System.out.println(c);
        }

        // 더 간략하고, 효율적 (2단)
        int num = 2;
        int mynum = 1;
        while(mynum < 9 ){
            System.out.println((num * mynum));
            mynum = mynum + 1;
        } 

        //모든 구구단 
        int num = 2;
        int mynum = 1;
        while(mynum < 9 ){
            System.out.println((num * mynum));
            mynum = mynum + 1;
            while () {

            }
        } 
    }
    
}
