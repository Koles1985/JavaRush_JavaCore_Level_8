package tascks_part2.tatsk_2_counting_commas;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {

	public Solution() throws IOException{
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		String fileName = reader.readLine();
		reader.close();
		
		int commaCount = 0;
		try(FileInputStream input = new FileInputStream(fileName)){
			while(input.available() > 0) {
				if(input.read() == 44)
					commaCount++;
			}
		}
		System.out.println(commaCount);
		
	}

}
