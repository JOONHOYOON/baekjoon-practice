package problem2884;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int hour=sc.nextInt();
		int minute=sc.nextInt();
		int flag=0;
		flag=minute-45;
		if(flag>=0) {
			System.out.println(hour);
			System.out.println(flag);
		}else if(flag<0&&hour==0) {
			System.out.println(23);
			System.out.println(60+flag);
		}else {
			System.out.println(hour-1);
			System.out.println(60+flag);
		}
	}
}
