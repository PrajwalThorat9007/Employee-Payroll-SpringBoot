package com.springboot.employeepayroll.service;

import com.springboot.employeepayroll.dto.EmployeeDTO;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmployeePayrollService {

    private List<EmployeeDTO> employeeList = new ArrayList<>();

    public List<EmployeeDTO> getAllEmployees() {
        return employeeList;
    }

    public EmployeeDTO getEmployee(int id) {
        return employeeList.get(id);
    }

    public EmployeeDTO addEmployee(EmployeeDTO empDTO) {
        employeeList.add(empDTO);
        return empDTO;
    }

    public EmployeeDTO updateEmployee(int id, EmployeeDTO empDTO) {
        employeeList.set(id, empDTO);
        return empDTO;
    }

    public void deleteEmployee(int id) {
        employeeList.remove(id);
    }
}