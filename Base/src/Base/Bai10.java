package Base;

public class Bai10 {
    public static boolean SNT(int n) {
        for (int i = 2; i < n / 2; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
    public void KT(){
        System.out.println("SNT");
        for(int i=1000000; i<10000000; i++)
        {
            if(SNT(i))
                System.out.println(i);
        }
    }

    public void KT1(){
        System.out.println("SNT");
        for(int i=1000000; i<10000000; i++)
        {
            int count = 0;
            while (i > 0) {
                int j= i % 10;
                SNT(j);
                if(SNT(j))
                    count++;
                i= i / 10;
            }
            if(count==(String.valueOf(i).length()))
                System.out.println(i);
        }

    }

}
