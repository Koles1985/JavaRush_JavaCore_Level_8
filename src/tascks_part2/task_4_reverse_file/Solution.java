package tascks_part2.task_4_reverse_file;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {

	public Solution() throws IOException{
		BufferedReader reader = new BufferedReader(
				new InputStreamReader(System.in));
		
		String file1 = reader.readLine();
		String file2 = reader.readLine();
		
		reader.close();
		
		FileInputStream input = new FileInputStream(file1);
		FileOutputStream output = new FileOutputStream(file2);
		
		byte[] buffer = input.readAllBytes();
		
		for(int i = buffer.length - 1; i >= 0; i-- ) {
			output.write(buffer[i]);
		}
		
		input.close();
		output.close();
	}

}
