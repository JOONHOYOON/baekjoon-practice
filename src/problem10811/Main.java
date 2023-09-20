package problem10811;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int box=sc.nextInt();
		int[] boxNum=new int[box];
		for(int i=0;i<box;i++) {
			int a=i+1;
			boxNum[i]=a;
		}
		int num=sc.nextInt();
		for(int i=0;i<num;i++) {
			int first=sc.nextInt();
			int second=sc.nextInt();
			first--;
			second--;
			for(int j=0;j<(second-first+1)/2;j++) {
				int stop=boxNum[second-j];
				boxNum[second-j]=boxNum[first+j];
				boxNum[first+j]=stop;
			}
		}
		for(int i=0;i<box;i++) {
			System.out.print(boxNum[i]);
			System.out.print(" ");
		}
	}

}
