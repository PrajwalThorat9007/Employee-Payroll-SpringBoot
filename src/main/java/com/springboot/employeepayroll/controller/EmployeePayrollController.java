package com.springboot.employeepayroll.controller;

import com.springboot.employeepayroll.dto.EmployeeDTO;
import com.springboot.employeepayroll.dto.ResponseDTO;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/employeepayrollservice")
public class EmployeePayrollController {

    // GET
    @GetMapping("/")
    public String getMessage() {
        return "Employee Payroll Service Running";
    }

    // GET by id
    @GetMapping("/get/{id}")
    public ResponseDTO getEmployee(@PathVariable int id) {
        return new ResponseDTO("Get Call Success", id);
    }

    // POST
    @PostMapping("/create")
    public ResponseDTO createEmployee(@RequestBody EmployeeDTO empDTO) {
        return new ResponseDTO("Created", empDTO);
    }

    // PUT
    @PutMapping("/update")
    public ResponseDTO updateEmployee(@RequestBody EmployeeDTO empDTO) {
        return new ResponseDTO("Updated", empDTO);
    }

    // DELETE
    @DeleteMapping("/delete/{id}")
    public ResponseDTO deleteEmployee(@PathVariable int id) {
        return new ResponseDTO("Deleted", id);
    }
}
