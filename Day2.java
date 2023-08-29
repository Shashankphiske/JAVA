/*
 * Primitive data type:                 reference data type:
 * 8 types                              unlimited (user defined)
 * store data                           store an address
 * can hold 1 value                     can hold more than 1 value
 * less memory                          more memory
 * fast                                 slower
 */
// assigment + declaration = initialization of a variable

/**
 * Day2
 */
public class Day2 {

    public static void main(String[] args)
    {
        int x = 1;
        long y = 33333333333333333L;
        // if we use byte then we can only store numbers upto 127
        float z = 333.33f; // use double for more precision upto 15 digits and dont use f at the last
        boolean c = true;
        char symbol = '&'; // strictly use ' ' 
        String name = "Shashank"; // reference data type 
        System.out.print("The number is " + x);
    }
}