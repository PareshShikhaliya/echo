package class17;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample1 {
    public static void main(String[] args) {
        Map<String, Integer> studentScores = new HashMap<>();

        studentScores.put("Alice", 95);
        studentScores.put("Bob", 85);
        studentScores.put("Charlie", 90);

        int aliceScore = studentScores.get("Alice");
        System.out.println("Alice's score: " + aliceScore);

        studentScores.put("Bob", 90);

        boolean containsCharlie = studentScores.containsKey("Charlie");
        System.out.println("Does the map contain Charlie? " + containsCharlie);

        System.out.println("Printing all entries:");
        for (Map.Entry<String, Integer> entry : studentScores.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
