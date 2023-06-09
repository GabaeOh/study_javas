// hashmap은사용못함 형태가 array가 아니여서 
// array와 arraylist만 가져올 수 있음

//arrayname이 false가 될때 멈춤 /값이 있을때 true 사이즈만큼 돈다.
// 한 뭉치씩 나온다.
import java.util.ArrayList;
import java.util.jar.Attributes.Name;
import java.util. HashMap;
public class LoopForEachs {
    public static void main(String[] args) {
        // for (type variableName : arrayName) {
        // type : array 속 데이터 타입 /variableName : for문 내에서 사용할 변수명 / arrayName ; array의 변수명
            //     // code block to be executed
        //   }
        try {
            // <> generic(제너릭)  잘못된 타입이 사용될수 있는 문제를 컴파일 과정에서 제거할 수 있음
            ArrayList<String> cars = new ArrayList<String>(); //인스턴스화 
            cars.add("Volvo");
            cars.add("BMW");
            cars.add("Ford");
            cars.add("Mazda");

            
            //2개의 파라미터를 넣어야 함 => 앞 : 풀어나갈 것 , 뒤 : 실제 풀어나갈 것
            for( String car: cars){
                System.out.println(car);
            }

            // 해쉬 맵에 자동차를 넣고 리스트에 해당 자동차를 넣고 배열 뽑기 
            //먼저 해쉬맵으로 열을 묶고 행은 list로 묶어서 넣기 
            // 값을 입력할때는 행순으로 
            // Automobile company Vehicle Names
            ArrayList<HashMap> carList = new ArrayList<HashMap>(); //인스턴스화를 통해 리스트 생성 / <HashMap>으로 제너릭 리스트에 넣은 데이터타입은 hashmap임
            HashMap<String, String> CarSpec = new HashMap<String, String>(); //인스턴스화를 통해 해쉬맵 생성 /<String, String> 제너릭 생성 해쉬맵의 데이터 타입이 스트링
            
            CarSpec.put("회사명","현대" );
            CarSpec.put("자동차명","그랜저" );
            CarSpec.put("연식","2021" );
            carList.add(CarSpec);

            CarSpec = new HashMap<String, String>(); // 기존 리스트도 유지되면서 추가적으로 넣은 리스트도 유지 고로, 인스턴스화를 시켜줘야함 아니면 똑같은 메모리에 변수를 할당함/ 계속적으로 값을 할당할 수 있음
            CarSpec.put("회사명","삼성" );
            CarSpec.put("자동차명","SM6" );
            CarSpec.put("연식","2020" );
            carList.add(CarSpec);
            
            CarSpec = new HashMap<String, String>();
            CarSpec.put("회사명","기아" );
            CarSpec.put("자동차명","K5" );
            CarSpec.put("연식","2022" );
            carList.add(CarSpec);
        
            for(HashMap<String, String> car:carList){  // 가져올것 carList/ carList의 데이터 타입 HashMap, HashMap의 제너릭, 데이터 타입 <String, String> / 새롭게 지정한 변수명 car
               System.out.println( car.get("회사명") +" " +car.get("자동차명") +" " +car.get("연식")); // 데이터를 가져오는 것 .get 
            }
            System.out.println();

            // Q. 맨 윗줄의 행을 넣고 출력하는 방법 => 같은 방법으로 key와 value값을 넣고 if를 써서 1행만 뽑고 나머지를 출력하는 구문을 씀 
            // 또는 ket.set을 씀


        } catch (Exception e) {
            // TODO: handle exception
        }
    }
}
