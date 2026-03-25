class Notification{
    String name;
    String message;
    Notification(String name,String message){
        this.name=name;
        this.message=message;
    }
    void send(){
        System.out.println("Sending Notification from Parent Class");
    }
}
class EmailNotification extends Notification{
    EmailNotification(String name,String message){
        super(name,message);
    }
    void send(){
        System.out.println("Sending Email to "+name);
        System.out.println("Message "+message);
    }
}
class SMSNotification extends Notification{
    SMSNotification(String name,String message){
        super(name,message);
    }
    void send(){
        System.out.println("Sending SMS to "+name);
        System.out.println("Message "+message);
    }
}
public class Notify{
    public static void main(String[] args){
        Notification n;
        n=new EmailNotification("test","Order Confirmed");
        n.send();
        n=new SMSNotification("test2","OTP is 234");
        n.send();
    }
}