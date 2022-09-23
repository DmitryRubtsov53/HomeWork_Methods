import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Домашняя работа Урока Методы");
        System.out.println();

        System.out.println("Задача 1. Високосный год *******************************************************");
        // Нужно определить является текущий год високосным или нет. Determine leap year.
        int currentYear = LocalDate.now().getYear();; // метод определения номера текущего года
        determineLeapYear(currentYear);

    System.out.println();
        System.out.println("Задача 2. Помощь в выборе клиентом приложения для смартфона ********************");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите тип операционной системы своего смартфона:");
        System.out.println("( если у вас iOS - 0, если Adroid - 1 )");
        int osType = scanner.nextInt(); // тип операционной системы смартфона клиента
        System.out.println("Введите год выпуска вашего смартфона:");
        int yearOfIssue = scanner.nextInt();   // год выпускв

        selectionOS (osType, yearOfIssue);


    }  // скобка метода main


    // ********* мой методыы ********************************************************************
    public static void determineLeapYear (int currentYear) {  // определяем високосный год - determine leap year
         if (currentYear % 4 == 0) {
            if ((currentYear % 100 == 0) && (currentYear % 400 == 0)) {
                System.out.println(currentYear + " год является високосным.");
            }
        } else System.out.println(currentYear + " год не является високосным.");
    }

    public static void selectionOS (int osType, int yearOfIssue) {
        int currentYear = LocalDate.now().getYear();; // метод определения номера текущего года

        if (yearOfIssue < currentYear && osType == 0) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке.");
        } else
        if (yearOfIssue < currentYear && osType == 1) {
            System.out.println("Установите облегченную  версию приложения для Android по ссылке.");  /// Здесь наставник использовал if - else if
        } else
        if (yearOfIssue >= currentYear && osType == 0) {
            System.out.println("Установите приложение для iOS по ссылке.");
        } else
        if (yearOfIssue >= currentYear && osType == 1) {
            System.out.println("Установите приложение для Android по ссылке.");
        }
    }



}   // скобка класса