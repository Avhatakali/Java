package learnProgramming;
//declaring method that takes objects and giving it a wrapped integer
public class WrapperClass {
    public static void main(String[] args) {
        String s1 = "Hello over there";
        Integer number1 = 3;
        show(s1);
        show(number1);
    }

    public static void show(Object a) {
        System.out.println("Behold! I give you " + a);
    }
}
