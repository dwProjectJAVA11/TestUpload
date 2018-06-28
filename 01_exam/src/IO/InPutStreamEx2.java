package IO;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class InPutStreamEx2 {

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
			 while(in.read(b)!= -1)	// 파일의 끝 : -1
				 out.write(b);
			 int input = in.read();
			 out.write(input);
			 
			 in.close();
			 out.close();
		 }
		 catch(IOException e) {
			 e.printStackTrace();
		 }
		

	}

}
