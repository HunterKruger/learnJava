package OOP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by FY on 17/3/27.
 */
public class Input3 {

    public static String getString() throws IOException{
        InputStreamReader isr=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(isr);
        String temp=br.readLine();
        return temp;
    }

    public static char getChar() throws IOException{
        String s=getString();
        return s.charAt(0);
    }

    public static int getInt() throws IOException{
        String s=getString();
        return Integer.parseInt(s);
    }

    public static void main(String[] args) throws IOException{
        System.out.print("Enter a string:");
        String s=getString();
        System.out.println(s);

        System.out.print("Enter an integer:");
        int i=getInt();
        System.out.println(i);

        System.out.print("Enter a char");
        char c=getChar();
        System.out.println(c);


    }
}
