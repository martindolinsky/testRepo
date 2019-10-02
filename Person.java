package sk.itsovy.dolinsky.family;

/**
 * @author Martin Dolinsky
 */
public class Person {

    private String name;
    private int age;
    private boolean gender; //T.. man F.. female
    private double height;
    private int weight;
    private char status; //S.. single, M.. married, D.. divorced, W.. widow
    private Mobile mobile;
    private Car car;
    private Calculator calc;

    public Person(String name, int age, boolean gender, double height, int weight, char status, Mobile mobile, Car car) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.height = height;
        this.weight = weight;
        this.status = status;
        this.mobile = mobile;
        this.car = car;
    }

    public Person() { //bezparametricky konstruktor
    }


    public void about() {
        System.out.println("Hello, I am class Person.");
    }

    public double calculateBMI() {
        double bmi;
        bmi = weight / (height * height);
        return bmi;
    }

    public String getBMIstatus() {
        if (calculateBMI() >= 20 && calculateBMI() <= 25) {
            return "Optimal weight.";
        }
        if (calculateBMI() < 20 && calculateBMI() >= 15) {
            return "Underweight.";
        }
        if (calculateBMI() > 25 && calculateBMI() <= 30) {
            return "Overweight.";
        } else {
            return "Not known value yet.";
        }
    }

    public int getBirthYear() {
        int actual_year = 2019;
        int birth_year = actual_year - age;
        return birth_year;
    }

    public boolean hasMobile() {
        if (mobile == null) {
            return false;
        } else {
            return true;
        }

    }

    public boolean hasCar() {
        if (car == null) {
            return false;
        } else {
            return true;
        }
    }

    public boolean hasCalculator() {
        if (calc == null) {
            return false;
        } else {
            return true;
        }
    }

    public void print() {
        System.out.println("------------------------------------------------------");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Height/weight : " + height + " / " + weight);
        System.out.println("BMI: " + calculateBMI() + " (" + getBMIstatus() + ")");
        if (gender) {
            System.out.println("Gender: male");
        } else {
            System.out.println("Gender: female");
        }
        System.out.println("Status: " + status);
        if (hasMobile()) {
            System.out.println("Mobile Phone: " + mobile.getPhoneNumber());
        }
        if (hasCar()) {
            System.out.println("Car: " + car.getBrand() + " " + car.getModel() +
                    " " + car.getPlate_number() + " " + car.calculateHorsePowers() + " HP");
        }
        if (hasCalculator()) {
            System.out.println("Calculator: " + calc.getTitle());
        }

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public char getStatus() {
        return status;
    }

    public void setStatus(char status) {
        this.status = status;
    }

    public Mobile getMobile() {
        return mobile;
    }

    public void setMobile(Mobile mobile) {
        this.mobile = mobile;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public Calculator getCalc() {
        return calc;
    }

    public void setCalc(Calculator calc) {
        this.calc = calc;
    }
}
