package ru.skypro;

public class Main {

    public static void main(String[] args) {

        //Задание 1

        int clientOS = 1;
        if (clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
        if (clientOS == 0) {
            System.out.println("Установите версию приложения для IOS по ссылке");
        }


        // Задание 2

        int clientDeviceYear = 2015;
        int clientOs = 0;
        if (clientDeviceYear < 2015 && clientOs == 1)
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        if (clientDeviceYear >= 2015 && clientOs == 1) {
            System.out.println("Установите обычную версию приложения для Android по ссылке");
        } else if (clientDeviceYear < 2015 && clientOs == 0) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (clientDeviceYear >= 2015 && clientOs == 0) {
            System.out.println("Установите обычную версию приложения для iOS по ссылке");
        }


        // Задание 3

        int year = 2021;

        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + " год является високосным!");
        } else {
            System.out.println(year + " год не является високосный!");
        }

        //Задание 4
        int deliveryDistance = 101;
        int distanceOne = 1;

        if (deliveryDistance < 20) {
            System.out.println("Потребуется дней:" + distanceOne);
        }else if (deliveryDistance >= 20 && deliveryDistance < 60) {
            System.out.println("Потребуется дней:" + distanceOne*2);
        }else if (deliveryDistance >= 60 && deliveryDistance < 100) {
                System.out.println("Потребуется дней:" + distanceOne*3);
            }else if (deliveryDistance >= 100) {
            System.out.println("Забирайте сами, нам невыгодно)))");
        }




            //Задание 5

            int monthNumber = 13;
            String season;

            switch (monthNumber) {
                case 12:
                case 1:
                case 2:
                    season = "Зима";
                    System.out.println("Зима");
                    break;
                case 3:
                case 4:
                case 5:
                    season = "Весна";
                    System.out.println("Весна");
                    break;
                case 6:
                case 7:
                case 8:
                    season = "Лето";
                    System.out.println("Лето");
                    break;
                case 9:
                case 10:
                case 11:
                    season = "Осень";
                    System.out.println("Осень");
                    break;
                default:
                    System.out.println("Ошибка.Пожалуйста, введите месяц от 1 до 12");
            }
        }
    }
