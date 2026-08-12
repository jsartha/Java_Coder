package Inheritance;

public class single {

    public static void main(String[] args) {

        car c = new car();

        c.color = "Red";

        System.out.println("Color of car is: " + c.color);

        c.start();
        c.drive();
        c.hork();
        c.stop();
    }
}

class vehicle {

    protected String brand;
    String color;
   protected  int speed;

    void start() {
        System.out.println("Vehicle is started");
    }

    void stop() {
        System.out.println("Vehicle is stopped");
    }
}

class car extends vehicle {

    int number_of_doors;
    String fuel_type;

    void drive() {
        System.out.println("Car is driving");
    }

    void hork() {
        System.out.println("Car is honking");
    }
}