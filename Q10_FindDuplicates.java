// ============================================================
// QUESTION 10: Find Duplicate Elements
// COLLECTION USED: HashSet (to track seen elements) + ArrayList (for duplicates)
//
// LOGIC:
//   - Create a "seen" HashSet -> tracks which numbers we've already encountered
//   - Create a "duplicates" LinkedHashSet -> stores numbers that appear more than once
//   - For each number:
//       If it's NOT in "seen" -> add to seen (first time we see it)
//       If it IS already in "seen" -> it's a duplicate! Add to duplicates list
// ============================================================
 
import java.util.HashSet;
import java.util.LinkedHashSet;
 
public class Q10_FindDuplicates {
    public static void main(String[] args) {
 
        // Step 1: Input array with duplicates
        int[] numbers = {1, 2, 3, 2, 4, 1};
 
        // Step 2: HashSet to track which numbers we've ALREADY SEEN
        HashSet<Integer> seen = new HashSet<>();
 
        // Step 3: LinkedHashSet to collect DUPLICATES (no repeat duplicates + preserves order)
        LinkedHashSet<Integer> duplicates = new LinkedHashSet<>();
 
        // Step 4: Loop through each number and find duplicates
        for (int num : numbers) {
 
            // seen.contains(num) -> checks if we've seen this number before
            if (seen.contains(num)) {
                // YES, we've seen it before -> it's a DUPLICATE
                duplicates.add(num);
                // Using LinkedHashSet for duplicates ensures we don't print "1" twice
                // even if 1 appears 3 times in the input
 
            } else {
                // NO, first time seeing this number -> mark it as seen
                seen.add(num);
            }
 
            // Step-by-step trace:
            // num=1: seen={}, contains? NO  -> seen={1},       duplicates={}
            // num=2: seen={1}, contains? NO  -> seen={1,2},     duplicates={}
            // num=3: seen={1,2}, contains? NO -> seen={1,2,3},  duplicates={}
            // num=2: seen={1,2,3}, contains? YES -> duplicates={2}
            // num=4: seen={1,2,3}, contains? NO -> seen={1,2,3,4}, duplicates={2}
            // num=1: seen={1,2,3,4}, contains? YES -> duplicates={2,1}
        }
 
        // Step 5: Print the duplicates
        System.out.println("=== Finding Duplicates ===");
 
        if (duplicates.isEmpty()) {
            System.out.println("No duplicates found!");
        } else {
            // Format: Duplicates: 2, 1
            System.out.print("Duplicates: ");
            System.out.println(String.join(", ",
                duplicates.stream().map(String::valueOf).toArray(String[]::new)));
        }
 
        // -----------------------------------------------
        // ALTERNATIVE: Without streams (simpler for beginners)
        // -----------------------------------------------
        StringBuilder sb = new StringBuilder("Duplicates: ");
        for (int dup : duplicates) {
            sb.append(dup).append(",");
        }
        // Remove last comma
        if (sb.charAt(sb.length() - 1) == ',') {
            sb.deleteCharAt(sb.length() - 1);
        }
        System.out.println(sb.toString());
    }
}
 
// EXPECTED OUTPUT:
// Duplicates: 2, 1
//
// NOTE: Output says "1,2" in question, but 2 appears before 1 in the array
// Our code correctly reports 2 first (since 2 is the first duplicate found),
// then 1. If exact order "1,2" is needed, sort the duplicates set.
 