package Array;

import java.util.Scanner;

public class Bai6 {
    public void Mang(){
        Scanner sc=new Scanner(System.in);
        int n,m,p;
        System.out.println("Nhap n:");
        n=sc.nextInt();
        System.out.println("Nhap m:");
        m=sc.nextInt();
        System.out.println("Nhap p:");
        do {
            p=sc.nextInt();
        } while (p >n-1);
        int []b=new int[m];
        int [] a=new int[n];

        System.out.println("Nhap mang a:");
        for(int i=0; i<n; i++)
        {
            a[i]=sc.nextInt();
        }
        System.out.println("Nhap mang b:");
        for(int i=0; i<m; i++)
        {
            b[i]=sc.nextInt();
        }

        int []c= new int [m+n];
        for(int i=0; i<p; i++){
            c[i]=a[i];
        }
        for(int i=p; i<p+m; i++){
            c[i]=b[i-p];
        }
        for(int i=p+m; i<m+n; i++)
        {
            c[i]=a[i-m];
        }
        System.out.println("Mang sau khi chèn:");
        for (int i=0; i<n+m; i++)
        {
            System.out.println(c[i]);
        }
    }
    public  static void main(String []argv){
        Bai6 bai6=new Bai6();
        bai6.Mang();
    }
}
