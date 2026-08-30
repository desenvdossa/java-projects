import java.util.Scanner;

public class Terminal {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Account number:");
        int accountNumber = Integer.parseInt(scanner.nextLine().trim());

        System.out.println("Branch:");
        String branch = scanner.nextLine();

        System.out.println("Holder Name:");
        String clientName = scanner.nextLine();

        System.out.println("Balance:");
        double balance = Double.parseDouble(scanner.nextLine().trim().replace(",", "."));

        System.out.println("Hello " + clientName
                + ", thank you for creating an accaount with us! Your branch is "
                + branch + ", account " + accountNumber + " and your balance is " + balance
                + " avaliable for withdraw");

        scanner.close();
    }
}
