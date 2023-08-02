package class10;

public class StringVsStringBuilderExample7 {
    public static void main(String[] args) {
        // Using String
        long startString = System.currentTimeMillis();
        String str = "";
        for (int i = 0; i < 100000; i++) {
            str += "hello";
        }
        long endString = System.currentTimeMillis();
        System.out.println("Using String: " + (endString - startString) + "ms");

        // Using StringBuilder
        long startStringBuilder = System.currentTimeMillis();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 1000000; i++) {
            sb.append("hello");
        }
        long endStringBuilder = System.currentTimeMillis();
        System.out.println("Using StringBuilder: " + (endStringBuilder - startStringBuilder) + "ms");

        // Using StringBuilder
        long l1 = System.currentTimeMillis();
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < 100000; i++) {
            stringBuffer.append("hello");
        }
        long l2 = System.currentTimeMillis();
        System.out.println("Using StringBuffer: " + (l2 - l1) + "ms");
    }
}
