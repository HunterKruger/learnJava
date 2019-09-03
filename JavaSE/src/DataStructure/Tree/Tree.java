package DataStructure.Tree;

import java.util.Stack;

/**
 * Created by FY on 17/2/24.
 */
public class Tree {

    private Node root;

    public Tree(){
        root=null;
    }

    public Node find(int key){
        Node current=root;
        while (current.iData!=key){
            if(current.iData<key)
                current=current.leftChild;
            else
                current=current.rightChild;
            if(current==null)
                return null;
        }
        return current;
    }

    public void insert(int ii,double dd) {
        Node node = new Node();
        node.iData = ii;
        node.dData = dd;
        if (root == null) {
            root = node;
        } else {
            Node current = root;
            Node parent;
            while (true) {
                parent = current;
                if (ii < current.iData) {
                    current = current.leftChild;
                    if (current == null) {
                        parent.leftChild = node;
                        return;
                    }
                } else {
                    current = current.rightChild;
                    if (current == null) {
                        parent.rightChild = node;
                        return;
                    }
                }
            }
        }
    }

    public Node minimum(){
        Node current=root;
        Node last=current;
        while (current!=null) {
            last = current;
            current = current.leftChild;
        }
        return last;
    }

    public Node maximum(){
        Node current=root;
        Node last=current;
        while (current!=null) {
            last = current;
            current = current.rightChild;
        }
        return last;
    }

    public boolean delete(int key) {

        Node parent = root;
        Node current = root;
        boolean isLeftChild = true;

        while (key != current.iData) {
            parent = current;
            if (key < current.iData) {
                isLeftChild = true;
                current = current.leftChild;
            } else {
                isLeftChild = false;
                current = current.rightChild;
            }
            if (current == null)
                return false;
        }


        if (current.leftChild != null && current.rightChild != null) {
            if (current == root)
                root = null;
            else if (isLeftChild)
                parent.leftChild = null;
            else
                parent.rightChild = null;

        } else if (current.rightChild == null) {
            if (current == root)
                root = current.leftChild;
            else if (isLeftChild)
                parent.leftChild = current.leftChild;
            else
                parent.rightChild = current.leftChild;
        } else if (current.leftChild == null) {
            if (current == root)
                root = current.rightChild;
            else if (isLeftChild)
                parent.leftChild = current.rightChild;
            else
                parent.rightChild = current.rightChild;
        } else {
            Node successor = getSuccessor(current);
            if (current == root)
                root = successor;
            else if (isLeftChild)
                parent.leftChild = successor;
            else
                parent.rightChild = successor;

            successor.leftChild = current.leftChild;
        }
        return true;
    }

    private Node getSuccessor(Node deleteNode){
        Node successorParent=deleteNode;
        Node successor=deleteNode;
        Node current=deleteNode.rightChild;
        while (current!=null){
            successorParent=successor;
            successor=current;
            current=current.leftChild;
        }
        if(successor!=deleteNode.rightChild){
            successorParent.leftChild=successor.rightChild;
            successor.rightChild=deleteNode.rightChild;
        }
        return successor;
    }

    private void preOrder(Node localRoot){
        if(localRoot!=null){
            System.out.print(localRoot.iData+" ");
            preOrder(localRoot.leftChild);
            preOrder(localRoot.rightChild);
        }
    }

    private void inOrder(Node localRoot){
        if(localRoot!=null){
            inOrder(localRoot.leftChild);
            System.out.print(localRoot.iData+" ");
            inOrder(localRoot.rightChild);
        }
    }

    private void postOrder(Node localRoot){
        if(localRoot!=null){
            postOrder(localRoot.leftChild);
            postOrder(localRoot.rightChild);
            System.out.print(localRoot.iData+" ");
        }
    }

    public void traverse(int traverseType){
        switch (traverseType){
            case 1:
                System.out.println("\nPreOrder Traversal:");
                preOrder(root);
                break;
            case 2:
                System.out.println("\nInOrder Traversal:");
                inOrder(root);
                break;
            case 3:
                System.out.println("\nPostOrder Traversal:");
                postOrder(root);
                break;
        }
        System.out.println();
    }

    public void displayTree(){

        Stack globalStack=new Stack();
        globalStack.push(root);
        int nBlanks=32;
        boolean isRowEmpty=false;
        System.out.println("...............................................................");

        while (isRowEmpty==false){
            Stack localStack=new Stack();
            isRowEmpty=true;

            for (int i = 0; i <nBlanks ; i++) {
                System.out.print(' ');
            }

            while (globalStack.isEmpty()==false){

                Node temp=(Node)globalStack.pop();

                if(temp!=null) {
                    System.out.print(temp.iData);
                    localStack.push(temp.leftChild);
                    localStack.push(temp.rightChild);

                    if (temp.leftChild != null || temp.rightChild != null)
                        isRowEmpty = false;

                }else {
                    System.out.print("--");
                    localStack.push(null);
                    localStack.push(null);
                }
                    for (int j = 0; j <nBlanks*2.2 ; j++)
                        System.out.print(' ');

            }

            System.out.println();
            nBlanks/=2;

            while (localStack.isEmpty()==false)
                globalStack.push(localStack.pop());

        }
        System.out.println("...............................................................");
    }

}
