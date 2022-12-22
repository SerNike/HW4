import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
    }
    public static void task1() {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if (a < 18) {
            System.out.println("Если возраст человека равен " + a + ", то он не достиг совершеннолетия, нужно немного подождать");
        } else if (18 <= a) {
            System.out.println("Если возраст человека равен " + a + ", то он совершеннолетний");
        }
    }
    public static void task2() {
        Scanner s = new Scanner(System.in);
        int b = s.nextInt();
        if (b < 5) {
            System.out.println("На улице " + b + " градусов, можно идти без шапки");
        } else if (5 <= b) {
            System.out.println("На улице " + b + " градусов, нужно надеть шапку");
        }
    }
    public static void task3() {
        Scanner sq = new Scanner(System.in);
        int c = sq.nextInt();
        if (c < 60) {
            System.out.println("Если скорость " + c + " то можно ездить спокойно");
        } else if (60 <= c) {
            System.out.println("Если скорость " + c + " то придется заплатить штраф");
        }
    }
    public static void task4() {
        Scanner sq1 = new Scanner(System.in);
        int d = sq1.nextInt();
        if (d <= 6 && 2 <= d) {
            System.out.println("Если возраст человека равен " + d + ", то ему нужно ходить в детский сад");
        }
        if (d <= 18 && 7 <= d) {
            System.out.println("Если возраст человека равен " + d + ", то ему нужно ходить в школу");
        }
        if (d <= 24 && 19 <= d) {
            System.out.println("Если возраст человека равен " + d + ", то его место в университете");
        }
        if (25 <= d) {
            System.out.println("Если возраст человека равен " + d + ", то ему пора ходить на работу");
        }
    }
    public static void task5() {
        Scanner sq2 = new Scanner(System.in);
        int e = sq2.nextInt();
        if (e < 5) {
            System.out.println("Если возраст ребенка равен " + e + ", то он не может кататься на аттракционе");
        }
        if (e <= 14 && 5 <= e) {
            System.out.println("Если возраст ребенка равен " + e + ", то он может кататься только в сопровождении взрослого. Если взрослого нет, то кататься нельзя");
        } else if (e > 14) {
            System.out.println("Если возраст ребенка равен " + e + ", то он может кататься без сопровождения взрослого");
        }
    }
    public static void task6() {
        Scanner sq3 = new Scanner(System.in);
        int e1 = sq3.nextInt();
        if (e1 < 60) {
            System.out.println("есть седячие места в автобусе");
        }
        if (e1 <= 102 && 60 <= e1) {
            System.out.println("в автобусе только стоячие места");
        } else if (e1 > 102) {
            System.out.println("Автобус заполнен мест нет");
        }
    }
    public static void task7() {
        Scanner sq4 = new Scanner(System.in);
        int one = sq4.nextInt();
        int two = sq4.nextInt();
        int three = sq4.nextInt();
        if (one > two && one > three) {
            System.out.println(one);
        } if (one < two && two > three) {
            System.out.println(two);
        } else if (three > two && one < three) {
            System.out.println(three);
        }
    }
}