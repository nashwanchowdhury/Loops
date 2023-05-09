import java.util.Scanner;
public class StopAtFive {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean x = true;
        while (x) {
            System.out.println("Give a number: ");
            int response = Integer.valueOf(scanner.nextInt());
            if (response == 5) {
                x = false;
            }
        }
    }
}
