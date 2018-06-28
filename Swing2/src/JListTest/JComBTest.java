package JListTest;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import JListTest.JComBTest;

import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class JComBTest extends JFrame {

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
					JComBTest frame = new JComBTest();
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
	public JComBTest()
	{
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 300, 350);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JLabel img = new JLabel("");
		contentPane.add(img, BorderLayout.CENTER);
		
		JComboBox comboBox = new JComboBox();
		comboBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String str = comboBox.getSelectedItem().toString();
				
				switch(str)
				{
					// => Upsare OJk
				case "Cat" : img.setIcon((new ImageIcon(JComBTest.class.getResource("/javax/swing/plaf/metal/icons/Error.gif"))));
				default : System.out.println("으음");
				}
				
			}
		});
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Bird", "Cat", "Dog", "Pig", "Rabbit"}));
		contentPane.add(comboBox, BorderLayout.NORTH);
	
	}

}