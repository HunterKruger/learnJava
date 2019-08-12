package DataStructure.Hash;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by FY on 17/2/27.
 */
public class HashTableApp {

    public static void main(String[] args) throws IOException {

        DataItem aDataitem;
        int aKey, size, n, keysPerCell;
        System.out.print("Enter size of hash table:");
        size = getInt();
        System.out.print("Enter initial number of items:");
        n = getInt();
        keysPerCell = 10;
        HashTable theHashTable = new HashTable(size);
        for (int i = 0; i < n; i++) {
            aKey = (int) (java.lang.Math.random() * keysPerCell * size);
            aDataitem = new DataItem(aKey);
            theHashTable.insert(aDataitem);
        }

        while (true) {
            System.out.println("Enter the first letter of show, delete, find or insert");
            char choice = getChar();
            switch (choice) {
                case 's':
                    theHashTable.displayTable();
                    break;
                case 'i':
                    System.out.println("Enter key value to insert:");
                    aKey = getInt();
                    aDataitem = new DataItem(aKey);
                    theHashTable.insert(aDataitem);
                    break;
                case 'd':
                    System.out.println("Enter key value to delete:");
                    aKey = getInt();
                    theHashTable.delete(aKey);
                    break;
                case 'f':
                    System.out.println("Enter key value to find:");
                    aKey = getInt();
                    aDataitem = theHashTable.find(aKey);
                    if (aDataitem != null)
                        System.out.println("Found " + aKey);
                    else
                        System.out.println("Not found");
                    break;
                default:
                    System.out.println("Invalid input");
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
