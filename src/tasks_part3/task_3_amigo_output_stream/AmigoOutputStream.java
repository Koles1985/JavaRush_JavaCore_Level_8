package tasks_part3.task_3_amigo_output_stream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;

public class AmigoOutputStream extends FileOutputStream {

	private FileOutputStream component;

	public AmigoOutputStream(FileOutputStream component) throws FileNotFoundException {
		super("sfgsggsg");
		this.component = component;
	}

	@Override
	public void write(int b) throws IOException {
		component.write(b);
	}

	@Override
	public void write(byte[] b) throws IOException {
		component.write(b);
	}

	@Override
	public void write(byte[] b, int off, int len) throws IOException {
		component.write(b, off, len);
	}

	@Override
	public FileChannel getChannel() {
		return component.getChannel();
	}

	@Override
	public void flush() throws IOException {
		component.flush();
	}

	@Override
	public void close() throws IOException {
		flush();
		String text = "\nJavaRush All rights reserved.";
		write(text.getBytes());
		component.close();
	}

}
