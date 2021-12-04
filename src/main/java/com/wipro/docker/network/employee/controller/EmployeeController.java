package com.wipro.docker.network.employee.controller;

import com.wipro.docker.network.employee.model.EmployeeInfo;
import com.wipro.docker.network.employee.model.EmployeeRequest;
import com.wipro.docker.network.employee.model.EmployeeResponse;
import com.wipro.docker.network.employee.model.SingleEmployeeResponse;
import com.wipro.docker.network.employee.service.EmployeeService;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;

@RestController
public class EmployeeController {

    EmployeeService  employeeService = new EmployeeService();

    @RequestMapping(value = "/allEmployees", method = RequestMethod.GET)
    public EmployeeResponse allEmployeesMethod() throws IOException {
        return employeeService.employeeResponse();
    }

    @RequestMapping(value = "/employee/{id}", method = RequestMethod.GET)
    public SingleEmployeeResponse singleEmployee(@PathVariable int id) {
        return employeeService.getEmployee(id);
    }

    @RequestMapping(value = "/postemployee", method = RequestMethod.POST)
    public SingleEmployeeResponse postEmployee(@RequestBody EmployeeRequest employeeRequest) {
        return employeeService.postEmployee(employeeRequest);
    }
}
