// Subclass (Inherit from Person)
public class Student extends Person{
    public int graduationYear = 2022;
    @Override
    public void study() {
        System.out.println("Studying all day long");
    }
}
