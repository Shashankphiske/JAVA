public class Day32_abstarction {
    public static void main(String[] args) {
        
        //abstract = abstract classes cannot be instantiated(to create such an instance) but they can have a 
        //           subclass . Abstract methods are declared   without any implementation

        //Vehicle vehicle = new Vehicle(); this instance is too vague as vehicle is in general not specific
        //we dont buy a vehicle we buy car, bikes etc which are its representations
        Car car = new Car();

    }
}
abstract class Vehicle {// the abstract keyword will not allow creation of instance of vehicle
                       // helps add a layer of security to the program  
    abstract void go(); //this will force us to implement this method in the child class
}

class Car extends Vehicle{

    @Override
    void go()
    {
        System.out.println("Moving");
    }
}