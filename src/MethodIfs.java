// if문을 Method화 
public class MethodIfs {
    // <access_modifier> <return_type> <method_name>( list_of_parameters)
    // {
    // //body
    // }
    public String daytime(int time){
        String str = "";
        try {
         if ( time < 12) {
            str = "오전입니다." ;
         } else if ( time < 18) {
            str = "오후입니다." ;
         } else {
            str = "밤입니다."; 
         }
        } catch (Exception e) {
            // TODO: handle exception
        }
        return str;
    }
    public static void main(String[] args) {
        try {
            int time = 15;
            MethodIfs methodIfs = new MethodIfs();
            String returnResult = methodIfs.daytime(time);
            System.out.println(returnResult);
        } catch (Exception e) {
            // TODO: handle exception
        }
        //return 0;
    }
}
