import java.util.Scanner;

/**
 * Untuk penamaan class di java harus sama dengan nama file
 */
public class Main {
    // main method
    public static void main(String[] args) {
        Pig myPig = new Pig();
        myPig.animalSound();
        myPig.run();

        DemoClass demoClass = new DemoClass();
        demoClass.firstInterface();
        demoClass.secondInterface();
    }
}
