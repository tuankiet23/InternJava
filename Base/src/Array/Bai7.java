package Array;

import java.util.Scanner;

public class Bai7 {
    public void Mang(){
        Scanner sc=new Scanner(System.in);
        int n,x;
        System.out.println("Nhap n:");
        n=sc.nextInt();
        System.out.println("Nhap số X:");
        x=sc.nextInt();
        int [] a=new int[n];
        System.out.println("Nhap mang:");

        for(int i=0; i<n; i++)
        {
            a[i]=sc.nextInt();
        }
        int []b=new int [n+1];
        for(int i=0; i<n; i++)
        {
            b[i]=a[i];
        }
        b[n]=x;

        int tam;
        for(int i=0; i<n; i++)
        {
            for(int j=i+1; j<n+1; j++){
                if(b[i]>b[j]){
                    tam=b[i];
                    b[i]=b[j];
                    b[j]=tam;
                }
            }
        }
        System.out.println("mang sau chen:");
        for(int i=0; i<=n; i++)
        {
            System.out.println(b[i]);
        }
    }
    public  static void main(String []argv){
        Bai7 bai7=new Bai7();
        bai7.Mang();
    }
}
