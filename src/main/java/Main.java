import java.util.Scanner;

/**
 * Untuk penamaan class di java harus sama dengan nama file
 */
public class Main {
    // main method
    public static void main(String[] args) {
        Car car = new Car();
        String carModel = car.getModelName();
        String carBrand = car.brand;

        System.out.println("Car Brand: " + carBrand);
        System.out.println("Car Model: " + carModel);
        car.honk();

        String newCarModel = car.setModelName("Shelby");
        System.out.println("Car Brand: " + carBrand);
        System.out.println("Car Model: " + newCarModel);
        car.honk();

    }
}
