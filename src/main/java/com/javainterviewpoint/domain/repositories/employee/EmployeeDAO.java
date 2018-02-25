package com.javainterviewpoint.domain.repositories.employee;

import com.javainterviewpoint.domain.models.Employee;

import java.util.List;
public interface EmployeeDAO
{
    public void saveEmployee(Employee employee);
    public Employee getEmployeeById(Long id);
    public void updateEmployee(Employee employee);
    public void deleteEmployee(Long id);
    public List<Employee> getAllEmployees();
}
