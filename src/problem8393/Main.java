package problem8393;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int count=1;
		int sum=0;
		for(int i=0;i<num;i++) {
			sum+=count;
			count++;
		}
		System.out.println(sum);
		
	}

}
