import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        //Lesson 6 Home Work 1
        int sumInBank = 0;
        int month = 0;
        int salary = 15000;
        do {
            sumInBank = sumInBank + 15000;
            month = month + 1;
            System.out.println("Месяц " + month + ", накопленная сумма " + sumInBank + "рублей.");
        }
        while (sumInBank < 2459000);

        //Lesson 6 Home Work 2
        int a = 0;
        do {
            a++;
            System.out.print(a + " ");
        }
        while (a < 10);
        System.out.println();
        do {
            System.out.print(a + " ");
            a--;
        }
        while (a > 0);
        System.out.println();

        //Lesson 6 Home Work 3
        int y = 12_000_000;
        int birthRate = 17;
        int mortality = 8;
        int year = 0;
        do {
            year++;
            y = y + ((y / 1000 * birthRate) - (y / 1000 * mortality));
            System.out.println("Год " + year + ", численность населения состовляет " + y + " человек.");
        }
        while (year < 10);

        //Lesson 6 Home Work 4
        int sum = 0;
        int contribution = 15000;
        int interestRate = 7;
        int monthA = 0;
        do {
            monthA++;
            sum = sum + (sum / 100) * interestRate;
            sum = sum + contribution;
            System.out.println("Месяц " + monthA + ", сумма накоплений " + sum + " рублей.");
        } while (sum <= 12_000_000);

        //Lesson 6 Home Work 5
        int sumA = 0;
        int contributionA = 15000;
        int interestRateA = 7;
        int monthB = 0;
        do {
            monthB++;
            sumA = sumA + (sumA / 100) * interestRateA;
            sumA = sumA + contributionA;
            if (monthB % 6 == 0) {
                System.out.println("Месяц " + monthB + ", сумма накоплений " + sumA + " рублей.");
            }
        } while (sumA <= 12_000_000);

        //Lesson 6 Home Work 6
        int contrbutionB = 15000;
        int sumB = 0;
        int interestRateB = 7;
        int monthC = 0;
        do {
            monthC++;
            sumB = sumB + (sumB / 100) * interestRateB;
            sumB = sumB + contrbutionB;
            if (monthC % 6 == 0) {
                System.out.println("Месяц " + monthC + ", сумма накоплений " + sumB + " рублей.");
            }
        } while (monthC < 108);

        //Lesson 6 Home Work 7
        int friday = 5;
        while (friday <= 31) {
            System.out.println("Сегодня " + friday + " число, пятница! Надо подготовить отчет.");
            friday += 7;
        }

        //Lesson 6 Home Work 8
        for (int yearA = 2024 - 200; yearA < 2024 + 100; yearA++) {
            if (yearA % 79 == 0) {
                System.out.println(yearA);
            }
        }
    }
}