import java.sql.SQLOutput;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle(4, "Red", 1.2f, "Diesel");Car.honk();
        System.out.println("Number of wheels: " + vehicle.getNumberOfWheels());
        System.out.println("color: " + vehicle.getColor());
        System.out.println("Engine Size: " + vehicle.getEngineSize());
        System.out.println("Fuel Type: " + vehicle.getFuelType());
        System.out.println();
    }
}