package com.keyin;

import org.junit.Assert;
import org.junit.Test;

public class EmployeeTest {
    @Test
    public void testRaiseSalary() {
        Employee employeeTest = new Employee(1, "John", "Doe", 4500);
        Employee employeeTest2 = new Employee(2, "James", "Doe", 5000);

        employeeTest.raiseSalary(20);
        employeeTest2.raiseSalary(20);

        Assert.assertEquals((4500 * 1.20), employeeTest.getSalary(), 0.0);
        Assert.assertEquals((5000 * 1.20), employeeTest2.getSalary(), 0.0);
    }
}
