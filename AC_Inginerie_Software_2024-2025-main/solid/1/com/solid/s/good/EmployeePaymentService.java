package com.solid.s.good;

public class EmployeePaymentService {

    public int calculatePay(Employee employee) {
        switch (employee.getStatus()) {
            case "A":
                return 1;
            case "B":
                return 2;
            default:
                return 0;
        }
    }
}
