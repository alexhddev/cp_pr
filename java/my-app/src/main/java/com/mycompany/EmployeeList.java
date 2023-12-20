package com.mycompany;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class EmployeeList {
    private List<Employee> employees = new ArrayList<Employee>();

    public EmployeeList() {
        employees.add(new Employee("John", 25, 30000));
        employees.add(new Employee("Donald", 30, 50000));
        employees.add(new Employee("Tom", 35, 40000));
        employees.add(new Employee("Jane", 40, 60000));
        employees.add(new Employee("Mary", 45, 70000));
        employees.add(new Employee("David", 50, 80000));
    }

    public List<Employee> getEmployeesSortedByAge() {
        List<Employee> sortedEmployees = new ArrayList<Employee>(employees);
        sortedEmployees.sort((e1, e2) -> e1.getAge() - e2.getAge());
        return sortedEmployees;
    }

    public List<Employee> getEmployeesSortedByAgeWithStream() {
        return employees.stream().sorted((e1, e2) -> e1.getAge() - e2.getAge()).collect(Collectors.toList());
    }

    public void printEmployeesNames() {
        employees.forEach(e -> System.out.println(e.getName()));
    }

    public List<Employee> getEmployeesWithSalaryGreaterThan(int salary) {
        return employees.stream()
                .filter(e -> e.getSalary() > salary)
                .sorted(Comparator.comparing(employee -> employee.getName()))
                .collect(Collectors.toList());
    }

}
