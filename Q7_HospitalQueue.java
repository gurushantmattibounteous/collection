// ============================================================
// QUESTION 7: Queue System (First Come First Serve)
// COLLECTION USED: Queue (implemented by LinkedList)
//
// WHY Queue?
//   - Queue follows FIFO: First In, First Out
//   - Patient1 arrives first -> served first
//   - Just like a real hospital queue!
//   - poll() removes and returns the FRONT element (oldest patient)
//   - offer() adds to the BACK of the queue (new patient joins end)
// ============================================================
 
import java.util.Queue;
import java.util.LinkedList;
 
public class Q7_HospitalQueue {
    public static void main(String[] args) {
 
        // Step 1: Create a Queue using LinkedList
        // Queue<String> is the INTERFACE
        // LinkedList is the IMPLEMENTATION (it implements Queue)
        Queue<String> hospitalQueue = new LinkedList<>();
 
        hospitalQueue.offer("Patient1");  // Queue: [Patient1]
        hospitalQueue.offer("Patient2");  // Queue: [Patient1, Patient2]
        hospitalQueue.offer("Patient3");  // Queue: [Patient1, Patient2, Patient3]
 
        // poll() -> removes and returns the FIRST element (FIFO)
        System.out.println("=== Hospital Queue - FCFS ===");
 
        while (!hospitalQueue.isEmpty()) {
            // poll() takes the patient at the front of the queue
            String patient = hospitalQueue.poll();
            System.out.println("Serving: " + patient);
        }
 
    
        // -----------------------------------------------
        // KEY Queue Methods:
        // offer(e) -> Add to back of queue
        // poll()   -> Remove and return from front (returns null if empty)
        // peek()   -> Look at front WITHOUT removing (returns null if empty)
        // isEmpty()-> Check if queue has no elements
        // -----------------------------------------------
    }
}
 
