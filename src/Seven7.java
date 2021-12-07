import java.util.Scanner;

public class Seven7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double n1;
        double n2;

        System.out.print("Enter 1st number: ");
        n1 = input.nextDouble();

        System.out.print("Enter 2nd number: ");
        n2 = input.nextDouble();
        input.close();

        if (Math.abs(n1 - n2) <= 0.01) {
            System.out.println("They are the same");
        }
        else {
            System.out.println("They are different");
        }


    }
}
