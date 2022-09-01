import java.awt.*;

/**
 * Untuk penamaan class di java harus sama dengan nama file
 */
public class Main {
    // Final
    // Jika tidak ingin merubah nilai pada attribute, nyatakan attribute tersebut menjadi final
    final String gender = "Laki-Laki";
    final String nik = "3275022601970006";

    // main method
    public static void main(String[] args) {
        Main person = new Main();
//        person.gender = ""  -> error not assign final attribute
//        person.nik = "6234642"; -> error not assign final attribute

        // Call static methode
        myStaticVoid();

        // call public method
        Main obj = new Main();
        obj.myPublicVoid();

        // Call student class
        Student student = new Student();
        String name = student.name;
        String age = String.valueOf(student.age);

        System.out.println(name);
        System.out.println(age);
        student.study();

    }

    // Static
    // method static dapat di akses tanpa membuat object class, tidak seperti public

    // Static method
    static void myStaticVoid() {
        System.out.println("Static method execute");
    }

    // Public method
    public void myPublicVoid() {
        System.out.println("Public method execute");
    }
}
