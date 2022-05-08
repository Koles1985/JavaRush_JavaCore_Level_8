package task_4_rarest_bytes;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Solution {

	public Solution() {
		String filePath = null;
		try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
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

		int minCount = Integer.MAX_VALUE;
		for (int i = 0; i < byteArray.length; i++) {
			if (byteArray[i] < minCount && byteArray[i] > 0) {
				minCount = byteArray[i];
			}
		}

		List<Integer> rarestBytes = new ArrayList<>();
		for (int i = 0; i < byteArray.length; i++) {
			if (byteArray[i] == minCount) {
				rarestBytes.add(i);
			}
		}

		for (int i : rarestBytes) {
			char ch = (char) i;
			System.out.print(i + " - " + ch + " .");
		}
	}

}
