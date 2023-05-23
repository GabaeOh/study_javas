public class SetAndGetVariable {
    public static void main(String[] args) {
        int A = 1;
        int B = 3;
        int c = 5;
        int D = 7;

        int first = 200 ;
        int second = 30 ;
        int third = 5 ;
        int forth = 10 ;
        int fifth = 50;

        if ( B == 3 ) {
            A=forth ;
         } else {
           c = third ;
         }

         if ( D != 9 ) {
            B=third ;
         } else {
            B=first ;
         }

         if ( A == 10 ) {
            c=fifth ;
         } else {
            D = second ;
         }
        
         System.out.println(A);
         System.out.println(B);
         System.out.println(c);
         System.out.println(D);
    }
    
}
