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
        // Loop
        // Loop dapat mengeksekusi blok kode selama kondisi tertentu tercapai.
        // Loop berguna karena menghemat waktu, mengurangi kesalahan, dan membuat kode lebih mudah dibaca.

        // Java while loop
        // Loop whileloop melalui blok kode selama kondisi yang ditentukan adalah true:

        int num = 0;
        while (num < 10) {
            System.out.println(num);
            num++;
        }

        // Do-While
        // Loop do/whileadalah varian dari whileloop.
        // Loop ini akan mengeksekusi blok kode satu kali, sebelum memeriksa apakah kondisinya benar, kemudian akan mengulangi loop selama kondisinya benar.
        // Loop akan selalu dieksekusi setidaknya sekali, bahkan jika kondisinya salah, karena blok kode dieksekusi sebelum kondisi diuji:
        int i = 0;
        do {
            System.out.println("cetak" + " " + i);
            i++;
        } while (i < 10);
    }

}
