public class Employee {
    private int employeeId;
    private String name;
    private double hourlyRate;
    private int hoursWorked;

    public Employee(int employeeId, String name, double hourlyRate, int hoursWorked) {
        this.employeeId = employeeId;
        this.name = name;
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    public double calculateSalary() {
        return hourlyRate * hoursWorked;
    }

    public void printPayStub() {
        System.out.println("Pay Stub for Employee: " + name);
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Hours Worked: " + hoursWorked);
        System.out.println("Hourly Rate: $" + hourlyRate);
        System.out.println("Total Salary: $" + calculateSalary());
    }
}
