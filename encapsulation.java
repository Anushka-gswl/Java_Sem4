public class encapsulation {
    //variable private

    private int rollno;
    private String name;
    private int marks;

    //2nd method public setter/getter method
    public void setRollNo(int rollno){
        this.rollno=rollno;
    }
    public void setName(String name){
        this.name=name;
    }   
    public void setMarks(int marks){
        if(marks>=0 && marks<=100){
            this.marks=marks;
        }
        else{
            System.out.println("Invalid marks");
        }
    }
    
    //getter
    public int getRollNo(){
        return rollno;
    }
    public String getName(){
        return name;
    }
    public int getMarks(){
        return marks;
    }

    public static void main(String[] args){
        encapsulation s1=new encapsulation();
        s1.setRollNo(258);
        s1.setName("Anushka Jaiswal");
        s1.setMarks(90);
        System.out.println("Roll No: "+s1.getRollNo());
        System.out.println("Name: "+s1.getName());
        System.out.println("Marks: "+s1.getMarks());
    }
}
