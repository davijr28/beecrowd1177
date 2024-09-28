
import java.util.Scanner;

public class Beecrowd1177 {

    public static void main(String[] args) throws java.lang.Exception {
        Scanner scanner = new Scanner(System.in);
        int N[] = new int[1000];
        int T, U;
        T = scanner.nextInt();
        U = T;
        for (int i = 0; i < 1000; i++) {
            if (U < 1) {
                U = T;
            }
            N[i] = T - U;
            U--;
            System.out.printf("N[%d] = %d%n", i, N[i]);
        }

    }
}
