package Lesson_2;

public class HomeWork {
    public static void main (String[] args) {
        System.out.println (sum(15, 6));
        num (1);
        System.out.println(truenum(1));
        line("Строка", 3);
        System.out.println(year(800));
    }

    public static boolean sum (int num_1, int num_2) {
        int result = num_1 + num_2;
        if (result >= 10 && result <= 20) {
            return true;
        } else {
            return false;
        }
    }

    public static void num (int num_1) {
        if (num_1 < 0) {
            System.out.println("Число отрицательное");
        } else if (num_1 >= 0) {
            System.out.println("Число положительное");
        }
    }

    public static boolean truenum (int num_1) {
        if (num_1 < 0) {
            return true;
        } else {
            return false;
        }
    }

    public static void line (String st , int num_1) {
        int begin = 0;
        while (begin < num_1) {
            begin ++;
            System.out.println(st);
        }

    }

    public static boolean year (int num_1) {
        if (num_1 % 4 == 0 && num_1 % 100 != 0) {
            return true;
        }
        else if (num_1 % 400 ==0) {
            return true;
        }
        else if (num_1 % 100 == 0) {
            return false;
        }
        else {
            return false;
        }
    }
}
