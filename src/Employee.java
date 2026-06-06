public class Employee {
    private double baseSalary;
    private double bonus;
    private double tax;
    private String name;
    private String department;

    public Employee(String name, String department, double baseSalary, double tax) {
        this.name = name;
        this.department = department;
        setBaseSalary(baseSalary);
        setTax(tax);
        this.bonus = 0;
    }

    private void setBaseSalary(double baseSalary) {
        if (baseSalary < 8500) {
            this.baseSalary = 8500;
            System.out.println("Salary cannot be less than 8500 TL! Saved as 8500 TL.");
        } else {
            this.baseSalary = baseSalary;
        }
    }

    private void setTax(double tax) {
        if (tax < 0) {
            this.tax = 0;
        } else if (tax > 0.4) {
            this.tax = 0.4;
        } else {
            this.tax = tax;
        }
    }

    public void raiseSalary(double rate) {
        double raiseAmount = this.baseSalary * (rate / 100);
        setBaseSalary(this.baseSalary + raiseAmount);
        System.out.println("Salary raised by %" + rate + ". New salary: " + this.baseSalary + " TL");
    }

    public void addBonus(double amount) {
        if (amount > 0) {
            this.bonus = amount;
            System.out.println(amount + " TL bonus added. Total bonus: " + bonus);
        } else {
            System.out.println("Invalid bonus amount entered!");
        }
    }

    public double calculateNetSalary() {
        double grossSalary = this.baseSalary + this.bonus;
        return grossSalary * (1 - this.tax);
    }

    public void displayInfo() {
        double grossSalary = this.baseSalary + this.bonus;
        double netSalary = calculateNetSalary();
        System.out.println("Employee name: " + this.name);
        System.out.println("Department: " + this.department);
        System.out.println("Gross salary: " + grossSalary + " TL");
        System.out.println("Tax rate: " + tax);
        System.out.println("Net salary: " + netSalary);
    }
}