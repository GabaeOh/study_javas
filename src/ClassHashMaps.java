import java.util.HashMap;
// list는 배열의 순서를 알아야지 원하는 값을 가져올수 있다는 단점이 있음 
// map은 콕 찍어서 가져 올수 있음 key와 value가 한쌍으로 key를 통해 가져옴
public class ClassHashMaps {
    public static void main(String[] args) {
        try {
            HashMap hashMap = new HashMap(); //인스턴스화 
            // hashMap에 값을 넣기 
            hashMap.put("first", 1); //null
            hashMap.put("second", 2); //null    
            hashMap.put("third", 3); //null
            
            // 값 가져오기 (key로 value 값 뽑기)
            hashMap.get("third"); //Integer@48 "3"

            // hashMap에 대한 사이즈 파악
            hashMap.size(); //3

            //값 바꾸기 
            hashMap.put("second", 5); //Integer@32 "2" //second의 value값을 5로 변경
            
            //삭제하는 법 (key를 통해서 value값 삭제)
            hashMap.remove("second"); //Integer@56 "5"

            //key, value의 집합을 각각 가져오는 방법 
            //순서는 랜덤하게 추출됨 
            hashMap.keySet(); //HashMap$KeySet@79 size=2 0:"third" 1:"first"
            //키 값으로 리스트를 돌려서 내가 갖고 있는 모든 hashmap를 돌리고 싶을때 
            hashMap.values();  //HashMap$Values@84 size=2  0:Integer@48 1:Integer@29
            
            //초기화 
            hashMap.clear(); //(void)

            
            System.out.println();
        } catch (Exception e) {
            // TODO: handle exception
        }
    }
}
