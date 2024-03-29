package DataStructure.Tree;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

/**
 * Created by FY on 17/2/26.
 */
public class TreeApp {

    public static void main(String[] args) throws IOException {

        int value;
        Tree theTree=new Tree();

        theTree.insert(50,1.5);
        theTree.insert(25,1.2);
        theTree.insert(75,1.7);
        theTree.insert(12,1.5);
        theTree.insert(37,1.2);
        theTree.insert(43,1.7);
        theTree.insert(30,1.5);
        theTree.insert(33,1.2);
        theTree.insert(87,1.7);
        theTree.insert(93,1.5);
        theTree.insert(97,1.5);

        while (true){
            System.out.print("Enter first letter of show,insert,find,delete,or traverse? ");
            int choice=getChar();
            switch (choice){
                case 's':
                    theTree.displayTree();
                    break;
                case 'i':
                    System.out.print("Enter value to insert:");
                    value=getInt();
                    theTree.insert(value,value+0.9);
                    break;
                case 'f':
                    System.out.print("Enter the value to find:");
                    value=getInt();
                    Node found=theTree.find(value);
                    if(found!=null){
                        System.out.print("Found: ");
                        found.displayNode();
                        System.out.println();
                    }else
                        System.out.print("Cannot find "+value);
                    break;
                case 'd':
                    System.out.println("Enter the value to delete:");
                    value=getInt();
                    boolean didDelete=theTree.delete(value);
                    if (didDelete)
                        System.out.print(value+" deleted!");
                    else
                        System.out.println("Cannot delete "+value);
                    break;
                case 't':
                    System.out.print("Enter type(1,2 or3):");
                    value=getInt();
                    theTree.traverse(value);
                    break;
                default:
                    System.out.println("Invalid input!");
            }
        }
    }

    public static String getString() throws IOException{
        InputStreamReader isp=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(isp);
        String s=br.readLine();
        return s;
    }

    public static char getChar() throws IOException{
        String s=getString();
        return s.charAt(0);
    }

    public static int getInt() throws IOException{
        String s=getString();
        return Integer.parseInt(s);
    }

}
