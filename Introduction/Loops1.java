package Introduction;

import java.util.Scanner;

public class Loops1 {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int N = scanner.nextInt();

        for (int i = 1; i<=10; i++) {
            System.out.println(N*i);
        }

    }
}