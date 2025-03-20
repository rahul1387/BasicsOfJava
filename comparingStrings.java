public class comparingStrings {
    public static void main(String[] args) {
        //There are various methods for comparing strings
        //1. equals()--> tells if two strings are equal or not. Gives boolean value.
        String str1 = "Mango";
        String str2 = "Lemon";
        String str3 = "Mango";
        System.out.println(str1.equals(str2)); //false
        System.out.println(str1.equals(str3)); // true

        //2. equalsIgnoreCase()---> same as above but ignores the case of the characters

        //3. startsWith() ---> Gives boolean value
        String one = "Mango is good in taste";
        System.out.println("startsWith() method: " + one.startsWith("Mango"));
        //We can add range from where we want to check the starting string.
        System.out.println("startsWith() method with given range: " + one.startsWith("Mango" , 5));

        //4. endsWith() ---> Gives boolean value
        System.out.println("endsWith() method: " + one.endsWith("taste"));
        System.out.println("endsWith() method: " + one.endsWith("tasty"));

        // compareTo() ---> returns an int telling whether this string is smaller or equals to or larger than the other string.
        String first = "abc";
        String second = "def";
        String third = "abc";
        System.out.println(first.compareTo(second));
        System.out.println(first.compareTo(third));
        System.out.println(second.compareTo(first));
    }
}
