package class5;


public class Continue7 {
    public static void main(String[] args) {

        for (int i = 1; i <= 10; i++) {

            System.out.println("iterator " + i);
            if (i % 2 == 0) {
                continue;
            }
            System.out.println("Odd number: " + i);
        }
    }
}
