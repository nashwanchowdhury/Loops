import java.util.Scanner;
public class PositiveNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean x = true;
        while (x) {
            System.out.println("Enter a number: ");
            int response = Integer.valueOf(scanner.nextInt());
            if (response < 0) {
                    System.out.println("Number must be a positive number");
            } else if (response == 0) {
                x = false;
            } else {
                    System.out.println("Number is " + response);
            }
            }
        }
    }
