package Opps.Constructor;


class Student {

    String name;
    int age;
    int rollNo;
    String college;

    Student(){ // this is default constructor -->
        name = "Ranjan";
        age = 20;
        rollNo = 333;
        college = "NIET";
    }
}
public class defaultConstructor {
    public static void main(String[] args) {

        Student s = new Student();
        System.out.println(s.name);

    }
}
