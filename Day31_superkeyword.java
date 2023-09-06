public class Day31_superkeyword {
    public static void main(String[] args) {
        
        // super = keyword refers to the superclass (parent) of an object
        //         similar to "this" keyword

        Hero hero1 = new Hero("batman",40,"rich");
        System.out.println(hero1.name);
    }
}
class Person
{
    String name;
    int age;

    Person(String name, int age)
    {
        this.name = name;
        this.age = age;
    }

}
class Hero extends Person{

    String power;

    Hero(String name,int age,String power)
    {
        super(name, age);
        this.power = power;
    }
}