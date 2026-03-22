package com.springboot.employeepayroll.controller;

import com.springboot.employeepayroll.dto.EmployeeDTO;
import com.springboot.employeepayroll.dto.ResponseDTO;
import org.springframework.web.bind.annotation.*;

import com.springboot.employeepayroll.service.EmployeePayrollService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/employeepayrollservice")
public class EmployeePayrollController {

    @Autowired
    EmployeePayrollService service;

    // GET all
    @GetMapping("/")
    public ResponseDTO getAll() {
        return new ResponseDTO("All Employees", service.getAllEmployees());
    }

    // GET by id
    @GetMapping("/get/{id}")
    public ResponseDTO getEmployee(@PathVariable int id) {
        return new ResponseDTO("Employee", service.getEmployee(id));
    }

    // POST
    @PostMapping("/create")
    public ResponseDTO createEmployee(@RequestBody EmployeeDTO empDTO) {
        return new ResponseDTO("Created", service.addEmployee(empDTO));
    }

    // PUT
    @PutMapping("/update/{id}")
    public ResponseDTO updateEmployee(
            @PathVariable int id,
            @RequestBody EmployeeDTO empDTO) {

        return new ResponseDTO(
                "Updated",
                service.updateEmployee(id, empDTO)
        );
    }

    // DELETE
    @DeleteMapping("/delete/{id}")
    public ResponseDTO deleteEmployee(@PathVariable int id) {

        service.deleteEmployee(id);

        return new ResponseDTO(
                "Deleted",
                id
        );
    }
}
