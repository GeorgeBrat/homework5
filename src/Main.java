public class Main {
    public static void main(String[] args) {
        //Task 1
        System.out.println("Задача №1");
        int clientOS = 0;
        if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } if (clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
        //Task 2
        System.out.println("Задача №2");
        int clientDeviceYear = 2015;
        if (clientOS == 0 && clientDeviceYear > 2015) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOS == 0 && clientDeviceYear <= 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } if (clientOS == 1 && clientDeviceYear > 2015) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else if (clientOS == 1 && clientDeviceYear <= 2015) {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            }
        //Task 3
        System.out.println("Задача №3");
        int year = 2024;
        if (year < 1584) {
            System.out.println("Год должен быть больше, чем 1584 (в котором был введен високосный год)");
        } if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0){
            System.out.println(year + " год является високосным");
        } else { // esle if
            System.out.println(year + " год не является високосным");
        }
        //Task 4
        System.out.println("Задача №4");
        int deliveryDistance = 98; // дистанция до клиента
        int days = 1;
        if (deliveryDistance <= 20) {
            System.out.println("Потребуется дней: " + days);
        } else if (deliveryDistance > 20 && deliveryDistance < 60) {
            System.out.println("Потребуется дней: " + (days + 1));
        } if (deliveryDistance >= 60 && deliveryDistance <= 100) {
            System.out.println("Потребуется дней: " + (days + 2));
        } else {
            System.out.println("Свыше 100 км доставки нет.");
        }
        //Task 5
        System.out.println("Задача №5");
        int monthNumber = 6;
        switch (monthNumber) {
            case 1:
                System.out.println("Январь");
                break;
            case 2:
                System.out.println("Февраль");
                break;
            case 3:
                System.out.println("Март");
                break;
            case 4:
                System.out.println("Апрель");
                break;
            case 5:
                System.out.println("Май");
                break;
            case 6:
                System.out.println("Июнь");
                break;
            case 7:
                System.out.println("Июль");
                break;
            case 8:
                System.out.println("Август");
                break;
            case 9:
                System.out.println("Сентябрь");
                break;
            case 10:
                System.out.println("Октябрь");
                break;
            case 11:
                System.out.println("Ноябрь");
                break;
            case 12:
                System.out.println("Декабрь");
                break;
            default:
                System.out.println("Такого месяца не существует");
        }
        if (monthNumber == 1 || monthNumber == 2 || monthNumber == 12) {
            System.out.println("Зима");
        } else if (monthNumber == 3 || monthNumber == 4 || monthNumber == 5) {
            System.out.println("Весна");
        } if (monthNumber == 6 || monthNumber == 7 || monthNumber == 8) {
            System.out.println("Лето");
        } else if (monthNumber == 9 || monthNumber == 10 || monthNumber == 11) {
            System.out.println("Осень");
        }
        }
    }
