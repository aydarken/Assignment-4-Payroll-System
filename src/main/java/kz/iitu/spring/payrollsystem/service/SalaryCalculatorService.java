package kz.iitu.spring.payrollsystem.service;

import kz.iitu.spring.payrollsystem.event.SalaryChangeEvent;
import kz.iitu.spring.payrollsystem.model.Employee;
import kz.iitu.spring.payrollsystem.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Service;

@Service
public class SalaryCalculatorService {
    @Autowired
    private EmployeeRepository employeeRepository;

    private ApplicationEventPublisher eventPublisher;

    public Employee changeBaseSalary(long id, double newSalary) {
        Employee employee = employeeRepository.findById(id).get();
        employee.setSalary(newSalary);

        this.eventPublisher.publishEvent(new SalaryChangeEvent(this, employee));

        return employee;
    }

    public Employee addEmployee(Employee employee){

        return employeeRepository.save(new Employee(
                employee.getType(),
                employee.getSalary(),
                employee.getWorkedHours(),
                employee.getCoef(),
                employee.getSales(),
                employee.getHourlySalary(),
                employee.getPercentage()
        ));

    }
    public double getTotalSalary(Employee employee) {
        double totalSalary = 0;
        switch (employee.getType()) {
            case SALARIED:
                totalSalary = employee.getSalary();
                break;
            case HOURLY:
                if (employee.getWorkedHours() > 40) {
                    totalSalary = ((employee.getHourlySalary()) * 40) +
                            (employee.getCoef() * employee.getHourlySalary() * (employee.getWorkedHours()) - 40);
                } else
                    totalSalary = employee.getWorkedHours() * employee.getHourlySalary();
                break;
            case COMMISSION:
                totalSalary = (double) (employee.getPercentage() * employee.getSales()) / 100;
                break;
            case SALARIED_COMMISSION:
                totalSalary = employee.getSalary() +
                        ((double) (employee.getPercentage() * employee.getSales()) / 100);
        }
        return totalSalary;
    }
}
