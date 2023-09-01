public class Day17_foreachloop {
    public static void main(String[] args) {
        
        // for-each = traversing technique to iterate through the elements in a array/collection 
        //            less steps, more readable
        //            less flexible

        String[] animals = {"cat","dog","horse"};

        for(String i : animals) {
            System.out.println(i);
        }
    }
}
