package lesson2.HW;

//Вывести на экран первые 11 членов последовательности Фибоначчи.//
public class HW12 {
    public static void main(String[] args) {
        int a = 0;
        System.out.println(a);
        int b = 1;
        System.out.println(b);
        int j = 1;
        while (j <= 9) {
            j++;
            int c = a + b;
            a = b;
            b = c;
            System.out.println(c);
        }
    }
}
