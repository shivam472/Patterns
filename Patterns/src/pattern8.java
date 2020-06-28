import java.util.Scanner;
/*
              1
            2   3
          4   5   6
        7   8   9   10
*/
public class pattern8 { //Important
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        int counter = 1;
        for(int i = 1; i <= n; i++)
        {
            for(int j = 1; j <= n-i; j++)
            {
                System.out.print("  "); //2 spaces
            }
            for(int j = 1; j <= i; j++)
            {
                System.out.print(counter++ + "   "); //3 spaces
            }
            System.out.println();
        }
    }
}