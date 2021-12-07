import java.util.Scanner;

public class One1 {
    public static void main(String[] args) {
        prime();
    }

    public static void prime() {


        Scanner sc = new Scanner((System.in));
        System.out.println("Enter the value  = ");
        int num = sc.nextInt();
        algo(num);


    }

    public static void algo(int num) {

        for (int i = 2; i <= num; i++) {
            int count = 0;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    count++;

                }


                }if (count == 0) {
                    System.out.println("prime number =" + i);


            }


        }


    }
}