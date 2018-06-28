package IO;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class InPutStreamEx3 {

	public static void main(String[] args)
	{
		InputStream in;
		OutputStream out;
		
		/// 키보드로부터 입력이 드러오는 경우
		 in = System.in;
		 out = System.out;
		 byte[] b = new byte[100]; 
		 // 컴파일 단계에서 알려주면 체크드 이셉션
		 
		 try {

			 System.out.println("하고 싶은 말 : ");
			 int commandBytes = in.read(b);
			 String str = new String(b,0,commandBytes -2);
			 System.out.println(str);
			 
			 in.close();
			 out.close();
		 }
		 catch(IOException e) {
			 e.printStackTrace();
		 }
		

	}

}
