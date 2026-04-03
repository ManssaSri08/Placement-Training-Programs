abstract class SmartDevice {
    String name;

    // Constructor
    SmartDevice(String name) {
        this.name = name;
    }

    // Abstract methods (must be implemented by child classes)
    abstract void turnOn();
    abstract void turnOff();
}

// ------------------ Devices ------------------
class Light extends SmartDevice {

    Light(String name) {
        super(name);
    }

    @Override
    void turnOn() {
        System.out.println(name + " -> TURN ON LIGHT");
    }

    @Override
    void turnOff() {
        System.out.println(name + " -> TURN OFF LIGHT");
    }
}

class AC extends SmartDevice {

    AC(String name) {
        super(name);
    }

    @Override
    void turnOn() {
        System.out.println(name + " -> TURN ON AC");
    }

    @Override
    void turnOff() {
        System.out.println(name + " -> TURN OFF AC");
    }
}

// ------------------ Trigger ------------------
interface Trigger {
    boolean isTrigger();  // condition check
}

// Motion Trigger
class MotionTrigger implements Trigger {
    boolean motionDetected;

    MotionTrigger(boolean motionDetected) {
        this.motionDetected = motionDetected;
    }

    @Override
    public boolean isTrigger() {
        return motionDetected;
    }
}

// Temperature Trigger
class TempTrigger implements Trigger {
    int temperature;

    TempTrigger(int temperature) {
        this.temperature = temperature;
    }

    @Override
    public boolean isTrigger() {
        return temperature > 30; // condition
    }
}

// Time Trigger
class TimeTrigger implements Trigger {
    int hour;

    TimeTrigger(int hour) {
        this.hour = hour;
    }

    @Override
    public boolean isTrigger() {
        return hour == 19; // 7 PM condition
    }
}

// ------------------ Actions ------------------
interface Action {
    void execute(); // action to perform
}

// Turn ON action
class TurnOn implements Action {
    SmartDevice sd;

    TurnOn(SmartDevice sd) {
        this.sd = sd;
    }

    @Override
    public void execute() {
        sd.turnOn();
    }
}

// Turn OFF action
class TurnOff implements Action {
    SmartDevice sd;

    TurnOff(SmartDevice sd) {
        this.sd = sd;
    }

    @Override
    public void execute() {
        sd.turnOff();
    }
}

// ------------------ Rule Engine ------------------
class Rule {
    Trigger trigger;
    Action action;

    Rule(Trigger trigger, Action action) {
        this.trigger = trigger;
        this.action = action;
    }

    void result() {
        // If condition satisfied → perform action
        if (trigger.isTrigger()) {
            action.execute();
        } else {
            System.out.println("Condition not satisfied");
        }
    }
}

// ------------------ Main Class ------------------
public class Abstraction {
    public static void main(String[] args) {

        // Devices
        Light light = new Light("Living Room Light");
        AC ac = new AC("Bedroom AC");

        // Triggers (simulate inputs)
        MotionTrigger motionTrigger = new MotionTrigger(true); // motion detected
        TempTrigger tempTrigger = new TempTrigger(35);         // temp > 30
        TimeTrigger timeTrigger = new TimeTrigger(19);         // 7 PM

        // Actions
        TurnOn lightOn = new TurnOn(light);
        TurnOff lightOff = new TurnOff(light);

        TurnOn acOn = new TurnOn(ac);

        // Rules
        Rule r1 = new Rule(motionTrigger, lightOn); // motion → light ON
        Rule r2 = new Rule(tempTrigger, acOn);      // temperature → AC ON
        Rule r3 = new Rule(timeTrigger, lightOn);   // time → light ON

        // Execute Rules
        System.out.println("----- SMART HOME AUTOMATION -----");
        r1.result();
        r2.result();
        r3.result();
    }
}