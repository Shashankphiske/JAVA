package package2;
import package1.*;


public class C {
    public static void main(String[] args) {
        
        A a = new A();
        System.out.println(a.d);

    }

    String defaultmessage = "This is default "; // visible to only the classes present in the package2
    private String v = "ssp"; // only visible to the class that it is contained in 
}
