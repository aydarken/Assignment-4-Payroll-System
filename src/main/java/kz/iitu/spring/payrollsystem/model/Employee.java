package kz.iitu.spring.payrollsystem.model;

import javax.persistence.*;

@Entity
@Table(name = "employees")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private double salary;
    private int workedHours;
    private double coef;
    private int sales;
    private double hourlySalary;
    private int percentage;

    @Enumerated(EnumType.STRING)
    private EmployeeType type;

    public Employee(EmployeeType type, double salary, int workedHours, double coef, int sales, double hourlySalary, int percentage) {
        this.type = type;
        this.salary = salary;
        this.workedHours = workedHours;
        this.coef = coef;
        this.sales = sales;
        this.hourlySalary = hourlySalary;
        this.percentage = percentage;
    }

    public Employee() {

    }

    public void setId(long id) {
        this.id = id;
    }

    public int getWorkedHours() {
        return workedHours;
    }

    public void setWorkedHours(int workedHours) {
        this.workedHours = workedHours;
    }

    public double getCoef() {
        return coef;
    }

    public void setCoef(double coef) {
        this.coef = coef;
    }

    public int getSales() {
        return sales;
    }

    public void setSales(int sales) {
        this.sales = sales;
    }

    public double getHourlySalary() {
        return hourlySalary;
    }

    public void setHourlySalary(double hourlySalary) {
        this.hourlySalary = hourlySalary;
    }

    public int getPercentage() {
        return percentage;
    }

    public void setPercentage(int percentage) {
        this.percentage = percentage;
    }

    public long getId() {
        return id;
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
