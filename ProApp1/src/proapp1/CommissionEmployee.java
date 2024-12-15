/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proapp1;


class CommissionEmployee {
    String firstName;
    String lastName;
    String idNumber; // Changed "socialSecurityNumber" to "idNumber"
    double grossSales;
    double commissionRate;

    // Constructor
    public CommissionEmployee(String firstName, String lastName, String idNumber, double grossSales, double commissionRate) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.idNumber = idNumber; // Changed "socialSecurityNumber" to "idNumber"
        this.grossSales = grossSales;
        this.commissionRate = commissionRate;
    }

    // Getters and Setters
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getIdNumber() { // Changed "getSocialSecurityNumber" to "getIdNumber"
        return idNumber;
    }

    public void setIdNumber(String idNumber) { // Changed "setSocialSecurityNumber" to "setIdNumber"
        this.idNumber = idNumber;
    }

    public double getGrossSales() {
        return grossSales;
    }

    public void setGrossSales(double grossSales) {
        if (grossSales >= 0) {
            this.grossSales = grossSales;
        } else {
            System.out.println("Invalid gross sales value. Please enter a non-negative value.");
        }
    }

    public double getCommissionRate() {
        return commissionRate;
    }

    public void setCommissionRate(double commissionRate) {
        if (commissionRate >= 0) {
            this.commissionRate = commissionRate;
        } else {
            System.out.println("Invalid commission rate. Please enter a non-negative value.");
        }
    }

    // Earnings method
    public double earnings() {
        if (grossSales >= 0 && commissionRate >= 0) {
            return grossSales * commissionRate;
        } else {
            return 0;
        }
    }

    // toString() method for better display
    @Override
    public String toString() {
        return "CommissionEmployee{" +
               "firstName='" + firstName + '\'' +
               ", lastName='" + lastName + '\'' +
               ", idNumber='" + idNumber + '\'' +
               ", grossSales=" + grossSales +
               ", commissionRate=" + commissionRate +
               '}';
    }
}