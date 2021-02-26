package kz.iitu.spring.payrollsystem;

public class Employee {
    private long id;
    private EmployeeType type;
    private double salary;


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public EmployeeType getType() {
        return type;
    }

    public void setType(EmployeeType type) {
        this.type = type;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", type=" + type +
                ", salary=" + salary +
                '}';
    }
}
