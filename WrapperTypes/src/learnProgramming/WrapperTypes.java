package learnProgramming;

public class WrapperTypes {
    public static void main(String[] args) {
        int myInt = 10; // primitive datatype
        Integer myInteger = 10;// all wrappers start with capital letters, just like class
        Integer myInteger2 = 20; // declaring integerObject but setting value to 20 as primitive
        Integer myInteger3 = Integer.valueOf(10);
        Integer myInteger4 = Integer.parseInt("3"); //we can also parse a string
        Integer myInteger5 = null; // object can hold null

//        int myInt2 = null; // this will not compile, null cannot be contained in int

//output
        System.out.println("myInteger = " + myInteger);
        System.out.println("myInteger2 = " + myInteger2);
        System.out.println("myInteger3 = " + myInteger3);
        System.out.println("myInteger4 = " + myInteger4);
        System.out.println("myInteger5 = " + myInteger5);

        //converting wrapper to primitive -> unboxing
        int myInt3 = myInteger3 ; //unboxing
        // int myInt4 = myInteger5; // throws null pointer exception, primitives can't contain null

        //boxing -> converting primitive to wrapper
        Integer myInteger6 = new Integer(10);

        printSum(1, 5);  //autoboxing
        printSum(myInteger, myInteger2); //not autoboxing
    }

    private static void printSum(Integer first, Integer second){
        Integer sum = first + second;
        System.out.println("sum = " + sum);
    }
}
