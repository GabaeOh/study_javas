public class StringClasses {
    public static void main(String[] args) {
        try {
            //String은 class이다.
            String name = "GA BAE OH";
            
            // <디버깅 모드에서 비교하는 법>
            //값을 비교하는 법
            name.equalsIgnoreCase("GA BAE OH"); // true
            name.equalsIgnoreCase("GA BAE ");  // false
            String name_second = new String("MIN JOO KANG");
            name_second.equals("MIN JOO KANG"); // true

            name_second.length(); // 12

            //특정한것을 바꾸고 싶을때 replace의 경우 첫번째 만나는 것만 변경, replace all은 전부 변경해줌
            //바꾸고 싶은것을 앞에 변화될 값을 뒤에 
            name_second.replaceAll("O", "f");  // "MIN Jff KANG"
            name_second = name_second.replaceAll("O", "f"); // "MIN Jff KANG"  // 변경된 값을 다시 할당해주어야 함 
            // 구분자, 잘라내고 싶을때 결과값은 array로 출력
            name_second.split(" "); // String[3]@41
            String[] arrays = name_second.split(" "); // String[3]@46 

            // 해당부분만 잘라내고 값을 할당하기
            name_second.substring(2,9); // "N Jff K"
            String name_substring = name_second.substring(2,9) // "N Jff K"
            // System.out.println();

        } catch (Exception e) {
            // TODO: handle exception
        }
        System.out.println();
        //return 0;
    }
}
