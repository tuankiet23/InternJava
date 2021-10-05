package Base;

import java.util.Scanner;

public class Bai3 {
    public static int UCLN(int a, int b) {
        if (b == 0) return a;
        return UCLN(b, a % b);
    }

    public static int BCNN(int a, int b) {
        return (a * b) / UCLN(a, b);
    }
    public static void main(String[] args) {
        System.out.print("Nhap a = ");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        System.out.print("Nhap b = ");
        int b = scanner.nextInt();
        System.out.println("USCLN của " + a + " và " + b
                + " là: " + UCLN(a, b));
        System.out.println("BSCNN của " + a + " và " + b
                + " là: " + BCNN(a, b));
    }
}