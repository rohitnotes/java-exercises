package _j_classes._j_1_Scanner;

public class CarScan {
    private String make;
    private int maxSpeed;

    public CarScan() {
    }

    public CarScan(String make, int maxSpeed) {
        this.make = make;
        this.maxSpeed = maxSpeed;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public String getMake() {
        return make;
    }

}