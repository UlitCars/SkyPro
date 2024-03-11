public class Main {
    public static void main(String[] args) {

        //Home Work 1
        int age = 31;
        if ( age >= 18) {
            System.out.println("Человек совершеннолетний!");
        } else {
            System.out.println("Человек не совершеннолетний!");
        }
        //Home Work 2
        int temp = 11;
        if ( temp >= 5){
            System.out.println("Сегодня тепло, можно идти без шапки");
        } else {
            System.out.println("На улице холодно, нужно надеть шапку");
        }
        //Home Work 3
        int speed = 43;
        if ( speed <= 60 ){
            System.out.println("Превышения скорости нет");
        } else {
            System.out.println("Скорость превышена!");
        }
        //Home Work 4
        int age2 = 31;
        if (age2 >= 2 && age2 <= 6){
            System.out.println("Нужно ходить в детский сад");
        } else if (age2 >= 7 && age2 <= 17){
            System.out.println("Нужно ходить в школу");
        } else if (age2 >= 18 && age2 <= 24){
            System.out.println("Нужно ходить в университет");
        } else if (age2 > 24){
            System.out.println("Нужно ходить на работу");
        } else {
            System.out.println("Такого условия не предусмотренно, проверьте корректность введеных данных");
        }
        //Home Work 5
        int ageKids = 17;
        if (ageKids < 5){
            System.out.println("Ребёнку нельзя кататься на аттракционах");
        } else if (ageKids >= 5 && ageKids <= 14){
            System.out.println("Ребёнку можно кататься только в сопровождении взрослых!");
        } else if (ageKids > 14){
            System.out.println("Ребёнок может кататься один");
        } else {
            System.out.println("Такого условия не предусмотренно, проверьте корректность введеных данных");
        }
        //Home Work 6


    }
}