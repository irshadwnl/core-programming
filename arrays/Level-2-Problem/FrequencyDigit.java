
import java.util.*;

public class FrequencyDigit {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        long n=sc.nextLong();
        sc.close();
        long og=n;
        int cnt=0;
        while(n>0){
            cnt++;
            n/=10;
        }
        int freq[]=new int[10];
        // int idx=0;
        while(og>0){
            int rem=(int)Math.abs(og%10);
            freq[rem]++;
            og/=10;
        }
        System.out.println(Arrays.toString(freq));

    }
}
