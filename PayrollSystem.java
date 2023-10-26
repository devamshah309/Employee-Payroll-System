import java.util.Scanner;

public class PayrollSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Employee ID: ");
        int employeeId = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        System.out.print("Enter Employee Name: ");
        String name = scanner.nextLine();

        System.out.print("Enter Hourly Rate: $");
        double hourlyRate = scanner.nextDouble();

        System.out.print("Enter Hours Worked: ");
        int hoursWorked = scanner.nextInt();

        Employee employee = new Employee(employeeId, name, hourlyRate, hoursWorked);
        employee.printPayStub();

        scanner.close();
    }
}
