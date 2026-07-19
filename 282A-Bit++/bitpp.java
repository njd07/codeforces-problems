import java.util.Scanner;

public class bitpp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = 0;

        for (int i = 0; i < n; i++) {
            String statement = sc.next();
            // Since the input only contains +, -, and X, checking for "+" is enough
            if (statement.contains("+")) {
                x++;
            } else {
                x--;
            }
        }
        sc.close();
        System.out.println(x);
    }
}