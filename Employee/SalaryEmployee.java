// Kristina Shaw
// Lab 1 Lecture
package edu.monmouth.Employee;

public class SalaryEmployee implements Employee {
    private int yearlySalary;

    public SalaryEmployee(int yearlySalary) {
        this.yearlySalary = yearlySalary;
    }

    @Override
    public int getMonthlyPay() {
        return yearlySalary / 12;
    }

    @Override
    public String toString() {
        return "SalaryEmployee [Yearly Salary: $" + yearlySalary + "]";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SalaryEmployee other = (SalaryEmployee) obj;
        return yearlySalary == other.yearlySalary;
    }
    // test for equals method
    public static void main(String[] args) {
        SalaryEmployee employee1 = new SalaryEmployee(60000);
        SalaryEmployee employee2 = new SalaryEmployee(60000);

        System.out.println("Employee 1 Monthly Pay: $" + employee1.getMonthlyPay());
        System.out.println("Employee 2 Monthly Pay: $" + employee2.getMonthlyPay());

        System.out.println("Employee 1: " + employee1);
        System.out.println("Employee 2: " + employee2);

        System.out.println("Are Employee 1 and Employee 2 equal? " + employee1.equals(employee2));
    }
}