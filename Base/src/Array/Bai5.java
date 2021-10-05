package Array;

import java.util.Scanner;

public class Bai5 {
    public void Mang(){
        Scanner sc=new Scanner(System.in);
        int n,c;
        System.out.println("Nhap n:");
        n=sc.nextInt();
        System.out.println("Nhap c:");
        c=sc.nextInt();
        int [] a=new int[n];
        for(int i=0; i<n; i++)
        {
            a[i]=sc.nextInt();
        }
        int kc=Math.abs(a[0]-c);
        int p=0;
        for(int i=1; i<n-1; i++)
        {
            if(kc>Math.abs(a[i]-c)){
                kc=Math.abs(a[i]-c);
                p=i;
            }
            }
        System.out.println("Số gẫn nhat voi X:"+a[p]+" vị trí ở "+p);
    }
    public  static void main(String []argv){
        Bai5 bai5=new Bai5();
        bai5.Mang();
    }
}
