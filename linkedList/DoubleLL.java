package linkedList;

public class DoubleLL {
    public class Node{
        int data;
        Node next;
        Node prev;

        public Node(int data){
            this.data=data;
            this.next=null;
            this.prev=null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size;

    //addfirst node
    public void addFirst(int data){
        Node newnNode=new Node(data);
        size++;
        if(head==null){
            head=tail=newnNode;
            return;
        }
        newnNode.next=head;
        head.prev=newnNode;
        head=newnNode;
    }

    //addLast
    public void addLast(int data){
        Node newNode=new Node(data);
        size++;
        tail.next=newNode;
        newNode.prev=tail;
        tail=newNode;

    }
    //removefirst node
    public void removeFirst(){
        if(head==null){
            System.out.println("empty linkedlist");
            return;
        }

        if(size==1){
            head=tail=null;
            size--;
            return;
        }
        head=head.next;
        head.prev=null;
        size--;

    }

    //reverse a linkedlist 
    public void reverse(){
        Node curr=head;
        Node prev=null;
        Node next;

        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            curr.prev=next;
            prev=curr;
            curr=next;
        }
        head=prev;
    }

    //removeLast
    public void removeLast(){
        if(head==null){
            System.out.println("empty linkedlist");
        }

        if(size==1){
            head=tail=null;
            size=0;
        }

        Node prev=head;
        for (int i = 0; i < size-2; i++) {
            prev=prev.next;
        }
        size--;
        tail.prev=null;
        prev.next=null;
        tail=prev;
    }
    //print
    public void print(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data +"<=>");
            temp=temp.next;
        }
        System.out.println("null");
    }
    public static void main(String[] args) {
        DoubleLL dll=new DoubleLL();
        dll.addFirst(2);
        dll.addFirst(4);
        dll.addFirst(7);
        dll.addFirst(28);
        dll.print();
        System.out.println(dll.size);
        dll.removeLast();
        // dll.addLast(20);
        // dll.removeFirst();
        // dll.reverse();
        dll.print();
        System.out.println(dll.size);
    }
}
