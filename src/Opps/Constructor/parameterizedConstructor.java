package Opps.Constructor;

public class parameterizedConstructor {
    public static void main(String[] args) {

        Customer cus = new Customer("AK", 98,"Sanwich",20);
        System.out.println(cus.name);

    }
}

class Customer {
    String name;
    int idNo;
    String likeDises;
    int age;

    Customer(String name, int id, String fav, int age){
        this.name = name;
        this.idNo = id;
        this.likeDises = fav;
        this.age = age;

    }


}
