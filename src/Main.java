public class Main {
    public static void main(String[] args) {
        System.out.println("Task 1:");
        task1();
        System.out.println("Task 2:");
        task2();
        System.out.println("Task 3:");
        task3();
        System.out.println("Task 4:");
        task4();
        System.out.println("Task 5:");
        task5();
        System.out.println("Task 6:");
        task6();
        System.out.println("Task 7:");
        task7();
        System.out.println("Task 8:");
        task8();
        System.out.println("Task 9:");
        task9();
        System.out.println("Task 10:");
        task10();
    }

    public static void task1() {
        for (int alpha = 1; alpha <= 10; alpha = alpha + 1) {
            System.out.println(alpha);
        }
    }

    public static void task2() {
        for (int beta = 10; beta >= 1; beta = beta - 1) {
            System.out.println(beta);
        }
    }

    public static void task3() {
        for (int gama = 0; gama <= 17; gama = gama + 2) {
            System.out.println(gama);
        }
    }

    public static void task4() {
        for (int delta = 10; delta >= -10; delta = delta - 1) {
            System.out.println(delta);
        }
    }

    public static void task5() {
        for (int leapYear = 1904; leapYear <= 2096; leapYear = leapYear + 4) {
            System.out.println("Год " + leapYear + "является високостным");
        }
    }

    public static void task6() {
        for (int epsylon = 7; epsylon <= 98; epsylon = epsylon + 7) {
            System.out.println(epsylon);
        }
    }

    public static void task7() {
        for (int dzeta = 1; dzeta <= 512; dzeta = dzeta * 2) {
            System.out.println(dzeta);
        }
    }

    public static void task8() {
        int monthlyPayments = 29000;
        int total = 0;
        for (int eta = 0; eta < 12; eta++) {
            total = total + monthlyPayments;
        }
        System.out.println(total);

    }

    public static void task9() {
        int monthlyPayments = 29000;
        int total = 0;
        int teta;
        for (teta = 1; teta <= 12; teta++) {
            total = total + total / 100;
            total = total + monthlyPayments;
            System.out.println("Месяц " + teta + ", сумма накоплений равна " + total + " рублей");
        }
    }

    public static void task10() {
        for (int yota = 1; yota <= 10; yota++) {
            System.out.println("2 * " + yota + " = " + 2* yota);
        }
    }

}
