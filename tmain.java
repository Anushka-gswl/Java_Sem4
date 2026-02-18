public class tmain {
    public static void main(String[] args) {
        try{
            //unchecked
            throw new ArithmeticException();//we can declare exception multiple times
        } catch (ArithmeticException e) {
            e.printStackTrace();
        }
    }
}
