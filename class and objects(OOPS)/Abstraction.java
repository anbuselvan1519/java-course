public class Abstraction {
    public static void main(String[] args) {
        Car car = new Car();
        car.vehicleId = 1519;
        car.brand = "Bugatti";
        System.out.println(car.vehicleId);
        System.out.println(car.brand);
        car.RegulationCheck();
        car.SoftwareCheck();
    }
}

abstract class Vehicle {
    int vehicleId;
    String brand;

    public abstract void RegulationCheck();

    public abstract void SoftwareCheck();
}

class Car extends Vehicle {

    @Override
    public void RegulationCheck() {
        // check the regulation
        System.out.println("Regulation validated");
    }

    @Override
    public void SoftwareCheck() {
        // check the software
        System.out.println("Software validated");
    }
}
