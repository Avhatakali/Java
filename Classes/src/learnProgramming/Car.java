package learnProgramming;

public class Car {

    /*charateristics of a car,
    State of the car defined as fields
    template of car
    */
    private int doors;
    private int wheels;
    private String model; // we use 'this' keyword to access
    private String engine;
    private String colour;

    public void setModel(String model) {
        String validModel = model.toLowerCase();
        if (validModel.equals("carrera") || validModel.equals("commodore")) {
            this.model = model;
        } else {
            this.model = "unknown";
        }
    }

    public String getModel() {
        return this.model;
    }

}
