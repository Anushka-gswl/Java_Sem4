public class salary {
    private String name;
    private double salary;
    
    public void setName(String name){
        this.name=name;
    }
    public void setSalary(double salary){
        if(salary>=0){
            this.salary=salary;
        }
        else{
            System.out.println("Invalid salary");
        }
    }
    public String getName(){
        return name;
    }
    public double getSalary(){
        return salary;
    }
    public static void main(String[] args) {
        salary s1=new salary();
        s1.setName("Anushka Jaiswal");
        s1.setSalary(-50000);
        System.out.println("Name: "+s1.getName());
        System.out.println("Salary: "+s1.getSalary());
    }
}
