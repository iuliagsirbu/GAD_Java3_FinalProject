package Problem2;

import java.util.Scanner;

public class Problem2 {
    static Scanner input = new Scanner(System.in);
    static int n = input.nextInt();

    public static void PrintProblem2(){
        MultiplicationTable();
    }
    public static void MultiplicationTable() {
        for (int i = 1; i <= 10; i++) {
            System.out.println(n + " * " + i + " = " + n * i);
        }
    }
}
