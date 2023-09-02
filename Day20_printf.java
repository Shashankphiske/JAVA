public class Day20_printf {
    public static void main(String[] args) {
        
        //printf() = an optional method to control, format and display text to the console window
        //           two arguments = format string + (object/variable/value)
        //           % [flags] [precision] [width] [conversion-character]

        System.out.printf("This is a format specifier %d",123);

        boolean bool = true;
        double d = 2.3434;
        char c = '$';
        int a = 20;
        String s = "ssp";
        
        System.out.printf("%b \n",bool);
        System.out.printf("%c \n",c);
        System.out.printf("%s \n",s);
        System.out.printf("%d \n",a);
        System.out.printf("%f \n",d);

        System.out.printf("Hello %10s",s);// [width] minimum number of characters as output
        System.out.printf("The num is %.2f",d); //[precison]

        // [flags]
        // adds effects
        // - : left justifies defualt right justified width
        // + : outputs a + or - sign for a numeric value
        // 0 : numeric values are zero padded
        // , : grouping separator for 1000s place 
    }
}
