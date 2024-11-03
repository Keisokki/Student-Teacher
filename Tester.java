package person;

import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Masukkan nama: ");
        String name = scanner.nextLine();
        System.out.println("Masukan umur : ");
        int age = scanner.nextInt();
        System.out.println("Pilih: 1. Murid / 2. Guru (Gunakan angka) ");
        int choice = scanner.nextInt();
        
        switch (choice) {
            case 1:
                System.out.println("Masukkan jurusan : ");
                String major = scanner.next();
                System.out.println("Masukkan score : ");
                int score = scanner.nextInt();
                System.out.println("Masukkan absen : ");
                int studentNumber = scanner.nextInt();
                Student s = new Student(name, age, major,
                        score, studentNumber);
                s.print();
                break;
            case 2:
                System.out.println("Masukkan mapel: ");
                String subject = scanner.next();
                System.out.println("Pilih 1. Full time / 2. Part time (Gunakan angka)");
                int type = scanner.nextInt();
                if (type == 1){
                    System.out.println("Masukkan unit : ");
                    String unit = scanner.next();
                    System.out.println("Masukkan gaji : ");
                    int salary = scanner.nextInt();
                    FullTime ft = new FullTime(name, age, subject,
                            unit, salary);
                    ft.print();
                } else if (type == 2){
                    System.out.println("Masukkan total jam pelajaran: ");
                    int hoursWorked = scanner.nextInt();
                    System.out.println("Masukkan gaji per jam pelajaran: ");
                    int gajiPerJam = scanner.nextInt();
                    int salary = hoursWorked*gajiPerJam;
                    
                    PartTime pt = new PartTime(name, age, subject,
                            hoursWorked, salary);
                    pt.print();
                }   
                break;
            default:
                System.out.println("Pilihan anda tidak ada");
                break;
        }
    }
}
