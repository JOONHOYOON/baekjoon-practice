package problem9498;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int exam=sc.nextInt();
		if(exam>=90) {
			System.out.println("A");
		}else if(exam>=80) {
			System.out.println("B");
		}else if(exam>=70) {
			System.out.println("C");
		}else if(exam>=60) {
			System.out.println("D");
		}else {
			System.out.println("F");
		}

	}

}
