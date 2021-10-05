package Base;

public class Bai8 {
    public static boolean KT(int n) {
        String str = String.valueOf(n);
        for (int i = 0; i <= str.length() / 2; i++) {
            if (str.charAt(i) != str.charAt(str.length() - i - 1)) {
                return false;
            }
        }
        return true;
    }
    public static int sum(int n) {
        int sum = 0;
        while (n > 0) {
            sum += n % 10;
            n = n / 10;
        }
        return sum;
    }
    public void DX() {
        System.out.println("Số có 6 chữ số thuận nghịch: ");
        for (int i = 100000; i < 1000000; i++) {
            if (KT(i)) {
                System.out.println(i);
            }
        }
    }
    public void KT1(){
        System.out.println("Số có 6 chữ số thuận nghịch và chia hết cho 10: ");
        for (int i = 100000; i <1000000 ; i++) {
            if (KT(i) && sum(i)%10==0){
                System.out.println(i);
            }
    }
}
    public static void main(String[] args) {
        Bai8 bai8 =new Bai8();
        bai8.DX();
        bai8.KT1();
    }
}
