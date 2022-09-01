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
        // call myMethod()
        myMethod();

        // dipanggil beberapa kali
        myMethod();
        myMethod();
        myMethod();
        myMethod();

        // call name method
        name("Liam");
        name("Jenny");
        name("Anja");

        // call overloading method
        name("Liam", 25);
        name("Jenny", 17);
        name("Anja", 33);

        // Call method return value
        int result = resultNumber(5, 5);
        System.out.println(result * 10);

        // call method check age
        checkAge(12);

        // call overloading method
        int num1 = plusMethod(2, 4);
        System.out.println(num1);
        double num3 = plusMethod(24.5, 34.2);
        System.out.println(num3);

        // call recursive method
        int r1 = recursive(1);
        System.out.println(r1); // 1
        int r2 = recursive(2);
        System.out.println(r2); // 3
        int r3 = recursive(3);
        System.out.println(r3); // 6
        int r4 = recursive(4);
        System.out.println(r4); // 10

        // call recursive 2 parameter
        int r2p = recursive(3, 5);
        System.out.println(r2p);

    }

    // Method Java

        /*
            Metode adalah blok kode yang hanya berjalan ketika dipanggil.

            Anda dapat meneruskan data, yang dikenal sebagai parameter, ke dalam metode.

            Metode digunakan untuk melakukan tindakan tertentu, dan juga dikenal sebagai fungsi .

            Mengapa menggunakan metode? Untuk menggunakan kembali kode: tentukan kode sekali, dan gunakan berkali-kali.
         */

    // Create Method
    static void myMethod() {
        System.out.println("I just got executed!");
    }

    // myMethod() itu nama metodenya
    // static, berarti metode tersebut milik kelas Utama dan bukan objek dari kelas Utama.
    // void, method ini tidak memberikan nilai balik


    // Argument dan parameter
    // Informasi dapat diteruskan ke metode sebagai parameter. Parameter bertindak sebagai variabel di dalam metode.
    // Parameter ditentukan setelah nama metode, di dalam tanda kurung. Anda dapat menambahkan parameter sebanyak yang Anda inginkan, cukup pisahkan dengan koma.
    static void name(String name) {
        System.out.println("Name :" + " " + name);
    }

    // Menambahkan beberapa parameter dengan tipe data yang berbeda
    static void name(String name, int age) {
        System.out.println(name + " Berusia " + age + " Tahun");
    }

    // Method return value
    // Keyword void artinya method tersebut tidak boleh mengembalikan nilai
    // Jika ingin mengembalikan sebuah nilai, dapat menggunakan tipe data primitif

    static int resultNumber(int x, int y) {
        return x + y;
    }


    // Method dengan if else
    static void checkAge(int age) {
        if (age < 17) {
            System.out.println("di bawah 17 tahun");
        } else {
            System.out.println("Usia cukup");
        }
    }

    // Method overloading
    // Dengan metode overloading , beberapa metode dapat memiliki nama yang sama dengan parameter yang berbeda:
    static int plusMethod(int x, int y) {
        return x + y;
    }

    static double plusMethod(double x, double y) {
        return x + y;
    }

    // Java Scope
    // di Java, variabel hanya dapat diakses di dalam wilayah tempat mereka dibuat. Ini disebut Scope


    // Method Scope
    // Variabel yang dideklarasikan langsung di dalam suatu metode tersedia di mana saja dalam metode yang mengikuti baris kode di mana mereka dideklarasikan:
    static void methodScope() {
        // Code here CANNOT use x
        int x = 100;

        // Code here can use x
        System.out.println(x);
    }

    // Block Scope
    // Sebuah blok kode mengacu pada semua kode di antara kurung kurawal {}
    // Variabel yang dideklarasikan di dalam blok kode hanya dapat diakses oleh kode di antara kurung kurawal,
    // yang mengikuti baris di mana variabel dideklarasikan:

    static void blockScope() {
        // Code here CANNOT use x

        { // This is a block

            // Code here CANNOT use x

            int x = 100;

            // Code here CAN use x
            System.out.println(x);

        } // The block ends here

        // Code here CANNOT use x

    }

    static int recursive(int k) {
        // Jika true
        if (k > 0) {
            // return nilai parameter + hasil recursive - 1
            // 3 = 3+2+1
            // 5 = 5+4+3+2+1
            return k + recursive(k - 1);
        } else {
            return k;
        }
    }

    static int recursive(int start, int end) {
        // Jika true
        if (end > 0) {
            // return nilai parameter + hasil recursive - 1
            return end + recursive(start, end - 1);
        } else {
            return end;
        }
    }

}
