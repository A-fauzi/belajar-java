// Pig "implements" the animals interface
public class Pig implements Animals{
    @Override
    public void animalSound() {
        // The body of animalSound() is provided here
        System.out.println("The Pig Says: wee wee");
    }

    @Override
    public void run() {
        // The body of sleep() is provided here
        System.out.println("Zzzz");
    }
}
