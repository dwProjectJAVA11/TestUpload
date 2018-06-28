
package IO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class FileInputStream5 {

	public static void main(String[] args)
	{
		// 음악파일
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
