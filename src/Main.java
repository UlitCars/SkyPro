public class Main {
    public static void main(String[] args) {

        //Lesson 5 Home Work 1
        for ( int i = 1; i < 11; i++) {
            System.out.println(i);
        }
        //Lesson 5 Home Work 2
        for ( int i = 10; i > 0; i--) {
            System.out.println(i);
        }
        //Lesson 5 Home Work 3
        for ( int i = 0; i < 18; i = i + 2) {
            System.out.println(i);
        }
        //Lesson 5 Home Work 4
        for ( int i = 10; i > -11; i--) {
            System.out.println(i);
        }
        //Lesson 5 Home Work 5
        for ( int i = 1904; i < 2096; i = i + 4) {
            System.out.println(i + " год является високостным.");
        }
        //Lesson 5 Home Work 6
        for ( int i = 7; i < 99; i = i + 7) {
            System.out.println(i);
        }
        //Lesson 5 Home Work 7
        for ( int i = 1; i < 513; i = i * 2) {
            System.out.println(i);
        }
        //Lesson 5 Home Work 8
        int sum = 0;
        for ( int i = 1; i < 13; i++) {
            sum = sum + 29000;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + sum + " рублей.");
        }
        //Lesson 5 Home Work 9
        int sumInBank = 0;
        for ( int i = 1; i < 13; i++) {
            sumInBank = sumInBank + ( sumInBank / 100 );
            sumInBank = sumInBank + 29000;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + sumInBank + " рублей.");
        }
        //Lesson 5 Home Work 10
        int result = 0;
        for ( int i = 1; i < 11; i++) {
            result = 2 * i;
            System.out.println("2 * " + i + " = " + result);
        }
        }
    }