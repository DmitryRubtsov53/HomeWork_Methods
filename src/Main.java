import java.time.LocalDate;
import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Домашняя работа Урока Методы");
        System.out.println();

        System.out.println("Задача 1. Високосный год ****************************************************************");
        // Нужно определить является текущий год високосным или нет. Determine leap year.
        int currentYear = LocalDate.now().getYear();; // метод определения номера текущего года
        determineLeapYear(currentYear);

        System.out.println();
        System.out.println("Задача 2. Помощь в выборе клиентом приложения для смартфона *****************************");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите тип операционной системы своего смартфона:");
        System.out.println("( если у вас iOS - 0, если Adroid - 1 )");
        int osType = scanner.nextInt(); // тип операционной системы смартфона клиента
        System.out.println("Введите год выпуска вашего смартфона:");
        int yearOfIssue = scanner.nextInt();   // год выпускв

        selectionOS (osType, yearOfIssue);
        System.out.println();

        System.out.println("Задача 3. Доставка банковских карт ******************************************************");
        System.out.println("Введите растояние до вас в км:");

        int deliveryDistance = scanner.nextInt();
        int deliveryTime = determineDeliveryTime (deliveryDistance);  // мой метод

        switch (deliveryTime) {
            case 1:
                System.out.println("На доставку карты потребуется 1 день.");  break;
            case 2:
                System.out.println("На доставку карты потребуется 2 дня.");  break;
            case 3:
                System.out.println("На доставку карты потребуется 3 дня.");  break;
            case 4:
                System.out.println("Доставку карт на такое расстояние не делаем."); break;
        }

        System.out.println();
        System.out.println("Повышенный уровень. Задача 4. Развернуть массив без создания вспомогательного. **********");

        int [] arr = {3, 2, 1, 6, 5};
        reverseArray (arr);
        System.out.println();
        System.out.println(Arrays.toString(arr) + " - в методе Main." );

        System.out.println();
        System.out.println("Повышенный уровень. Задача 5. Проверка строки на дубли и вывод 1-ого.");
        String badString = "aabccddefgghiijjkk";
        toKnowDouble (badString);


        System.out.println(" ");
        System.out.println("Повышенный уровень. Задача 6. - Расчет суммы затрат за месяц и средней величины. ********");

        java.util.Random random = new java.util.Random();
        int[] arrT = new int[30];
        for (int i = 0; i < arrT.length; i++) {
            arrT[i] = random.nextInt(100_000) + 100_000;

        }
        int summa = sumTrat (arrT);
        int j = arrT.length;
        double averege = averegeTrata (summa, j);

        System.out.println("Средняя сумма трат за месяц составила " + Math.ceil(averege) + " рублей");
    }  // скобка метода main


    // ********* мой методыы ********************************************************************
    public static void determineLeapYear (int currentYear) {  // определяем високосный год - к Задаче 1.
         if (currentYear % 4 == 0) {
            if ((currentYear % 100 == 0) && (currentYear % 400 == 0)) {
                System.out.println(currentYear + " год является високосным.");
            }
        } else System.out.println(currentYear + " год не является високосным.");
    }

    public static void selectionOS (int osType, int yearOfIssue) {   // к Задаче 2.
        int currentYear = LocalDate.now().getYear();; // метод определения номера текущего года

        if (yearOfIssue < currentYear && osType == 0) {
            System.out.println("Установите lite версию приложения для iOS по ссылке.");
        } else
        if (yearOfIssue < currentYear && osType == 1) {
            System.out.println("Установите lite  версию приложения для Android по ссылке.");  /// Здесь наставник использовал if - else if
        } else
        if (yearOfIssue >= currentYear && osType == 0) {
            System.out.println("Установите обычную версию приложения для iOS по ссылке.");
        } else
        if (yearOfIssue >= currentYear && osType == 1) {
            System.out.println("Установите обычную версию приложения для Android по ссылке.");
        }
    }

    public static int determineDeliveryTime (int deliveryDistance) {  // к Задаче 3.

        if (deliveryDistance <= 20) {
            return 1;
        } else if (20 < deliveryDistance && deliveryDistance <= 60) {
            return 2;
        } else if (60 < deliveryDistance && deliveryDistance <= 100) {
            return 3;
            }
        return 4;
    }

    public static void reverseArray (int[] arr) {    // к Задаче 4 ПС {3, 2, 1, 6, 5};

        for (int i = 0; i < arr.length/2 + 1; i++) { // Счет до середины массива + 1 элемент, иначе не верный результат!!!
            int tmp = arr[i];                 // 3.2.1
            arr[i] = arr[arr.length - 1 - i]; // 5.6.1
            arr[arr.length - 1 - i] = tmp;    // 3.2.1 -  {5.6.1.2.3}

        }
        System.out.println();
        System.out.println(Arrays.toString(arr) + " - в моём методе.");
    }

    public static void toKnowDouble (String badString) {

        char[] badArray = badString.toCharArray();
        for (int i = 0; i < badArray.length; i++) {
            if (badArray[i] == badArray[i+1]) {
                System.out.println("В строке есть дублирующиеся элементы.");
                System.out.println("1-й дублирующийся символ строки - " + badArray[i]);
                break;
            }
        }
    }

    public static int sumTrat (int[] arr) {    // к Задаче 6 ПС
        int sum = 0;
        for (int j = 0; j < arr.length; j++) {
            sum += arr[j];
        }
        return sum;
    }

    public static double averegeTrata (int summa, int i) {

        double averTr = (double) summa / i;
        return  averTr;

    }


}   // скобка класса