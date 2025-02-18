import java.util.Arrays;

public class Otp {
    public static void main(String[] args) {
        int otp[]=new int[10];
        for(int i=0;i<10;i++){
            otp[i]=generate6DigitRandomNumber();
        }
        System.out.println(Arrays.toString(otp));
        boolean validate=checkUniqueOTP(otp);
        if(validate){
            System.out.println("OTPs are Unique "+validate);
        }else{
            System.out.println("OTPs are not Unique "+validate);
        }

    }
    public static int generate6DigitRandomNumber(){
        return (int)(Math.random()*900000)+100000;
    }

    public static boolean checkUniqueOTP(int otp[]){
        for(int i=0;i<otp.length-1;i++){
            if(otp[i]==otp[i+1]){
                return false;
            }
        }
        return true;
    }
}
