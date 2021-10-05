package Base;

import java.util.Scanner;

public class Bai1 {
    public void tongA(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap n : ");
        int n = sc.nextInt();
        int s = 0;
        if (n %2==0) {
            System.out.println(n +" "+"la so chan");
            for(int i = 2; i <=n;i+=2) {
                s+=i;
            }
        }
        else {
            System.out.println(n +" "+ "la so le");
            for(int i = 1;i<=n;i+=2) {
                s+=i;
            }
        }
        System.out.println("Tong:"+s);
    }
    public void tongB(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap m : ");
        float m = sc.nextFloat();
        float s = 0 ;
        for(int i= 1;i<=m; i++ ) {
            s += 1/(float)i;
        }
        System.out.println("Tong:"+s);
    }
    public static  void main(String [] argv){
        Bai1 bai1=new Bai1();
        bai1.tongA();
        bai1.tongB();
    }

}
