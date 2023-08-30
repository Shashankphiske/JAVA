public class Day13_Stringmethods {
    public static void main(String[] args)
    {
        String name = " Ssp  ";
        name.equals("Ssp"); // compares the string in name and the given name and returns bool value
        name.equalsIgnoreCase("ssp"); // it ignores upper or lower case while comparing
        name.length();
        name.charAt(0); // to access a character at a specified position
        name.indexOf("S"); // gives index of specified character
        name.isEmpty(); // checks if the string variable is empty
        name.toUpperCase(); // converts all chars in string to uppercase
        name.toLowerCase();
        name.trim(); // removes empty space before and after the string
        name.replace("p", "s");

    }
}
