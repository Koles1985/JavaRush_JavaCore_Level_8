package tasks_part3.task_4_unsuported_filename;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class TtxInputStream extends FileInputStream {

	public TtxInputStream(String name) throws UnsupportedFileNameException, IOException, FileNotFoundException {
		super(name);
		if (!name.endsWith(".txt")) {
			super.close();
			throw new UnsupportedFileNameException();
		}
	}
}
