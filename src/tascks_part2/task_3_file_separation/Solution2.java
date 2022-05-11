package tascks_part2.task_3_file_separation;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution2 {

	public Solution2() throws IOException {
		BufferedReader reader = new BufferedReader(
				new InputStreamReader(System.in));
		
		String file1 = reader.readLine();
		String file2 = reader.readLine();
		String file3 = reader.readLine();
		
		reader.close();
		
		FileInputStream  input = new FileInputStream(file1);
		FileOutputStream output1 = new FileOutputStream(file2);
		FileOutputStream output2 = new FileOutputStream(file3);
		
		int halfByteFile = (input.available() + 1) / 2;
		int count = 0;
		while(input.available() > 0) {
			if(count <= halfByteFile) {
				output1.write(input.read());
				count++;
			}else {
				output2.write(input.read());
			}
		}
		input.close();
		output1.close();
		output2.close();		
	}
}
