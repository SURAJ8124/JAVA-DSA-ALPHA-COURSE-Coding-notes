package _30_LinkedListPart1;

public class HeadAndTail {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public static Node head;
    public static Node tail;

    public static void main(String[] args){
     HeadAndTail object=new HeadAndTail();
     object.head=new Node(20);
     object.head.next=new Node(30);
    }
}
