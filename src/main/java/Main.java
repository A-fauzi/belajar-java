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
        // TIPE DATA CHARACTER
        // Tipe chardata digunakan untuk menyimpan satu karakter.
        // Karakter harus diapit oleh tanda kutip tunggal, seperti 'A' atau 'c':

        char myGrade = 'B';

        // Atau, jika Anda terbiasa dengan nilai ASCII, Anda dapat menggunakannya untuk menampilkan karakter tertentu:
        char myVar1 = 65, myVar2 = 66, myVar3 = 67;
        System.out.println(myVar1);
        System.out.println(myVar2);
        System.out.println(myVar3);

        // String
        // Tipe Stringdata digunakan untuk menyimpan urutan karakter (teks). Nilai string harus diapit oleh tanda kutip ganda:
        String greeting = "Hello Java";
        System.out.println(greeting);

        // Tipe String begitu banyak digunakan dan terintegrasi di Java, sehingga beberapa orang menyebutnya " tipe kesembilan khusus ".
        //
        // Sebuah String di Jawa sebenarnya adalah tipe data non-primitif ,
        // karena mengacu pada sebuah objek. Objek String memiliki metode yang digunakan untuk melakukan operasi tertentu pada string.
    }

}
