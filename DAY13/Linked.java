class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        this.next=null;
    }
}
class LinkedList{
    Node head;
    public void insertAtStart(int data){
        Node newNode=new Node(data);
        newNode.next=head;
        head=newNode;
    }
    public void insertAtPosition(int position,int data){
        if(position==0){
            insertAtStart(data);
            return;
        }
        Node newNode=new Node(data);
        Node temp=head;
        for(int i=0;i<position-1;i++){
            if(temp==null){
                System.out.println("Invalid position");
                return;
            }
            temp=temp.next;
        }
        newNode.next=temp.next;
        temp.next=newNode;
    }
    public void insertAtEnd(int data){
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
            return;
        }
        Node temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=newNode;
        newNode.next=null;
    }
    public void deleteAtStart(){
        if(head==null) return;
        head=head.next;
    }
    public void deleteAtPosition(int position){
        if(head==null) return;
        if(position==0) head=head.next;
        Node temp=head;
        for(int i=0;i<position-1;i++){
            if(temp.next==null) return;
            temp=temp.next;
        }
        if(temp.next!=null){
            temp.next=temp.next.next;
        }
    }
    public void deleteAtEnd(){
        if(head==null) return;
        if(head.next==null){
            head=null;
            return;
        }
        Node temp=head;
        while(temp.next.next!=null){
            temp=temp.next;
        }
        temp.next=null;
    }
    public void display(){
        Node temp=head;
        if(temp==null) {
            System.out.println("List is empty");
            return;
        }
        while(temp!=null){
            System.out.print(temp.data);
            if (temp.next!=null) {
                System.out.print("->");
            }
            temp=temp.next;
        }
        System.out.println("->null");
    }
}
public class Linked{
    public static void main(String[] args){
        LinkedList list=new LinkedList();
        list.insertAtStart(5);
        list.insertAtStart(10);
        list.insertAtStart(15);
        list.insertAtEnd(20);
        list.display();
        list.deleteAtEnd();
        System.out.println("After deleting at end");
        list.display();
    }
}