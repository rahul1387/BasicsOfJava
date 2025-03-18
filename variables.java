public class variables
{
    static int num1 = 24 ;
    // Method with parameters
    public static void myName(String name)
    {
        System.out.println("Hello " + name + "!");
        int a = 0;
    }
    public static void main(String[] args)
    {
        /*
         Variables are used to store data which is used in program.
         Declaration of variables : type name;

         There are four types of variables: 1. Non-static fields --->that belong to an object
                                           2. Static fields --->One for the whole class declared by keyword 'static'
                                           3. Local variables ---> declared inside a method and only accessible in that method.
                                           4. Parameters ----> values u pass in method to work with them in that method
         */
        int myVariable;
        myName("Rahul"); // ---> Rahul is argument passed to the parameter name in myName method.
        // Arguments are actual value u give to parameters when calling the method. Multiple parameter separated by comma.
    }
}
