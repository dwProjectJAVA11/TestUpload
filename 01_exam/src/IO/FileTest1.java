package IO;

import java.io.File;
import java.io.IOException;

public class FileTest1 {

	public static void main(String[] args)
	{
		// 디렉토리 구분 : / or \\
		File file = new File("d:/temp/test2.txt");
		
		if(!file.exists())
		{
			try
			{
				file.createNewFile();	
			} 
			catch (IOException e)
			{
				e.printStackTrace();
			}
		}
		
	}

}
