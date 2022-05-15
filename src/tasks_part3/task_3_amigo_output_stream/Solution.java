package tasks_part3.task_3_amigo_output_stream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Solution {
	private static String fileName = "C:\\Users\\User\\Desktop\\Springs.txt";

	@SuppressWarnings("resource")
	public Solution() throws FileNotFoundException, IOException {
		new AmigoOutputStream(new FileOutputStream(fileName, true)).close();
	}

}
