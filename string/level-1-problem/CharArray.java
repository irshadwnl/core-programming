/*Write a program to return all the characters in a string
 using the user-defined method,  
 compare the result with the String built-in toCharArray() method, 
and display the result */

import java.util.Arrays;
import java.util.Scanner;

public class CharArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter String: ");
        String s1=sc.next();
        sc.close();
        char arr[]=convertToCharArray(s1);
        boolean comp=compare(s1,arr);
        System.out.println(Arrays.toString(arr));
        if(comp){
            System.out.println("Both are equal");
        }else{
            System.out.println("both are not equal");
        }
    }
    public static char[] convertToCharArray(String s1){
        return s1.toCharArray();
    }
    public static boolean compare(String s1,char arr[]){
        for(int i=0;i<s1.length();i++){
            char ch=s1.charAt(i);
            if(ch!=arr[i]){
                return false;
            }
        }
        return true;
    }
}
