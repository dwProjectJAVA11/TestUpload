
package IO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class BufferedinputStream4 {

	public static void main(String[] args)
	{
		// 그림 파일
		try(FileInputStream in = new FileInputStream("d:/temp/MUSIC.mp3");
				FileOutputStream out = new FileOutputStream("d:/temp/MUSIC_copy.mp3");)
		{
			int data;
			byte b[] = new byte[4096];
			long start = System.currentTimeMillis();
			
//			while((data = in.read()) != -1)
//				out.write(data);
			while((data = in.read(b)) != -1)
				out.write(b);

			long end = System.currentTimeMillis();
			System.out.println("걸린 시간 : " + (end - start));
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
