package kz.iitu.spring.payrollsystem.repository;

import kz.iitu.spring.payrollsystem.model.Employee;
import org.springframework.data.repository.CrudRepository;

public interface EmployeeRepository extends CrudRepository<Employee,Long> {
}
