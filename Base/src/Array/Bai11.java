package Array;

import java.util.Scanner;

public class Bai11 {
public void mang(){
    int n;
    Scanner scanner = new Scanner(System.in);
    System.out.println("Nhập n: ");
    n = scanner.nextInt();
    int[][] A = new int[n][n];
    System.out.println("Nhap mang: ");
    for(int i=0; i<n; i++)
    {
        for(int j=0; j<n; j++){
            System.out.print("A[" + i + "]["+ j + "] = ");
                A[i][j]=scanner.nextInt();
        }
    }
    int sum=0;
    for(int i=0; i<n; i++){
        sum=sum+A[i][i];
    }
    System.out.println("Tong cheo chinh:"+sum);
    sum=0;
    for(int i=n-1; i>=0; i--){
        sum=sum+A[i][i];
    }
    System.out.println("Tong cheo phu:"+sum);
}
    public static void main(String []argv){
        Bai11 bai11=new Bai11();
        bai11.mang();
    }

}
