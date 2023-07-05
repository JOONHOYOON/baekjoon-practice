package problem2525;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int hour=sc.nextInt();
		int minute=sc.nextInt();
		int time=sc.nextInt();
		int plusHour=(time+minute)/60;
		int plusminute=(time+minute)%60;
		if(plusHour>0&&hour+plusHour>=24) {
			System.out.println(hour+plusHour-24);
			System.out.println(plusminute);
		}else if(plusHour>0) {
			System.out.println(hour+plusHour);
			System.out.println(plusminute);
		}else {
			System.out.println(hour);
			System.out.println(plusminute);
		}
	}

}
