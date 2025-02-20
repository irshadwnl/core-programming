/*Write a program to compare two strings using the charAt()
method and check the result with the built-in 
String equals() method */


import java.util.Scanner;

public class CompareTwoString{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s1=sc.next();
        String s2=sc.next();
        sc.close();
        boolean compare=compareTwoString(s1,s2);
        if(compare){
            System.out.println(s1+" "+ s2+"are equal");
        }else{
            System.out.println(s1+" "+s2+" are not equal");
        }
    }
    public static boolean compareTwoString(String s1,String s2){
        return s1.equals(s2);
    }
}