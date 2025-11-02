import java.util.*;  

public class VectorExample {
    public static void main(String[] args) {

        Vector<String> fruits = new Vector<>();

        // --- 2️⃣ Add elements ---
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Mango");

        // Add element at specific index
        fruits.add(1, "Orange");

        // --- 3️⃣ Access elements ---
        System.out.println("First fruit: " + fruits.firstElement());
        System.out.println("Last fruit: " + fruits.lastElement());
        System.out.println("Fruit at index 2: " + fruits.get(2));

        // --- 4️⃣ Update elements ---
        fruits.set(2, "Grapes");  // Replace element at index 2

        // --- 5️⃣ Remove elements ---
        fruits.remove("Apple");  // Remove by value
        fruits.remove(1);        // Remove by index

        // --- 6️⃣ Check size and capacity ---
        System.out.println("Size: " + fruits.size());
        System.out.println("Capacity: " + fruits.capacity()); // default capacity 10, doubles automatically

        // --- 7️⃣ Traversal methods ---
        System.out.println("\nTraversal using for-each:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        // System.out.println("\nTraversal using Iterator:");
        // Iterator<String> itr = fruits.iterator();
        // while (itr.hasNext()) {
        //     System.out.println(itr.next());
        // }

        // System.out.println("\nTraversal using Enumeration (old-style):");
        // Enumeration<String> e = fruits.elements();
        // while (e.hasMoreElements()) {
        //     System.out.println(e.nextElement());
        // }

        // --- 8️⃣ Check for element existence ---
        if (fruits.contains("Mango")) {
            System.out.println("Mango is in the list!");
        } else {
            System.out.println("Mango is not present.");
        }

        // --- 9️⃣ Clear all elements ---
        fruits.clear();
        System.out.println("\nAfter clearing: " + fruits);
    }
}
