abstract class SmartDevice{
    abstract void turnOn();
    abstract void turnOff();
    abstract void setLevel();

    void deviceInfo(){
        System.out.println("It is a device");
    }
}

class Light extends SmartDevice{
    @Override
    void turnOn(){
        System.out.println("LIGHT'S ON");
    }

    @Override
    void turnOff(){
        System.out.println("LIGHT'S OFF");
    }

    @Override
    void setLevel(){
        System.out.println("LEVEL SET SUCCESSFULLY IN LIGHT");
    }
}

class Fan extends SmartDevice{   // class name should start with capital
    @Override
    void turnOn(){
        System.out.println("FAN ON");
    }

    @Override
    void turnOff(){
        System.out.println("FAN OFF");
    }

    @Override
    void setLevel(){
        System.out.println("LEVEL SET SUCCESSFULLY IN FAN");
    }
}

interface Remote{
    void change();
}

interface WifiControl{
    void connect();
}

class TV implements Remote, WifiControl{
    @Override
    public void change()   // always public (interface methods)
    {
        System.out.println("Change Channel");
    }

    @Override
    public void connect()
    {
        System.out.println("Wifi Connected");
    }
}

public class SmartDevices {
    public static void main(String[] args)
    {
        SmartDevice d = new Light();   // Polymorphism (parent reference, child object)
        d.turnOn();

        d.deviceInfo(); // here we use child class object to access the parent class method (concrete method)

        d.setLevel();

        SmartDevice d1 = new Fan();   // Polymorphism
        d1.setLevel();

        Remote r = new TV(); // INTERFACE reference
        r.change();
    }
}