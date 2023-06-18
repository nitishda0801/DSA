import java.util.*;
public class BinartTreeLeveOfOrder {
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
    static void levelOrder(Node root)
    {
        Queue<Node>q=new LinkedList<>();
        q.add(root);
        q.add(null);
        while(!q.isEmpty())
        {
            Node curNode=q.remove();
            if(curNode==null)
            {
                System.out.println();
                if(q.isEmpty())
                {
                    break;
                }
                else{
                    q.add(null);
                }
            }
            else{
                System.out.print(curNode.data+" ");
                if(curNode.left!=null)
                {
                    q.add(curNode.left);
                }
                if(curNode.right!=null)
                {
                    q.add(curNode.right);
                }
            }
        }
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
            levelOrder(root);
            


        }
    }
}
