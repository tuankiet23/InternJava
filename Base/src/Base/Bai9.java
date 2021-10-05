package Base;

public class Bai9 {
    public static boolean KT(int n) {
        String str = String.valueOf(n);
        if(str.length() / 2==0){
            for (int i = 0; i <= str.length() / 2; i++) {
                if (str.charAt(i) != str.charAt(str.length() - i - 1)) {
                    return false;
                }
            }
            return true;
        }
        else
        {
            for (int i = 0; i < str.length() / 2; i++) {
                if (str.charAt(i) != str.charAt(str.length() - i - 1)) {
                    return false;
                }
            }
            return true;
        }
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
        System.out.println("chữ số thuận nghịch: ");
        for (int i = 1000000; i < 1000000000; i++) {
            if (KT(i)) {
                System.out.println(i);
            }
        }
    }
    public void KT1(){
        System.out.println("Số  có tổng chữ số chia hết cho 10: ");
        for (int i = 1000000; i <1000000000 ; i++) {
            if ( sum(i)%10==0){
                System.out.println(i);
            }
        }
    }
    public void KT2(){
        for (int i = 1000000; i <1000000000 ; i++) {
            String str = String.valueOf(i);
                for (int j = 0; j<= str.length(); i++) {
                        if(Character.toString(str.charAt(j)).equals("0")||Character.toString(str.charAt(j)).equals("6")||Character.toString(str.charAt(j)).equals("8")){
                            System.out.println(i);
                    }
                }
        }
    }


    public static void main(String[] args) {
        Bai9 bai9 =new Bai9();
        bai9.DX();
        bai9.KT1();
        bai9.KT2();
    }
}

