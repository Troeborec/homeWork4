import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();

    }

    public static void task1() {
        System.out.println("Задача №1");
        byte a = 1;
        short b = 2;
        int c = 3;
        long d = 4;
        float A = 1.1f;
        double B = 2.2;
        System.out.println("Значение переменной byte " + "с типом целочисленных" + " равно " + a);
        System.out.println("Значение переменной short " + " с типом целочиленных" + " равно " + b);
        System.out.println("Значение переменной int " + " с типом целочисленных" + " равно " + c);
        System.out.println("Значение переменной long " + " с типом целочисленных" + " равно " + d);
        System.out.println("Значение переменной float" + " с типом плавающей точки" + " равно " + A);
        System.out.println("Значение переменной float" + " с типом плавающей точки" + " равно " + B);
    }

    public static void task2() {
        System.out.println("Задача №2");
       float a = 27.12f;
       long b = 987678965549l;
       float c = 2.786f;
       short d = 569;
       short e = -159;
       int f = 27897;
       byte g = 67;
        System.out.println(g);
    }

    public static void task3() {
        System.out.println("Задача №3");
        byte teacher1 = 23;
        byte teacher2 = 27;
        byte teacher3 = 30;
        short peaper = 480;
        int allStudents = teacher1 + teacher2 + teacher3;
        int everyStudents = peaper / allStudents;
        System.out.println("На каждого ученика рассчитано " + everyStudents + " листов бумаги");
    }

    public static void  task4() {
        System.out.println("Задача №4");
        byte bottles = 16;
        byte minutes = 2;
        int minutes_1 = bottles / minutes; //Сколько бутылок за 1 минуту (8штук)
        int minutes_20 = minutes_1 * 20;
        System.out.println("За 20 минут машина произвела " + minutes_20 + " штук бутылок");
        int hours_1 = minutes_20 * 3;
        int day = hours_1 * 24;
        System.out.println("За cутки  машина произвела " + day + " штук бутылок");
        int threeDay = day * 3;
        System.out.println("За 3 дня  машина произвела " + threeDay + " штук бутылок");
        int month = day * 28;
        System.out.println("За 1 месяц  машина произвела " + month + " штук бутылок");

    }

    public static void task5() {

    }
}