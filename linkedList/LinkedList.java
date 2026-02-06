package linkedList;

public class LinkedList {
    public static class Node {
        int data;
        Node next;
        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size;

    public void addfirst(int data) {
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    public void addlast(int data) {
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }

     public void addIndx(int data,int indx) {
        Node newNode = new Node(data);
        if (indx ==0) {
          addfirst(data);  
            return;
        }
        size++;
        Node temp=head;
        int i=0;
        while(i<indx-1){
            temp=temp.next;
            i++;
        }
        newNode.next=temp.next;
        temp.next=newNode;
    }

    public void removefirst(){
        if(size==0){
            System.out.println("empty list");
            return ;
        }else if(size==1){
            head=tail=null;
            size=0;
            return;
        }
        head=head.next;
        size--;
    }
 
    public void removelast(){
         if(size==0){
            System.out.println("empty list");
            return;
        }else if(size==1){
            head=tail=null;
            size=0;
            return;
        }
        
       Node prev=head;
       for(int i=0;i<size-2;i++){
        prev=prev.next;
       }
       size--;
        prev.next=null;
        tail=prev;    
    }

    public void print() {
        Node temp = head;
        
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.addfirst(2);
        list.addfirst(23);
        list.addfirst(7);
        list.addlast(17);
        list.addlast(47);
        list.print();
        list.addIndx(3,2);
        list.print();
        list.removelast();
        list.removelast();
        list.print();
        System.out.println(list.size);
    }
}
