package problem10818;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int count=sc.nextInt();
		List<Integer> num=new ArrayList<>();
		for(int i=0;i<count;i++) {
			num.add(sc.nextInt());
		}
		Collections.sort(num);
		System.out.println(num.get(0));
		System.out.println(num.get(count-1));
		
		
		
	}

}
