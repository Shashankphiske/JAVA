import java.util.Scanner;

public class Day8_ifstatements {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your age :");
        int a = scanner.nextInt();

        if(a>=18)
        {
            System.out.println("You are eligible for voting");
        }
        else if(a==18){
            System.out.println("You are 18 years old");
        }
        else{
            System.out.println("You are not eligible for voting");
        }
    }
}
