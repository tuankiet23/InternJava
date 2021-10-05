package Array;

import java.util.Scanner;

public class Bai2 {
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
        int tam;
        for(int i=0; i<n-1; i++)
        {
            for(int j=i+1; j<n; j++){
                if(a[i]>a[j]){
                    tam=a[i];
                    a[i]=a[j];
                    a[j]=tam;
                }
            }
        }
        System.out.println("mang sau sx:");
        for(int i=0; i<n; i++)
        {
            System.out.println(a[i]);
        }

    }
    public  static void main(String []argv){
        Bai2 bai2=new Bai2();
        bai2.Mang();
    }
}
