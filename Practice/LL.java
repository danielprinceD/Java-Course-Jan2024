package Practice;
class Node
{
    int data;
    Node next;
    Node(int data)
    {
        this.data = data;
        this.next = null;
    }
}
class LinkedList
{
    Node head;
    LinkedList(){this.head = null;}
    public void addFirst(int data)
    {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }
    public void addLast(int data)
    {
        Node ptr = gotoLast();
        Node newNode =  new Node(data);
        ptr.next = newNode;
    }
    public void print()
    {
        if(head==null)
        {
            System.out.println("No Elements are Present");
            return;
        }
            for(Node temp = head;temp!=null;temp=temp.next)
            {
                System.out.print(temp.data);
                if(!(temp.next==null)) System.out.print(" - > ");
            }
    }
    private Node gotoLast()
    {
        Node ptr = head;
        while(ptr.next != null)ptr = ptr.next;
        return ptr;
    }
    public void popFirst()
    {
        if(head !=null)
        {
           Node ptr = head.next;
           head = null;
           head = ptr;
        }
            
    }
    public void popLast()
    {
        if(head.next == null)
        {
            pop();return;
        }
        if(head != null)
        {
            Node ptr = head;
            while(ptr.next.next!=null)ptr = ptr.next;
            ptr.next = null;
        }
    }
    public void pop()
    {
        head = null;
    }
}
public class LL {
    public static void main(String[] args) {
        
        LinkedList l = new LinkedList();
        l.addFirst(10);
        l.addLast(80);
        l.popFirst();
        l.popLast();
        l.print();
    }

}
