package Container;

import javax.swing.JFrame;

public class JFrameTest1 {

	public static void main(String[] args)
	{
		// 컨테이너 생성
		JFrame f = new JFrame();
		
		// 사이즈 지정
		f.setSize(300, 400);
		
		f.setTitle("Swing Test");
		
		// JFrame 객체 보이기
		f.setVisible(true);
	}

}
