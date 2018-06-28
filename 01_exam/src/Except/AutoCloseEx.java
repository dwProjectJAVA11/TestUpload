package Except;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class AutoCloseEx {

	public static void main(String[] args) {

		// 개발자가 자원관리
		FileInputStream stream = null;
		
		try
		{
			stream = new FileInputStream("test.txt");
		}
		catch(FileNotFoundException e)
		{
			e.printStackTrace();
		}
		finally
		{
			try
			{
				stream.close();
			}
			catch (IOException e)
			{
				e.printStackTrace();
			}
		}
	}

}
