package tascks_part2.task_3_file_separation;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {

	public Solution() throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String[] fileNames = new String[3];
		
		for(int i = 0; i < fileNames.length; i++) {
			fileNames[i] = reader.readLine();
		}
		reader.close();
		FileInputStream input = null;
		FileOutputStream output = null;
		try{
			input = new FileInputStream(fileNames[0]);
			output = new FileOutputStream(fileNames[1]);
			
			byte[] buffer = new byte[input.available()];
			System.out.println("buffer length = " + buffer.length);
			int count = input.read(buffer);
			
		
			if(count % 2 != 0) {
				System.out.println(count);
				int halfFile = (count / 2) + 1;
				System.out.println("halfFile = " + halfFile);
				output.write(buffer, 0, halfFile);
				output.close();
				output = new FileOutputStream(fileNames[2]);
				output.write(buffer, halfFile, count - halfFile);
				output.close();	
				input.close();
			}else {
				System.out.println(count);
				int halfFile = count / 2;
				System.out.println("halfFile = " + halfFile);
				output.write(buffer, 0, halfFile);
				output.close();
				output = new FileOutputStream(fileNames[2]);
				output.write(buffer, halfFile, count - halfFile);
				output.close();
				input.close();
			}
		}finally {
			try {
				if(input != null)
					input.close();
				if(output != null)
					output.close();
			}catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

}
