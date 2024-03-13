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

        //Lesson 4 Home Work 4

        //Lesson 4 Home Work 5


    }
}