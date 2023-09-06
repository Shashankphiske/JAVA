public class Day30_methodoverriding {
    public static void main(String[] args) {
        
        // method overriding = Declaring a method in sub class which is already present in the parent class
        //                     so that a child class can give its own implementation

        Dog dog = new Dog();
        dog.speak();
        Animal animal = new Animal();
        animal.speak();
    }
}
class Animal
{
    void speak() // overridden method
    {
        System.out.println("Hello!");
    }
}
class Dog extends Animal // overriding method
{   
    @Override // isnt necessary but considered good practice
    void speak()
    {
        System.out.println("Bark!");
    }

}
