package IO;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class BUfferedinputStream {

	public static void main(String[] args)
	{
		try(FileInputStream in = new FileInputStream("d:/temp/MUSIC.mp3");
				FileOutputStream out = new FileOutputStream("d:/temp/MUSIC_copy.mp3");)
		{
			int data;
			while((data = in.read()) != -1)
				out.write(data);
		}
		catch(FileNotFoundException e)
		{
			e.printStackTrace();
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
	}

}
