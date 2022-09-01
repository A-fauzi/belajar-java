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
        // BREAK AND CONTINUE

        // Break
        // pernyataan break juga dapat digunakan untuk menghentikan kondisi tertentu jika kondisi true
        for (int i = 0; i < 10; i++) {
            if (i == 4) {
                break;
            }
            System.out.println(i);
        }

        // Continue
        // Pernyataan continuememecah satu iterasi (dalam loop), jika kondisi tertentu terjadi, dan berlanjut dengan iterasi berikutnya dalam loop.
        //
        // Contoh ini melewatkan nilai 4
        for (int i = 0; i < 10; i++) {
            if (i == 4) {
                continue;
            }
            System.out.println(i); // 0, 1, 2, 3, 5
        }

    }

}
