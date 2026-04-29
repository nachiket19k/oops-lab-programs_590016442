import java.util.*;

public class MapExample {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();

        // Insertion
        map.put(1, "Apple");
        map.put(2, "Banana");
        map.put(3, "Cherry");
        System.out.println("After Insertion: " + map);

        // Updation
        map.put(2, "Mango");        // replaces Banana
        map.replace(3, "Grapes");   // replaces Cherry
        System.out.println("After Updation: " + map);

        // Deletion
        map.remove(1);
        map.remove(2, "Mango");     // conditional remove
        System.out.println("After Deletion: " + map);
    }
}