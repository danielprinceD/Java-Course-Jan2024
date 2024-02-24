import java.util.Scanner;
    {
        this.root = null;
    }
    void insert(int data){
        Node newNode = new Node(data);
        if(root==null)root = newNode;
        else inserter(root , data);
    }
    private void inserter(Node root ,int data)
    {
        if(root.left==null && root.data > data)
        {
            Node newNode = new Node(data);
            root.left = newNode;
        }
        else if(root.right==null && root.data < data)
        {
            Node newNode = new Node(data);
            root.right = newNode;
        }
        else if(root.data > data)
            inserter(root.left, data);
        else if(root.data < data)
            inserter(root.right, data);
    }
    void display()
    {
        displayInorder(root);
    }
    private void displayInorder(Node root)
    {
        if(root!=null)
        {
            displayInorder(root.left);
            System.out.print(root.data+" ");
            displayInorder(root.right);
        }
    }
}
public class Main {
    public static void main(String[] args) {
    BST bst = new BST();
    Scanner s = new Scanner(System.in);

    int val = s.nextInt();
    while(val!=-1)
    {
        bst.insert(val);
        val = s.nextInt();
    }
System.out.println("Tree values are:");

    bst.display();
System.out.print("  ");

}
    
}
