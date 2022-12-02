import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();


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
        System.out.println("Задача №5");
        byte needPaint = 120;
        byte klass_1_white = 2;
        byte klass_1_brown = 4;
        int needKlassWhite = needPaint / klass_1_white; //На 1 класс уходит белой краски
        int needKlassBrown = needPaint / klass_1_brown; //На 1 класс уходит коричневой краски
        int allKlasses = needPaint / (klass_1_white + klass_1_brown); //Сколько банок уходит на 1 класс -=сколько всего классов
        System.out.println("В школе, где " + allKlasses + " классов, нужно " + needKlassWhite + " банок белой краски и " + needKlassBrown + " банок коричневой краски");

    }

    public static void task6() {
        System.out.println("Задача №6");
        byte banana = 5;
        byte bananaGramm = 80; //80 грамм - 1 банана
        int bananaGramms = banana * bananaGramm; //400
        int milk = 200;
        byte milkGramm = 105; //100мл - 105g
        int milkGramms = milk * milkGramm; //210
        byte iceCream = 2;
        byte iceCreamGramm = 100;
        int iceCreamGramms = iceCream * iceCreamGramm;// 200
        byte egg = 4;
        byte eggGramm = 70;
        int eggGramms = egg * eggGramm; //280
        int allGramms = bananaGramms + milkGramms + iceCreamGramms + eggGramms;
        float allKilogramms = allGramms / 1000f;
        System.out.println(allKilogramms);
    }

    public static void  task7() {
        System.out.println("Задача №7");
        int kilogramms = 7000;
        int gramms = 250;
        int need_250 = kilogramms / gramms;
        System.out.println(need_250);
        int gramms_500 = 500;
        int need_500 = kilogramms / gramms_500;
        System.out.println(need_500);
        int averageValue = (gramms + gramms_500) / 2;
        System.out.println(averageValue);
    }

    public static void  task8() {
        System.out.println("Задача №8");
        int Maria = 67760;
        int Denis = 83690;
        int Kristina = 76230;
        int newSalaryMaria = Maria/10 + Maria; //10% в месяц
        int newSalaryDenis = Denis/10 + Denis; //10% в месяц
        int newSalaryKristina = Kristina/10 + Kristina; //10% в месяц
        int moneyYearMaria = Maria * 12; //Годовая зп
        int moneyYearDenis = Denis * 12; //Годовая зп
        int moneyYearKristina = Kristina * 12; //Года зп
        int newMoneyYearMaria = newSalaryMaria * 12; //Годовая зп %
        int newMoneyYearDenis = newSalaryDenis * 12; //Годовая зп %
        int newMoneyYearKristina = newSalaryKristina * 12; //Годовая зп %
        int salaryMaria = newMoneyYearMaria - moneyYearMaria; //Разница
        int salaryDenis = newMoneyYearDenis - moneyYearDenis; //Разница
        int salaryKristina = newMoneyYearKristina - moneyYearKristina; //Разница
        System.out.println("Маша теперь получает " + newSalaryMaria + " рублей. Годовой доход вырос на " + salaryMaria + " рублей");
        System.out.println("Денис теперь получает " + newSalaryDenis + " рублей. Годовой доход вырос на " + salaryDenis + " рублей");
        System.out.println("Кристина теперь получает " + newSalaryKristina + " рублей. Годовой доход вырос на " + salaryKristina + " рублей");

    }
}