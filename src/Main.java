import java.lang.Math;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class Main {
    public static void main(String[] args) {
        taskAdd2();
        taskAdd3();
        taskAdd4();
        taskAdd5();
        taskAdd6();

        System.out.println("Задача 1");
        boolean clientOS = false;
        String answ = clientOS == true ? "Установите версию приложения для Android по ссылке" : "Установите версию приложения для iOS по ссылке";
        System.out.println(answ);

        System.out.println("Задача 2");
        boolean clientOS2 = true;
        int clientDeviceYear = 2015;
        if (clientOS2 == true && clientDeviceYear <= 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else if (clientOS2 == true) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else if (clientOS2 == false && clientDeviceYear <= 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else {
            System.out.println("Установите версию приложения для iOS по ссылке");
        }

        System.out.println("Задача 3");
        int year = 2401;
        if ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0)) {
            System.out.printf("%d является високосным\n", year);
        } else {
            System.out.printf("%d не является високосным\n", year);
        }

        System.out.println("Задача 4");
        int deliveryDistance = 9;
        int deliveryDay = 0;
        if (deliveryDistance < 20) {
            deliveryDay = 1;
            System.out.printf("Потребуется дней: %d\n", deliveryDay);
        } else if (20 <= deliveryDistance && deliveryDistance < 60) {
            deliveryDay = 2;
            System.out.printf("Потребуется дней: %d\n", deliveryDay);
        } else if (60 <= deliveryDistance && deliveryDistance <= 100) {
            deliveryDay = 3;
            System.out.printf("Потребуется дней: %d\n", deliveryDay);
        } else {
            System.out.println("Доставки нет\n");
        }

        System.out.println("Задача 5");
        byte monthNum = 3;
        String answ5;
        switch (monthNum) {
            case 1:
            case 2:
            case 12:
                answ5 = "Зима";
                break;
            case 3:
            case 4:
            case 5:
                answ5 = "Весна";
                break;
            case 6:
            case 7:
            case 8:
                answ5 = "Лето";
                break;
            case 9:
            case 10:
            case 11:
                answ5 = "Осень";
                break;
            default:
                answ5 = "";
        }
        System.out.println(answ5);

        System.out.println("Задача 1*");
        int p = 0;
        String answAdd1 = (p % 2 == 1) || (p == 0) ? "Число нечетное" : "Число четное";
        System.out.println(answAdd1);
    }

    public static void taskAdd2() {
        System.out.println("Задача 2*");
        float p = 15.3f, d = 7.1f, pd = 10 - p, dd = 10 - d;
        if (Math.abs(pd) > Math.abs(dd)) {
            System.out.printf("Число %.2f ближе к 10 чем %.2f\n", d, p);
        } else {
            System.out.printf("Число %.2f ближе к 10 чем %.2f\n", p, d);
        }
    }

    public static void taskAdd3() {
        System.out.println("Задача 3*");
        Random random = new Random();
        int i = 3 + random.nextInt(156);
        if (22 < i && i < 99) {
            System.out.printf("Число %d попало в диапазон 22-99\n", i);
        } else {
            System.out.printf("Число %d не попало в диапазон 22-99\n", i);
        }
    }

    public static void taskAdd4() {
        System.out.println("Задача 4*");
        int k = ThreadLocalRandom.current().nextInt(999);
        //int firstKNum = k / 100;
        //int secondKNum = (k - firstKNum * 100) / 10;
        int firstKNum = k / 100;
        int secondKNum = k % 100 / 10;
        int thirdKNum = k % 10;
        System.out.println(k + " " + firstKNum + " " + secondKNum + " " + thirdKNum);
        if (firstKNum >= secondKNum && firstKNum >= thirdKNum) {
            System.out.printf("Число %d - наибольшее\n", firstKNum);
        } else if (secondKNum >= thirdKNum) {
            System.out.printf("Число %d - наибольшее\n", secondKNum);
            } else {
            System.out.printf("Число %d - наибольшее\n", thirdKNum);
        }
    }

    public static void taskAdd5 () {
        System.out.println("Задача 5*");
        int a = ThreadLocalRandom.current().nextInt(-1000, 1000), b = ThreadLocalRandom.current().nextInt(-1000, 1000),
                c = ThreadLocalRandom.current().nextInt(- 1000, 1000);
        int max = 0, min = 0, mid = 0;
        if (a >= b && a >= c) {
            max = a;
            if (b >= c) {
                mid = b;
                min = c;
            } else {
                mid = c;
                min = b;
            }
        } else if (b >= c) {
            max = b;
            if (a >= c) {
                mid = a;
                min = c;
            } else {
                mid = c;
                min = a;
            }
        } else {
            max = c;
            if (a >= b) {
                mid = a;
                min = b;
            }
        }
        System.out.println(a + " " + b + " " + c);
        System.out.println(min + " " + mid + " " + max);
    }

    public static void taskAdd6 () {
        System.out.println("Задача 6*");
        int currentSeconds = ThreadLocalRandom.current().nextInt(28801);
        int leftSeconds = 28800 - currentSeconds;
        float currentHours = Math.round(currentSeconds / 3600f);
        int leftHours = 8 - (int) currentHours;
        System.out.println(currentSeconds + " " + currentHours + " " + leftSeconds + " " + leftHours);
    }
}
