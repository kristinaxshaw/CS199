// Kristina Shaw
// Lab 1 Lecture

package edu.monmouth.Employee;

public class SalesEmployee implements Employee {
    private int yearlyBase;
    private int commission;

    public SalesEmployee(int yearlyBase) {
        this.yearlyBase = yearlyBase;
        this.commission = 0;
    }

    public void setCommission(int commission) {
        this.commission = commission;
    }

    @Override
    public int getMonthlyPay() {
        return (yearlyBase + commission) / 12;
    }

    @Override
    public String toString() {
        return "SalesEmployee [Yearly Base Salary: $" + yearlyBase + ", Commission: $" + commission + "]";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SalesEmployee other = (SalesEmployee) obj;
        return yearlyBase == other.yearlyBase && commission == other.commission;
    }
    // test for equals method
    public static void main(String[] args) {
        SalesEmployee employee1 = new SalesEmployee(50000);
        employee1.setCommission(6000);

        SalesEmployee employee2 = new SalesEmployee(50000);
        employee2.setCommission(6000);

        System.out.println("Employee 1 Monthly Pay: $" + employee1.getMonthlyPay());
        System.out.println("Employee 2 Monthly Pay: $" + employee2.getMonthlyPay());

        System.out.println("Employee 1: " + employee1);
        System.out.println("Employee 2: " + employee2);

        System.out.println("Are Employee 1 and Employee 2 equal? " + employee1.equals(employee2));
    }
}