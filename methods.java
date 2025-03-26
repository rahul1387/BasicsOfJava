public class methods {
    public static void main(String[] args) {

        //calling the method using objects.
        myClass meow = new myClass();
        meow.writeText("Rahul");
        meow.sum1();
        meow.concat1("Rahul" , "Neeraj");
        meow.sum2(24, 24);
        meow.concat2("Gojo" , "Suguru" , true);
    }
}

class myClass {
    //Method parameters makes it possible to pass values to the method, which the method can operate on.
    //below the parameter is text in String data type.
    public void writeText(String text){
        System.out.println(text + "!");// Operation on text parameter which will passed when the method is called.
    }

    //Local variables --> same as normal variables but only able to access inside the scope of method.
    public void sum1(){
        int localVar1 = 10;
        int localVar2  = 20;
        System.out.println(localVar1 + localVar2);
    }

    //Final variable --> cannot be changed. If the parameter is reference to an object,the reference cannot be changed, but the value inside the object can still change.
    public void finalVar(final String text1 , final String text2){
        System.out.println(text1 + "!");
        System.out.println(text2 + "!");
    }

    //Method Return type ---> can be return in the form of various data types.We can return by using 'return' keyword.
    public String concat1(String str1 , String str2){
        return str1 + str2;
    }
    public int sum2(int num1 , int num2){
        return num1 + num2;
    }

    //Multiple return statements
    public String concat2(String string1, String string2, boolean reverseOrder){

        if(reverseOrder) {
            return string2 + string1;
        }
        return string1 + string2;
    }

}
