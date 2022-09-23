public class Main {
    public static void main(String[] args) {
        System.out.println("Домашняя работа Урока Методы ************************************* ");
        System.out.println();

        System.out.println("Задача 1. Високосный год.");
        // Нужно определить является текущий год високосным или нет. Determine leap year.
        int year = 2022; // метод определения номера текущего года
        determineLeapYear(year);


        System.out.println(); //***********current*********************************************************

    }



    public static void determineLeapYear (int year) {  // определяем високосный год - determine leap year

         if (year % 4 == 0) {
            if ((year % 100 == 0) && (year % 400 == 0)) {
                System.out.println(year + " год является високосным.");
            }
        } else System.out.println(year + " год не является високосным.");


    }
}