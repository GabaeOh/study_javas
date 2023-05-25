// import java.util.Scanner; 
public class PollsWithoutMethod {
    public static void main(String[] args) {
        // @SuppressWarnings("resource") // 사용된 Scanner 위에서 추가 해야지 clode가 됨
        // System.out.println("이름");
        // Scanner myObj = new Scanner(System.in);
        // String name = myObj.next();
        // myObj.close(); // 스캐너 닫는 것
        // System.out.println("이름은" + name);
        String[][] survey = { {"교수는 수업 전 강의 목표를 명확히 제시하였습니까?"}, 
                                {"전혀 아니다", "아니다", "그렇다", "매우그렇다"},
                                {"강의의 내용은 체계적이고 성의 있게 구성되었는가?"}, 
                                {"전혀 아니다", "아니다", "그렇다", "매우그렇다"},
                                {"교수는 강의 내용에 대해 전문적 지식이 있었는가?"}, 
                                {"전혀 아니다", "아니다", "그렇다", "매우그렇다"},
                                {"강의 진행 속도는 적절하였는가?"}, 
                                {"전혀 아니다", "아니다", "그렇다", "매우그렇다"}
                                                                                };
        for(int first = 0; first <survey.length; first = first+2 ){
                System.out.println(survey[first][0]);
                for(int second=0; second < survey[1].length; second++){
                    System.out.println( survey[3][1]);
                }
                // System.out.println(survey[][]);
        }
    }
}