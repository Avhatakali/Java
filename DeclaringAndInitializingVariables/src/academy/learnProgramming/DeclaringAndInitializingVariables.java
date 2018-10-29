package academy.learnProgramming;

public class DeclaringAndInitializingVariables {

    public static void main(String[] args) {
        // declaring and initializiing in 2 lines
        //you cannot use java reserved words to name your variables.
        //variableName is also known as identifier
        int myNumber;  // declaration
        myNumber = 10; // initialization
        System.out.println("myNumber = " + myNumber);

        // declaring and initializiing in 1 line
        double myDouble = 7.50;
        System.out.println("myDouble = " + myDouble);

        //this is allowed, declaring multiple variable in one line
        float myFloat, myFloat2, myFloat3;
        float myFloat4; float myFloat5;

        float myFloat6 = 5f, myFloat7 = 10f, myFloat8;
        boolean b1, b2, b3;

//        double d1, double d2 ; // doesn't compile

        int i1;
        int i2;
//        int i3; i4; // doesn't compile, are not the same statement

        //what you can use to name your variables, _ , $, numbers
        //examples
        float okFloat;
        double $ok2double;
        double _alsoOkDouble;
        float __okButNotNice$_123;

        // illigal examples
        /*
            double 3point;
            double my@street;
            float *$coffee;
            float double;
            double public;

        */
    }
}
