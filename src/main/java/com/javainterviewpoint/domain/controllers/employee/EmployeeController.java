package com.javainterviewpoint.domain.controllers.employee;

import java.util.List;

import com.javainterviewpoint.domain.models.Employee;
import com.javainterviewpoint.domain.repositories.employee.impl.EmployeeDAOImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@RestController
@RequestMapping(value="/api")
@Api(value="Employee Service")
public class EmployeeController
{
    @Autowired
    private EmployeeDAOImpl employeeDAO;

    @RequestMapping(value = "/create",method=RequestMethod.POST)
    @ApiOperation(value="Create Employee",notes="Creation of a new Employee",response=EmployeeController.class)
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Employee Created successfully"),
            @ApiResponse(code = 401, message = "You are Not authorized to create Employee"),
            @ApiResponse(code = 403, message = "Create Employee is forbidden"),
            @ApiResponse(code = 404, message = "Resource Not found")
    })
    public void saveEmployee(@RequestBody Employee employee)
    {
        employeeDAO.saveEmployee(employee);
    }
    
    @RequestMapping(value = "/employee/{id}",method=RequestMethod.GET)
    @ApiOperation(value="Get Employee",notes="Get Employee by a particular id",response=EmployeeController.class)
    public Employee getEmployeeById(@PathVariable("id") Long id)
    {
        
        Employee employee = employeeDAO.getEmployeeById(id);
        return employee;
        
    }
    
    @RequestMapping(value = "/employees",method=RequestMethod.GET)
    @ApiOperation(value="List of Employees",notes="Get list of all Employees",response=EmployeeController.class)
    public List<Employee> listEmployees()
    {
        List<Employee> employeeList = employeeDAO.getAllEmployees();
        return employeeList;
    }
    
    @RequestMapping(value = "/update",method=RequestMethod.PUT)
    @ApiOperation(value="Update Employee",notes="Update a particular Employee",response=EmployeeController.class)
    public void update(@RequestBody Employee employee)
    {
        employeeDAO.updateEmployee(employee);
    }
    
    @RequestMapping(value = "/delete/{id}",method=RequestMethod.DELETE)
    @ApiOperation(value="Delete Employee",notes="Delete a particular Employee",response=EmployeeController.class)
    public void deleteEmployee(@PathVariable("id") Long id)
    {
        employeeDAO.deleteEmployee(id);
    }
}
