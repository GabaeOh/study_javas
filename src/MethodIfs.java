
// if문을 Method화 
import java.util.Scanner;

public class MethodIfs {
    // <access_modifier> <return_type> <method_name>( list_of_parameters)
    // {
    // //body
    // }
    public String daytime(int time) {
        String str = "";
        try {
            if (time < 12) {
                str = "오전입니다.";
            } else if (time < 18) {
                str = "오후입니다.";
            } else {
                str = "밤입니다.";
            }
        } catch (Exception e) {
            // TODO: handle exception
        }
        return str;
    }

    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in); // 스캔 걸기 
        try {
            while(true) { // while의 조건은 true일때 계속 돌기 
            int time = myObj.nextInt();
            MethodIfs methodIfs = new MethodIfs(); // 인스턴스화
            String returnResult = methodIfs.daytime(time);
            if(time == 0){  // 0일때 break , 출력되지 않고 break를 원하면 print 위에 조건 걸기
                break;
            }
            System.out.println(returnResult); 
            }
        } catch (Exception e) {
            // TODO: handle exception
        }
        //return 0;
    }
}
