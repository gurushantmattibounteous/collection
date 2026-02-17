// ============================================================
// QUESTION 2: Shopping Cart System
// COLLECTION USED: ArrayList
//
// WHY ArrayList?
//   - Items CAN REPEAT (Milk appears twice - that's allowed)
//   - Maintains INSERTION ORDER (we want items in the order they were added)
//   - ArrayList allows duplicates + preserves order = perfect for a cart!
// ============================================================

import java.util.ArrayList;

public class Q2_ShoppingCart {
    public static void main(String[] args) {

        ArrayList<String> cart = new ArrayList<>();

        cart.add("Milk");   // Added 1st time
        cart.add("Bread");
        cart.add("Milk");   // Added 2nd time -> ArrayList ALLOWS this duplicate
        cart.add("Egg");

        System.out.println("=== Shopping Cart Items ===");
        for (String item : cart) {
            System.out.println(item);
        }

        
        System.out.println("Total items in cart: " + cart.size());
    }
}

