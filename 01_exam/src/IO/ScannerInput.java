package IO;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ScannerInput {

	public static void main(String[] args)
	{
		FileWriter writer = null;
		Scanner sc = new Scanner(System.in);
		String str = "";
		
		try {
			writer = new FileWriter("d:/temp/testscanner.txt",true);
				do {
					str += sc.nextLine()+"\r\n";
				}while(!str.contains("q"));
				
				writer.write(str);
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		finally {
			sc.close();

			try
			{
				writer.close();
			} catch (IOException e)
			{
				e.printStackTrace();
			}
		}
	}

}
