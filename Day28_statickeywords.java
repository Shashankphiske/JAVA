public class Day28_statickeywords {
    public static void main(String[] args) {
        
        //static = is a keyword modifier , A single copy of variable / method is created and shared .
        //         The class "owns" the static member

        Friends f1 = new Friends("ssp");
        Friends f2 = new Friends("isp");

        System.out.println(Friends.num); //best practice not the one shown down
        System.out.println(f1.num);

        // if we remove static from num then the uniqueness is gone
        // each instance of Friend will have its own copy of num
    }
}
class Friends
{
    String name;
    static int num;
    Friends(String name)
    {
        this.name = name;
        num++;
    }
}