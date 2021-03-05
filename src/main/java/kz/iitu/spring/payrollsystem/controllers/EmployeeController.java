package kz.iitu.spring.payrollsystem.controllers;

import kz.iitu.spring.payrollsystem.model.EmployeeType;
import kz.iitu.spring.payrollsystem.repository.EmployeeRepository;
import kz.iitu.spring.payrollsystem.service.SalaryCalculatorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/employee")
public class EmployeeController {
    @Autowired
    private EmployeeRepository employeeRepository;
    private SalaryCalculatorService service;


    @GetMapping("/employees")
    public void getEmployee() {
        employeeRepository.findAll();
    }

    @PostMapping("/add")
    public void createEmployee(
            @RequestParam long id,
            @RequestParam EmployeeType type,
            @RequestParam double salary,
            @RequestParam int workedHours,
            @RequestParam double coef,
            @RequestParam int sales,
            @RequestParam double hourlySalary,
            @RequestParam int percentage
    ) {
        service.

    }
}
