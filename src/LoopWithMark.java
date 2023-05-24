public class LoopWithMark {
    public static void main(String[] args) {
        for (int line = 1; line < 5; line = line + 1) {
            // code block to be executed
            System.out.println("for" +""+line); // +**+ 더해주는 역활
            // System.out.println(); // 라인을 바꿔줌
        }
        System.out.println("End");
    }
}
