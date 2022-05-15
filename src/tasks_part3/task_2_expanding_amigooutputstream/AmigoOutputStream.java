package tasks_part3.task_2_expanding_amigooutputstream;

import java.io.IOException;

public interface AmigoOutputStream {
	void flush() throws IOException;

	void write(int b) throws IOException;

	void write(byte[] b) throws IOException;

	void write(byte[] b, int off, int len) throws IOException;

	void close() throws IOException;
}
