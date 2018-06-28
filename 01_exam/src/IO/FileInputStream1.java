
package IO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class FileInputStream1 {

	public static void main(String[] args)
	{
		// 텍스트 파일에 한글이 있으면 깨지므로 저장 시 인코딩을 UTF-8로 바꿔
		InputStream in = null;
		OutputStream out = null;
		
		try
		{
			in = new FileInputStream("d:/temp/test1.txt");
			out = System.out;
			
			int data;
			while ((data = in.read()) != -1)
			{
				out.write(data);
			}

		}
		
		catch (FileNotFoundException e)
		{
			e.printStackTrace();
		}
		
		catch (IOException e)
		{
			e.printStackTrace();
		}
		finally
		{
			try
			{
				in.close();
				out.close();
			}
			
			catch (IOException e)
			{
				e.printStackTrace();
			}
		}
	}

}
