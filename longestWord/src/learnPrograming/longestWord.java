package learnPrograming;

public class longestWord {

    public static void main(String[] args) {
        String str = "Today is the happiest day of my life Avhatakali";
        String[] word = str.split(" ");
        String rts = " ";
        int len = 0;

        for (int i = 0; i < word.length; i++) {
            if (word[i].length() > rts.length())
                rts = word[i];
        }
        System.out.println(rts);
    }
}
