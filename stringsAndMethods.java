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

        //Trimming in strings trim() ---> removes white spaces
        String fruit = "   My favourite fruit is Mango   ";
        System.out.println("Without unwanted spaces in sentence: " + fruit.trim());

        //Replacing characters in Strings

        //1. replace():--> replaces a specific character or word of string.
        String source = "123abc";
        System.out.println(source.replace('a', '@'));

        //2. replaceFirst() ---> replaces first character or word,with give character or word
        String text = "one two three two one";
        System.out.println("replaceFirst(): " + text.replaceFirst("two", "five"));

        //3. replaceAll() --->  replaceAll() method returns a new String with all matches of the regular expression
        System.out.println("replaceAll(): " + text.replaceAll("two" , "five"));

        // Splitting the Strings with split() ---> split a String into an array of String objects
//        String[] occurrence = fruit.split("a");
//        System.out.println("split(): " + occurrence);

        //Getting characters with charAt() method of string.
        String theString = "This is a good day to code";
        System.out.println("The character at index 0 is: " + theString.charAt(0));
        System.out.println("The character at index 3 is: " + theString.charAt(3));

        //Converting to Uppercase and Lowercase
        String sentence = "This is UPPERCASE and lowercase";
        System.out.println("toUpperCase(): " + sentence.toUpperCase());
        System.out.println("toLowerCase(): " + sentence.toLowerCase());
    }
}