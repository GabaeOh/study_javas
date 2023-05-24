public class LoopWithMark {
    public static void main(String[] args) {
        for (int line = 1; line < 5; line = line + 1) {
            // code block to be executed
            System.out.println("for" +""+line);
            System.out.println();
        }
        System.out.println("End");
    }
}
