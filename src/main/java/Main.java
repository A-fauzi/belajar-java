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
        // JAVA OPERATOR
        int x = 10 + 10;
        System.out.println(x);

        int sum1 = 100; // 100
        int sum2 = sum1 + 100; // 100 + 100
        int sum3 = sum1 + sum2 + 100; // 100 + 200 + 100
        System.out.println(sum1);
        System.out.println(sum2);
        System.out.println(sum3);

        // Arithmetic Operators
        int addition = 10 + 10; // 20
        System.out.println(addition);

        int subtraction = 10 - 5; // 5
        System.out.println(subtraction);

        int multiplication = 10 * 10; // 100
        System.out.println(multiplication);

        int division = 10 / 2; // 5
        System.out.println(division);

        int module = 10 % 3; // 1
        System.out.println(module);

        int increment = ++addition; // 21
        System.out.println(increment);

        int decrement = --increment;
        System.out.println(decrement);


        // Java Assignment Operators
        // Operator penugasan digunakan untuk menetapkan nilai ke variabel.
        //
        //Dalam contoh di bawah ini, kita menggunakan operator penugasan= ( ) untuk menetapkan nilai 10 ke variabel yang disebut x :
        int assigment = 10;
        System.out.println(assigment);

        // Operator penugasan tambahan ( +=) menambahkan nilai ke variabel:
        assigment += 5; // 15
        System.out.println(assigment);

        assigment -= 5; // 10
        System.out.println(assigment);

        assigment *= 10; // 100
        System.out.println(assigment);

        assigment /= 2; // 50
        System.out.println(assigment);

        assigment %= 3; // 2
        System.out.println(assigment);

        // Java Comparison Operators
        // Operator perbandingan digunakan untuk membandingkan dua nilai:
        String check = "check";
        System.out.println(check == "check"); // true
        System.out.println(check != "check"); // false
        System.out.println(check.length() > 5); // false
        System.out.println(check.length() < 5); // false
        System.out.println(check.length() >= 5); // true
        System.out.println(check.length() <= 5); // true

        // Java Logical Operator
        // Operator logika digunakan untuk menentukan logika antar variabel atau nilai:
        System.out.println(true && true); // true
        System.out.println(true || false); // true
        System.out.println(!true); // false
    }

}
