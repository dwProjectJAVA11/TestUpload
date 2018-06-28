package Event;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.TextField;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.AbstractButton;
import javax.swing.JButton;
import javax.swing.JEditorPane;
import javax.swing.JToggleButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class JToggleTest3 extends JFrame {

	private JPanel contentPane;
	private JToggleButton tglbtn;
	
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
					JToggleTest3 frame = new JToggleTest3();
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
	public JToggleTest3()
	{
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JButton btn = new JButton("New button");
		contentPane.add(btn, BorderLayout.SOUTH);
		
		tglbtn = new JToggleButton("New toggle button");
		contentPane.add(tglbtn, BorderLayout.NORTH);
		
		
		
	}
	
	public void actionperformed(ActionEvent e) {
//		AbstractButton btn1 = (AbstractButton) e.getSource();
//		if(btn1 == btn)
//			btn1.isSelected(){			// 다형성을 이용핵
//		if(btn1 == btn) {
//			TextField.setText();
//		}
//		else
	}

}
