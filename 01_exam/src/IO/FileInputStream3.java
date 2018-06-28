
package IO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class FileInputStream3 {

	public static void main(String[] args)
	{
		// 텍스트 파일에 한글이 있으면 깨지므로 저장 시 인코딩을 UTF-8로 바꿔
		
		// try with Resource
		// 7버전 부터 알아서 자원을 닫아주도록 지원한다.
		// finally안에서 명시적으로  close할 필요가 없다.
		try(InputStream in = new FileInputStream("d:/temp/test1.txt");
				OutputStream out = new FileOutputStream("d:/temp/test15.txt");)
		{
			
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
		
		
		
	}

}
