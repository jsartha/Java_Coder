package Inheritance;

public class hierchical {

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


class  bike extends vehicle {

    int number_of_wheels;
    String fuel_type;

    void ride() {
        System.out.println("Bike is riding");
    }

    void hork() {
        System.out.println("Bike is honking");
    }
}


class truck extends vehicle {

    int number_of_wheels;
    String fuel_type;

    void drive() {
        System.out.println("Truck is driving");
    }

    void hork() {
        System.out.println("Truck is honking");
    }
}