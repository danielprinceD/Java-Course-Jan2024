package Practice;
class DLNode
{
    Object data;
    DLNode next;
    DLNode prev;
    DLNode(Object data)
    {
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}
class DoubleLinkedList 
{
    DLNode head;
    DoubleLinkedList(){head = null;}
    void addFirst(Object data)
    {
        DLNode newNode = new DLNode(data);
        if(head==null)head = newNode;
        else 
        {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
    }
    void addLast(Object data)
    {
        DLNode temp = head;
        DLNode newNode = new DLNode(data);
        if(head==null)head = newNode;
        else{
            while(temp.next !=null)temp=temp.next;
            temp.next = newNode;
            newNode.prev = temp; 
        }
    }
    void print()
    {
        for(DLNode temp = head;temp!=null;temp=temp.next)
            System.out.print(temp.data + " ");
    }
    void reverse(DLNode root)
    {
        if(root!=null)
        {
            reverse(root.next);
            System.out.print(root.data+" ");
        }
    }
    
    
}

public class DLL {
    public static void main(String[] args) {
         
        DoubleLinkedList dl = new DoubleLinkedList();
        dl.addFirst("hello");
        dl.addLast("world");
        dl.addLast(5);
        DLNode root= dl.head; 
        System.out.print("Reverse Order : ");
        dl.reverse(root);
        System.out.println();
        System.out.print("Original Order : ");
        dl.print();
    }
        
}
