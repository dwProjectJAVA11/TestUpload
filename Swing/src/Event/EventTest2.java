package Event;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;

class MyListener implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent e)
	{
		// 버튼을 클릭하면 '버튼 클릭' 글자가 '버튼 클릭했음' 으로 변경
		//System.out.println(e.getActionCommand());
		//System.out.println(e.getSource());
		JButton btn2 = (JButton)e.getSource();
		
	}
	
}

public class EventTest2 extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args)
	{
		EventQueue.invokeLater(new Runnable()
		{
			public void run()
			{
				try
				{
					EventTest2 frame = new EventTest2();
					frame.setVisible(true);
				} catch (Exception e)
				{
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public EventTest2()
	{
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(new BorderLayout(0, 0));
		
		JButton btn1 = new JButton("버튼 클릭");                              
		
		// 버튼을 클릭하면 일어나는 이벤트를 처리하는 객체 등록
		btn1.addActionListener(new MyListener());
		// btn1.setText("버튼");
		panel.add(btn1, BorderLayout.NORTH);
	}

	class MyListener implements ActionListener
	{

		@Override
		public void actionPerformed(ActionEvent e)
		{
		}
		
	}
	
}
