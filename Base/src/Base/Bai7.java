package Base;

public class Bai7 {
    public static boolean KT(int n) {
        if (n < 2) {
            return false;
        }
        int a = (int) Math.sqrt(n);
        for (int i = 2; i <= a; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
    public static void SNT(){
        for (int i = 100001; i < 999999; i+=2) {
            if (KT(i)) {
                System.out.println(i);
            }
        }
    }

    public static void main(String[] args) {
        Bai7 bai7=new Bai7();
        bai7.SNT();
    }
}
