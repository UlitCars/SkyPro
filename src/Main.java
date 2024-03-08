public class Main {
    public static void main(String[] args) {

        //Home Work 1
        byte b = 8;
        short s = 32;
        int i = 214;
        long l = 92L;
        float f = 32.7f;
        double d = 34.7;

        System.out.println("Значение переменной b с типом byte равно " + b);
        System.out.println("Значение переменной s с типом short равно " + s);
        System.out.println("Значение переменной i с типом byte равно " + i);
        System.out.println("Значение переменной l с типом byte равно " + l);
        System.out.println("Значение переменной f с типом byte равно " + f);
        System.out.println("Значение переменной d с типом byte равно " + d);

        //Home Work 2
        float a = 27.12f;
        long c = 987_678_965_549L;
        float e = 2.786f;
        short g = 569;
        short h = -159;
        short j = 27897;
        byte k = 67;

        //Home Work 3
        short classA = 23;
        short classB = 27;
        short classC = 30;
        short totalLists = 480;
        int perStudent = totalLists / (classA + classB + classC);
        System.out.println("На каждого ученика рассчитано " + perStudent + " листов бумаги");

        //Home Work 4
        byte doneInTwoMinutes = 16;
        System.out.println("За 2 минуты машина произвела " + doneInTwoMinutes + " штук бутылок");
        int doneInTwentyMinutes = doneInTwoMinutes * 10;
        System.out.println("За 20 минут машина произвела " + doneInTwentyMinutes + " штук бутылок");
        int day = 24 * 60 / 2 * 16;
        System.out.println("За сутки машина произвела " + day + " штук бутылок");
        int forThreeDays = day * 3;
        System.out.println("За 3 дня машина произвела " + forThreeDays + " штук бутылок");
        int perMonth = day * 31;
        System.out.println("За месяц машина произвела " + perMonth + " штук бутылок");

        //Home Work 5
        byte total = 120;
        int numberOfOffices = 120 / (2 + 4);
        int white = numberOfOffices * 2;
        int brown = numberOfOffices * 4;
        System.out.println("В школе, где " + numberOfOffices + " классов, нужно " + white + " банок белой краски и " + brown + " банок коричневой краски");

        //Home Work 6
        int bananas = 5 * 80;
        int milk = 105 * 2;
        int iceCream = 100 * 2;
        int eggs = 4 * 70;
        double totalGrams = bananas + milk + iceCream + eggs;
        double totalWeight = totalGrams / 1000.0;  // Не смог найти адекватного решения, для конвертирования веса из грамм в кг.
        //Результат 62 строки в данном виде у меня 1.09
        System.out.println("Общий вес завтрака " + eggs + " грамм");
        System.out.println("Общий вес завтрака " + totalWeight + " кг");

        //Home Work 7
        int totalNecessaryGrams = 7 * 1000;
        int maxDays = totalNecessaryGrams / 250;
        int minDays = totalNecessaryGrams / 500;
        int average = (maxDays + minDays) / 2;
        System.out.println("Необходимо сбросить " + totalNecessaryGrams + " грамм");
        System.out.println("Если уменьшить рацион на 250 грамм, то на это уйдет " + maxDays + " дней");
        System.out.println("Если уменьшить рацион на 500 грамм, то на это уйдет " + minDays + " дней");
        System.out.println("В среднем можно сбросить необходимы вез за " + average + " день");

        //Home Work 8
        int salaryMasha = 67760;
        int salaryDenis = 83690;
        int salaryKris = 76230;
        int yearSalaryMasha = salaryMasha * 12;
        int yearSalaryDenis = salaryDenis * 12;
        int yearSalaryKris = salaryKris * 12;
        System.out.println("Годовая зарплата Марии, до повышения, состовляет " + yearSalaryMasha + " рублей");
        System.out.println("Годовая зарплата Дениса, до повышения, состовляет " + yearSalaryDenis + " рублей");
        System.out.println("Годовая зарплата Кристины, до повышения, состовляет " + yearSalaryKris + " рублей");
        float increasedSalaryMasha = (float) (salaryMasha * 1.1);
        float increasedSalaryDenis = (float) (salaryDenis * 1.1);
        float increasedSalaryKris = (float) (salaryKris * 1.1);
        float yearIncreasedSalaryMasha = (increasedSalaryMasha * 12);
        float yearIncreasedSalaryDenis = (increasedSalaryDenis * 12);
        float yearIncreasedSalaryKris = (increasedSalaryKris * 12);
        System.out.println("Годовая зарплата Марии, после повышения, состовляет " + yearIncreasedSalaryMasha + " рублей");
        System.out.println("Годовая зарплата Дениса, после повышения, состовляет " + yearIncreasedSalaryDenis + " рублей");
        System.out.println("Годовая зарплата Кристина, после повышения, состовляет " + yearIncreasedSalaryKris + " рублей");
        float yearDifferenceMasha = yearIncreasedSalaryMasha - yearSalaryMasha;
        float yearDifferenceDenis = yearIncreasedSalaryDenis - yearSalaryDenis;
        float yearDifferenceKris = yearIncreasedSalaryKris - yearSalaryKris;
        System.out.println("Разница за год у Марии, состовляет " + yearDifferenceMasha + " рублей");
        System.out.println("Разница за год у Дениса, состовляет " + yearDifferenceDenis + " рублей");
        System.out.println("Разница за год у Кристины, состовляет " + yearDifferenceKris + " рублей");

    }
}