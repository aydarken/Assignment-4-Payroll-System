package kz.iitu.spring.payrollsystem.event;

import kz.iitu.spring.payrollsystem.Employee;
import org.springframework.context.ApplicationEvent;

public class SalaryChangeEvent extends ApplicationEvent {
    private Employee employee;
    public SalaryChangeEvent(Object source, Employee _employee) {
        super(source);
        employee = _employee;
    }

    public Employee getEmployee() {
        return employee;
    }
}
