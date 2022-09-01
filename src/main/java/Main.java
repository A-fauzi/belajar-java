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
        // For Loop
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }
        /*
            Pernyataan 1 menetapkan variabel sebelum loop dimulai (int i = 0).

            Pernyataan 2 mendefinisikan kondisi untuk menjalankan loop (i harus kurang dari 5). Jika kondisi benar, loop akan dimulai lagi, jika salah, loop akan berakhir.

            Pernyataan 3 meningkatkan nilai (i++) setiap kali blok kode dalam loop telah dieksekusi.
         */

        // Contoh ini hanya akan mencetak nilai genap antara 0 dan 10:
        for (int i = 0; i <= 10; i += 2){
            System.out.println(i);
        }

        // Java Foreach
        // Ada juga loop " for-each ", yang digunakan secara eksklusif untuk mengulang elemen dalam array :
        String[] car = {"car 1", "car 2", "car 3"};
        for (String i : car) {
            System.out.println(i);
        }

    }

}
