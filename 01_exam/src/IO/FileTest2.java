package IO;

import java.io.File;
import java.io.IOException;

public class FileTest2 {

	public static void main(String[] args)
	{
		try {
			File file = File.createTempFile("file1", "txt");
			
			if(file.exists())
			{
				System.out.println("파일 생성 완료");
				System.out.println(file.getPath());
			}
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		
	}

}
