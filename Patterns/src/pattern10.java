import java.util.Scanner;
/*
        *
        * *
        *   *
        *     *
        * * * * *
*/
public class pattern10 { //important
    public static void main(String[] arsgs) 
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();

        System.out.println("*"); //prints the first star
        
        for(int i = 2; i <= n-1; i++)
        {
            System.out.print("* ");
            for(int j = 1; j <= i-2; j++)
            {
                System.out.print("  ");
            }
            System.out.print("* ");
            System.out.println();
        }

        if(n>1)
        {
            for(int i = 1; i <= n; i++)
            {
                System.out.print("* "); //prints the last n stars
            }
        }
        
    }
}