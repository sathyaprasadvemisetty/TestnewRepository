package practice;

import java.util.Scanner;

public class RemoveSpaces {
	
public static void removeSpacetest(String s){
		String []arr = s.split(" ");
		String newstring ="";
		for(int i=0;i<arr.length;i++)
		{
			newstring = newstring+arr[i];
		}
	 System.out.println(newstring);
	}
	

	public static void main(String[] args) {
		System.out.println("Enter string:");
		Scanner sc = new Scanner(System.in);
		String sent = sc.nextLine();
		removeSpacetest(sent);
	}

}
