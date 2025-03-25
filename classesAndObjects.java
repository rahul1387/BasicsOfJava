//Creating aur custom class.
// We cant create one more public class we can only one public class in java.
class employee {
    int age ;
    String name;
    //creating a method inside my class.
    public void empDetails(){
        System.out.println("Employee1 name: " + name);
        System.out.println("Employee2 age: " + age);
    }
}
class Lamp{
    //stores the value of light
    //true if light is on and false if light is off.
    boolean isOn;

    public void turnOn(){
        isOn = true;
        System.out.println("Light on? " + isOn);
    }
    public void turnOff(){
        isOn = false;
        System.out.println("Light on? " + isOn);
    }
}

public class classesAndObjects {
    public static void main(String[] args) {
        //Instantiating the class we created through objects
        //defining objects
        //className objectName = new className();
        employee myEmp1 = new employee();
        // Setting attributes
        myEmp1.age = 18;
        myEmp1.name = "Rahul";
        myEmp1.empDetails();

        //creating second object.
        employee myEmp2 = new employee();
        myEmp2.name = "Neeraj";
        myEmp2.age = 27;
        myEmp2.empDetails();

        //creating an object for Lamp
        Lamp graphite = new Lamp();
        Lamp halogen = new Lamp();

        // calling the method turnOn for light to turn on.
        graphite.turnOn();

        //calling the method turnOff for light to turn off.
        halogen.turnOff();


    }
}

