public class Day11_arrays {
    public static void main(String[] args)
    {
        String car = "Santro"; // converting this into an array in nextline :

        String[] cars = {"Santro","Alto","Taigun"};
        cars[0] = "Pagani";

        String[] ncars = new String[3];

        ncars[2] = "Pagani";
        ncars[1] = "Zonda";
        ncars[0] = "Gt3";

        for(int i=0;i<ncars.length;i++)
        {
            System.out.println(i);
        }
    }
}
