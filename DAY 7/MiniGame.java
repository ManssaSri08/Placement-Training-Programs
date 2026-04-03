class Character{
    String name;
    Character(String name){
        this.name=name;
    }
    void Attack(){
        System.out.println(name+" Attacks!");
    }
}
class Warrior extends Character{
    Warrior(String name){
        super(name);
    }
    @Override
    void Attack(){
        System.out.println(name+" Attacks with sword");
    }
}
class Archer extends Character{
    Archer(String name){
        super(name);
    }
    @Override
    void Attack(){
        System.out.println(name+" Attacks with arrow");
    }
}
class Mage extends Character{
    Mage(String name){
        super(name);
    }
    @Override
    void Attack(){
        System.out.println(name+" Attacks with magic");
    }
}
public class MiniGame {
    public static void main(String[] args){
        Character[] c={new Warrior("Alice"),new Archer("Bob"),new Mage("Charles")};
        for(Character n:c){
            n.Attack();
        }
    }
}
