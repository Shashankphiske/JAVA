/**
 * Day19_overloadedmethods
 */
public class Day19_overloadedmethods {
     
    // here we created two classes of same name but they take in different number of parameters
    // if we intialize add() and pass in 2 arguments then the first class is executed and vice versa
    static int add(int a,int b)
    {
        return a+b;
    }
    static int add(int a,int b, int c)
    {
        return a+b;
    }
    public static void main(String[] args)
    {
        // overloaded methods = methods that share the same name but have different parameters
        //                      method name + parameters = method signature

        int x = add(2,3);
        System.out.println(x);

        int y = add(2,3,4);
        System.out.println(y);
    }
}