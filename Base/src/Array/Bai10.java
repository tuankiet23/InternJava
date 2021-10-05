package Array;

import java.util.Scanner;

public class Bai10 {
    public void mang(){
        int m1, n1;
        int m2, n2;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập dòng của ma trận A: ");
        m1 = scanner.nextInt();
        System.out.println("Nhập cột của ma trận A: ");
        n1 = scanner.nextInt();
        System.out.println("Nhập dòng của ma trận B: ");
        m2 = scanner.nextInt();
        System.out.println("Nhập cột của ma trận B: ");
        n2 = scanner.nextInt();

        int[][] A = new int[m1][n1];
        int[][] B = new int[m2][n2];
        int C[][] = new int[m1][n2];

        while (m1 > 0 && n1 > 0 && m2 > 0 && n2 > 0) {
            if (n1 != m2) {
                System.out.println("Nhập lại cột của ma trận A: ");
                n1 = scanner.nextInt();
                System.out.println("Nhập dòng của ma trận B: ");
                m2 = scanner.nextInt();
            } else {
                System.out.println("Nhập vào các phần tử của ma trận A: ");
                for (int i = 0; i < m1; i++) {
                    for (int j = 0; j < n1; j++) {
                        System.out.print("A[" + i + "]["+ j + "] = ");
                        A[i][j] = scanner.nextInt();
                    }
                }
                System.out.println("Nhập vào các phần tử của ma trận B: ");
                for (int i = 0; i < m2; i++) {
                    for (int j = 0; j < n2; j++) {
                        System.out.print("B[" + i + "]["+ j + "] = ");
                        B[i][j] = scanner.nextInt();
                    }
                }
                System.out.println("Ma trận A: ");
                for (int i = 0; i < m1; i++) {
                    for (int j = 0; j < n1; j++) {
                        System.out.print(A[i][j] + "\t");
                    }
                    System.out.println("\n");
                }

                System.out.println("Ma trận B: ");
                for (int i = 0; i < m2; i++) {
                    for (int j = 0; j < n2; j++) {
                        System.out.print(B[i][j] + "\t");
                    }
                    System.out.println("\n");
                }
                for (int i = 0; i < m1; i++) {
                    for (int j = 0; j < n2; j++) {
                        C[i][j] = 0;
                        for (int k = 0; k < n1; k++) {
                            C[i][j] = C[i][j] + A[i][k] * B[k][j];
                        }
                    }
                }
                System.out.println("Ma trận tích C: ");
                for (int i = 0; i < m1; i++) {
                    for (int j = 0; j < n2; j++) {
                        System.out.print(C[i][j] + "\t");
                    }
                    System.out.println("\n");
                }
            }

        }
    }

    public static void main(String[] args) {
        Bai10 bai10=new Bai10();
        bai10.mang();
    }
}
