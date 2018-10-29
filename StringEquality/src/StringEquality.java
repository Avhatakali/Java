public class StringEquality {
    public static void main(String[] args) {
        System.out.println("");
        String name = "John";
        String anotherName = "John";
        String john = "Jo" + "hn"; // same as "john"
        String newName = new String("John");

        //checking object equality, return true if equal
        System.out.println("name == anotherName -> " +(name == anotherName));
        System.out.println("name == john -> " + (name == john));
        System.out.println("name == newName -> " + (name == newName));

        //equal method
        System.out.println("name.equal(anotherName) -> " + name.equals(anotherName));
        System.out.println("name.equal(anotherName) -> " + name.equals(john));
        System.out.println("name.equal(anotherName) -> " + name.equals(newName));

        //identity hash code check if the string is the same
        System.out.println("name = identityHashCode -> " + System.identityHashCode(name));
        System.out.println("anotherName = identityHashCode -> " + System.identityHashCode(anotherName));
        System.out.println("john = identityHashCode -> " + System.identityHashCode(john));
        System.out.println("newName = identityHashCode -> " + System.identityHashCode(newName));

        //string concatination

        String str1 = "abc";
        String str2 = "ab";
//        String str3 = str2 + "c";
        String str3 = "ab" + "c";

        System.out.println(System.identityHashCode(str1));
        System.out.println(System.identityHashCode(str2));
        System.out.println(System.identityHashCode(str3));

        System.out.println(str1 == str2);
        System.out.println(str1 == str3);

    }
}
