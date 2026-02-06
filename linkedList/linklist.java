package linkedList;

import devideAndConquer.mergesort;

public class linklist{
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
    
   
     public void add(int data) {
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }

    //iterative search
    public int search(int key){
        Node temp=head;
        if(head==null){
            return -1;
        }
        int i=0;
        while(temp!=null){
            if(temp.data==key){
                return i;
            }
            temp=temp.next;
            i++;
        }
        return -1;
    }

    //recursive search
    public int helper(Node head,int key){
        if(head==null){
            return -1;
        }
        if(head.data==key){
            return 0;
        }
       int indx=helper(head.next,key);
       if(indx==-1){
        return -1;
       }
        return indx+1;
    }
    public int recursivesearch(int key){
        return helper(head, key);
    }

    
    //remove from last nth node
    public void removenthfromlast(int indx){
        Node prev=head;
        int i=1;

        while(i<size-indx){
            prev=prev.next;
            i++;
        }
        prev.next=prev.next.next; 
    }


    //check palindrome
    public Node findmid(Node head){
        Node slow=head;
        Node fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
 
    public boolean palindrome(){
        if(head==null ||head.next==null){
            return true;
        }
        Node mid=findmid(head);
        Node prev=null;
        Node curr=mid;
        Node next;
        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        Node right=prev;
        Node left=head;
         while(right!=null){
            if(left.data!=right.data){
                return false;
            }
            left=left.next;
            right=right.next;
        }
        return true;
    }

     //detect a cycle
     public static boolean isCycle(){
        Node slow=head;
        Node fast=head;

        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){
                return true;
            }
        }
        return false;
     }

     //to remove a cycle
     public static void removeCycle(){
        //detect a cycle
        Node slow=head;
        Node fast=head;
        boolean cycle=false;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){
                cycle=true;
                break;
            }
        }
        //if false
        if(cycle==false){
            return;
        }
        //iftrue
        slow=head;
        Node prev=null;
        while(slow!=fast){
            prev=fast;
            slow=slow.next;
            fast=fast.next;
        }
        prev.next=null;
     }

     //merge sort
     public Node getMid(Node head){
        Node slow=head;
        Node fast=head.next;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
      return slow;  
     } 
     private Node merge(Node head1,Node head2){
        Node mergeLL=new Node(-1);
        Node temp=mergeLL;
        while(head1!=null && head2!=null){
            if(head1.data<=head2.data){
                temp.next=head1;
                head1=head1.next;
                temp=temp.next;
            }else{
                temp.next=head2;
                head2=head2.next;
                temp=temp.next;
            }
        }
        while (head1!=null) {
                temp.next=head1;
                head1=head1.next;
                temp=temp.next;
        }
        while (head2!=null) {
            temp.next=head2;
            head2=head2.next;
            temp=temp.next;
        }
        return mergeLL.next;
     }


     public Node mergesort(Node head){
        //base case
        if(head==null||head.next==null){
            return head;
        }
        //find mid
        Node mid =getMid(head);
        //left & right ms
        Node rightHead=mid.next;
        mid.next=null;
        Node newLeft=mergesort(head);
        Node newRight=mergesort(rightHead);
        //merge
        return merge(newLeft,newRight);
     }

     //print zig zag matrix
     public void zigZag(){
        //find mid
        Node slow=head;
        Node fast=head;
        while (fast!=null && fast.next!=null) {
            slow=slow.next;
            fast=fast.next.next;
        }
         Node  mid=slow; 

         //reverse 2nd half
         Node curr=mid.next;
         mid.next=null; 
         Node prev=null;
         Node next;
         while (curr!=null) {
            next=curr.next;
            curr.next=prev; 
            prev=curr;
            curr= next; 

         }

         Node left=head;
         Node right=prev;
         Node nextL,nextR;

         //alt merge -in zig zag fashion
         while(left!=null && right!=null){
            nextL=left.next;
            left.next=right;
            nextR=right.next;
            right.next=nextL;


            left=nextL;
            right=nextR;
         }
     }
    //to print linkedlist 
     public void print() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");
    }
    
    
    public static void main(String[] args) {
        linklist list=new linklist();
        list.add(11);
        list.add(52);
        list.add(81);
        list.add(15);
        list.add(10);
        list.print();
      
        //CYCLIC LINKEDLIST
        // head=new Node(1);
        // head.next=new Node(4);
        // head.next.next=new Node(5);
        // head.next.next.next=head.next; 
        // System.out.println(isCycle());
        // removeCycle();
        // System.out.println(isCycle());



    }
}
