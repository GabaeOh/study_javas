package cases;

import java.util.Scanner;

public class ForBuket {
    public static void main(String[] args) {
        try {
            // 장바구니 3가지만 담게 선언 
            // String bucket_1 = "";
            // String bucket_2 = "";
            // String bucket_3 = "";
            String[] bucket = {"","",""};  // 품목을 담을 배열 생성

            Scanner myObj = new Scanner(System.in); 
            for(int first = 0; first< bucket.length; first++){
                System.out.print((first+1)+" 번째 담기 :"); // 원하는거 ()치기 
                bucket[first] = myObj.nextLine();
            }
            
            System.out.println("---담은 내용물---");
            System.out.print(bucket[0]+","); // 글자가 다 붙는걸 방지 하기 위해 +"," 추가
            System.out.print(bucket[1]+",");
            System.out.print(bucket[2]+",");
            
        } catch (Exception e) {
            // TODO: handle exception
        } finally{

        }
        System.out.println();
        // return 0; 
    }
}
