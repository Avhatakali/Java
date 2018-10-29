package academy.learnProgramming;

public class Config {
    public static final String NAME = "myName";
    public static final int MAX_COLUMN_COUNT = 5;

    public static void printConfig(){
        System.out.printf("name = " + NAME + "columnCount =" + MAX_COLUMN_COUNT);
    }
}
