package com.wipro.docker.network.employee.controller;

import com.wipro.docker.network.employee.model.EmployeeResponse;
import com.wipro.docker.network.employee.service.EmployeeService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {

    EmployeeService  employeeService = new EmployeeService();

    @RequestMapping(value = "/allEmployees", method = RequestMethod.GET)
    public EmployeeResponse allEmployeesMethod() {
        EmployeeResponse employeeResponse = employeeService.employeeResponse();
        return employeeResponse;
    }
}
