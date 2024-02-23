package Practice;

import java.util.Scanner;

class BSTNode
{
    int data;
    BSTNode left,right;
    BSTNode(int data)
    {
        this.data = data;
        this.left = this.right = null;
    }
}
class BST
{
    BSTNode root;
    BST()
    {
        this.root = null;
    }
    void insert(int data){
        BSTNode newNode = new BSTNode(data);
        if(root==null)root = newNode;
        else inserter(root , data);
    }
    private void inserter(BSTNode root ,int data)
    {
        if(root.left==null && root.data > data)
        {
            BSTNode newNode = new BSTNode(data);
            root.left = newNode;
        }
        else if(root.right==null && root.data < data)
        {
            BSTNode newNode = new BSTNode(data);
            root.right = newNode;
        }
        else if(root.data > data)
            inserter(root.left, data);
        else if(root.data < data)
            inserter(root.right, data);
    }
    void display()
    {
        System.out.print("In-Order Traversal  : ");
        displayInorder(root);
        System.out.println();
        System.out.print("Pre-Order Traversal : ");
        displayPreorder(root);
        System.out.println();
        System.out.print("Post-oder Traversal : ");
        displayPostorder(root);

    }
    private void displayInorder(BSTNode root)
    {
        if(root!=null)
        {
            displayInorder(root.left);
            System.out.print(root.data+" ");
            displayInorder(root.right);
        }
    }
    private void displayPreorder(BSTNode root)
    {
        if(root!=null)
        {
            System.out.print(root.data+" ");
            displayPreorder(root.left);
            displayPreorder(root.right);
        }
    }
    private void displayPostorder(BSTNode root)
    {
        if(root!=null)
        {
            displayPostorder(root.left);
            displayPostorder(root.right);
            System.out.print(root.data+" ");
        }
    }
}
public class BST_Practice
{
    public static void main(String[] args) {
        BST bst = new BST();
        Scanner s = new Scanner(System.in);
        int size = s.nextInt();
        while(size-- >0)
            bst.insert(s.nextInt());
        bst.display();
    }
}