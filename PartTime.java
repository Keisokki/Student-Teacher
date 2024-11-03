package person;

public class PartTime extends Teacher{
    private int hoursWorked;
    private int salary;

    public int getSalary() {
        return this.salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
    
    public PartTime(String name, int age, String subject, int hoursWorked1, int salary) {
        super();
        hoursWorked = 0;
        salary = 0;
    }
    
    public PartTime(String name, int age,
    String subject, int hoursWorked) {
        super(name, age, subject);
        this.hoursWorked = hoursWorked;
    }

    public int getHoursWorked() {
        return this.hoursWorked;
    }

    public void setHoursWorked(int hoursWorked) {
        this.hoursWorked = hoursWorked;
    }
    @Override
    public void print() {
        super.print();
        System.out.println("Jam Kerja : " + hoursWorked);
        System.out.println("Total gaji :" + salary);
    }

}
