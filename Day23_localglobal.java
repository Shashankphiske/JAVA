import java.util.Random;

/**
 * Day23_localglobal
 */
public class Day23_localglobal {

    public static void main(String[] args) {
        //local = declared inside a method is local 
        //        visible only to that method

        // global = declared outside a method ,but within a class
        //          visible to all parts of class

        Diceroller D1 = new Diceroller();

    }
}
class Diceroller
{
    Random random;
    int number = 0;
    Diceroller()
    {
        random = new Random();
        roll();
    }
    void roll()
    {
        number = random.nextInt(6)+1;
        System.out.println(number);
    }
}