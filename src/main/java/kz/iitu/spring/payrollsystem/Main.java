package kz.iitu.spring.payrollsystem;

import kz.iitu.spring.payrollsystem.config.SpringConfiguration;
import kz.iitu.spring.payrollsystem.controllers.EmployeeController;
import kz.iitu.spring.payrollsystem.model.EmployeeType;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfiguration.class);

        EmployeeController employeeController = context.getBean("employeeController", EmployeeController.class);

    }
}
