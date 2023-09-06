public class Day26_Arrayofobjects {
    public static void main(String[] args) {

        Food[] f = new Food[3];

        Food f1 = new Food("Bread");
        Food f2 = new Food("Pizza");
        Food f3 = new Food("paneer");

        f[0] = f1;
        f[1] = f2;
        f[2] = f3;
        // OR
        //Food[] f = {f1,f2,f3};

        System.out.println(f[1]); // this will print the address of item at 1st index

        System.out.println(f[1].name);
    }
}
class Food
{
    String name;
    Food(String name)
    {
        this.name = name;
    }
}
