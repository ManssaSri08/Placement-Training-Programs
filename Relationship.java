class Battery{
    public void powerSupply()
    {
        System.out.println("Still have 40% power");
    }
}
class Remote{
    // here we have to use the method in this child class so we create the object for the parent class and call the method using the object but here we only call inside the another method is called has a relationship
    //Battery minibattery = new Battery();// has a relationship //composition
    Battery minibattery;
    Remote(){
        minibattery =  new Battery();//Aggregaton
    }
    public void changeChannel(){
    minibattery.powerSupply();  //composition  
    System.out.println("Channel changed");
    }
    public void changeVolume(){
        System.out.println("volume Increased");
    }
}
class TV{
    Remote tvRemote;
    TV(Remote tvRemote){
        this.tvRemote=tvRemote;
    }
    public void IncreaseVolume(){
        tvRemote.changeVolume();//aggregation
    }
}
public class Relationship {
    public static void main(String[] args)
    {
        Remote r = new Remote();
        TV t= new  TV(r);
        //r.changeChannel();
        t.IncreaseVolume();
    }
}