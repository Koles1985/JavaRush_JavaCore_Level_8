package task_3_most_frequent_bytes;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Solution2 {

	public Solution2() {

		String filePath = null;
		try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));) {
			filePath = reader.readLine();
		} catch (IOException e) {
			e.printStackTrace();
		}
		int[] byteArray = new int[256];
		try (FileInputStream inputStream = new FileInputStream(filePath)) {
			while (inputStream.available() > 0) {
				byteArray[inputStream.read()] += 1;
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

		int maxCount = 0;
		for (int i = 0; i < byteArray.length; i++) {
			if (byteArray[i] > maxCount)
				maxCount = byteArray[i];
		}

		List<Integer> regularByte = new ArrayList<>();
		for (int i = 0; i < byteArray.length; i++) {
			if (byteArray[i] == maxCount)
				regularByte.add(i);
		}

		for (int i : regularByte) {
			char ch = (char) i;
			System.out.println(i + " - " + ch);
		}

		char symbol = 32;
		System.out.println("Символ = " + symbol);

	}

}
