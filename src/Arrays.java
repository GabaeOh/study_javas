// Array는 값을 뽑아낼때 arrㅁy 형식을 돌려야 됨 
// 0,1,2,3 
public class Arrays {
    public static void main(String[] args) {
        String[] cars = { "Volvo", "BMW", "Ford", "Mazda" }; // 데이터 타입을 String으로 선언해줌 데이터 타입에 따라 달라짐
        System.out.println();
        // return 0;
        for( int number = 0;  number < 4; number = number+2){
            System.out.println( cars[number]);
        }
    }
}
