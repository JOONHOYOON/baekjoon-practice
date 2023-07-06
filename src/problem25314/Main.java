package problem25314;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		String text="";
		for(int i=0;i<num/4;i++) {
			text+="long "; 
		}
		text+="int";
		System.out.println(text);
	}

}
