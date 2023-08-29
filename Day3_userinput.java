import java.util.Scanner; 

class usinput{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in); // creation of scanner object 
                                                  // scanner is name of object
        System.out.println("Name? :");
        String name = scanner.nextLine();
        System.out.println("Age :");
        int a = scanner.nextInt();
        scanner.nextLine();                         // now if we create another input line for inputing a string in general
                                   // after we input an integer or number then it will skip the next string input
                                   // because it thinks \n is our input
                                   // to resolve this add one scanner.nextLine() to clear the scanner after number input

    }
}
