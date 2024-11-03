package person;

public class FullTime extends Teacher {
    private String unit;
    private int anualSalary;
    
    public FullTime() {
        super();
        unit = "";
        anualSalary = 0;
    }
    
    public FullTime(String name, int age, String subject,
    String unit, int anualSalary) {
        super(name, age, subject);
        this.unit = unit;
        this.anualSalary = anualSalary;
    }

    public String getUnit() {
        return this.unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public int getAnualSalary() {
        return this.anualSalary;
    }

    public void setAnualSalary(int anualSalary) {
        this.anualSalary = anualSalary;
    }
    
    @Override
    public void print(){
        super.print();
        System.out.println("Unit : " + unit);
        System.out.println("Gaji Bulanan : " + anualSalary);
        System.out.println("-----------------");
    }
    
}
