public class staicKeyword {
    public static void main(String[] args) {

        Counter c1 = new Counter();
        Counter c2 = new Counter();
        System.out.println(Counter.COUNT); //---> one variable in both object

        //calling static method
        Counter.increment();
    }
}
class Counter {
    //Static variables -->The COUNT variable will be shared by all objects of that class.
    public static int COUNT = 0;

    Counter() {
        COUNT++;
    }

    //Static Methods -->Static method can not use non-static members (variables or functions) of the class.
    public static void increment(){
        COUNT++;
        System.out.println(COUNT);
    }

    //Static Blocks
    static {

    }

}
