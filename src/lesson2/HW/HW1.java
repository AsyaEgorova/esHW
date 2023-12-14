package lesson2.HW;

import java.util.Scanner;

//	Напишите программу для вывода поры года по номеру месяца (Использовать оператор swetch-case)//
public class HW1 {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        System.out.println("введите номер месяца");
        Integer num1 = num.nextInt();
        switch (num1)
    {
        case 1:
            System.out.println("зима");
        break;
        case 2:
            System.out.println("зима");
            break;
        case 3:
            System.out.println("весна");
            break;
        case 4:
            System.out.println("весна");
        break;
        case 5:
        System.out.println("весна");
        break;
        case 6:
            System.out.println("лето");
            break;
        case 7:
            System.out.println("лето");
            break;
        case 8:
            System.out.println("лето");
            break;
        case 9:
            System.out.println("осень");
            break;
        case 10:
            System.out.println("осень");
            break;
        case 11:
            System.out.println("осень");
            break;
        case 12:
            System.out.println("зима");
            break;
        default: System.out.println("введите номер в диапазоне от 1 до 12");

    }}

}
