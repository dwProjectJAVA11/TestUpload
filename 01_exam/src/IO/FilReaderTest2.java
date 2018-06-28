package IO;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;

public class FilReaderTest2 {
	public static void main(String[] args)
	{
		try(Reader reader = new FileReader("d:/temp/test1.txt");
				Writer writer = new FileWriter("d:/temp/test16.txt");)
		{
			int ch;
			while((ch=reader.read()) != -1)
			{
				System.out.print(ch);
			}
		}
		catch(FileNotFoundException e) {
			e.printStackTrace();
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
	}
}
