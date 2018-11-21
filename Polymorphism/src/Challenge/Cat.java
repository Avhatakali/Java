package Challenge;

public class Cat extends Animal {


    public Cat () {
        super(4);
        super.setName("Cat");
        super.setNoise("Meow");
    }

    @Override
    public String toString() {
        return "An adorable kitten.";
    }
}
