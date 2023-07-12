package class5;

public class BreakStatement5 {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            if (i == 5) {
                System.out.println("Breaking the loop at iteration " + i);
                break;
            }
            System.out.println("Iteration: " + i);
        }
    }
}

