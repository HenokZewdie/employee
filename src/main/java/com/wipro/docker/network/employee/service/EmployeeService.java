package com.wipro.docker.network.employee.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.wipro.docker.network.employee.model.EmployeeInfo;
import com.wipro.docker.network.employee.model.EmployeeRequest;
import com.wipro.docker.network.employee.model.EmployeeResponse;
import com.wipro.docker.network.employee.model.SingleEmployeeResponse;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import java.io.File;
import java.io.IOException;

public class EmployeeService {
    RestTemplate restTemplate = new RestTemplate();
    /*public EmployeeResponse employeeResponse(){
        HttpHeaders headers = new HttpHeaders();
        String url = "http://dummy.restapiexample.com/api/v1/employees";
        HttpEntity<?> entity = new HttpEntity<>(headers);
        ResponseEntity<EmployeeResponse> responseEntity = null;

        try {
            responseEntity = restTemplate.exchange(url, HttpMethod.GET, entity, EmployeeResponse.class);

        } catch (Exception e) {
            System.out.println("#######" + e.getMessage());
        }
        assert responseEntity != null;
        return responseEntity.getBody();
    }*/

    public EmployeeResponse employeeResponse() throws IOException {
        ObjectMapper  objectMapper = new ObjectMapper();
        EmployeeResponse employeeResponse = new EmployeeResponse();
        employeeResponse = objectMapper.readValue(new File("/Users/henokwordoffa/IdeaProjects/employee/src/main/resources/response.json")
        , EmployeeResponse.class);
        return employeeResponse;
    }
    public SingleEmployeeResponse getEmployee(int id){
        HttpHeaders headers = new HttpHeaders();
        String url = "http://dummy.restapiexample.com/api/v1/employee/"+id;
        HttpEntity<?> entity = new HttpEntity<>(headers);
        ResponseEntity<SingleEmployeeResponse> responseEntity = null;

        try {
            responseEntity = restTemplate.exchange(url, HttpMethod.GET, entity, SingleEmployeeResponse.class);

        } catch (Exception e) {
            System.out.println("#######" + e.getMessage());
        }
        assert responseEntity != null;
        return responseEntity.getBody();
    }
    public SingleEmployeeResponse postEmployee(EmployeeRequest employeeRequest) {
        HttpHeaders headers = new HttpHeaders();
        String url = "http://dummy.restapiexample.com/api/v1/employee/create";
        HttpEntity<?> entity = new HttpEntity<>(employeeRequest, headers);
        ResponseEntity<SingleEmployeeResponse> responseEntity = null;

        try {
            responseEntity = restTemplate.exchange(url, HttpMethod.POST, entity, SingleEmployeeResponse.class);

        } catch (Exception e) {
            System.out.println("#######" + e.getMessage());
        }
        assert responseEntity != null;
        return responseEntity.getBody();
    }
}
