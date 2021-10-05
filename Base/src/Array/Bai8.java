package Array;

import java.util.Scanner;

public class Bai8 {
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
        int kq=0;
        int dem=1;
        for(int i=0; i<n-1; i++)
        {
            if(a[i]<a[i+1])
                dem++;
            if(a[i]<a[i+1] ||a[i]==n-1)
            {
                if(kq<dem)
                kq=dem;
                dem=1;
            }
        }
        System.out.println("mang sau sx:");
            System.out.println(kq);

    }
    public  static void main(String []argv){
        Bai8 bai8=new Bai8();
        bai8.Mang();
    }
}
