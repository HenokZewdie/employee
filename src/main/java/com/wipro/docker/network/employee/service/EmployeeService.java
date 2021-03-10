package com.wipro.docker.network.employee.service;

import com.wipro.docker.network.employee.model.EmployeeResponse;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

public class EmployeeService {

    RestTemplate restTemplate = new RestTemplate();
    public EmployeeResponse employeeResponse(){
        EmployeeResponse employeeResponse = new EmployeeResponse();
        HttpHeaders headers = new HttpHeaders();
        String url = "http://dummy.restapiexample.com/api/v1/employees";
        HttpEntity<?> entity = new HttpEntity<>(headers);
        ResponseEntity<EmployeeResponse> responseEntity = null;

        try {
            responseEntity = restTemplate.exchange(url, HttpMethod.GET, entity, EmployeeResponse.class);

        } catch (Exception e) {
            System.out.println("#######" + e.getMessage());
        }
        return responseEntity.getBody();
    }
}
