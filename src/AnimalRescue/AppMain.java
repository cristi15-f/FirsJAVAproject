package AnimalRescue;

public class AppMain {
public static void main (String[] args) {
    HORSE Drogon = new HORSE();
    System.out.println("The horse's name is " + Drogon.name);
    System.out.println("The horse's age is " + Drogon.age + " years ");
    System.out.println("The horse's gender is " + Drogon.gender);

    Drogon.eat();
    Drogon.run();
    Drogon.speak();


}


}
