import java.time.LocalDate;
import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        //Lesson_8 HomeWork 1
        int[] salary = {35000, 50000, 15000, 40000, 30000};
        double sum = 0;
        for (int i = 0; i < salary.length; i++) {
            sum = sum + salary[i];
        }
        System.out.println("Сумма трат за месяц составила " + sum + " рублей");

        //Lesson_8 HomeWork 2
        int min = 100_000;
        int max = 0;
        for (int i = 0; i < salary.length; i++) {
            if(salary[i] < min){
                min = salary[i];
            }
        }
        for (int i = 0; i < salary.length; i++) {
            if(salary[i] > max){
                max = salary[i];
            }
        }
        System.out.println("Минимальная сумма трат за неделю составила " + min + " рублей." +
                " Максимальная сумма трат за неделю составила " + max + " рублей");

        //Lesson_8 HomeWork 3
        double[] salaryNew = {35000, 50000, 15000, 40000, 30000};
        double sumNew = 0;
        for (int i = 0; i < salaryNew.length; i++) {
            sumNew = sumNew + salaryNew[i];
        }
        System.out.println("Средняя сумма трат за месяц составила " + sumNew / 4 + " рублей");

        //Lesson_8 HomeWork 4
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }
    }
}