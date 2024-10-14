package com.solid.s;

import com.solid.s.good.*;

public class SMain {

    public static void main(String[] args) {
        testGoodS();
    }

    private static void testGoodS() {
        Employee employee = new Employee("A", "GoodEmployee", 42);

        EmployeePaymentService paymentService = new EmployeePaymentService();
        int payment = paymentService.calculatePay(employee);
        System.out.printf("Payment calculated: %d\n", payment);

        EmployeeTimetrackingService timetrackingService = new EmployeeTimetrackingService();
        System.out.print(timetrackingService.reportHours(employee));

        EmployeeRepository repository = new EmployeeRepository();
        repository.save(employee);
    }
}
