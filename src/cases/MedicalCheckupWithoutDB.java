
package cases;

// import 
import java.util.ArrayList;
import java.util.HashMap;

public class MedicalCheckupWithoutDB {
    public static void main(String[] args) {
        try {
            // hashmap와 arraylist 인스턴스화; 데이터 타입을 고려하여 제네릭 시키기
            ArrayList<HashMap> medicalList = new ArrayList<HashMap>();  
            HashMap<String, String> medicalhash = new HashMap<String, String>();

            // 1행 
            medicalhash.put("이름", "홍길동");
            medicalhash.put("성별", "남");
            medicalhash.put("나이", "30");
            medicalhash.put("키, 체중", "175, 75");
            medicalhash.put("혈압, 혈당", "120/80, 90");
            medicalhash.put("검진결과", "비정상");
            medicalhash.put("재검진항목", "폐암, 갑상선 질환");
            medicalhash.put("유지방안", " ");
            medicalList.add(medicalhash);

            //2행
            medicalhash = new HashMap<String, String>();
            medicalhash.put("이름", "김영희");
            medicalhash.put("성별", "여");
            medicalhash.put("나이", "25");
            medicalhash.put("키, 체중", "160, 55");
            medicalhash.put("혈압, 혈당", "110/70, 85");
            medicalhash.put("검진결과", "비정상");
            medicalhash.put("재검진항목", "간암, 뇌졸증");
            medicalhash.put("유지방안", " ");
            medicalList.add(medicalhash);

            //3행
            medicalhash = new HashMap<String, String>();
            medicalhash.put("이름", "박철수");
            medicalhash.put("성별", "남");
            medicalhash.put("나이", "45");
            medicalhash.put("키, 체중", "180, 85");
            medicalhash.put("혈압, 혈당", "130/85, 100");
            medicalhash.put("검진결과", "정상");
            medicalhash.put("재검진항목", "심장질환");
            medicalhash.put("유지방안", "식습관 개선, 운동 계획");
            medicalList.add(medicalhash);

            //4행
            medicalhash = new HashMap<String, String>();
            medicalhash.put("이름", "이지은");
            medicalhash.put("성별", "여");
            medicalhash.put("나이", "35");
            medicalhash.put("키, 체중", "165, 60");
            medicalhash.put("혈압, 혈당", "115/75, 95");
            medicalhash.put("검진결과", "비정상");
            medicalhash.put("재검진항목", "간암, 알츠하이머병");
            medicalhash.put("유지방안", " ");
            medicalList.add(medicalhash);

            //5행
            medicalhash = new HashMap<String, String>();
            medicalhash.put("이름", "최민호");
            medicalhash.put("성별", "남");
            medicalhash.put("나이", "28");
            medicalhash.put("키, 체중", "170, 70");
            medicalhash.put("혈압, 혈당", "125/80, 92");
            medicalhash.put("검진결과", "정상");
            medicalhash.put("재검진항목", "간암");
            medicalhash.put("유지방안", " ");
            medicalList.add(medicalhash);


            //for문을 통해 hashlist에 담긴 값들 불러와서 출력
            for(HashMap<String, String> medical :medicalList ){
                System.out.println( medical.get("이름") +" "+ medical.get("성별") +" "+ medical.get("나이") +" "+ medical.get("키, 체중") +" "+ medical.get("혈압, 혈당") +" "+ medical.get("검진결과") +" "+ medical.get("재검진항목") +" "+ medical.get("유지방안")); 
            }
            System.out.println();
        } catch (Exception e) {
            // TODO: handle exception
        }
    }
}
