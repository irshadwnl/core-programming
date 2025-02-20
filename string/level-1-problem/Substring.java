/*Write a program to create a substring from a String
 using the charAt() method. Also, use the String
 built-in method substring() to find the substring 
 of the text. Finally Compare the the two strings 
 and display the results
 */

import java.util.Scanner;

public class Substring {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s1=sc.next();
        sc.close();
        for(int i=0;i<s1.length();i++){
            String s=calculateSubstring(s1,i);
            System.out.println(s+" ");
        }

    }
    public static String calculateSubstring(String s1,int i){
        return s1.substring(0,i+1);
    }

}
