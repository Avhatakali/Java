public class StringMethod {
    public static void main(String[] args) {
        //0 1 2 3 4 5 6 7 8 9 10
        //j a v a   i s   f u n
        String Str = "java is fun";
        //length
        System.out.println("Length = " +Str.length());

        //char at
        System.out.println(Str.charAt(0));
        System.out.println(Str.charAt(2));
        System.out.println(Str.charAt(6));
        System.out.println(Str.charAt(1));

        //index of
        System.out.println(Str.indexOf('a'));
//        System.out.println(Str.indexOf(ch: "a", fromIndex:2));
        System.out.println(Str.indexOf("fun"));
//        System.out.println(Str.indexOf(Str:"fun", fromIndex: 10 ));

        //substring
        System.out.println(Str.substring(8));
        System.out.println(Str.substring(0, 5));
        System.out.println(Str.substring(4, 4)); // this return empty string

//      out of range
//        System.out.println(Str.substring(4, 2)); //StringIndexOutOfBoundsException: begin 4, end 2, length 11
//        System.out.println(Str.substring(8, 14)); // out of range

        //changing cases
        System.out.println("ABCD".toLowerCase());
        System.out.println(Str.toUpperCase());
        System.out.println(Str);

        String dog = "spotty";
//        dog.toUpperCase(); // string is immutable 'can not be change'
        dog = dog.toUpperCase(); // dereference to change string
        System.out.println(dog);
    }
}
