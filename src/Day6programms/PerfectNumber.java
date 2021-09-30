package Day6programms;

public class PerfectNumber {
    public static void main(String[] args) {
        for (int n=2;n<100;n++){
            if (perfect(n))
                System.out.println("THE PERFECT NUMBERS ARE : "+n );
        }

    }

    public static boolean perfect(int n){
        int sum=1,i;

        for (i=2;i*i<=n;i++){
            if (n % i==0)
            {
                if(i * i != n)
                    sum = sum + i + n / i;
                else
                    sum = sum + i;

            }
        }
        if (sum==n && n!=1 )
            return true;
        else
            return false;


    }
}
