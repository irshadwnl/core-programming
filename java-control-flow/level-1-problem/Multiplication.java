// Create a program to find the multiplication table of a number entered by the user from 6 to 9 (Solution by Irshad).


public class Multiplication {
    public static void main(String[] args) {
        for(int j=6;j<=9;j++){
            for(int i=1;i<=10;i++){
                System.out.println(j+" * " + i+" = "+j*i);
            }
            System.out.println("***********************");
        }
    }
}
