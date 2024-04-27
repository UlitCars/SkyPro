import course_work_1.Employee;
import course_work_1.EmployeeBook;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        EmployeeBook employeeBook = new EmployeeBook();
        employeeBook.addPerson("Иванов Иван Иванович", "Юрист", 65000);
        employeeBook.addPerson("Семенов Семен Семенович", "Бухгалтер", 60000);
        employeeBook.addPerson("Петров Петр Петрович", "Инженер", 55000);
        employeeBook.addPerson("Сидоров Глеб Фёдорович", "Инженер", 50000);
        employeeBook.addPerson("Пушкин Михаил Сергеевич", "Юрист", 60000);
        employeeBook.addPerson("Васильков Фёдор Петрович", "Инженер", 70000);
        employeeBook.addPerson("Сыч Михаил Иванович", "Бухгалтер", 75000);
        employeeBook.addPerson("Фил Пётр Сергеевич", "Флорист", 80000);
        employeeBook.addPerson("Дудь Игорь Петрович", "Инженер", 65000);
        employeeBook.addPerson("Свиридов Иван Петрович", "Инженер", 32000);
        employeeBook.printOffice();
        employeeBook.remotePerson(9);
        employeeBook.printOffice();
        System.out.println(employeeBook.salarySum());
        System.out.println("employeeBook.searchPersonId(8) = " + employeeBook.searchPersonId(8));
        System.out.println("employeeBook.searchPersonId(9) = " + employeeBook.searchPersonId(9));
    }
}