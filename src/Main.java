import course_work_1.Employee;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Random;

public class Main {
    private static final Employee[] office = new Employee[10];

    public static void main(String[] args) {
        office[0] = new Employee("Иванов Иван Иванович", "Юрист", 65000);
        office[1] = new Employee("Семенов Семен Семенович", "Бухгалтер", 60000);
        office[2] = new Employee("Петров Петр Петрович", "Инженер", 55000);
        office[3] = new Employee("Сидоров Глеб Фёдорович", "Инженер", 50000);
        office[4] = new Employee("Пушкин Михаил Сергеевич", "Юрист", 60000);
        office[5] = new Employee("Васильков Фёдор Петрович", "Инженер", 70000);
        office[6] = new Employee("Сыч Михаил Иванович", "Бухгалтер", 75000);
        office[7] = new Employee("Фил Пэтр Сергеевич", "Флорист", 80000);
        office[8] = new Employee("Дудь Игорь Петрович", "Инженер", 65000);
        office[9] = new Employee("Свиридов Иван Петрович", "Инженер", 32000);

        printOffice();
        System.out.println("Сумма зарплат = " + salarySum());
        System.out.println("Минимальная зарплата = " + minSalary());
        System.out.println("Максимальная зарплата = " + maxSalary());
        System.out.println("Средняя зарплата сотрудника = " + averageSalary());
        allFullNames();
        System.out.println(salarySumDepartment("Бухгалтер"));
        System.out.println(maxSalaryDepartment("Юрист"));
        System.out.println(minSalaryDepartment("Инженер"));
        System.out.println(salaryAerageDepartment("Инженер"));
        indexation(10);
        printOffice();
        indexationDepartment(5, "Инженер");
        printOffice();
        printPersonDepartmen("Бухгалтер");
        printPersonSalaryMax(50000);
        printPersonSalaryMin(50000);


    }

    private static void printOffice() {
        for (Employee employee : office) {
            System.out.println(employee);
        }
    }

    private static double salarySum() {
        double sum = 0;
        for (Employee employee : office) {
            sum += employee.getSalary();
        }
        return sum;
    }

    private static Employee minSalary() {
        Employee min = office[0];
        for (Employee employee : office) {
            if (employee.getSalary() < min.getSalary()) {
                min = employee;
            }
        }
        return min;
    }

    private static Employee maxSalary() {
        Employee max = office[0];
        for (Employee employee : office) {
            if (employee.getSalary() > max.getSalary()) {
                max = employee;
            }
        }
        return max;
    }

    private static double averageSalary() {
        return salarySum() / office.length;
    }

    private static void allFullNames() {
        for (Employee employee : office) {
            System.out.println(employee.getfIO());

        }
    }
    private static void indexation(int percent){
        for (Employee employee : office) {
            float newSalary = employee.getSalary() + (employee.getSalary() * percent)/100;
            employee.setSalary(newSalary);
        }
    }
    private static double salarySumDepartment(String department) {
        double sum = 0;
        for (Employee employee : office) {
            if (department.equals(employee.getDepartment())) {
                sum += employee.getSalary();
            }
        }
        return sum;
    }
    private static Employee minSalaryDepartment(String department) {
        Employee min = null;
        for (Employee employee : office) {
            if (!department.equals(employee.getDepartment())) {
                continue;
            }
            if (min == null || employee.getSalary() < min.getSalary()) {
                min = employee;
            }
        }
        return min;
    }
    private static Employee maxSalaryDepartment(String department) {
        Employee max = null;
        for (Employee employee : office) {
            if (!department.equals(employee.getDepartment())) {
                continue;
            }
            if (max == null || employee.getSalary() > max.getSalary()) {
                max = employee;
            }
        }
        return max;
    }
    private static double salaryAerageDepartment(String department) {
        int person = 0;
        double salarySum = 0;
        for (Employee employee : office) {
            if (!department.equals(employee.getDepartment())) {
                continue;
            }
            person++;
            salarySum += employee.getSalary();
        }
        return salarySum / person;
    }
    private static void indexationDepartment(int percent, String department){
        for (Employee employee : office) {
            if (!department.equals(employee.getDepartment())) {
                continue;
            }
            float newSalary = employee.getSalary() + (employee.getSalary() * percent)/100;
            employee.setSalary(newSalary);
        }
    }
    private static void printPersonDepartmen(String department){
        for (Employee employee : office) {
            if (!department.equals(employee.getDepartment())) {
                continue;
            } System.out.println(employee);
        }
    }
    private static void printPersonSalaryMax(double salary){
        for (Employee employee : office) {
            if(employee.getSalary()>=salary){
                System.out.println("ФИО: " + employee.getfIO() + " ID: " + employee.getId() + " ЗП: " + employee.getSalary());
            }
        }
    }
    private static void printPersonSalaryMin(double salary){
        for (Employee employee : office) {
            if(employee.getSalary()<=salary){
                System.out.println("ФИО: " + employee.getfIO() + " ID: " + employee.getId() + " ЗП: " + employee.getSalary());
            }
        }
    }
}