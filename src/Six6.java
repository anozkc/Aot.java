import java.util.Scanner;

public class Six6 {
    public static void main(String[] args) {
        Greater();
    }
    public static void Greater(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number = ");
        int num1 = sc.nextInt();
        System.out.println("Enter the second number =");
        int num2 = sc.nextInt();
        System.out.println("Enter the Third number =");
        int num3 = sc.nextInt();
        algo(num1,num2,num3);

    }
    public  static void algo(int a, int b, int c){
        if (a>b && b>c) {
            System.out.println("The numbers are in descending order");
        }
        else if (a<b && b<c){
            System.out.println("The numbers are in ascending order");
        }
        else{
            System.out.println("The numbers are neither in increasing nor descending order");
        }


        }

    }

