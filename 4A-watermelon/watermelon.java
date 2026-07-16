import java.util.Scanner;
public class watermelon {
    public static String check(int weight) {
        if (weight > 2 && weight % 2 == 0) {
            return "YES";
        }
        return "NO";
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int weight = sc.nextInt();
        System.out.println(check(weight));
        sc.close();
    }
}