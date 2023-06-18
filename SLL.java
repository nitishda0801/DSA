
public class SLL {

        static class Node{
            int data;
            Node next;
                Node(int x)
                {
                    this.data=x;
                    next=null;
                }
            }
    public static void printRev(Node head)
    {
        
        Node curr=head;
       if(curr==null)
       return;
       printRev(curr.next);
       System.out.print(curr.data+"->");
    }
    public static void printList(Node head)
    {
        
        Node curr=head;
        while(curr!=null)
        {
            System.out.print(curr.data+"->");
            curr=curr.next;
        }
        System.out.println("null");
    }
    public static void createSLL(int a[])
    {
        Node head = new Node(a[0]);
        Node curr=head;
        for(int i=1;i<a.length;i++)
        {
            Node nn= new Node(a[i]);
            curr.next=nn;
            curr=nn;
        }
        printList(head);
        printRev(head);
    }
    public static void main(String[] args)
    {
        SLL ob=new SLL();
        // Scanner sc=new Scanner(System.in);
        // System.out.println("Enter no of node:");
        // int n=sc.nextInt();
        // int a[]=new int[n];
        // System.out.println("Enter n node:");
        // for(int i=0;i<n;i++)
        // {
        //     a[i]=sc.nextInt();
        // }
        int a[]={1,2,3,4,5};
        createSLL(a);
    }
}
