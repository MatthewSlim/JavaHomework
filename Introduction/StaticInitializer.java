package Introduction;
import java.util.Scanner;
public class StaticInitializer {

    public static int Breadth;
    public static int Height;
    public static boolean flag;

    static {
        Scanner scan = new Scanner(System.in);
        Breadth = scan.nextInt();
        Height = scan.nextInt();

        if (Breadth <= 0 || Height <= 0) {
            System.out.println("java.lang.Exception: Breadth and height must be positive");
            flag = false;
        } else {
            flag = true;
        }
    }

    public static void main(String[] args) {
        if (flag) {
            int area = Breadth * Height;
            System.out.print(area);
        }
    }
}