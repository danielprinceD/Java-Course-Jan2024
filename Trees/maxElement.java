import java.util.Scanner;

class Node
{
    int data;
    Node left,right;
    Node(int data)
    {
        this.data = data;
        this.left = this.right = null;
    }
}
class BST
{
    Node root;
    BST()
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
    int max;

    public void max_element()
    {
         finder(root);
    }
    private void finder(Node root)
    {
        if(root!=null)
        {
            
            finder(root.left);
            max = root.data;

            finder(root.right);
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
bst.max_element();

System.out.println("Maximum element is "+ bst.max);

    }
}
