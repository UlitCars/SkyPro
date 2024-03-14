public class Main {
    public static void main(String[] args) {

        //Lesson 4 Home Work 1
        byte clientOS = 0;
        if (clientOS == 1){
            System.out.println("Установите приложение для Android по ссылке:");
        } else {
            System.out.println("Установите приложение для iOS по ссылке:");
        }
        //Lesson 4 Home Work 2
        int clientDeviceYear = 2013;
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
        //Lesson 4 Home Work 3
        int years = 2024;
        if (years % 4 == 0 && years % 100 != 0){
            System.out.println(years + " год является високосным!");
        } else if ( years % 400 == 0){
            System.out.println(years + " год является високосным!");
        } else {
            System.out.println(years + " год не является високосным.");
        }
        //Lesson 4 Home Work 4
        int deliveryDistans = 95;
        int deliveryDays = 0;
        if (deliveryDistans < 20 && deliveryDistans >= 0){
            deliveryDays++;
        } else if (deliveryDistans >= 20 && deliveryDistans < 60){
            deliveryDays++;
            deliveryDays++;
        } else if (deliveryDistans >= 60 && deliveryDistans <= 100){
            deliveryDays++;
            deliveryDays++;
            deliveryDays++;
        } else {
            System.out.println("Так далеко не доставляем!");
        }
        System.out.println("Потребуется дней: " + deliveryDays);
        //Lesson 4 Home Work 5
        int monthNumber = 3;
        switch (monthNumber){
            case 1:
                System.out.println("Сейчас зима, месяц январь.");
                break;
            case 2:
                System.out.println("Сейчас зима, месяц февраль.");
                break;
            case 3:
                System.out.println("Сейчас весна, месяц март.");
                break;
            case 4:
                System.out.println("Сейчас весна, месяц апрель.");
                break;
            case 5:
                System.out.println("Сейчас весна, месяц май.");
                break;
            case 6:
                System.out.println("Сейчас лето, месяц июнь.");
                break;
            case 7:
                System.out.println("Сейчас лето, месяц июль.");
                break;
            case 8:
                System.out.println("Сейчас лето, месяц август.");
                break;
            case 9:
                System.out.println("Сейчас осень, месяц сентябрь.");
                break;
            case 10:
                System.out.println("Сейчас осень, месяц октябрь.");
                break;
            case 11:
                System.out.println("Сейчас осень, месяц ноябрь.");
                break;
            case 12:
                System.out.println("Сейчас зима, месяц декабрь.");
                break;
            default:
                System.out.println("Не корректно указан номер месяца!");
        }
    }
}