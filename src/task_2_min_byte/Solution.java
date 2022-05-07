package task_2_min_byte;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {

	public Solution() {
		System.out.println(getMinByteFromFile(getFileName()));
	}
	
	private String getFileName() {
		String fileName = null;
		try(BufferedReader reader = new BufferedReader(
				new InputStreamReader(System.in))){
			fileName = reader.readLine();
		}catch(IOException e) {
			e.printStackTrace();
		}
		
		return fileName;
	}
	
	private int getMinByteFromFile(String fileName) {
		int minByte = Integer.MAX_VALUE;
		try(FileInputStream input = new FileInputStream(fileName)){
			while(input.available() > 0) {
				int temp = input.read();
				if(temp < minByte) minByte = temp;
			}
		}catch(IOException e) {
			e.printStackTrace();
		}
		return minByte;
	}

}
