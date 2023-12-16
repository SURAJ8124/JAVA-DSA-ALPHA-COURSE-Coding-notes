package LinkedListPart1;

public class AddFirst {
    public class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
        }
    }
    public static Node head;
    public static Node tail;

    public void addFirst(int data){
        Node firstNode= new Node(data);
        if(head==null){
            head=tail=firstNode;
            return;
        }
        firstNode.next=head;
        head=firstNode;
    }
    public static void main(String[] args){
      AddFirst linkedlist=new AddFirst();
       linkedlist.addFirst(10);
       linkedlist.addFirst(20);
       linkedlist.addFirst(30);
    }
}
