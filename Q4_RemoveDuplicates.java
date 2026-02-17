// ============================================================
// QUESTION 4: Remove Duplicate Numbers
// COLLECTION USED: LinkedHashSet
//
// WHY LinkedHashSet?
//   - Set = removes duplicates automatically
//   - Linked = keeps insertion ORDER (so 1,2,3,4 not jumbled)
//   - We simply add all numbers -> duplicates are silently dropped
// ============================================================

import java.util.LinkedHashSet;
import java.util.Arrays;
import java.util.List;

public class Q4_RemoveDuplicates {
    public static void main(String[] args) {

        int[] numbers = {1, 2, 3, 2, 4, 1};

        LinkedHashSet<Integer> uniqueNumbers = new LinkedHashSet<>();

        for (int num : numbers) {
            uniqueNumbers.add(num);
            
        }

        System.out.println("=== After Removing Duplicates ===");
        System.out.println(uniqueNumbers); // Prints: [1, 2, 3, 4]

        StringBuilder sb = new StringBuilder();
        for (int num : uniqueNumbers) {
            sb.append(num).append(", ");
        }
        String result = sb.toString().replaceAll(", $", "");
        System.out.println(result); // Output: 1, 2, 3, 4
    }
}

