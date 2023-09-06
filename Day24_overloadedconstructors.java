/**
 * Day24_overloadedconstructors
 */
public class Day24_overloadedconstructors {

    public static void main(String[] args) {
        
        //overloaded constructors = multiple constructors within a class with the same name, but have]
        //                          different parameters 
        //                          name + parameters = signature

        Pizza pizza = new Pizza("White_bread", "tomato");
        System.out.println("Ingredients of pizza are :");
        System.out.println(pizza.bread);
        System.out.println(pizza.sauce);
        Pizza pizza2 = new Pizza("garlic bread");
        System.out.println(pizza2.bread);

    }
}
class Pizza
{
    String bread;
    String sauce;
    Pizza(String bread, String sauce)
    {
        this.bread = bread;
        this.sauce = sauce;

    }
        Pizza(String bread)
    {
        this.bread = bread;
        
    }
}