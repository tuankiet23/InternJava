package Array;

import java.util.Scanner;

public class Bai3 {
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
        int count=0;
        int p=0;
        for(int i=0; i<n-1; i++)
        {
            int tam=0;
            for(int j=i; j<n; j++){
                if(a[i]==a[j]){
                    tam=tam+1;
                }
            }
            if(tam>count)
            {
                count=tam;
                p=i;
            }
        }
        System.out.println("Số xuất hiện nhiều nhất:"+a[p]);
    }
    public  static void main(String []argv){
        Bai3 bai3=new Bai3();
        bai3.Mang();
    }
}
