package problem2562;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		List<Integer> num=new ArrayList<>();
		int count=0;
		int numCount=0;
		for(int i=0;i<9;i++) {
			num.add(sc.nextInt());
		}
		for(int i=0;i<9;i++) {
			if(num.get(i)>count) {
				count=num.get(i);
				numCount=i+1;
			}
		}
		System.out.println(count);
		System.out.println(numCount);
	}

}
