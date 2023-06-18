import java.util.*;
public class SumOfNodeBTree {
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
        }
    }
    static int sumNode(Node root)
    {
        if(root==null)
        return 0;
        int leftSum=sumNode(root.left);
        int rightSum=sumNode(root.right);
        return (leftSum+rightSum+root.data);

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
            int c=sumNode(root);//Total Sum of nodes are:21
            System.out.println("Total Sum of nodes are:"+c);
            
    }  
}
}
