package academy.learnProgramming;

public class main {
    public static void main(String[] args) {
        //printing size of arguments
        System.out.println("args-size = " + args.length);

        //printing arguments names/words & location in array[index]
        for (int i = 0; i < args.length; i++){
            System.out.println("args[" + i + "] = " + args[i] );
        }
    }
}
