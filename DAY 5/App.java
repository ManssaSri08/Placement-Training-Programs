class User{
    String name;
    String phone;
    String address;
    String role="User";
    User(){
        System.out.println("By using super");
    }
    User(String name){
        this.name=name;
        System.out.println("User Created");
    }
    void display(){
        System.out.println("Name: "+name);
        System.out.println("Role: "+role);
    }
}
class Driver extends User{
    String role="Driver";
    String vehicle;
    Driver(String name,String vehicle){
        super(name);
        this.vehicle=vehicle;
    }
    void displayDriver(){
        super.display();
        System.out.println("Vehicle: "+vehicle);
        System.out.println("Driver Class Role: "+role);
        System.out.println("User Class Role: "+super.role);
    }
}
class FoodUser extends User{
    String favouriteFood;
    FoodUser(){
        System.out.println("FoodUser Created");
    }
}
class TravelUser extends User{
    String preferredVehicle;
}
public class App{
    public static void main(String[] args){
        Driver D=new Driver("Abc","Bike");
        D.displayDriver();
    }
}