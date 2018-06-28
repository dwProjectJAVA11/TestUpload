package Event;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import org.omg.CORBA.COMM_FAILURE;

import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class RockSicsPaper extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JTextField textField;

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
					RockSicsPaper frame = new RockSicsPaper();
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
	public RockSicsPaper()
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
		panel.add(textField, BorderLayout.SOUTH);
		textField.setColumns(10);

		JPanel panel_1 = new JPanel();
		panel.add(panel_1, BorderLayout.CENTER);
		panel_1.setLayout(new GridLayout(1, 0, 0, 0));

		JButton Rock = new JButton("Rock");
		Rock.addActionListener(this);
		panel_1.add(Rock);

		JButton Paper = new JButton("Paper");
		Paper.addActionListener(this);
		panel_1.add(Paper);

		JButton Scissors = new JButton("Scissors");
		Scissors.addActionListener(this);
		panel_1.add(Scissors);
	}

	@Override
	public void actionPerformed(ActionEvent e)
	{
		String ComputerTurn = "";
		String MyTurn = e.getActionCommand();

		int ComputerTurnNum = (int) (Math.random() * 3);

		switch (ComputerTurnNum)
		{
		case 0:
			ComputerTurn = "Rock";
			break;
		case 1:
			ComputerTurn = "Paper";
			break;
		case 2:
			ComputerTurn = "Scissors";
			break;
		}

		if (MyTurn.equals("Rock"))
		{
			if (ComputerTurn.equals("Rock"))
				textField.setText("Computer is " + ComputerTurn.toString() + "	-> " + "Drew");

			else if (ComputerTurn.equals("Paper"))
				textField.setText("Computer is " + ComputerTurn.toString() + "	-> " + "You Lose");

			else if (ComputerTurn.equals("Scissors"))
				textField.setText("Computer is " + ComputerTurn.toString() + "	-> " + "You Win");

		}

		else if (MyTurn.equals("Paper"))
		{
			if (ComputerTurn.equals("Rock"))
				textField.setText("Computer is " + ComputerTurn.toString() + "	-> " + "You Win");

			else if (ComputerTurn.equals("Paper"))
				textField.setText("Computer is " + ComputerTurn.toString() + "	-> " + "Drew");

			else if (ComputerTurn.equals("Scissors"))
				textField.setText("Computer is " + ComputerTurn.toString() + "	-> " + "You Lose");

		}

		else if (MyTurn.equals("Scissors"))
		{
			if (ComputerTurn.equals("Rock"))
				textField.setText("Computer is " + ComputerTurn.toString() + "	-> " + "You Lose");

			else if (ComputerTurn.equals("Paper"))
				textField.setText("Computer is " + ComputerTurn.toString() + "	-> " + "You Win");

			else if (ComputerTurn.equals("Scissors"))
				textField.setText("Computer is " + ComputerTurn.toString() + "	-> " + "Drew");

		}
	}

}
