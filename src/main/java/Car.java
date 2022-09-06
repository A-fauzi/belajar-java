// child class
public class Car extends Vehicle {
    private String modelName = "Mustang"; // Car attribute

    // Getter
    public String getModelName(){
        return modelName;
    }

    // Setter
    public String setModelName(String modelName) {
        return this.modelName = modelName;
    }
}
