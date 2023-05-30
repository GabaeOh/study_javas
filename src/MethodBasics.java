public class MethodBasics {
//     <access_modifier> <return_type> <method_name>( list_of_parameters)
// {
//     //body
// }
// x에 +1 
    public int F(int x) 
    {
        int result =  x + 1;
        return result;  // return의 데이터 타입을 무조건 맞춰줘야 함  

        int result2 =  y + 1;
        return result2;  // return의 데이터 타입을 무조건 맞춰줘야 함 
    }
   public static void main(String[] args) {
    try {
        int x = 4;
        int y = 0;
        // y = x + 1; //변수에 + 1
        MethodBasics methodBasics = new MethodBasics(); 
        // new(클래스)= 인스턴스화 , 클래스도 변수에 담을수 있다.
        //methodBasics의 데이터 타입은 class(기능을 묶어놓은 데이터 타입)이기에 class명을 가지고 오면 됨   
        // 관리하기 편하고, 유지보수 및 효율성을 위하여 
        //y = F(x);
        y = methodBasics.F(x); //해당하는 class의 function에 들어가 있어요 

        y = y + 1; //변수에 + 1
        y = methodBasics.F(y);
    } catch (Exception e) {
        // TODO: handle exception
    }
    System.out.println();
    // return 0;
   }
}