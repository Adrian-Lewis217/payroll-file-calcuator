package com.pluralsight;

import java.io.BufferedReader;
import java.io.FileReader;

public class PayrollCalcuator {
    public static void main(String[] args) {

        try {
            BufferedReader fileName = new BufferedReader(new FileReader("employees.csv"));



        } catch (Exception e) {
            System.out.println("Something went wrong");
        }


    }
}
