/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proapp1;
import java.util.Scanner;
/**
 *
 * @author allwe
 */
public class EmployeeSalaryDeterminationApp {
    
    public static void main(String[] args) {  
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your employee type (1 for Commission, 2 for Base Commission):");
        int employeeType = scanner.nextInt();        
        scanner.nextLine();
        
        System.out.println("Enter your first name:");        
        String firstName = scanner.nextLine();
        System.out.println("Enter your last name:");        
        String lastName = scanner.nextLine();
        System.out.println("Enter your ID Number:");        
        String idNumber = scanner.nextLine();
        System.out.println("Enter your gross sales:");
        double grossSales = scanner.nextDouble();        
        System.out.println("Enter your commission rate (as a decimal):");
        double commissionRate = scanner.nextDouble();
        double baseSalary = 0;        if (employeeType == 2) {
            System.out.println("Enter your base salary:");            
            baseSalary = scanner.nextDouble();
        }
        if (employeeType == 1) {            
            CommissionEmployee commissionEmployee = new CommissionEmployee(firstName, lastName, idNumber, grossSales, commissionRate);
            System.out.println("Employee Details:");            System.out.println(commissionEmployee);
            System.out.println("Earnings: " + commissionEmployee.earnings());        
        } else if (employeeType == 2) {
            BaseCommissionEmployee baseCommissionEmployee = new BaseCommissionEmployee(firstName, lastName, idNumber, grossSales, commissionRate, baseSalary);            System.out.println("Employee Details:");
            System.out.println(baseCommissionEmployee);            
            System.out.println("Earnings: " + baseCommissionEmployee.earnings());
        } else {            
           System.out.println("Invalid employee type.");
        }
        scanner.close();    }
}

    

