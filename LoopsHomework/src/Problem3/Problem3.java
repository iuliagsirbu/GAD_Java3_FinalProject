package Problem3;

import java.util.Scanner;

public class Problem3 {
    static Scanner input = new Scanner(System.in);
    static int n = input.nextInt();

    public static void PrintProblem3(){
        ReversedDigits();
    }

    public static void ReversedDigits(){
        int ogl = 0;
        while(n>0){
            ogl = ogl * 10 + n%10;
            n = n/10;
        }
        System.out.println(ogl);
    }
}
