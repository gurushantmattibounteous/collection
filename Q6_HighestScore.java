// ============================================================
// QUESTION 6: Find Highest Score
// COLLECTION USED: ArrayList + Collections.max()
//
// WHY ArrayList + Collections.max()?
//   - ArrayList stores all scores (allowing duplicates)
//   - Collections.max() scans the entire list and returns the highest value
//   - Alternatively, you could use Collections.sort() and pick the last element
// ============================================================
 
import java.util.ArrayList;
import java.util.Collections;
 
public class Q6_HighestScore {
    public static void main(String[] args) {
 
        ArrayList<Integer> scores = new ArrayList<>();
 
        scores.add(45);
        scores.add(67);
        scores.add(89);
        scores.add(34);
 
        
        int highestScore = Collections.max(scores);
 
        System.out.println("Highest Score: " + highestScore);
 
        
    }
}
 
// EXPECTED OUTPUT:
// Highest Score: 89
// Highest Score (manual): 89