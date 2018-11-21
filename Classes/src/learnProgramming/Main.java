package learnProgramming;

public class Main {

    public static void main(String[] args) {

        Car porche = new Car();
        Car toyota = new Car();
        porche.setModel("Carrera"); // calling the set method and update it with parsed value in parameter
        System.out.println("Model is " + porche.getModel());
    }
}
