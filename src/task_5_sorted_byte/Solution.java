package task_5_sorted_byte;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Set;
import java.util.TreeSet;

public class Solution {

	public Solution() {
		String fileName = null;
		try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
			fileName = reader.readLine();
		} catch (IOException e) {
			e.printStackTrace();
		}
		Set<Integer> resultSet = new TreeSet<>();
		try (FileInputStream input = new FileInputStream(fileName)) {
			while (input.available() > 0) {
				resultSet.add(input.read());
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

		System.out.println(resultSet);
	}

}
