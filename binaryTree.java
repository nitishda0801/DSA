import java.util.Scanner;

public class binaryTree
{
    static class Node{
        int data;
        Node left,right;
        Node(int data)
        {
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }
    static class BinaryTree{
        static int i=-1;
        
        Node buildTree(int root[])
        {
            i++;
            if(root[i]==-1)
            {
                return null;
            }
            Node newNode=new Node(root[i]);
            newNode.left=buildTree(root);
            newNode.right=buildTree(root);
            return newNode;

            
            //return root;
        }
    }
    static void preOrder(Node root)
    {
        if(root==null)
        {
            return;
        }
        System.out.print(root.data+" ");
        preOrder(root.left);
        preOrder(root.right);
    }
    static void inOrder(Node root)
    {
        if(root==null)
        {
            return;
        }
        inOrder(root.left);
        System.out.print(root.data+" ");
        inOrder(root.right);
    }
    static void postOrder(Node root)
    {
        if(root==null)
        {
            return;
        }
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.data+" ");
    }
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n;
           
            System.out.println("Enter the size of node:\n");
            n=sc.nextInt();//13
            System.out.println("Enter the node:\n");
            int a[]=new int[n];
            for(int i=0;i<n;i++)
            a[i]=sc.nextInt();//1 2 4 -1 -1 5 -1 -1 3 -1 6 -1 -1
            BinaryTree tree=new BinaryTree();
            Node root=tree.buildTree(a);
            preOrder(root);//1 2 4 5 3 6
            System.out.println();
            inOrder(root);//4 2 5 1 3 6
            System.out.println();
            postOrder(root);//4 5 2 6 3 1



        }
    }
}