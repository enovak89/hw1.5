public class Main {
    public static void main(String[] args) {
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
        byte monthNum = 13;
        String answ5;
        switch (monthNum) {
            case 1:
                answ5 = "Зима";
                break;
            case 2:
                answ5 = "Зима";
                break;
            case 3:
                answ5 = "Весна";
                break;
            case 4:
                answ5 = "Весна";
                break;
            case 5:
                answ5 = "Весна";
                break;
            case 6:
                answ5 = "Лето";
                break;
            case 7:
                answ5 = "Лето";
                break;
            case 8:
                answ5 = "Лето";
                break;
            case 9:
                answ5 = "Осень";
                break;
            case 10:
                answ5 = "Осень";
                break;
            case 11:
                answ5 = "Осень";
                break;
            case 12:
                answ5 = "Осень";
                break;
            default:
                answ5 = "";
        }
        System.out.println(answ5);
    }
}
