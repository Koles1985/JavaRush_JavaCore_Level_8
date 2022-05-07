package task_3_most_frequent_bytes;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution {

	public Solution() {
		System.out.println(findMostFrequentBytes
				(fromArrayToMap
						(getBuffer
								(getFileName())
								)
						)
				.toString());
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
	
	private int[] getBuffer(String fileName) {
		int[] buffer = null;
		try(FileInputStream input = new FileInputStream(fileName)){
			 buffer = new int[input.available()];
			int i = 0;
			while(input.available() > 0) {
				buffer[i] = input.read();
				i++;
			}
		}catch(IOException e) {
			e.printStackTrace();
		}
		
		return buffer;
	}
	
	
	private Map<Integer, Integer> fromArrayToMap(int[] buffer) {
		
		Map<Integer, Integer> bytes = new HashMap<>();
		for(int i = 0; i < buffer.length; i++) {
			Integer temp = 0;
			if((temp = bytes.put(buffer[i], 1)) != null){
				temp += 1;
				bytes.put(buffer[i], temp);
			}
		}
		
		return bytes;
	}
	
	private List<Integer> findMostFrequentBytes(Map<Integer, Integer> map) {
		int maxValue = 0;
		for(Map.Entry<Integer, Integer> entry : map.entrySet()) {
			if(entry.getValue().intValue() > maxValue) {
				maxValue = entry.getValue().intValue();
			}
		}
		List<Integer> frequentBytes = new ArrayList<>();
		for(Map.Entry<Integer, Integer> entry : map.entrySet()) {
			if(entry.getValue().intValue() == maxValue) {
				frequentBytes.add(entry.getKey());
			}
		}
		
		return frequentBytes;
	}

}
