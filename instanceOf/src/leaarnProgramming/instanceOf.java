package leaarnProgramming;

import java.util.Calendar;
import java.util.Date;

public class instanceOf {

    public static void main(String[] args) {

        Object obj = Calendar.getInstance();
        long time = 0L;

        if(obj instanceof Calendar)
        {
            time = ((Calendar)obj).getTime();
        }

        if(obj instanceof Date)
        {
            time = ((Date)obj).getTime(); // This line will never be reached, obj is not a Date type.
        }
    }
}
