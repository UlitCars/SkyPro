import java.time.LocalDate;
import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        //Lesson 7 HomeWork 1
        int[] num = new int[3];
        for (int i = 0; i < num.length; i++) {
            num[i] = i + 1;
        }
        System.out.println(Arrays.toString(num));
        double[] ch = {1.57, 7.654, 9.986};
        System.out.println(Arrays.toString(ch));
        String[] names = {"Oleg", "Alex", "John"};
        System.out.println(Arrays.toString(names));

        //Lesson 7 HomeWork 2
        //все элементы в нужном формате были выведены в ходе решения первой задачи.
        //Lesson 7 HomeWork 3
        for (int i = num.length; i > 0; i--) {
            if (i > 1) {
                System.out.print(num[i - 1] + ", ");
            } else {
                System.out.println(num[i - 1]);
            }
        }
        for (int i = ch.length; i > 0; i--) {
            if (i > 1) {
                System.out.print(ch[i - 1] + ", ");
            } else {
                System.out.println(ch[i - 1]);
            }
        }
        for (int i = names.length; i > 0; i--) {
            if (i > 1) {
                System.out.print(names[i - 1] + ", ");
            } else {
                System.out.println(names[i - 1]);
            }
        }
        //Lesson 7 HomeWork 4
        for (int i = 0; i < num.length; i++) {
            if (num[i] % 2 != 0) {
                num[i] = num[i] + 1;
            }
        }
        System.out.println(Arrays.toString(num));
    }
}