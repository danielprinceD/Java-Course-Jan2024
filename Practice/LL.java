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
        Node ptr = head;
        while(ptr.next != null)
            ptr = ptr.next;
        Node newNode =  new Node(data);
        ptr.next = newNode;
    }
    public void print()
    {
        for(Node temp = head;temp!=null;temp=temp.next)
        {
            System.out.print(temp.data);
            if(!(temp.next==null)) System.out.print(" - > ");
        }
    }
    public void popFirst()
    {

    }
}
public class LL {
    public static void main(String[] args) {
        
        LinkedList l = new LinkedList();
        l.addFirst(10);
        l.addFirst(20);
        l.addFirst(30);
        l.addLast(50);
        l.addLast(80);
        l.print();
    }

}
