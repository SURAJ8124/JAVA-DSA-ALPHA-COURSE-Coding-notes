package LinkedListPart1;

public class Introduction {
  public static class Node{
        int data;
        Node next;
        public Node(int data){
          this.data=data;
          this.next=null;
        }
    }
    public static void main(String[] args){
      Node object=new Node(10);
      Node object2=new Node(20);
      Node object3=new Node(30);
      object.next=object2;
      object.next.next=object3;
       System.out.println(object2.next);
    }


}
