package LeapYear;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Программа Какой год");
        System.out.print("Введите год и нажмите enter: ");
        int year = sc.nextInt();
        int i = year;
        if (i % 4 == 0) {
            if ((i % 100 != 0) || (i % 400 == 0))
            System.out.print("Год високосный ");
        }
        else
                System.out.print("Год не високосный ");
    }
}
