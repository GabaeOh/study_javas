public class LoopWhiles {
    public static void main(String[] args) {
        //while (condition) {
        //    // code block to be executed
        // }
        int first = 5;
        int second = 10;
        while (first < second) {
            System.out.println(first);
            //first = 11; //무한루프에서 빠져나올수 있도록 값 부여
            first = first + 2; // 루프를 3번 돌리고 싶다, 값을 3번만 출력하고 싶을때 
        }
        System.out.println();
        //return 0;
    }
    
}
