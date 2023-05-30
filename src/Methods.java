public class Methods {
    // <access_modifier> <return_type> <method_name>( list_of_parameters)
    // {
    // //body
    // }
    // 두 값을 빼는 기능 
    public static int minus(int first, int second){
        int result = 0;
        try {
            result = first - second;           
        } catch (Exception e) {
            // TODO: handle exception
        }
        return result;
    }

    // 두 값을 더하는 기능
    public static int add(int first, int second){ // add는 두 값을 합치는 거니깐 받을 값 first, second 값 2개
        int result = 0; // result값을 try영역이 아닌 같은 영역에서 선언
        try {
            result = first + second;
        } catch (Exception e) {
            // TODO: handle exception
        }
        //return 0;
        return result ; // retrun 값을 선언 해줘야 함
    }
    // 인스턴스는 1회
    // 초기값은 2를 넘지 않음
    // main 결과값은 17
    public static void main(String[] args) {
        try {
            int first = 2;
            int second = 1;
            Methods methods = new Methods();

            first = Methods.add(first, second);
            second = Methods.add(first, second);
            first = Methods.add(first, second);
            second = Methods.add(first, second);
            first = Methods.add(first, second);
            first = Methods.add(first, second);
            first = Methods.minus(first, second);
            
            int result = first; 

            System.out.println(result-1);

        } catch (Exception e) {
            // TODO: handle exception
        }
        // return 0;
        System.out.println();
    }
}
