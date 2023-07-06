package problem15552;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	public static void main(String[] args) {
		BufferedReader bfr=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bfw=new BufferedWriter(new OutputStreamWriter(System.out));
		try {		
			int num=bfr.read();
			bfw.write(num);
			for(int i=0;i<num;i++) {
				int num2=bfr.read();
				int num3=bfr.read();
				bfw.write(num2+num3);
			}
			bfw.flush();
			bfw.close();
			
		}catch(IOException e) {
			e.printStackTrace();
		}
		
		
		
	}

}