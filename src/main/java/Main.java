import java.awt.*;

/**
 * Untuk penamaan class di java harus sama dengan nama file
 */
public class Main {

    // main method
    public static void main(String[] args) {
        greeting("boyan");

        // Call myStaticMethod()
        myStaticVoid();

        // Call myPublicMethod()
        Main objPublicMethod = new Main();
        objPublicMethod.myPublicVoid();

        // Access method an object Car
        Main car = new Main();
        car.fullThrottle();
        car.speed(200);

    }

    // Method class java
    public static void greeting(String name) {
        System.out.println("Hello " + name);
    }

    // static vs non static
    // Anda akan sering melihat program Java yang memiliki salah satu static atau public atribut dan metode.
    // Pada contoh di atas, kami membuat sebuah static metode,
    // yang berarti dapat diakses tanpa membuat objek kelas, tidak seperti public, yang hanya dapat diakses oleh objek:


    // static method
    static void myStaticVoid() {
        System.out.println("static dapat di akses tanpa membuat object");
    }

    // public method
    public void myPublicVoid() {
        System.out.println("public hanya dapat di akses oleh object");
    }

    // Access Methods With an Object

    // create a fullThrottle() method
    public void fullThrottle(){
        System.out.println("Mobil sedang berjalan dengan cepat!");
    }

    // create a speed() method and add a parameter
    public void speed(int maxSpeed) {
        System.out.println("Max speed is " + maxSpeed);
    }
}
