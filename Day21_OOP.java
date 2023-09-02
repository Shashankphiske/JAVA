public class Day21_OOP {
    public static void main(String[] args) {
        
        // object = an instance of a class that may contain attributes and methods 
         Car C1 = new Car();

         C1.drive();
         C1.brake();
         System.out.println("Price is :"+C1.price);
         // The car class acts as a blue print to create multiple ford cars here instances
    }

}
class Car
{
    String make  = "Ford";
    String model = "GT";
    int year = 2023;
    String color = "Blue";
    double price = 100000;
    
    void drive()
    {
        System.out.println("the car is moving");
    }
    void brake()
    {
        System.out.println("The car has stopped");
    }
}