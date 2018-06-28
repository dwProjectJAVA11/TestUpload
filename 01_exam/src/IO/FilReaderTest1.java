package IO;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class FilReaderTest1 {
	public static void main(String[] args)
	{
		try(Reader reader = new FileReader("d:/temp/test1.txt"))
		{
			int ch;
			while((ch=reader.read()) != -1)
			{
				System.out.print((char)ch);
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
