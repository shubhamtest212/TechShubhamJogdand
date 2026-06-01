/*
 * package Practices_Codes;
 * 
 * import java.util.Scanner;
 * 
 * // write a program to remove the duplicate characters from the given string
 * 
 * public class Java_Interview_Question_3 {
 * 
 * public static String removeDuplicateChar(String str) { String result = "";
 * 
 * for(int i = 0; i<str.length(); i++) { int count =0; if(str.charAt(i)!='') {
 * for(int j=i+1;j<str.length(); j++) { if(str.charAt(i)==str.charAt(j) &&
 * (i!=j)) { count++; } }
 * 
 * if(count=0) { result +=str.charAt(i); } } } return result; }
 * 
 * public static void main(String[] args) {
 * 
 * Scanner sc = new Scanner(System.in); System.out.println("Enter string: ");
 * String str = sc.nextLine();
 * 
 * System.out.println(removeDuplicateChar(str)); sc.close();
 * 
 * }
 * 
 * }
 */