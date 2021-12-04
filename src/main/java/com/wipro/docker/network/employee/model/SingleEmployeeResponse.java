package com.wipro.docker.network.employee.model;

import lombok.Data;

@Data
public class SingleEmployeeResponse {
    private String status;
    private EmployeeInfo data;
}
