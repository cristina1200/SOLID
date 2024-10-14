package com.solid.s.good;

public class EmployeeTimetrackingService {

    public String reportHours(Employee employee) {
        return String.format("%s worked %d hours.\n", employee.getName(), employee.getHours());
    }
}
