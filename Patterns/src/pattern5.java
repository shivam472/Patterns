
/*
    * * * * * *
      * * * * *
        * * * *
          * * *
            * * 
              * 

*/
import java.util.Scanner;

public class pattern5 { //Important
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        for(int i = 1; i <= n; i++)
        {
            for(int j = 1; j <= i-1; j++) //the loop will run till j <= 2(n-i) since we are printing 2 spaces so  we can write j <= n-i
            {
                System.out.print("  "); //2 spaces
            }
            for(int j = 1; j <= n-i+1; j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}