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
        /**
         * Deklarasi variable
         */
        String name = "Akhmad Fauzi";
        Integer age = 25;
        Boolean isStatus = false;
        Double height = 165.0;
        Character initialsName = 'A';

        Integer number1 = 25;
        Integer number2 = 25;
        Integer result = number1 + number2;

        // Mencetak variable
        System.out.println("initial name: " + initialsName);
        System.out.println("name: " + name);
        System.out.println("age: " + age);
        System.out.println("Status: " + isStatus);
        System.out.println("height: " + height);
        System.out.println(result);

        // menetapkan nilai baru
        age = 15;
        System.out.println("nilai age baru: " + age);

//        // Keyword final adalah nilai untuk dijadikan konstan
//        final Integer myNum = 100;
//        // jika nilai konstant di tetapkan ke nilai baru maka kompile error
//        myNum = 125;
    }

}
