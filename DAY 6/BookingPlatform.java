class User{
    String name;
    String phone;
    String location;
    User(String name,String phone,String location){
        this.name=name;
        this.phone=phone;
        this.location=location;
    }
    void displayInfo(){
        System.out.println("Name: "+name+" | Phone: "+phone+" | Location: "+location);
    }
}
class RideUser extends User{
    String vehicleType;
    RideUser(String name,String phone,String location,String vehicleType){
        super(name,phone,location);
        this.vehicleType=vehicleType;
    }
    void displayRide(){
        System.out.println("--------RIDE USER--------");
        displayInfo();
        System.out.println("VehicleType: "+vehicleType);
    }
}
class FoodUser extends User{
    String favFood;
    FoodUser(String name,String phone,String location,String favFood){
        super(name,phone,location);
        this.favFood=favFood;
    }
    void displayFood(){
        System.out.println("--------FOOD USER--------");
        displayInfo();
        System.out.println("FavFood: "+favFood);
    }
}
class ParcelUser extends User{
    double parcelWeight;
    ParcelUser(String name,String phone,String location,double parcelWeight){
        super(name,phone,location);
        this.parcelWeight=parcelWeight;
    }
    void displayParcel(){
        System.out.println("--------PARCEL USER--------");
        displayInfo();
        System.out.println("ParcelWeight: "+parcelWeight);
    }
}
public class BookingPlatform{
    public static void main(String[] args){
        RideUser R=new RideUser("Manssa","1234567890","Chennai","Bike");
        FoodUser F=new FoodUser("Hari","0987654321","Coimbatore","IceCream");
        ParcelUser P=new ParcelUser("Sri","6789012345","Kerala",300.0);
        R.displayRide();
        F.displayFood();
        P.displayParcel();
    }
}