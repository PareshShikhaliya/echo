package class10;

public class StringBuilderExample1 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        sb.append("Hello");
        sb.append(" ");
        sb.append("world");
        sb.append("!");
        sb.append("Paresh");
        String result = sb.toString();
        System.out.println(sb);
        System.out.println(result);
    }
}

