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
        // TIPE BILANGAN BULAT
        // 1. byte
        // Tipe bytedata dapat menyimpan bilangan bulat dari -128 hingga 127.
        // Ini dapat digunakan sebagai pengganti intatau tipe integer lainnya untuk menghemat memori ketika Anda yakin bahwa nilainya akan berada dalam -128 dan 127:
        byte numByte = 120;

        // 2. short
        // Tipe shortdata dapat menyimpan bilangan bulat dari -32768 hingga 32767:
        short shortNumber = 31000;

        // 3. int
        // Tipe intdata dapat menyimpan bilangan bulat dari -2147483648 hingga 2147483647.
        // Secara umum, dan dalam tutorial kita,
        // int tipe data adalah tipe data yang disukai saat kita membuat variabel dengan nilai numerik.
        int intNumber = 5000000;

        // 4. long
        // Tipe long data dapat menyimpan bilangan bulat dari -9223372036854775808 hingga 9223372036854775807.
        // Ini digunakan ketika int tidak cukup besar untuk menyimpan nilai.
        // Perhatikan bahwa Anda harus mengakhiri nilainya dengan "L":
        long longNumber = 1000000000L;

        // 5. Floating point type
        // Anda harus menggunakan tipe floating point kapan pun Anda membutuhkan angka dengan desimal, seperti 9,99 atau 3,14515.
        // Tipe data floatand doubledapat menyimpan bilangan pecahan. Perhatikan bahwa Anda harus mengakhiri nilainya dengan "f" untuk float dan "d" untuk double:
        float floatNumber = 8.77f;
        double doubleNumber = 35.999999999d;

        /*
            Gunakan floatatau double?

            Ketepatan nilai floating point menunjukkan berapa banyak digit nilai yang dapat dimiliki setelah titik desimal.
            Ketepatan floathanya enam atau tujuh digit desimal, sedangkan doublevariabel memiliki presisi sekitar 15 digit.
            Oleh karena itu lebih aman digunakan doubleuntuk sebagian besar perhitungan.
         */

        // 6. Scientific Numbers
        // Angka floating point juga bisa menjadi angka ilmiah dengan "e" untuk menunjukkan kekuatan 10:
        // e adalah float & E adalah double, angka setelah e/E adalah berapa digit 0 yangdi keluarkan
        float f1 = 25e4f;
        double d1 = 12E4d;
        System.out.println(f1);
        System.out.println(d1);
    }

}
