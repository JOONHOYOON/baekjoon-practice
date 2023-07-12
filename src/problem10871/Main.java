package problem10871;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int count=sc.nextInt();
		int check=sc.nextInt();
		List<Integer> num=new ArrayList<>();
		for(int i=0;i<count;i++) {
			num.add(sc.nextInt());
		}
		List<Integer> numCheck=new ArrayList<>();
		for(int a:num) {
			if(check>a) {
				numCheck.add(a);
			}
		}
		for(int i=0;i<numCheck.size();i++) {
			System.out.println(numCheck.get(i));
		}
	}

}
