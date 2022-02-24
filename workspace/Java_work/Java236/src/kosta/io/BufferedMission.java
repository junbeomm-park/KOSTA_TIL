package kosta.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.InputStreamReader;

public class BufferedMission {

	public static void main(String[] args) {
		
		BufferedReader br = null;
		BufferedWriter bw = null;
		
		try {
			br = new BufferedReader(new FileReader("output.txt"));
			bw = new BufferedWriter(new FileWriter("copy.txt"));
			
			String str;
			while((str = br.readLine()) != null) {
				
				bw.write(str);
			}
					
		
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				bw.close();
				br.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
	}
}
