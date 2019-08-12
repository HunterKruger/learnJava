package OOP;

import java.util.Scanner;

/**
 * Created by FY on 17/3/27.
 */
public class Input2 {
    public static void main(String[] args) {
        String[] fy=new String[3];
        Scanner scanner=new Scanner(System.in);
        for (int i = 0; i < 3 ; i++) {
            fy[i]=scanner.next();
        }
        scanner.close();
        for (int i = 0; i < 3 ; i++) {
            System.out.println(fy[i]);
        }
    }
}
