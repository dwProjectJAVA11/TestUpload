package IO;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;

public class BufferedReaderTest1 {

	public static void main(String[] args)
	{
		try (	Reader in = new FileReader("d:/temp/test1.txt");
				BufferedReader reader = new BufferedReader(in);
				Writer out = new FileWriter("d:/temp/test18.txt");
				BufferedWriter writer = new BufferedWriter(out);)
		{
			String str;
			while((str = reader.readLine())!= null)
				writer.write(str+"\r\n");
			
		}
		catch(FileNotFoundException e) {
			e.printStackTrace();
		}
		catch(IOException e) {
			e.printStackTrace();
		}
	}

}
