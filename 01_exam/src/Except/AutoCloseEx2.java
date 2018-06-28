package Except;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class AutoCloseEx2 {

	public static void main(String[] args) {

		// JVM이 자원관리
		//	FileInputStream stream = null;
		try (FileInputStream stream = new FileInputStream("test.txt");
			BufferedInputStream buf = new BufferedInputStream(stream);	) {
		} catch(IOException e)
		{
			e.printStackTrace();
		}
		
	}

}
