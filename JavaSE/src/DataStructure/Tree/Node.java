package DataStructure.Tree;

/**
 * Created by FY on 17/2/24.
 */
public class Node {
    public int iData;
    public double dData;
    public void displayNode(){
        System.out.print("{"+iData+","+dData+"}");
    }
    public Node leftChild;
    public Node rightChild;
}
