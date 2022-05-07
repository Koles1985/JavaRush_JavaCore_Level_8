package task_1_max_byte;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class Solution {
	
	public Solution() {
		System.out.println(getMaxByteFromFile(getFileName()));
	}
	
	private String getFileName() {
		String fileName = null;
		try(Scanner scanner = new Scanner(System.in)){
			fileName = scanner.nextLine();
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		return fileName;
	}
	
	private int getMaxByteFromFile(String pathFile) {
		FileInputStream input = null;
		int maxByte = 0;
		try {
			input = new FileInputStream(pathFile);
			while(input.available() > 0) {
				int temp = input.read();
				if (temp > maxByte) {
					maxByte = temp;
				}
			}
		}catch(IOException e) {
			e.printStackTrace();
		}finally {
			if(input != null)
				try {
					input.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
		}
		
		return maxByte;
		 
	}

}
