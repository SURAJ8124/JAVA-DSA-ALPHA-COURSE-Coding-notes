package _30_LinkedListPart1;

public class AddMiddele {
    public static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data=data;
        }
    }
    public static Node head;
    public static Node tail;
    public static int size;
    public void addFirst(int data){
        Node firstElemenet= new Node(data);
        size++;
        if(head==null){
            head=tail=firstElemenet;
            return;
        }
        firstElemenet.next=head;
        head=firstElemenet;
    }

    public void lastElement(int data){
        Node lastNode= new Node(data);
        size++;
        if(head==null){
            head=tail=lastNode;
            return;
        }
        tail.next=lastNode;
        tail=lastNode;
    }

    public void addMiddele(int data,int index){
        if(index==0){
            addFirst(data);
            return;
        }
        Node middeleElement= new Node(data);
        size++;
        int i=0;
        Node temp=head;
        while (i<index-1){
            temp=temp.next;
            i++;
        }
        middeleElement.next=temp.next;
        temp.next=middeleElement;
    }


    public void display(){
        Node temp=head;
        while (temp!=null){
            System.out.print(temp.data+"->");
           temp= temp.next;
        }
    }


    public static void main(String[] args){
        AddMiddele middeleElementObject= new AddMiddele();
         middeleElementObject.addFirst(90);
        middeleElementObject.addFirst(80);
        middeleElementObject.addFirst(70);
        middeleElementObject.addFirst(60);
        middeleElementObject.addFirst(50);
        middeleElementObject.addFirst(40);
        middeleElementObject.addFirst(30);
        middeleElementObject.addFirst(20);
        middeleElementObject.addFirst(10);
        middeleElementObject.display();
        middeleElementObject.lastElement(100);
        System.out.println();
        middeleElementObject.display();
        middeleElementObject.addMiddele(35,3);
        System.out.println();
        middeleElementObject.display();
        System.out.println( middeleElementObject.size);


    }
}
