package Base;

import java.util.Scanner;

public class Bai6 {
    public static boolean SNT(int n) {
        for (int i = 2; i < n / 2; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public void Tach() {
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhap n:");
        int n=sc.nextInt();
        int dem=0;
        for (int i = 2; i <= n; i++) {
            while (SNT(i) && n % i == 0) {
                if(dem==0){
                    System.out.print("" + i);
                }
                else System.out.print("X" + i);
                dem++;

                n /= i;
            }
        }
    }

    public static void main(String[] args) {
        Bai6 bai6=new Bai6();
        bai6.Tach();
    }
}
