public class Car {

    private boolean previouslyOwned;
    private int numWheels;
    private int mileage;
    private String type;
    public String colour;

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public Car(boolean previouslyOwned) {

        this.previouslyOwned = previouslyOwned;

        if (previouslyOwned == true) {

            getPreviouslyOwned();
            setMileage(20000);

        } else if (previouslyOwned == false) {

            setMileage(0);
            return;
        }
    }


    // getters and setters
    public boolean getPreviouslyOwned() {
        return previouslyOwned;
    }

    public void setPreviouslyOwned(boolean previouslyOwned) {
        this.previouslyOwned = previouslyOwned;
    }

    public int getNumWheels() {
        return numWheels;
    }

    public void setNumWheels(int numWheels) {
        this.numWheels = numWheels;
    }

    public int getMileage() {
        return mileage;
    }

    public void setMileage(int mileage) {
        this.mileage = mileage;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;

        if (getType().equals("Reliant Robin")) {
            setNumWheels(3);
        } else {
            setNumWheels(4);
        }
    }
}
