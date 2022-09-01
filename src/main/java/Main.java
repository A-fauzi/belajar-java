import java.awt.*;

/**
 * Untuk penamaan class di java harus sama dengan nama file
 */
public class Main {

    // main method
    public static void main(String[] args) {
        Constructor obj = new Constructor(); // buat object untuk memanggil attribute yang ada didalam class Constructor
        Constructor objConstructParam = new Constructor(10); // create object parameter
        System.out.println(obj.x);
        System.out.println(objConstructParam.x);

        Constructor car = new Constructor("Yariz", "Toyota", 2020); // buat object untuk menginisialisasikan property Car
        System.out.println("Car Name " + car.carName);
        System.out.println("Car Model " + car.carModel);
        System.out.println("Car Year " + car.carYear);

    }
}
