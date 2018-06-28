package IO;

import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FileTest3 {

	public static void main(String[] args)
	{
		try
		{
			File temp = new File("d:/temp");
			File dir = new File("d:/temp/dir");
			File file1 = new File("d:/temp/file1.txt");
			File file2 = new File("d:/temp/file2.txt");
			File file3 = new File("file3.txt");
			File file4 = new File(new URI("file:///d:/temp/file4.txt"));

			if (!dir.exists())
				dir.mkdirs();

			if (!file1.exists())
				file1.createNewFile();
			
			if (!file2.exists())
				file2.createNewFile();
			
			if (!file3.exists())
				file3.createNewFile();
			
			if (!file4.exists())
				file4.createNewFile();
			
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd a HH:mm");
			System.out.println("날씨	시간	형태	크기	이름");
			
			File contents[] = temp.listFiles();
			for(File f : contents)
			{	
				System.out.println(sdf.format(new Date(f.lastModified())));
				if(f.isDirectory())
					System.out.print("<DIR> "+f.getName());
				else
					System.out.print(f.length() + "\t"+f.getName());
				System.out.println();
			}
		}		

		catch (URISyntaxException e)
		{
			e.printStackTrace();
		} catch (IOException e)
		{
			e.printStackTrace();
		}
	}

}
