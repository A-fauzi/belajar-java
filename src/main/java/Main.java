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
        // If Else Condition
        // Anda dapat menggunakan kondisi ini untuk melakukan tindakan yang berbeda untuk keputusan yang berbeda.
        //
        // Java memiliki pernyataan bersyarat berikut:
        /*
            Gunakan if untuk menentukan blok kode yang akan dieksekusi, jika kondisi yang ditentukan benar
            Gunakan else untuk menentukan blok kode yang akan dieksekusi, jika kondisi yang sama salah
            Gunakan else if untuk menentukan kondisi baru yang akan diuji, jika kondisi pertama salah
            Gunakan switch untuk menentukan banyak blok kode alternatif yang akan dieksekusi
         */

        boolean statusNikah = true;
        if (statusNikah) {
            System.out.println("Sudah Menikah");
        } else {
            System.out.println("Belum menikah");
        }

        int bangunTidur = 18;
        if (bangunTidur < 10) {
            System.out.println("Good Morning");
        } else if (bangunTidur < 17) {
            System.out.println("Good day");
        } else {
            System.out.println("Good night");
        }

        // Ternary Operator

        // Short Hand If...Else
        // Ada juga short-hand if else , yang dikenal sebagai operator ternary karena terdiri dari tiga operan.
        // Ini dapat digunakan untuk mengganti beberapa baris kode dengan satu baris, dan paling sering digunakan untuk mengganti pernyataan if else sederhana:
        int age = 14;
        String checkAge = (age < 17) ? "Maaf belum cukup umur" : "Sudah Cukup Umur, silahkan masuk";
        System.out.println(checkAge); // maaf

    }
}
