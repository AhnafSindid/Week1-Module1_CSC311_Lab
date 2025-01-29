public class Car extends Vehicle {
    public String brand;

    public Car(int numberOfWheels, String color, float engineSize, String fuelType) {
        super(numberOfWheels, color, engineSize, fuelType);
    }
    public static void honk(){
        System.out.println("Honk, honk");
    }
    public void displayInfo(){
        System.out.println("Brand: " + brand);
        System.out.println("Number of Wheels: " + numberOfWheels);
        System.out.println("Color: " + color);
        System.out.println("Engine Size: " + engineSize);
        System.out.println("Fuel Type: " + fuelType);
    }
}
