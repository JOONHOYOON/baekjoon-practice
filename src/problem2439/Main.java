package problem2439;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int count=sc.nextInt();
		for(int i=0;i<count;i++) {
			for(int j=0;j<count-i-1;j++) {
				System.out.print(" ");
			}
			for(int k=0;k<i+1;k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
