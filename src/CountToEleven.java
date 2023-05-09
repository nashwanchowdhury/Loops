import java.util.Scanner;
public class CountToEleven {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number less than 11: ");
        int response = Integer.valueOf(scanner.nextLine());
        for (int i = response; i <= 11; i++) {
            System.out.println(i);
        }
    }
}
