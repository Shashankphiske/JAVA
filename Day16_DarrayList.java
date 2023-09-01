import java.util.*;

class DarrayList
{
    public static void main(String[] args) {
        
        // 2D arrayLists = a dynamic lists of lists
        //                 You can change the size of these lists during runtime

        ArrayList<String> Bakery = new ArrayList<>();
        Bakery.add("Bread");
        Bakery.add("cake");
        Bakery.add("Pastry");

        System.out.println(Bakery.get(1));

        ArrayList<String> Drinks = new ArrayList<>();
        Drinks.add("Sprite");
        Drinks.add("coke");
        Drinks.add("Frooti");

        ArrayList<String> Sides = new ArrayList<>();
        Sides.add("Fries");
        Sides.add("chips");
        Sides.add("Nuggets");

        ArrayList<ArrayList<String>> mainlist = new ArrayList<>();
        mainlist.add(Bakery);
        mainlist.add(Sides);
        mainlist.add(Drinks);

        System.out.println(mainlist.get(0).get(1));
    }
}