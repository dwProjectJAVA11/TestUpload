package Component;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JToggleButton;

public class JLabelTest extends JFrame {

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
					JLabelTest frame = new JLabelTest();
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
	public JLabelTest()
	{
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JButton btnNewButton = new JButton("이미지 레이블");
		contentPane.add(btnNewButton, BorderLayout.SOUTH);
		
		JLabel lblNewLabel = new JLabel("New label");
		contentPane.add(lblNewLabel, BorderLayout.CENTER);
		
		ImageIcon icon = new ImageIcon(JLabelTest.class.getResource("/com/sun/java/swing/plaf/windows/icons/Warn.gif"));
		JToggleButton tglbtnNewToggleButton = new JToggleButton("이미지 On/Off");
		
		tglbtnNewToggleButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				e.getSource();
				if(tglbtnNewToggleButton.isSelected())
					lblNewLabel.setIcon(icon);
				else lblNewLabel.setIcon(null);
			}
		});
		contentPane.add(tglbtnNewToggleButton, BorderLayout.NORTH);

		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
								
				lblNewLabel.setIcon(icon);
				
			}
		});
	}

}
