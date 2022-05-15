package tascks_part2.task_5_download_exception;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {

	public Solution() throws IOException {
		BufferedReader reader = new BufferedReader(
				new InputStreamReader(System.in));
		
		String fileName = null;
		
		FileInputStream input = null;  
		try {
			boolean flag = true;
			do {
				fileName = reader.readLine();
				input = new FileInputStream(fileName);
				if(input.available() < 1000) {
					flag = false;
					throw new DownloadException();
				}
					
			}while(flag);
			
		}catch(DownloadException e) {
			e.printStackTrace();
		}finally {
			System.out.println("Finally");
			try {
				if(input != null) {
					input.close();
				}
				if(reader != null) {
					reader.close();
				}
				
			}catch(IOException e) {
				e.printStackTrace();
			}
		}
		
	}

}
