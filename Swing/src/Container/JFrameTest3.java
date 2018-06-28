package Container;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.border.Border;

public class JFrameTest3 extends JFrame {

	// 보통 이런 식으로 extends JFrame을 사용한다.
	
	public JFrameTest3()
	{
		setSize(300,300);
		setTitle("Hello JAVA");
		
		// 버튼 생성
		JButton btn = new JButton("버튼1");
		JButton btn2 = new JButton("버튼2");
		
		// 버튼 붙이기
		add(btn, BorderLayout.SOUTH);
		add(btn2, BorderLayout.EAST);
		
	}

	public static void main(String[] args)
	{
		EventQueue.invokeLater(new Runnable()
		{
			@Override
			public void run()
			{
				JFrameTest3 f = new JFrameTest3();
				f.setVisible(true);
			}
		});
	}

}
