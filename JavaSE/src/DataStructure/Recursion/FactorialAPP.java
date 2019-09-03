package DataStructure.Recursion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by FY on 17/1/31.
 */
public class FactorialAPP {
    static int theNumber;

    public static void main(String[] args) throws IOException{
        System.out.println("Enter a number:");
        theNumber=getInt();
        int theAnswer=factorial(theNumber);
        System.out.println("Factorial="+theAnswer);
    }

    public static int factorial(int num){
        if(num==1){
            System.out.println("Entering:"+num);
            return 1;
        }
        else {
            int temp=num * factorial(num - 1);
            System.out.println("Returning:"+temp);
            return temp;
        }
    }

    public static int getInt() throws IOException{
        String s=getString();
        return Integer.parseInt(s);
    }

    public static String getString() throws IOException{
        InputStreamReader isp=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(isp);
        String s=br.readLine();
        return s;
    }


}
