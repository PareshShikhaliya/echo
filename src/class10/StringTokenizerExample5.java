package class10;

import java.util.StringTokenizer;

public class StringTokenizerExample5 {
    public static void main(String[] args) {
        String inputString = "The quick brown fox jumps over the lazy dog";
        StringTokenizer tokenizer = new StringTokenizer(inputString);
        System.out.println("countTokens=="+tokenizer.countTokens());
        //hasMoreTokens
        //nextToken
        while (tokenizer.hasMoreTokens())
        {
            String token = tokenizer.nextToken();
            System.out.println(new StringBuilder(token).reverse());
        }
    }
}
