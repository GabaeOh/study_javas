// arry를 fucion을 만들고 값 받기
import java.sql.Array;

public class Arrays{
    public String[] intitialArrays(){
        String[] carTypes = { "Volvo", "BMW", "Ford", "Mazda", "KIA" };
        return carTypes;
    }
// Array는 값을 뽑아낼때 array 형식을 돌려야 됨 
// 0,1,2,3 
// public class Arrays {
//     public static void main(String[] args) {
//         // row가 2개라는 표현 [],[] / {} 추가 및 , 추가로 데이터 범위 묶고 구분해줌
//         String[][] numbers = {
//                                 {"10","20","30", "40"},
//                                 {"50","60","70"}
//                                 };
//         for(int second = 0; second < numbers.length; second++){
//             for(int third= 0; third < numbers[second].length; third++){
//                 System.out.print(numbers[second][third]+","); 
//             }
//             System.out.println();
//         }    
    
        public static void main(String[] args) {
            Arrays arrays = new Arrays();
            String[] cars = arrays.intitialArrays();
        
        // String[] cars = { "Volvo", "BMW", "Ford", "Mazda", "KIA" }; // 데이터 타입을 String으로 선언해줌 데이터 타입에 따라 달라짐
        System.out.println(cars.length); // array의 길이 만큼 출력함
        //length을 이용해서 리스트 출력하기  
        for(int first = 0; first < cars.length; first++){
            System.out.print(cars[first]+",");
        }
        System.out.println();
        // return 0;

        // for문으로 cars 리스트 출력하기 
        // for( int number = 0;  number < 4; number = number+2){
        //     System.out.println( cars[number]);
        // }
        }
    
}
