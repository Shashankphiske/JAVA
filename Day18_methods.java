public class Day18_methods {
    public static void main(String[] args) {
        
        // methods = a block of code that is executed whenever it is called upon
        String name = "Shashank";
        hello(name);
    }
static void hello(String name) { // added static here as we are calling hello method from static method main
        System.out.println("Hello! "+name);
    }
    // to make return type methods just define the method with suitable data type that you are returning

    //eg : returning addition of numbers:
    // int calculate(int a, int b)
    //{   return a+b;}
}
