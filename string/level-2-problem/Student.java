
public class Student {
    public static void main(String[] args) {
        int age[]=new int[10];
        for(int i=0;i<10;i++){
            age[i]=generate2DigitRandomNumber();
        }
        String vote[][] =canVote(age);
        display(vote);
        // System.out.println(Arrays.toString(age));
    }

    private static int generate2DigitRandomNumber() {
        return (int)(Math.random()*90)+9;
    }

    private static String[][] canVote(int[] age) {
        String vote[][]=new String[10][2];
        for(int i=0;i<10;i++){
            if(age[i]>18){
                vote[i][0]="true";
                vote[i][1]=String.valueOf(age[i]);
            }else{
                vote[i][0]="false";
                vote[i][1]=String.valueOf(age[i]);
            }
        }
        return vote;
    }

    private static void display(String[][] vote) {
        System.out.printf("%10s %10s","Eligible","Age");
        for(String v[]:vote){
            System.out.println();
            System.out.printf("%10s",v[0]);
            System.out.printf("%10s",v[1]);
        }
    }

}
