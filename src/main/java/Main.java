import java.util.Scanner;

/**
 * Untuk penamaan class di java harus sama dengan nama file
 */
public class Main {
    // main method
    public static void main(String[] args) {
        Animals myAnimals = new Animals(); // Create animals object
        Dog myDog = new Dog(); // Create Dog Object
        Pig myPig = new Pig(); // Create Pig Object

        myAnimals.animalSound();
        myDog.animalSound();
        myPig.animalSound();

    }
}
