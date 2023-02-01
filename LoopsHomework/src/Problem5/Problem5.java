package Problem5;

import java.util.Scanner;

public class Problem5 {
    static Scanner input = new Scanner(System.in);
    static int n = input.nextInt();

    public static void PrintProblem5(){
        Fibonacci();
    }

    public static void Fibonacci(){
        int a=0, b=1, c;
        System.out.print(a + " " + b + " ");
        n = n-2;
        while(n>0)
        {
            c = a + b;
            a = b;
            b = c;
            n = n - 1;
            System.out.print(c + " ");
        }
    }
}
