import java.util.Scanner;
public class TakeABreak {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean x = true;
        while (x) {
            System.out.println("Do you want to take a break?");
            String response = scanner.nextLine();
            if (response.equals("yes")) {
                x = false;
            }
        }
    }
}
