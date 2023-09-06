/**
 * Day29_inheritence
 */
public class Day29_inheritence {

    public static void main(String[] args) {
        
        // inheritence = the process where one class acquires the attributes and methods of another

        Car car = new Car();
        car.go();

        Bike bike = new Bike();
        bike.stop();
    }
}
class Car extends Vehicle
{

}
class Bike extends Vehicle{ // use extends and the class name from where you need to inherit
                            // this will make bike and car class child or subclasses of vehicle class
                            // vehicle class becomes the super class/parent class

}
class Vehicle{

    double speed;

    void go()
    {
        System.out.println("This vehicle is moving");
    }
    void stop()
    {
        System.out.println("This vehicle has stopped moving");
    }

}