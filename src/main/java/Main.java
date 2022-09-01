import java.awt.*;

/**
 * Untuk penamaan class di java harus sama dengan nama file
 */
public class Main {
    // variable di dalam class
    int x = 10;

    /**
     * fungsi main adalah fungsi utama untuk menjalankan program di Java
     *
     * @param args
     */
    public static void main(String[] args) {
        // Java Class & Object
        // Java adalah bahasa pemrograman berorientasi objek.
        // Segala sesuatu di Java dikaitkan dengan kelas dan objek, bersama dengan atribut dan metodenya. Sebagai contoh: dalam kehidupan nyata, mobil adalah sebuah objek.
        // Mobil memiliki atribut , seperti berat dan warna, dan metode , seperti drive dan rem.
        // Class seperti konstruktor objek, atau "blue print" untuk membuat objek.

        // Buat Object
        // Di java, sebuah object di buat dari sebuah class
        // class Main dapat digunakan untuk membuat Object
        // Untuk membuat object Main, tentukan nama kelas, diikuti dengan nama object dan gunakan kata kunci new

        Main myObj = new Main();
        // Mendapatkan sebuah object property pada class
        System.out.println(myObj.x);

        // Beberapa object
        Main myObj1 = new Main();
        Main myObj2 = new Main();
        System.out.println(myObj1.x + myObj2.x);
    }

}
