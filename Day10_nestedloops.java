import java.util.Scanner;

public class Day10_nestedloops {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        int r;
        int c;
        String s = "#";

        System.out.println("Enter the number of rows :");
        r = scanner.nextInt();

        System.out.println("Enter the number of columns :");
        c = scanner.nextInt();

        for(int i = 1;i<=r;i++)
        {
            System.out.println();
            for(int j=1;i<=r;i++)
            {
                System.out.print(s);
            }
        }

    }
}
