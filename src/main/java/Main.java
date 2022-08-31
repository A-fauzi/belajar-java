import java.awt.*;

/**
 * Untuk penamaan class di java harus sama dengan nama file
 */
public class Main {

    /**
     * fungsi main adalah fungsi utama untuk menjalankan program di Java
     * @param args
     */
    public static void main(String[] args) {
        // Widening Casting -> konversi tipe data dari yang terkecil ke besar
        int myInt = 9;
        double myDouble = myInt;
        System.out.println(myInt);
        System.out.println(myDouble);

        // Narrowing Casting -> konversi tipe data dari yang terbesar ke kecil
        double doubleNumber = 90.5;
        int intNumber = (int) doubleNumber; // manual casting: double to int
        System.out.println(doubleNumber);
        System.out.println(intNumber);
    }

}
