import java.util.Scanner;

public class Five5b {
    public static void main(String[] args) {
        int i, j;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows = ");
        int n = sc.nextInt();
        System.out.println("Enter the number of columns = ");
        int m = sc.nextInt();


        for (i = 1; i <= n; i++)
        {
            for (j = 1; j <= m; j++)
            {
                if (i == 1 || i == n ||
                        j == 1 || j == m)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }

    }
    }
