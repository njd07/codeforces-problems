import java.util.Scanner;
public class team {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        for (int i = 0; i < n; i++) {
            int m = sc.nextInt();
            int k = sc.nextInt();
            int l = sc.nextInt();
            if((m+k+l)>=2){
                count++;
            }
        }
        sc.close();
        System.out.println(count);

    }
}
