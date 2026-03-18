import java.util.ArrayList;
import java.util.Collection;
public class collectionInterface {
    public static void main(String[] args) {
        Collection<String> fruits = new ArrayList<>();

        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");
        fruits.add("Mango");

        System.out.println("Fruits"+fruits);
        
        System.out.println(fruits.size());   
    }
}
