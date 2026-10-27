package com.pluralsight;

import java.io.BufferedReader;
import java.io.FileReader;

public class PayrollCalcuator {
    public static void main(String[] args) {

        try {
            String employeeText = "employees.csv";
            BufferedReader fileName = new BufferedReader(new FileReader(employeeText));

            String line;

            fileName.readLine();

            while ((line = fileName.readLine()) != null) {
                // | has a special meaning in split (it takes a pattern), so it is escaped as \\|
                String[] tokens = line.split("\\|");
                // Everything read from a file is text: convert each value to its real type
                int id = Integer.parseInt(tokens[0]);
                String name = tokens[1];
                double hoursWorked = Double.parseDouble(tokens[2]);
                double payRate = Double.parseDouble(tokens[3]);

                Employee employee = new Employee(id, name, hoursWorked, payRate);

                // %.2f shows the pay as money, two decimals
                System.out.printf("Employee ID: %d, Name: %s, Gross Pay: $%.2f%n",
                        employee.getEmployeeId(), employee.getName(), employee.getGrossPay());
            }
            fileName.close();


        } catch (Exception e) {
            System.out.println("Something went wrong");
        }


    }
}
