import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Nesne ismini küçük harfle başlatmak daha standarttır (employee)
        Employee employee = new Employee("Salih", "Software Engineer", 15000, 0.15);

        int choice;
        do {
            System.out.println("\nSelect an operation:\n1. Raise Salary\n2. Add Bonus\n3. Display Info\n4. Exit");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Enter the raise rate (%):");
                    double raiseRate = scanner.nextDouble();
                    employee.raiseSalary(raiseRate); // Güncel metot ismi
                    break;
                case 2:
                    System.out.println("Enter the bonus amount:");
                    double bonusAmount = scanner.nextDouble();
                    employee.addBonus(bonusAmount); // Güncel metot ismi
                    break;
                case 3:
                    employee.displayInfo(); // Güncel metot ismi
                    break;
                case 4:
                    System.out.println("Exiting the system...");
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a value between 1 and 4.");
                    break;
            }
        } while (choice != 4);

        scanner.close(); // Kaynak yönetimi için iyi bir alışkanlıktır
    }
}