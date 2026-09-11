package Opps.classObject;

class Student {
    String name;
    int age;
    int rollNumber;
    String college;

    void markAttadance() {
        System.out.println("Attendance marked by " + name);
    }

    void print() {
        System.out.println(name + " " + age + " " + rollNumber + " " + college);
    }
}

public class class_1 {

    public static void main(String[] args) {
        Student s = new Student();
        s.name = "Ranjan";
        s.age = 20;
        s.rollNumber = 115;
        s.college = "NIET";

        s.markAttadance();
        s.print();
    }
}

// Java is almost object oriented programming language

