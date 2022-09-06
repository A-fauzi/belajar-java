import java.util.Scanner;

/**
 * Untuk penamaan class di java harus sama dengan nama file
 */
public class Main {
    // main method
    public static void main(String[] args) {
        System.out.println("Enter username");
        String inputUsername = new Scanner(System.in).nextLine(); // Input Scanner

        System.out.println("Your name is " + inputUsername);
    }
}
