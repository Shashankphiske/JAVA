public class Day25_twostringmethod {
    public static void main(String[] args) {
        // Tostring = this is a special method that all objects inherit,
        //            that returns a string that texually represents an object 
        //            can be used both implicitly and explicitly

         Car car = new Car();

         System.out.println(car.model);
         System.out.println(car.c);
         System.out.println(car.color);
         System.out.println(car.year);

         System.out.println(car.toString()); // this will print the address of car object in the memory
    }
}
class Car
{
    String model = "Ford";
    String c = "GT";
    String color = "Blue";
    int year = 2023;

    public String toString() // here we overrided the toString method to print our own result
    {
        String myString = model + c +color + year;
        return myString;
    }
}
