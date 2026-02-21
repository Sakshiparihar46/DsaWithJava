package BinaryTree;
import java.util.*;
public class BinaryTreeB {
    static class Node{
        int data;
        Node left,right;

        public Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }

    public static int height(Node root){
        if(root==null){
            return 0;
        }

        int lh=height(root.left);
        int rh=height(root.right);
        return Math.max(lh,rh)+1; 
    }

    public static int count(Node root){
        if(root==null){
            return 0;
        }
        int lc=count(root.left);
        int rc=count(root.right);
        return lc+rc+1;
    }
    
    public static int sum(Node root){
        if(root==null){
            return 0;
        }
        int ls=sum(root.left);
        int rs=sum(root.right);
        return ls+rs+root.data;
    }

    public static int diameter(Node root){
        if(root==null){
            return 0;
        }
        int leftDiam=diameter(root.left);
        int leftht=height(root.left);
        int rightDiam=diameter(root.right);
        int rightht=height(root.right);

        int selfDiam=leftht+rightht+1;
        return Math.max(Math.max(leftDiam,rightDiam),selfDiam);
    }
    
    static class Info{
        int diam;
        int ht;
        public Info(int diam,int ht){
            this.diam=diam;
            this.ht=ht;
        }
    }
    public static Info diameter2(Node root){
        if(root==null){
            return new Info(0, 0);
        }
        Info leftInfo=diameter2(root.left);
        Info rightInfo=diameter2(root.right);

        int diam=Math.max(Math.max(leftInfo.diam,rightInfo.diam),leftInfo.ht+rightInfo.ht+1);
        int ht=Math.max(leftInfo.ht,rightInfo.ht)+1;
        return new Info(diam,ht);
    }

    public static boolean isIdentical(Node node,Node subRoot){
        if(node==null && subRoot==null){
            return true;
        }else if(node == null || subRoot==null||node.data !=subRoot.data){
            return false;
        }
        if(!isIdentical(node.left, subRoot.left)){
            return false;
        }
        if(!isIdentical(node.right, subRoot.right)){
            return false;
        }
        return true;
    }

    public static boolean isSubtree(Node root,Node subRoot){
        if(root==null){
            return false;
        }
        if(root.data==subRoot.data){
            if(isIdentical(root,subRoot)){
                return true;
            }
        }
        return isSubtree(root.left, subRoot)||isSubtree(root.right, subRoot);
    }
    public static void main(String[] args) {

        //tree
        Node root=new Node(1);
        root.left=new Node(2);
        root.right=new Node(3);
        root.left.left=new Node(4);
        root.left.right=new Node(5);
        root.right.left=new Node(6);
        root.right.right=new Node(7);


        //subtree
        Node subRoot=new Node(2);
        subRoot.left=new Node(4);
        // subRoot.right=new Node(5);
        // System.out.println(height(root));
        // System.out.println(count(root));
        // System.out.println(sum(root));

        // System.out.println(diameter2(root).ht); 

        System.out.println(isSubtree(root, subRoot));

    }
}
