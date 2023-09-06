public class Day34_encapsulation {
    public static void main(String[] args) {
        
        //Encapsulation = attributes of a class will be hidden or private, 
        //                Can be accessed only through methods (setters and getters)
        //                You should make attributes private if you dont have a reason to make them public/protected
        Car car = new Car("Ford", "Gt", 30);
        //System.out.println(car.make); not working as make is only visible to Car class (hidden)
        System.out.println(car.getMake()); // getter
        car.setMake("Chevrolet"); // setter
    }
}
class Car
{
    private String make;
    private String model;
    private int year;

    Car(String make,String model, int year)
    {
        this.model = model;
        this.make = make;
        this.year = year;
    }

    public String getMake() // getter method for make
    {
        return make;
    }
    public String getModel()
    {
        return model;
    }
    public int getYear()
    {
        return year;
    }
    public void setMake(String make)
    {
        this.make = make;
    }
}  