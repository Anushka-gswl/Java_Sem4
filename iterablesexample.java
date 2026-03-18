import java.util.ArrayList;
import java.util.Iterator;
public class iterablesexample {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();

        names.add("Naitik");
        names.add("Kartik");
        names.add("Abhimanyu");

        Iterator<String> it = names.iterator();
        
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}