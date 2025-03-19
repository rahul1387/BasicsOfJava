public class stringsAndMethods {
    public static void main(String[] args) {
        //String Literals
        String myStr1 = "Hello World";
        /* Creating a new strings with same value
        String str1 = new String("Hello");
        String str2 = new String("Hello");
         */

        //Multiple lines string
        String multiLineStr = """
                This is multiple line String.
                We can write in multiple lines.
                """;
        System.out.println(multiLineStr);

        //Concatenation of strings
        String one = "Hello";
        String two = "World";
        System.out.println(one + " " + two);

        //String Length
        String name = "Rahul";
        // There two-way to print length of string

        // First method ---> By storing in variable.
        int len = name.length();
        System.out.println("The length of string using first method: " + len);
        //Second method ---> Direct method.
        System.out.println("The length of string using second method: " + name.length());

        // SubStrings of string
        String place = "England";
        System.out.println(place.substring(0,3));

        //Searching in string using indexOf() method.
        System.out.println(""" 
                The index where 'W' is located is:""" + myStr1.indexOf("W"));

        //Matches() method in java used to check if a string exactly matches a given regular expression.
        //It gives value in boolean.
        System.out.println(place.matches("England")); //true
        System.out.println(place.matches("Eng")); //false

    }
}