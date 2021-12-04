package com.wipro.docker.network.employee.model;

import lombok.Data;

@Data
public class PostEmployeeResponse {
    private String status;
    private EmployeePostResponse data;
}
