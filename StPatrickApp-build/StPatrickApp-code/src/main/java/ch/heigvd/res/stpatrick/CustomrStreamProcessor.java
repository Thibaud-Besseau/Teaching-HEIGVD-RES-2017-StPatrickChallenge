package ch.heigvd.res.stpatrick;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;


class CustomStreamProcessor implements IStreamProcessor {

	public CustomStreamProcessor(char letterToRemove)
	{
		this.letterToRemove= letterToRemove;

	}

	public void process(Reader in, Writer out) throws IOException {
		BufferedReader br = new BufferedReader(in);
		BufferedWriter bw = new BufferedWriter(out);
		int c = br.read();
		while (c != -1) {
			char temp=(char)c;
			if(temp!=Character.toUpperCase(letterToRemove) && temp!=letterToRemove)
			{
				bw.write(c);
			}

			c = br.read();
		}
		bw.flush();
	}

	private char letterToRemove;

}