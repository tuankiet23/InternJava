package Base;

import java.util.Scanner;

public class Bai4 {
    public void SNT(){
        int a, b;
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhap a:");
        a=sc.nextInt();
        System.out.println("Nhap b:");
        b=sc.nextInt();
        int count=0;
        if(a<b){
            for(int i=a; i<=b; i++){
                for(int j=i; j<=b; j++)
                {
                    int k=i;
                    int t=j;
                    int r = k % t;
                    while (r != 0) {
                        k = t;
                        t = r;
                        r = k % t;
                    }
                    if(t==1)
                    {
                        System.out.println(i+"và"+j+"là snt cùng nhau");
                        count=count+1;
                    }
                }
            }
            if (count==0)
                System.out.println("Khong co snt cùng nhau");
        }

    }
    public static void main(String []argv){
        Bai4 bai4=new Bai4();
        bai4.SNT();
    }



}
