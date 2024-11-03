package person;

public class Teacher extends Person {
    private String subject;

    public Teacher() {
        super();
        subject = "";
    }
    
    public Teacher(String name, int age, String subject) {
        super(name, age);
        this.subject = subject;
    }

    public String getSubject() {
        return this.subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }
    @Override
    public void print() {
        super.print();
        System.out.println("Mapel : " + subject);
    }
    
}
