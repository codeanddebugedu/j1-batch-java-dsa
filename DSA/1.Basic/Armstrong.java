package Basic;

import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        System.out.print("Enter Number: ");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int rem, y = x, sum = 0;
        while (x != 0) {
            rem = x % 10;
            int cube = rem * rem * rem;
            sum = sum + cube;
            x = x / 10;
        }
        if (sum == y)
            System.out.println("Armstrong number");
        else
            System.out.println("Not a Armstrong Number");
    }
}
