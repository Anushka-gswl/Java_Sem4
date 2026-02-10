class person{
    String name;
    int age;

    void displayPerson(){
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}
//sub class
class student extends person{
    int rollNo;

    void displayStudent(){
        System.out.println("Roll No: " + rollNo);
    }
}
public class overloading {
    
    public static void main(String[] args) {
        student s = new student();
        s.name = "Anushka Jaiswal";
        s.age = 20;
        s.rollNo = 25;

        s.displayPerson();
        s.displayStudent();
    }
}
