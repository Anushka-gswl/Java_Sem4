abstract class vehicle {
    abstract void start();
    void fuel(){
        System.out.println("fuel");
    }
}
class car extends vehicle{
    void start(){
        System.out.println("car started");
    }
}
class bike extends vehicle{
    void start(){
        System.out.println("bike started");
    }
}
public class abstraction {
    public static void main(String[] args) {
        car c = new car();
        c.start();
        c.fuel();
        bike b = new bike();
        b.start();
        b.fuel();
    }
}