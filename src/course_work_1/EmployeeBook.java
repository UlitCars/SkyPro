package course_work_1;

public class EmployeeBook {
    private final Employee[] office = new Employee[10];

    public Employee searchPersonId(int id) {
        for (int i = 0; i < office.length; i++) {
            if (office[i] != null && office[i].getId() == id) {
                return office[i];
            }
        }
        return null;
    }

    public boolean addPerson(String fIO, String department, float salary) {
        for (int i = 0; i < office.length; i++) {
            if (office[i] == null) {
                office[i] = new Employee(fIO, department, salary);
                return true;
            }
        }
        return false;
    }

    public void remotePerson(int id) {
        for (int i = 0; i < office.length; i++) {
            if (office[i] != null && office[i].getId() == id) {
                office[i] = null;
                return;
            }
        }
    }

    public void printOffice() {
        for (Employee employee : office) {
            if (employee == null) {
                continue;
            }
            System.out.println(employee);
        }
    }

    public float salarySum() {
        float sum = 0;
        for (Employee employee : office) {
            if (employee == null) {
                continue;
            }
            sum += employee.getSalary();
        }
        return sum;
    }

    public Employee minSalary() {
        Employee min = office[0];
        for (Employee employee : office) {
            if (employee == null) {
                continue;
            }
            if (employee.getSalary() < min.getSalary()) {
                min = employee;
            }
        }
        return min;
    }

    public Employee maxSalary() {
        Employee max = office[0];
        for (Employee employee : office) {
            if (employee == null) {
                continue;
            }
            if (employee.getSalary() > max.getSalary()) {
                max = employee;
            }
        }
        return max;
    }

    public double averageSalary() {
        return salarySum() / office.length;
    }

    public void allFullNames() {
        for (Employee employee : office) {
            if (employee == null) {
                continue;
            }
            System.out.println(employee.getfIO());

        }
    }

    public void indexation(int percent) {
        for (Employee employee : office) {
            if (employee == null) {
                continue;
            }
            float newSalary = employee.getSalary() + (employee.getSalary() * percent) / 100;
            employee.setSalary(newSalary);
        }
    }

    public double salarySumDepartment(String department) {
        double sum = 0;
        for (Employee employee : office) {
            if (employee == null) {
                continue;
            }
            if (department.equals(employee.getDepartment())) {
                sum += employee.getSalary();
            }
        }
        return sum;
    }

    public Employee minSalaryDepartment(String department) {
        Employee min = null;
        for (Employee employee : office) {
            if (employee == null) {
                continue;
            }
            if (!department.equals(employee.getDepartment())) {
                continue;
            }
            if (min == null || employee.getSalary() < min.getSalary()) {
                min = employee;
            }
        }
        return min;
    }

    public Employee maxSalaryDepartment(String department) {
        Employee max = null;
        for (Employee employee : office) {
            if (employee == null) {
                continue;
            }
            if (!department.equals(employee.getDepartment())) {
                continue;
            }
            if (max == null || employee.getSalary() > max.getSalary()) {
                max = employee;
            }
        }
        return max;
    }

    public double salaryAerageDepartment(String department) {
        int person = 0;
        double salarySum = 0;
        for (Employee employee : office) {
            if (employee == null) {
                continue;
            }
            if (!department.equals(employee.getDepartment())) {
                continue;
            }
            person++;
            salarySum += employee.getSalary();
        }
        return salarySum / person;
    }

    public void indexationDepartment(int percent, String department) {
        for (Employee employee : office) {
            if (employee == null) {
                continue;
            }
            if (!department.equals(employee.getDepartment())) {
                continue;
            }
            float newSalary = employee.getSalary() + (employee.getSalary() * percent) / 100;
            employee.setSalary(newSalary);
        }
    }

    public void printPersonDepartmen(String department) {
        for (Employee employee : office) {
            if (employee == null) {
                continue;
            }
            if (!department.equals(employee.getDepartment())) {
                continue;
            }
            System.out.println(employee);
        }
    }

    public void printPersonSalaryMax(double salary) {
        for (Employee employee : office) {
            if (employee == null) {
                continue;
            }
            if (employee.getSalary() >= salary) {
                System.out.println("ФИО: " + employee.getfIO() + " ID: " + employee.getId() + " ЗП: " + employee.getSalary());
            }
        }
    }

    public void printPersonSalaryMin(double salary) {
        for (Employee employee : office) {
            if (employee == null) {
                continue;
            }
            if (employee.getSalary() <= salary) {
                System.out.println("ФИО: " + employee.getfIO() + " ID: " + employee.getId() + " ЗП: " + employee.getSalary());
            }
        }
    }
}
