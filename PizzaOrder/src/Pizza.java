public class Pizza {

    private String Base;
    private String Topping;



    public Pizza(String Base, String Topping){
        this.Base = Base;
        this.Topping = Topping;
    }

    public Pizza() {

    }

    public String getBase() {
        return Base;
    }

    public void setBase(String base) {
        Base = base;
    }

    public String getTopping() {
        return Topping;
    }

    public void setTopping(String topping) {
        Topping = topping;
    }
}
