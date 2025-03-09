public class Car {
    private String brand;
    private String model;
    private double fuelLevel;

    public void refuel(double amount){
        this.fuelLevel += amount;
    }

    public void drive(double distance){
        this.fuelLevel -= distance * 0.1;
    }
}
