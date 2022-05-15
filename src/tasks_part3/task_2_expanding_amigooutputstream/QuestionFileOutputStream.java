package tasks_part3.task_2_expanding_amigooutputstream;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class QuestionFileOutputStream implements AmigoOutputStream {

	private AmigoOutputStream component;
	private BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

	public QuestionFileOutputStream(AmigoOutputStream component) {
		this.component = component;

	}

	@Override
	public void flush() throws IOException {
		component.flush();

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
	public void close() throws IOException {
		System.out.println("Вы действительно хотите закрыть поток! Д/Н");
		String choise = reader.readLine();
		if (choise.equals("Д")) {
			component.close();
		}

	}

}
