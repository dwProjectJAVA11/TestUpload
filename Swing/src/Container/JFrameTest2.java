package Container;

import java.awt.EventQueue;

import javax.swing.JFrame;

public class JFrameTest2 {

	public static void main(String[] args)
	{
		EventQueue.invokeLater(new Runnable() {
			@Override
			public void run() {
				createandShowGUI();
			}
		});
	}

	private static void createandShowGUI()
	{
		JFrame f = new JFrame();

		f.setSize(300, 400);
		f.setTitle("Swing Test");
		f.setVisible(true);
	}

}
