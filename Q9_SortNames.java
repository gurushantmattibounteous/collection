// ============================================================
// QUESTION 9: Sort Names Alphabetically
// COLLECTION USED: TreeSet
//
// WHY TreeSet?
//   - TreeSet automatically sorts elements in NATURAL ORDER (A-Z for Strings)
//   - No need to call Collections.sort() separately
//   - As soon as you add an element, it goes to its correct sorted position
//   - It Also removes duplicates (like HashSet) - bonus feature!
// ============================================================
 
import java.util.TreeSet;
import java.util.ArrayList;
import java.util.Collections;
 
public class Q9_SortNames {
    public static void main(String[] args) {
 
      
        TreeSet<String> sortedNames = new TreeSet<>();
 
        sortedNames.add("Rahul");   // TreeSet: [Rahul]
        sortedNames.add("Amit");    // TreeSet: [Amit, Rahul]   <- Amit comes before Rahul
        sortedNames.add("Neha");    // TreeSet: [Amit, Neha, Rahul] <- Neha fits between
 
        System.out.println("=== Sorted Names (TreeSet) ===");
        System.out.println(sortedNames); 
 
        System.out.println(String.join(", ", sortedNames));
 
 
        
}
 
}
