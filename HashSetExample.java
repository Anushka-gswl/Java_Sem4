import java.util.HashSet;

// A HashSet is a collection that does not allow duplicate elements and does not maintain any order.
// It is part of the Java Collection Framework and implements the Set interface.
// HashSet is backed by a hash table, which provides constant time performance for basic operations like add, remove, and contains.
// In a HashSet, the elements are stored in a hash table, and the hash code of the elements is used to determine their position in the table.
// When you add an element to a HashSet, it calculates the hash code of the element and uses it to determine where to store the element in the hash table.
// If two elements have the same hash code, they will be stored in the same bucket,
// and the HashSet will use the equals() method to determine if the elements are equal or not.
// Allows one null element, but only one because it does not allow duplicates.

// add - to insert element, returns false if element already exists
// remove - to remove element, returns false if element does not exist
// size - to get the number of elements in the set
// clear - to remove all elements from the set
// contains - to check if element exists, returns true or false
// iterator - to iterate through the elements in the set

// Note: The order of elements in a HashSet is not guaranteed, and it may change over time as elements are added or removed.
public class HashSetExample {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();

        set.add("Apple");
        set.add("Banana");
        set.add("Orange");
        set.add("Mango");
        set.add("Apple"); // Duplicate element

        System.out.println("HashSet: " + set);

        set.remove("Orange");
        System.out.println("HashSet after removing 'Orange': " + set);

        set.add("Grapes");
        System.out.println("HashSet after adding 'Grapes': " + set);

        boolean containsMango = set.contains("Mango");
        System.out.println("HashSet contains 'Mango': " + containsMango);

        System.out.print("Elements in HashSet: ");
        for (String element : set) {
            System.out.print(element + " ");
        }
        System.out.println();
        
        System.out.println("Size of HashSet: " + set.size());

        set.clear();
        System.out.println("HashSet after clear: " + set);
    }
}
