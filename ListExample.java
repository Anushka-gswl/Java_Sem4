import java.util.ArrayList;
import java.util.List;

public class ListExample {
    public static void main(String[] args) {
        List<String> List = new ArrayList<>();

        List.add("Alice");
        List.add("Bob");
        List.add("Charlie");

        System.out.println("Names: " + List);
        
        System.out.println("Element at index 1: " + List.get(1));
        List.set(1,"David");
        System.out.println("Updated Names: " + List);
        List.remove(0);
        System.out.println("After removing element at index 0: " + List);
        System.out.println("Size of Names list: " + List.size());
    }
}
