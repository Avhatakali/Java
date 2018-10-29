package academy.learnProgramming;

public class UnderstandingNull {

    static Object myObject = new Object();
    static Object myOtherObject;
    static String myString;

    public static void main(String[] args) {
        Object mylocalObject = new Object();
        Object anotherLocalObject;

        String name = "Java";
        String anotherName = null;

        System.out.println("myObject = " + myObject);
        System.out.println("myOtherObject = " + myOtherObject);

        System.out.println("myLocalObject = " + mylocalObject);
       //System.out.println("anotherLocalObject + " + anotherLocalObject); //it is not inilialize so you cannot use it
        System.out.println("anotherName = " + anotherName);

        myString = "Java";
        System.out.println("myString = " + myString);
        myString.toLowerCase(); //this line is ignored
        System.out.println("myString = " + myString);
    }
}
