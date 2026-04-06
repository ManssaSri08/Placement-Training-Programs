class Locker{
    private int lockerId;
    private boolean isLocked;
    private int pin;
    private String storedItem;
    public Locker(int lockerId,int pin){
        this.lockerId=lockerId;
        this.pin=pin;
        this.isLocked=true;
    }
    public void storeItem(String item,int pin){
        if(this.pin==pin){
            if(!isLocked){
                this.storedItem=item;
                System.out.println("Stored successfully");
            }
            else{
                System.out.println("Locker is Locked");
            }
        }
        else{
            System.out.println("Entered pin is wrong");
        }
    }
    public void retrieveItem(int pin){
        if(this.pin==pin){
            if(!isLocked && storedItem!=null){
                System.out.println("Retrieved Item: "+storedItem);
                storedItem=null;
            }
            else if(storedItem==null){
                System.out.println("Locker is Empty");  
            }
            else{
                System.out.println("Locker is Locked");  
            }
        }
        else{
            System.out.println("Pin is wrong");
        }
    }
    public void lock(){
        isLocked=true;
        System.out.println("Locker Locked");
    }
    public void unlock(int pin){
        if(this.pin==pin){
            isLocked=false;
            System.out.println("Locker Unlocked");
        }
        else{
            System.out.println("Wrong pin");
        }
    }
}
public class LockerSystem {
    public static void main(String[] args) {
        Locker L=new Locker(100,1708);
        L.unlock(1708);
        L.storeItem("Platinum",1708);
        L.retrieveItem(1708);
        L.lock();
    }
}