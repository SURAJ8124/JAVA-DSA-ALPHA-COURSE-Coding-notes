package _30_LinkedListPart1;

public class AddLast {
    public class Node{
        int data;
        Node next;
       public  Node(int data){
           this.data=data;
       }
    }
    public static Node head;
    public static Node tail;
    public void addFirst(int data){
        //Add new node
        Node addelement=new Node(data);
        if(head==null){
            head=tail=addelement;
            return;
        }
        addelement.next=head;
        head=addelement;
    }
    public void addLast(int data){
        Node lastElement= new Node(data);
        if (head==null){
            head=tail=lastElement;
            return;
        }
        tail.next=lastElement;
        tail=lastElement;
    }
    public void display(){
        Node temp=head;
        while (temp!=null){
            System.out.println(temp.data);
            temp=temp.next;
        }
    }
    public static void main(String[] args){
        AddLast object=new AddLast();
        object.addLast(35);
        object.addFirst(30);
        object.addFirst(25);
        object.addFirst(20);
        object.addFirst(15);
        object.addFirst(10);
        object.addFirst(5);
        object.addFirst(0);
       object.addLast(90);
        object.display();

    }
}
