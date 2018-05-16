package Introduction;

import java.util.Scanner;

public class IfElse {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();


        String answer = "";
        if (a % 2 == 1) {
            answer = "Weird";
        } else {
            if (a >= 6 && a <= 20) {
                answer = "Weird";
            } else {
                answer = "Not Weird";
            }
        }
        System.out.println(answer);
    }
}
