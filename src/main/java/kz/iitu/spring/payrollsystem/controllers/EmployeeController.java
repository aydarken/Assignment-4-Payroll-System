package kz.iitu.spring.payrollsystem.controllers;

import kz.iitu.spring.payrollsystem.model.Employee;
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
            @RequestParam EmployeeType type,
            @RequestParam double salary,
            @RequestParam int workedHours,
            @RequestParam double coef,
            @RequestParam int sales,
            @RequestParam double hourlySalary,
            @RequestParam int percentage
    ) {
        service.addEmployee(new Employee(
                type, salary, workedHours, coef, sales, hourlySalary, percentage
        ));

    }

    @GetMapping("/total-salary")
    public double GetTotalSalary(@RequestParam long id) {
        double totalSalary = service.getTotalSalary(employeeRepository.findById(id).get());
        return totalSalary;
    }

    @GetMapping("/change-salary")
    public Employee changeSalary(
            @RequestParam long id,
            @RequestParam double newSalary
    ){
        return service.changeBaseSalary(id,newSalary);
    }
}
