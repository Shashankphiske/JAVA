import java.util.Scanner;

class Day9{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in); 
        String name = "";

        while(name.isBlank()) // can use do while here, in do loop the block of code will run atleast once and then
                              // check the condition after
        {
            System.out.println("Enter your name :");
            name = scanner.nextLine();
        }
        System.out.println("Hello "+name);

        for(int i = 0; i<= 10; i++)
        {
            System.out.println(i);
        }
    }
}