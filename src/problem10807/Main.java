package problem10807;

import java.util.ArrayList;
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
		int check=sc.nextInt();
		int c=0;
		for(int a:num) {
			if(check==a) {
				c++;
			}
		}
		System.out.println(c);
	}

}
