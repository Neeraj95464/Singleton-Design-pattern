package com.ynmio.Singleton.Design.pattern.model;

// its lazy initilation


public class Employee {
    private static volatile Employee employee;
    private static final int FEES = 300;

    private Employee() {
    }

    public static Employee getObject() {
        if (employee == null) {
            synchronized (Employee.class) {
                if (employee == null) {
                    employee = new Employee();
                }
            }
        }
        return employee;
    }

    public void showFees() {
        System.out.printf("Coaching fees is %d%n", FEES);
    }
}

class Runner {
    public static void main(String[] args) {
        Employee employee = Employee.getObject();
        employee.showFees();
    }
}

