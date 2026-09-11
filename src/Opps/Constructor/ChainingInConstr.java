package Opps.Constructor;

public class ChainingInConstr {

    public static void main(String[] args) {

        Students s1 = new Students();
        Students s2 = new Students("Ranjan");
        Students s3 = new Students("Rahul",30);
        Students s4 = new Students("honaan",40,44);
        Students s5 = new Students("honaan",40,44, "NIET");


//        System.out.println(s3.college);

        Students2 newS1 = new Students2("Ranjan");
//        Students newS2 = new Students("Ranjan");
//        Students newS3 = new Students("Rahul",30);
//        Students newS4 = new Students("honaan",40,44);
//        Students newS5 = new Students("honaan",40,44, "NIET");

        System.out.println(newS1.college);
    }
}

class Students {
    String name;
    int age;
    int rollNo;
    String college;


    Students() {
//        this.name = "Unknown";
//        this.age = 0;
//        this.rollNo = 0;
//        this.college = "unknown";

        this("Unknown");

    }

    Students(String name) {

        this(name,0,0,"unknown");
    }

    Students(String name, int age){
        this(name,age,0,"unknown");
    }

    Students(String name, int age, int rollNo){
        this(name,age,rollNo,"unknown");
    }

    Students(String name, int age, int rollNo,String college){
        this.name = name;
        this.age = age;
        this.rollNo = rollNo;
        this.college = college;

    }
}

class Students2 {
    String name;
    int age;
    int rollNo;
    String college;


    Students2() {
//        this.name = "Unknown";
//        this.age = 0;
//        this.rollNo = 0;
//        this.college = "unknown";

        this("Unknown");

    }

    Students2(String name) {
        this(name,0);
        System.out.println("i am in first constructor");
    }

    Students2(String name, int age){
        this(name,age,0);
        System.out.println("i am in second constructor");
    }

    Students2(String name, int age, int rollNo){
        this(name,age,rollNo,"unknown");
        System.out.println("i am in third constructor");
    }

    Students2(String name, int age, int rollNo,String college){
        this.name = name;
        this.age = age;
        this.rollNo = rollNo;
        this.college = college;
        System.out.println("i am in forth constructor");

    }
}


