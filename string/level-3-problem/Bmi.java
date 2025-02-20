
import java.util.Scanner;

public class Bmi {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String person[][]=new String[2][2];
        for(String p[]:person){
            System.out.print("Enter weight in(kg): ");
            p[0]=sc.next();
            System.out.print("Enter height in(cm): ");
            p[1]=sc.next();
        } 
        String personData[][]=findBmiAndStatus(person);
        displayResults(person, personData);
    }

    private static String[][] findBmiAndStatus(String[][] person) {
        String ans[][]=new String[10][2];
        for(int i=0;i<person.length;i++){
            for(int j=0;j<person[0].length;++j){
                double heightInMeter=Double.parseDouble(person[i][1])*0.01;
                double weight=Double.parseDouble(person[i][0]);
                double bmi=weight/(heightInMeter*heightInMeter);
                ans[i][0] = String.format("%.2f", bmi);
                if(bmi>=40.0){
                    ans[i][1]="Obese";
                }else if(bmi>=25.0){
                    ans[i][1]="Overweight";
                }else if(bmi>=18.5){
                    ans[i][1]="Normal";
                }else{
                    ans[i][1]="UnderWeight";
                }
            }
        }
        return ans;
    }
    private static void displayResults(String[][] person, String[][] personData) {
        System.out.printf("%-10s %-10s %-10s\n", "Weight(kg)", "Height(cm)", "BMI", "Status");
        for (int i = 0; i < person.length; i++) {
            System.out.printf("%-10s %-10s %-10s %-10s\n",
                    person[i][0], person[i][1], personData[i][0], personData[i][1]);
        }
    }
}
