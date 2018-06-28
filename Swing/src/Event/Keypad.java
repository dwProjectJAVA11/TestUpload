package Event;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import java.awt.FlowLayout;
import javax.swing.BoxLayout;

public class Keypad extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JTextField textField;

	String result = "";
	
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
					Keypad frame = new Keypad();
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
	public Keypad()
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
		
		textField = new JTextField();
		textField.setText("");
		panel.add(textField, BorderLayout.NORTH);
		textField.setColumns(10);
		
		JPanel panel_1 = new JPanel();
		panel.add(panel_1, BorderLayout.CENTER);
		panel_1.setLayout(new GridLayout(0, 3, 0, 0));
		
		JButton num1 = new JButton("1");
		num1.addActionListener(this);
		panel_1.add(num1);
		
		JButton num2 = new JButton("2");
		num2.addActionListener(this);
		panel_1.add(num2);
		
		JButton num3 = new JButton("3");
		num3.addActionListener(this);
		panel_1.add(num3);
		
		JButton num4 = new JButton("4");
		num4.addActionListener(this);
		panel_1.add(num4);
		
		JButton num5 = new JButton("5");
		num5.addActionListener(this);
		panel_1.add(num5);
		
		JButton num6 = new JButton("6");
		num6.addActionListener(this);
		panel_1.add(num6);
		
		JButton num7 = new JButton("7");
		num7.addActionListener(this);
		panel_1.add(num7);
		
		JButton num8 = new JButton("8");
		num8.addActionListener(this);
		panel_1.add(num8);
		
		JButton num9 = new JButton("9");
		num9.addActionListener(this);
		panel_1.add(num9);
	}

	@Override
	public void actionPerformed(ActionEvent e)
	{
		result += e.getActionCommand();
		textField.setText(result);
	}

}
