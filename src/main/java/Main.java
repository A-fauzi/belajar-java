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
        // Java String
        // String digunakan untuk menyimpan teks.
        // Variabel Stringberisi kumpulan karakter yang dikelilingi oleh tanda kutip ganda:
        String name = "Akhmad Fauzi";

        // String length
        int length = name.length();
        System.out.println("Panjang string " + name + " adalah: " + length);

        // String method
        // Ada banyak metode string yang tersedia, misalnya toUpperCase()dan toLowerCase() dll.
        String upperCase = name.toUpperCase();
        System.out.println(upperCase);

        String lowerCase = name.toLowerCase();
        System.out.println(lowerCase);

        // Finding a Character in a String
        // Metode indexOf()mengembalikan indeks (posisi) kemunculan pertama dari teks yang ditentukan dalam string (termasuk spasi):
        int indexOfString = name.indexOf("Fauzi"); // 7
        System.out.println(indexOfString);

        // String Concatenation
        // Operator +dapat digunakan di antara string untuk menggabungkannya. Ini disebut penggabungan :
        System.out.println("Akhmad" + " " + "Fauzi");
        // juga dapat menggunakan concat()metode untuk menggabungkan dua string:
        String firstName = "Akhmad";
        String lastName = "Fauzi";
        System.out.println(firstName.concat(" ").concat(lastName));

        // Adding Numbers and Strings
        /*
            PERINGATAN!

            Java menggunakan +operator untuk penambahan dan penggabungan.

            Angka ditambahkan. String digabungkan.
         */

        int x = 10;
        int y = 10;
        int z = x + y; // 20
        System.out.println(z);

        String num1 = "10";
        String num2 = "10";
        String result = num1 + num2;
        System.out.println(result); // 1010

        String string = "10";
        int number = 10;
        String result2 = string + number;
        System.out.println(result2); // 1010


        // Special character
        //Karena string harus ditulis dalam tanda kutip, Java akan salah memahami string ini, dan menghasilkan kesalahan:
        // String txt = "We are the so-called "Vikings" from the north."; // salah
        String txt = "We are the so-called \"Vikings\" from the north.";
        System.out.println(txt);

        // Urutan \'  menyisipkan satu kutipan dalam sebuah string:
        String txtAgain = "It's amazing";
        System.out.println(txtAgain);

        // Urutan \\  menyisipkan satu garis miring terbalik dalam sebuah string:
        String txtAgain2 = "Makan \\ minum";
        System.out.println(txtAgain2);

        // newline \n
        String txtNewLine = "Hello\nworld";
        System.out.println(txtNewLine);

        //
    }

}
