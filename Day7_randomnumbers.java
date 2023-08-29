import java.util.Random;

public class Day7_randomnumbers {
    public static void main(String[] args)
    {
        Random random = new Random(); // random is the instance
        // to limit the random value type the last end value and it will count from 0 to the number - 1

        int x = random.nextInt(6) + 1; // it is not truly random but close to random (pseudorandom)
        System.out.println(x);
        // the nextDouble will generate values between 0 and 1
    }
}
