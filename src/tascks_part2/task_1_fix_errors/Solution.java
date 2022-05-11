package tascks_part2.task_1_fix_errors;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Solution {

	public Solution() throws IOException{
		
		FileInputStream inputStream = new FileInputStream(
				"/home/user/Documents/first.txt");
		
		FileOutputStream outputStream = new FileOutputStream(
				"/home/user/Documents/copy.txt");
		
		if(inputStream.read() > 0) {
			byte[] buffer = new byte[inputStream.available()];
			int count = inputStream.read(buffer);
			outputStream.write(buffer, 0, count);
		}
		
		inputStream.close();
		outputStream.close();
		
	}

}
