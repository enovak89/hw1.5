public class Main {
    public static void main(String[] args) {
        taskAdd2();

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
    public static void taskAdd2 () {
        System.out.println("Задача 2*");
        float p = 15.3f, d = 7.1f, pd = 10 - p, dd = 10 - d;
        if (Math.abs(pd) > Math.abs(dd)) {
            System.out.printf("Число %.2f ближе к 10 чем %.2f\n", d, p);
        } else {
            System.out.printf("Число %.2f ближе к 10 чем %.2f\n", p, d);
        }
    }
}
