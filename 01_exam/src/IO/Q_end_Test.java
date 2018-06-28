package IO;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Q_end_Test {

	public static void main(String[] args)
	{
		FileOutputStream out = null;
		try
		{
			out = new FileOutputStream("d:/temp/QendTest.txt");
		} catch (FileNotFoundException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		Scanner sc = new Scanner(System.in);
		String str = new String();

		System.out.println("원하는 문장을 입력하십시오 : ");
		str = sc.nextLine();

		char[] b = new char[1024];

		int index = 0;

		for(int i =0;i<str.length();i++)
		{
			b[i] = str.charAt(i);
		}
		
		while (str.length() < b.length)
		{
			if (b[index] != 'q')
			{
				b[index] = str.charAt(index);
			}
			
			else
			{
				try
				{
					out.close();
					System.exit(0);
				}

				catch (IOException e)
				{ 
					e.printStackTrace();
				}
			}

			try
			{
				System.out.print(b[index]);
				out.write(b[index]);
				index++;
			}

			catch (IOException e)
			{
				e.printStackTrace();
			}
		}
	}
}
