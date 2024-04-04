import java.time.LocalDate;
import java.util.Arrays;
import java.util.Random;

public class Main {
    //Lesson_10 HomeWork_1
    public static void printLeapYear (int years){
        if ((years % 4 == 0 && years % 100 != 0) || years % 400 == 0){
            System.out.println(years + " год является високосным!");
        } else {
            System.out.println(years + " год не является високосным.");
        }
    }
    //Lesson_10 HomeWork_2
    public static void printRequiredApp (int clientOS, int clientDeviceYear){
        if (clientOS == 0 && clientDeviceYear >= 2015){
            System.out.println("Установите приложение для iOS по ссылке:");
        } else if (clientOS == 0 && clientDeviceYear < 2015){
            System.out.println("Установите облегченную версию приложение для iOS по ссылке:");
        } else if (clientOS == 1 && clientDeviceYear >= 2015){
            System.out.println("Установите приложение для Android по ссылке:");
        } else if (clientOS == 1 && clientDeviceYear < 2015){
            System.out.println("Установите облегченную версию приложение для Android по ссылке:");
        } else {
            System.out.println("Версия ОС не определена!");
        }
    }
    //Lesson_10 HomeWork_3
    public static void printDeliveryTime (int deliveryDistans){
        if (deliveryDistans < 20 && deliveryDistans >= 0){
            System.out.println("Для доставки потребуется один день.");
        } else if (deliveryDistans >= 20 && deliveryDistans < 60){
            System.out.println("Для доставки потребуется два дня.");
        } else if (deliveryDistans >= 60 && deliveryDistans <= 100){
            System.out.println("Для доставки потребуется три дня.");
        } else {
            System.out.println("Так далеко не доставляем!");
        }
    }
    public static void main(String[] args) {
        //Test Lesson_10 HomeWork_1
        System.out.println();
        System.out.println("//Test Lesson_10 HomeWork_1");
        int year = 2024;
        printLeapYear(year);

        //Test Lesson_10 HomeWork_2
        System.out.println();
        System.out.println("//Test Lesson_10 HomeWork_2");
        byte clientOS = 0;
        int clientDeviceYear = 2013;
        printRequiredApp(clientOS, clientDeviceYear);

        //Test Lesson_10 HomeWork_3
        System.out.println();
        System.out.println("//Test Lesson_10 HomeWork_3");
        int distans = 80;
        printDeliveryTime(distans);

    }
}