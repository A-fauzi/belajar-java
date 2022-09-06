// Multiple inheritance interface
public class DemoClass implements FirstInterface, SecondInterface {

    @Override
    public void firstInterface() {
        System.out.println("First Interface");
    }

    @Override
    public void secondInterface() {
        System.out.println("Second Interface");
    }

}
