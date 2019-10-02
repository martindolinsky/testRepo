package sk.itsovy.dolinsky.family;

/**
 * @author Martin Dolinsky
 */
public class Car {
    private String brand;
    private String model;
    private String plate_number;
    private int power;


    public Car() {
    }

    public Car(String brand, String model, String plate_number, int power) {
        this.brand = brand;
        this.model = model;
        this.plate_number = plate_number;
        this.power = power;
    }

    public double calculateHorsePowers() {
        double horse_power = 1.34102209;
        return power * horse_power;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getPlate_number() {
        return plate_number;
    }

    public void setPlate_number(String plate_number) {
        this.plate_number = plate_number;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }
}
