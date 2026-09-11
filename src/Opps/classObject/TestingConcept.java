package Opps.classObject;

public class TestingConcept {
    public static void main(String[] args) {
        Student1 s1 = new Student1();
        s1.name = "Ranjan";
        s1.age = 20;
        s1.rollnumber = 30;
        s1.college = "NIET";

        // Constructor ---> To create an Object

        System.out.println(s1.name);
        System.out.println(s1.age);
        System.out.println(s1.rollnumber);
        System.out.println(s1.college);

//        int x; // local variable --> No default values
//        System.out.println(x);


    }
}

class Student1 {
    String name; // information/data/characteristics ---> instance variables
    int age;
    int rollnumber;
    String college;

    void markAttendance() { // behaviour --> functions --> instance methods
        System.out.println("Attendance marked for student "+ name);
    }
}
