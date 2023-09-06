package package1;
import package2.*;

public class A {
    public static void main(String[] args) {

        //System.out.println(c.defaultmessage); this will not work as the defaultmessage variable
        // is using default access modifier and is visible to only the package that it is in
    }
    public String d = "ssp"; // this is visible to any package in the project folder
    String e = "ssp";
    protected String z = "ssp"; // this is protected and is only visible to sub class of this class (A)
}
