import java.util.HashSet;
import java.util.Set;

// Part of Java Collection Framework 
// Does not allow duplicate elements
// Does not maintain insertion order
// HashSet is used for fast access and retrieval of elements in Set
// add - to insert element, returns false if element already exists
// remove - to remove element, returns false if element does not exist
// contains - to check if element exists, returns true or false
// size - to get the number of elements in the set
// clear - to remove all elements from the set
// Note: Set is an interface, and HashSet is a class that implements the Set interface
public class SetExample {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();

        set.add("Apple");
        set.add("Banana");
        set.add("Orange");
        set.add("Mango");
        set.add("Apple"); // Duplicate element, will not be added

        System.out.println("Set: " + set);
        
        System.out.println("Contains 'Banana': " + set.contains("Banana"));

        set.remove("Orange");
        System.out.println("Set after removing 'Orange': " + set);

        set.add("Grapes");
        System.out.println("Set after adding 'Grapes': " + set);
        
        System.out.println("Size of Set: " + set.size());
        
        set.clear();
        System.out.println("Set after clear: " + set);
        
    }
}
