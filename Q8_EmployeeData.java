// ============================================================
// QUESTION 8: Store Employee ID and Name
// COLLECTION USED: LinkedHashMap
//
// WHY LinkedHashMap?
//   - We need KEY = Employee ID (Integer), VALUE = Name (String)
//   - HashMap stores key-value pairs
//   - LinkedHashMap preserves INSERTION ORDER (101, 102, 103 in order)
//   - Plain HashMap doesn't guarantee order, so we use LinkedHashMap
// ============================================================
 
import java.util.LinkedHashMap;
import java.util.Map;
 
public class Q8_EmployeeData {
    public static void main(String[] args) {
 
        LinkedHashMap<Integer, String> employees = new LinkedHashMap<>();
 
        employees.put(101, "Rahul");
        employees.put(102, "Amit");
        employees.put(103, "Neha");
 
        
 
        System.out.println("=== Employee Directory ===");
 
        for (Map.Entry<Integer, String> entry : employees.entrySet()) {
            // entry.getKey()   -> gives the ID (101, 102, 103)
            // entry.getValue() -> gives the Name (Rahul, Amit, Neha)
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
 
        
        // Check if an ID exists:
        System.out.println("ID 105 exists? " + employees.containsKey(105));
    }
}
 
