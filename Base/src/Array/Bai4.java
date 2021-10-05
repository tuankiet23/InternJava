package Array;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Bai4 {
    public void mang(){
        Scanner sc=new Scanner(System.in);
        int n;
        System.out.println("Nhap n:");
        n=sc.nextInt();
        int [] a=new int[n];
        for(int i=0; i<n; i++)
        {
            a[i]=sc.nextInt();
        }
        Map<Integer, Integer> map = new TreeMap<Integer, Integer>();
        for (int i = 0; i < n; i++) {
            addElement(map, a[i]);
        }
        System.out.print("Các phần tử xuất hiện 2 lần: \n");
        for (Integer key : map.keySet()) {
            System.out.printf("%d xuất hiện %d lần.\n", key, map.get(key));
        }

        }

    public static void addElement(Map<Integer, Integer> map, int element) {
        if (map.containsKey(element)) {
            int count = map.get(element) + 1;
            map.put(element, count);
        } else {
            map.put(element, 1);
        }
    }
    public static void main(String []argv){
        Bai4 bai4=new Bai4();
        bai4.mang();
    }
}