package problem9086;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		for(int i=0;i<num;i++) {
			String word=sc.next();
			String[] split=word.split("");
			System.out.println(split[0]+split[split.length-1]);
		}
	}

}
