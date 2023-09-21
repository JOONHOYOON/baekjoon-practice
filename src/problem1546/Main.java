package problem1546;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		double[] score=new double[num];
		for(int i=0;i<num;i++) {
			score[i]=sc.nextDouble();
		}
		double max=score[0];
		for(int i=0;i<score.length;i++) {
			if(score[i]>max) {
				max=score[i];
			}
		}
		for(int i=0;i<score.length;i++) {
			score[i]=(score[i]/max)*100;
		}
		double sum=0;
		for(int i=0;i<score.length;i++) {
			sum+=score[i];
		}
		System.out.println(sum/num);
		
	}

}
