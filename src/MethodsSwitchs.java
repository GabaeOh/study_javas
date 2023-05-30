// function화 
public class MethodsSwitchs {
    // <access_modifier> <return_type> <method_name>( list_of_parameters)
    // {
    // //body
    // }
    public String today(int day){
        String str = ""; // 문자 타입이기에 초기값은 "" 
        try {
            switch (day) {
                case 1:
                    str = "Monday";
                    break;
                case 2:
                    str = "Tuesday";
                    break;
                case 3:
                    str = "Wednesday";
                    break;
                case 4:
                    str = "Thursday";
                    break;
            }
        } catch (Exception e) {
            // TODO: handle exception
        }
        return str; // 받는 return값의 데이터타입이 string이기에 ""
    }
    public static void main(String[] args) {
        try {

            int day = 4; // 1 ~ 4 가능
            String str = ""; // 변수화하여 마지막 출력할때 해당 변수 사용
            
            MethodsSwitchs methodsSwitchs= new MethodsSwitchs(); // 인스터스화 
            String returnResult = methodsSwitchs.today(day); // 받는 값을 returnResult로 변수 선언
            System.out.println(returnResult); // 출력을 한번만 하고 싶음 -> 변수화
        } catch (Exception e) {
            // TODO: handle exception
        }
        // return 0;
    }
}
