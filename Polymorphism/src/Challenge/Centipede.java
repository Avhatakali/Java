package Challenge;

public class Centipede extends Animal{


    @Override
    public String getNoise() {
        return "Centipedes don’t make noise.";
    }

    public Centipede() {

        super(100);
        super.setNoise("Centipedes don’t make noise.");
        super.setName("Centipede");
    }
}
