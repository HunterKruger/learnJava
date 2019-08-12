package DataStructure.Recursion;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by FY on 17/1/31.
 */
public class TriangleAPP {
    static int theNumber;

    public static void main(String[] args) throws IOException{
        System.out.println("Enter a number:");
        theNumber=getInt();
        int theAnswer=triangle(theNumber);
        System.out.println("Triangle="+theAnswer);
    }

    public static int getInt() throws IOException{
        String s=getString();
        return Integer.parseInt(s);
    }

    public static String getString() throws IOException{
        InputStreamReader isr=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(isr);
        String s=br.readLine();
        return s;
    }

    public static int triangle(int num){
        if(num==1){
            System.out.println("Entering: "+num);
            return 1;
        }
        else {
            int temp=num+triangle(num-1);
            System.out.println("Returning: "+temp);
            return temp;
        }
    }
}
