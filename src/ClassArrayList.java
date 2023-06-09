import java.util.ArrayList;

public class ClassArrayList {
    public static void main(String[] args) {
        try {
            int[] numbers = {1, 2, 3}; //버킷의 사이즈를 미리 예측하고 지정해줘야하는 제약사항 발생

            ArrayList arrayList = new ArrayList();
            arrayList.add(1);  //true // 값을 넣어주는 function
            arrayList.add(2);  //true //arry와 달리 버킷의 사이즈를 지정하지 않아도 추가만 해주면 됨 
            arrayList.add(3);  //true

            // 갯수를 세는 법
            arrayList.size(); // 3

            // 값을 출력하는 법
            arrayList.get(2);  //Integer@36 "3"

            //값을 변경하는 법
            arrayList.set(1, 5); //Integer@35 "2" // 2번째 값을 5로 변경 

            // 값을 삭제하는 법
            arrayList.remove(0); //Integer@34 "1" //첫번째 값 삭제 / 삭제되면서 순번이 앞으로 땡겨짐

            //초기화 
            arrayList.clear(); //(void) 

            System.out.println();
        } catch (Exception e) {
            // TODO: handle exception
        }
    }
}
