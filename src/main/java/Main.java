import java.awt.*;

/**
 * Untuk penamaan class di java harus sama dengan nama file
 */
public class Main {

    // Attribute class di java

    // attribute class
    // istilah lain dari attribute adalah field
    int x = 10;
    final int y = 10;

    // Menambahkan beberapa attribute
    String fName = "Akhmad";
    String lName = "Fauzi";
    int age = 25;
    String email = "akhmadfauzi@gmail.com";

    public static void main(String[] args) {
        // mengakses attribute
        Main objX = new Main();
        Main objY = new Main();
        System.out.println(objX.x);
        System.out.println(objY.y);

        // Ubah nilai pada attribute
        int x = objX.x = 1;
//        int y = objY.y = 1; // not assigment, karna attribute tersebut adalah final
        System.out.println(x);
//        System.out.println(y);

        // cara merubah attribute yang final

//        objY.y = 20; // not assigment
        int changeFinalAttribute = objY.y;
        changeFinalAttribute = 20;
        System.out.println(changeFinalAttribute);

        // Beberapa Object
        Main obj1 = new Main();
        Main obj2 = new Main();
        Main obj3 = new Main();
        System.out.println(obj1.x);
        System.out.println(obj2.x);
        System.out.println(obj3.x);

        // Beberapa attribute
        Main obj = new Main();
        System.out.println("first name: " + obj.fName);
        System.out.println("last name: " + obj.lName);
        System.out.println("age: " + obj.age);
        System.out.println("email: " + obj.email);
    }


}
