package Problem1;

import java.util.Scanner;

public class Problem1 {
    static Scanner input = new Scanner(System.in);
    static int n = input.nextInt();

    public static void PrintProblem1(){
        System.out.println("n= ");
        Problem1.RightDownTriangle();
        System.out.println();
        Problem1.Pyramid();
        System.out.println();
        Problem1.LeftUpTriangle();
        System.out.println();
        Problem1.CondensedLeftTriangle();
        System.out.println();
        Problem1.ReversedPyramid();
        System.out.println();
        Problem1.LeftTriangleNumbers();
    }
    public static void RightDownTriangle(){
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=(n-i);j++)
                System.out.print("  ");
            for(int j=1;j<=i;j++)
                System.out.print("* ");
            System.out.println();
        }
    }

    public static void Pyramid(){
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=(n-i);j++)
                System.out.print(" ");
            for(int j=1;j<=i;j++)
                System.out.print("* ");
            System.out.println();
        }
    }

    public static void LeftUpTriangle(){
        for(int i=n;i>=1;i--)
        {
            for(int j=1;j<=i;j++)
                System.out.print("* ");
            System.out.println();
        }
    }

    public static void CondensedLeftTriangle(){
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=(n-i);j++)
                System.out.print(" ");
            for(int j=1;j<=i;j++)
                System.out.print("*");
            System.out.println();
        }
    }

    public static void ReversedPyramid(){
        for(int i=n;i>=1;i--)
        {
            for(int j=1;j<=(n-i);j++)
                System.out.print(" ");
            for(int j=1;j<=i;j++)
                System.out.print("* ");
            System.out.println();
        }
    }

    public static void LeftTriangleNumbers(){
        int k = 1;
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(k + " ");
                k++;
            }
            System.out.println();
        }
    }
}

