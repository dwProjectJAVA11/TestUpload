
package IO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class BufferedinputStream2 {

	public static void main(String[] args)
	{
		// 그림 파일
		try(FileInputStream in = new FileInputStream("d:/temp/mage.jpg");
				FileOutputStream out = new FileOutputStream("d:/image_copy.jpg");)
		{
			int data;
			byte b[] = new byte[1024];
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
