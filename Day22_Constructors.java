/**
 * Day22_Constructors
 */
public class Day22_Constructors {

    public static void main(String[] args) {
        // constructor = special method that is called when an object is created
        Man m1 = new Man("Shashank", 20);

        System.out.println("Name is :"+m1.name);
        System.out.println("Age is :"+m1.age);
    }
}
class Man 
{
    String name;
    int age;
    Man(String name, int age ) // constructor
    {   
        this.name = name;
        this.age = age;

        // this will link it to the object that we create
    }
}