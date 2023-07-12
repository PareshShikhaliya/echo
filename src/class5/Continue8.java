package class5;

public class Continue8 {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            if (i % 3 == 0) {
                System.out.println("Skipping multiple of 3: " + i);
                continue;
            }
            System.out.println("Number: " + i);
        }
    }
}

