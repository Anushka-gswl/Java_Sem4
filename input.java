import java.util.Scanner;
public class input {
    public static void main(String[] args) {
        System.out.println("Enter your name: ");
        Scanner s = new Scanner(System.in);
        String name = s.nextLine();
        System.out.println("Hello, " + name + "!");
        System.out.println("Enter num: ");
        Scanner s1 = new Scanner(System.in);
        int num = s1.nextInt();
        System.out.println("You entered: " + num);
        s.close();
        s1.close();
    }
}