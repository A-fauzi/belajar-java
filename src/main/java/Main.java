import java.awt.*;

/**
 * Untuk penamaan class di java harus sama dengan nama file
 */
public class Main {

    /**
     * fungsi main adalah fungsi utama untuk menjalankan program di Java
     *
     * @param args
     */
    public static void main(String[] args) {
        // Java Boolean
        // Sangat sering, dalam pemrograman, Anda memerlukan tipe data yang hanya dapat memiliki satu dari dua nilai, seperti:
        // YA TIDAK
        // AKTIF / MATI
        // BENAR SALAH
        // Untuk ini, Java memiliki booleantipe data, yang dapat mengambil nilai trueatau false.

        // Boolean values
        // Tipe boolean dideklarasikan dengan booleankata kunci dan hanya dapat mengambil nilai trueatau false:
        boolean javaIsFun = true;
        boolean jsIsFun = false;
        System.out.println(javaIsFun);
        System.out.println(jsIsFun);

        // Boolean expression
        int y = 10;
        int x = 15;
        boolean check = y > x;
        System.out.println(check); // false
        System.out.println(20 < 25); // true
        System.out.println(20 == 20); // true
        System.out.println(20 == 22); // false
    }

}
