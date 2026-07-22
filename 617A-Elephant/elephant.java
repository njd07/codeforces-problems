import java.util.Scanner;

public class elephant{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();

        // Integer division gives us the number of full 5-length steps.
        int steps = x / 5;

        // If there is any remainder (distance 1, 2, 3, or 4), it takes exactly 1 more step.
        if (x % 5 != 0) {
            steps++;
        }

        System.out.println(steps);
        sc.close();
    }
}