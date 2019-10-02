package sk.itsovy.dolinsky.family;

/**
 * @author Martin Dolinsky
 */
public class Calculator {
    private String title;
    private boolean power;


    public Calculator() {
    }


    public Calculator(String brand) {
        this.title = brand;
        power = false;
    }

    public int add(int a, int b) {
        if (isPower()) {
            int result = a + b;
            return result;
        } else {
            return 0;
        }
    }

    public int calculateSquareArea(int side) {
        if (isPower()) {
            return side * side;
        } else {
            return 0;
        }

    }

    public double calculateDiagonalRectangle(int a, int b) {
        if (isPower()) {
            double c = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
            return c;
        } else {
            return 0;
        }
    }

    public double calculateCircleArea(double r) {
        if (isPower()) {
            return Math.PI * Math.pow(r, 2);
        } else {
            return 0;
        }
    }

    public double convertCmToInch(double value) {
        if (isPower()) {
            return value * 0.393700787;
        } else {
            return 0;
        }
    }

    public double convertInchToCm(double value) {
        if (isPower()) {
            return value * 2.54;
        } else {
            return 0;
        }
    }

    public void toggle() {
        // power =! power;
        if (isPower()) {
            turnOff();
        } else {
            turnOn();
        }
    }

    public String convertDecimalToBinary(int value) {
        if (isPower()) {
            return Integer.toBinaryString(value);
        } else {
            return null;
        }

    }

    public String convertDecimalToHexadecimal(int value) {
        if (isPower()) {
            return Integer.toHexString(value);
        } else {
            return null;
        }
    }

    /**
     * Arithmetic average
     *
     * @param number1 number
     * @param number2 number
     * @param number3 number
     * @return average of numbers parsed to double
     */
    public double getAverage(int number1, int number2, int number3) {
        if (isPower()) {
            return (double) (number1 + number2 + number3) / 3;
        } else {
            return 0;
        }
    }

    public double getSphereVolume(double radius) {
        if (isPower()) {
            return ((4.0 / 3) * Math.PI) * radius * radius * radius;
        } else {
            return 0;
        }


    }

    public float getBlockArea(float aSide, float bSide, float cSide) {
        //S = 2.(a.b+a.c+b.c)
        if (isPower()) {
            return 2 * (aSide * bSide + aSide * cSide + bSide * cSide);
        } else {
            return 0;
        }

    }

    public boolean isPower() {
        return power;
    }

    public void turnOn() {
        power = true;
    }

    public void turnOff() {
        power = false;
    }

    public String getTitle() {
        return title;
    }
}
