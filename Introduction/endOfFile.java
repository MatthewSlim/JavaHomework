package Introduction;
import java.util.Scanner;
public class endOfFile {
        public static void main(String[] args) {

            Scanner scan = new Scanner(System.in);
            int i = 1;
            while (scan.hasNextLine()) {
                System.out.println(i + " " + scan.nextLine());
                i++;
            }
        /*    if (scan.equals("eof"))
                scan.close();
            break; */
        }
    }
