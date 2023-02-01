package Problem4;

import java.util.Scanner;

public class Problem4 {
    public static void PrintProblem4(){
        EvenOddInt();
    }
    public static void EvenOddInt(){
        Scanner input = new Scanner(System.in);
        int evensum=0, oddsum=0, n = input.nextInt(), number;
        for(int i=1;i<=n;i++)
        {
            number = input.nextInt();
            if(number%2==1)
                oddsum += number;
            else evensum += number;
        }
        System.out.println(evensum + ", " + oddsum);
    }
}
