package IO;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class InPutStreamEx {

	public static void main(String[] args)
	{
		InputStream in;		// 바이트 단위의 입력 담당 최상위 추상클래스
		OutputStream out;	// 바이트 단위의 출력 담당 최상위 추상클래스

		in = System.in;		// 키보드로 입력이 들어오는 경우
		out = System.out;	// 모니터로 출력하는 경우

		try
		{
			int input = in.read();
			out.write(input);
			in.close();
			out.close();
		} catch (IOException e)
		{
			e.printStackTrace();
		}
	}

}
