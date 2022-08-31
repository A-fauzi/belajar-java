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
        // Declare variable seperti biasa
        Integer x = 12;
        Integer y = 22;
        Integer z = 50;
        System.out.println(x + y + z);

        // Simple declare multiple
        Integer myAge = 25, ariAge = 25, fahlanAge = 22, daudAge = 24, hanifAge = 24;
        System.out.println(myAge + ariAge + fahlanAge + daudAge + hanifAge);

        // Beberapa variable untuk satu nilai
        int u, l, i;
        u = l = i = 20;
        System.out.println(u);
        System.out.println(l);
        System.out.println(i);
    }

}
