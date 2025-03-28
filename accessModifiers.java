public class accessModifiers {
    public static void main(String[] args) {
        //Private access modifier
        /*
        If a method or variable is marked as private , then only code inside the same class can access the variable, or call the method.
         */

        //default (package) Access Modifier ---> default access modifier means  same package of code inside the class
    }

}
class clock{
    private long time = 0;//---> this variable is only accessible in the class clock . That means this variable is not accessible outside the class clock.
}
