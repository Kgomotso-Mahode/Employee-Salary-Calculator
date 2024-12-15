/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proapp1;

class BaseCommissionEmployee extends CommissionEmployee {
    private double baseSalary;

    // Constructor
    public BaseCommissionEmployee(String firstName, String lastName, String idNumber, double grossSales, double commissionRate, double baseSalary) {
        super(firstName, lastName, idNumber, grossSales, commissionRate);
        this.baseSalary = baseSalary;
    }

    // Getter and Setter for baseSalary
    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    // Overridden earnings method
    @Override
    public double earnings() {
        return super.earnings() + baseSalary;
    }

    // toString() method for better display
    @Override
    public String toString() {
        return "BaseCommissionEmployee{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", idNumber='" + idNumber + '\'' +
                ", grossSales=" + grossSales +
                ", commissionRate=" + commissionRate +
                ", baseSalary=" + baseSalary +
                '}';
    }
}