package course_work_1;

import org.w3c.dom.css.Counter;

import java.util.Objects;

public class Employee {
    private final String fIO;
    private String department;
    private float salary;
    private final int id;
    private static int count = 1;


    public String getfIO() {
        return fIO;
    }
    public int getId() {
        return id;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return Float.compare(salary, employee.salary) == 0 && Objects.equals(fIO, employee.fIO) && Objects.equals(department, employee.department);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fIO, department, salary);
    }
    public Employee(String fIO, String department, float salary) {
        this.fIO = fIO;
        this.department = department;
        this.salary = salary;
        id = count++;
    }
    @Override
    public String toString() {
        return "ID: " + id + " | ФИО: " + fIO + " | " +
                " Должность : " + department + " | " +
                " Зарплата : " + salary;
    }
}
