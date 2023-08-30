import java.util.ArrayList;

public class Day15_arraylist {
    
    // ArrayList = A resizable array
    //             elements can be added and removed after compilation phase
    //             Store reference data types
    public static void main(String[] args)
    {
        ArrayList<Integer> food = new ArrayList<Integer>();
        food.add(3);
        food.add(4);

        food.set(1, 5); //replace index 1 element 
        food.remove(1);
        food.clear(); // removes all elements
    }
}
