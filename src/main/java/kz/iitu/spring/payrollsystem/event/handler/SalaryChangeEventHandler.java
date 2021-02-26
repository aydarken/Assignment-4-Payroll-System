package kz.iitu.spring.payrollsystem.event.handler;

import kz.iitu.spring.payrollsystem.event.SalaryChangeEvent;
import org.springframework.context.ApplicationListener;

public class SalaryChangeEventHandler implements ApplicationListener<SalaryChangeEvent> {

    @Override
    public void onApplicationEvent(SalaryChangeEvent salaryChangeEvent) {
        System.out.println("SalaryChangeEventHandler.onApplicationEvent");
        System.out.println("salaryChangeEvent = " + salaryChangeEvent.getEmployee());
    }
}
