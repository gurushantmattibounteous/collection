// ============================================================
// QUESTION 5: Maintain Order of Tasks
// COLLECTION USED: LinkedList (or ArrayList)
//
// WHY LinkedList?
//   - Maintains INSERTION ORDER (tasks appear in the order you added them)
//   - Both ArrayList and LinkedList work here
//   - LinkedList is preferred when you frequently add/remove from front or back
//   - ArrayList is better for random access (get by index)

// ============================================================
 
import java.util.LinkedList;
 
public class Q5_TaskOrder {
    public static void main(String[] args) {
 
        LinkedList<String> tasks = new LinkedList<>();
 
        tasks.add("Task1");   
        tasks.add("Task2");   
        tasks.add("Task3");   
 
        // Step 3: Print tasks in insertion order
        System.out.println("=== Tasks in Order ===");
        for (String task : tasks) {
            System.out.println(task);
        }
 
       
    }
}
 

 