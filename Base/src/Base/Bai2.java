package Base;

import java.util.Scanner;

public class Bai2 {
    public void Uoc(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap n :");
        int n = sc.nextInt();
        System.out.println("uoc cua"+n+"la:");
        for(int i =1; i<=n; i++) {
            if((n%i)==0) {
                System.out.println(i);
            }
    }}
    public static void main(String []argv){
        Bai2 bai2=new Bai2();
        bai2.Uoc();
    }

}
