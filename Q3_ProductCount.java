// ============================================================
// QUESTION 3: Count Number of Each Product
// COLLECTION USED: HashMap
//
// WHY HashMap?
//   - We need KEY = product name, VALUE = count
//   - HashMap stores KEY-VALUE pairs
//   - Example: {"Apple" -> 3, "Mango" -> 2, "Banana" -> 1}
//   - getOrDefault() helps us easily count without NullPointerException
// ============================================================

import java.util.HashMap;

public class Q3_ProductCount {
    public static void main(String[] args) {

        HashMap<String, Integer> productCount = new HashMap<>();

        String[] products = {"Apple", "Mango", "Apple", "Banana", "Mango", "Apple"};

        for (String product : products) {

           

            int currentCount = productCount.getOrDefault(product, 0);
            productCount.put(product, currentCount + 1);

            
        }

        System.out.println("=== Product Count ===");
        for (String key : productCount.keySet()) {
            System.out.println(key + " : " + productCount.get(key));
        }
    }
}
