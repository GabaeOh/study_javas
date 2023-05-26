// break 사용
public class Breaks {
    public static void main(String[] args) {
        // Try Catch문 사용
        try {
            for (int first = 0; first < 4; first++) {
                if (first == 2) { // first 값이 2이면 for문 종료
                    break;
                }
                System.out.println();
            }
        } catch (Exception e) {
            System.out.println();
        } finally {
            System.out.println();
        }
        System.out.println();
    }
}