package Inheritance;

public class FunctionAccess {

    public static void main(String[] args) {

        Vehicle vehicle = new Vehicle();

        vehicle.accessData();
    }
}

class Vehicle {

    String name;
    int id;

    private void modelData() {
        System.out.println("Store model data");
    }

    public void accessData() {
        modelData();   // ✅ Private method accessed inside same class
    }
}