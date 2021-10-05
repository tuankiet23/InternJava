package Base;

import java.util.Scanner;

public class Bai5 {
    public  void TongCS() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap n:");
        int n = scanner.nextInt();
        int sum = 0;
        while (n > 0) {
            sum += n % 10;
            n = n / 10;
        }
        System.out.println("Tổng số nguyên " + n + " là: " + sum);
    }

    public static void main(String[] args) {
        Bai5 bai5=new Bai5();
        bai5.TongCS();
    }
}
