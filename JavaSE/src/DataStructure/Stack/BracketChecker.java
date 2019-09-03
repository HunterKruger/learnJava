package DataStructure.Stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by FY on 16/12/23.
 */
public class BracketChecker {
    private String input;
    public BracketChecker(String input){
        this.input=input;
    }
    public void doCheck(){
        int stackSize=input.length();
        StackX st2=new StackX(input.length());
        for (int i = 0; i <input.length() ; i++) {
            char ch=input.charAt(i);
            switch (ch){
                case '{':
                case '[':
                case '(':st2.push(ch);break;

                case '}':
                case ']':
                case ')':
                    if(!st2.isEmpty()){
                        char ch2=st2.pop();
                        if((ch=='}' && ch2!='{')||(ch==']'&&ch2!='[')||(ch==')'&&ch2!='(')) {
                            System.out.println("Error:" + ch + " at " + i);
                        }
                    }else{
                        System.out.println("Error:"+ch+" at "+i);
                        break;
                    }
                default:break;
            }
        }
        if(!st2.isEmpty()){
            System.out.println("Error:missing right delimiter!");
        }
    }

    public static String getString() throws IOException {
        InputStreamReader isr=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(isr);
        String s=br.readLine();
        return s;
    }

    public static void main(String[] args) throws IOException {
        String input;
        while(true){
            System.out.println("Enter string with delimiters:");
            System.out.flush();
            input=getString();
            BracketChecker bc=new BracketChecker(input);
            bc.doCheck();

        }
    }
}
