package DataStructure.Stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


/**
 * Created by FY on 16/12/22.
 */
public class Reverse {
    private String input;
    private String output;
    public Reverse(String input){
        this.input=input;
    }
    public String doReverse(){
        int stackSize=input.length();
        StackX st=new StackX(stackSize);
        for (int i = 0; i <input.length() ; i++) {
            char ch=input.charAt(i);
            st.push(ch);
        }
        output="";
        while (!st.isEmpty()){
            char ch2=st.pop();
            output+=ch2;
        }
        return output;
    }

    public static String getString() throws IOException{
        InputStreamReader isr=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(isr);
        String s=br.readLine();
        return s;
    }

    public static void main(String[] args) throws IOException{
        String input,output;
        while (true){
            System.out.println("Enter a word:");
            input=getString();
            Reverse reverse=new Reverse(input);
            output=reverse.doReverse();
            System.out.println("The reverse is:");
            System.out.println(output);

        }
    }
}
