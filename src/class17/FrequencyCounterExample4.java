package class17;

import java.util.HashMap;
import java.util.Map;

public class FrequencyCounterExample4 {
    public static void main(String[] args) {
        int[] numbers = { 1, 2, 3, 2, 1, 3, 4, 5, 4, 4, 5, 5, 5 };

        Map<Integer, Integer> frequencyMap = new HashMap<>();

        // Count the frequency of each number
        for (int num : numbers) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }

        // Print the frequency of each number
        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            System.out.println("Number: " + entry.getKey() + ", Frequency: " + entry.getValue());
        }
    }
}
