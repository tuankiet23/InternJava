package Array;

import java.util.Scanner;

public class Bai1 {
    public void Mang(){
        Scanner sc=new Scanner(System.in);
        int n;
        System.out.println("Nhap n:");
        n=sc.nextInt();
        int [] a=new int[n];
        for(int i=0; i<n; i++)
        {
            a[i]=sc.nextInt();
        }
        if(n%2 ==0){
            for(int i=0; i<n/2; i++)
            {
                if(a[i]!=a[n-i-1]){
                    System.out.println("không phai mang doi xung");
                    return;
                }
            }
        }
        else {
            for(int i=0; i<=n/2; i++)
            {
                if(a[i]!=a[n-i-1]){
                    System.out.println("không phai mang doi xung");
                    return;
                }
            }
        }

    }
    public  static void main(String []argv){
        Bai1 bai1=new Bai1();
        bai1.Mang();
    }
}
