package OOP;

import java.util.Scanner;

/**
 * Created by FY on 17/3/27.
 */
public class Input {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int[] fy=new int[5];
        for (int i = 0; i < 5 ; i++) {
            int temp=scanner.nextInt();
            fy[i]=temp;
        }
        scanner.close();
        for (int i = 0; i < 5; i++) {
            System.out.print(fy[i]+" ");
        }
    }
}
