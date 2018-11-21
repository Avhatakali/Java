public class Order {

    public Pizza [] pizzas;


    public Order(Pizza[] pizzas) {
        this.pizzas = pizzas;
    }


    public void printOrder() {

        System.out.println("3-4-1 PIZZA MADNESS\n" + "###################");
        System.out.println("You ordered a "+ pizzas[0].getBase() +" on a "+pizzas[0].getTopping()+" base.");
        System.out.println("You ordered a "+ pizzas[1].getBase() +" on a "+pizzas[1].getTopping()+" base.");
        System.out.println("Are you sure you want "+ pizzas[2].getBase() +" on your "+ pizzas[2].getTopping() +" base?");
    }
}
