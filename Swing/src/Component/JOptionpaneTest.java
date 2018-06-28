package Component;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;

public class JOptionpaneTest extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JButton btnConfirm, btnMsg, btnInput, btnOpt;

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
					JOptionpaneTest frame = new JOptionpaneTest();
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
	public JOptionpaneTest()
	{
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));

		btnConfirm = new JButton("confirm");
		contentPane.add(btnConfirm);

		btnMsg = new JButton("message");
		contentPane.add(btnMsg);

		btnInput = new JButton("input");
		contentPane.add(btnInput);

		btnOpt = new JButton("option");
		contentPane.add(btnOpt);

		btnConfirm.addActionListener(this);
		btnMsg.addActionListener(this);
		btnInput.addActionListener(this);
		btnOpt.addActionListener(this);

	}

	@Override
	public void actionPerformed(ActionEvent e)
	{
		JButton btn = (JButton) e.getSource();

		if (btn == btnConfirm)
		{
			JOptionPane.showConfirmDialog(this, "냥냥", "대화상자", JOptionPane.CLOSED_OPTION,
					JOptionPane.INFORMATION_MESSAGE);
		}

		else if (btn == btnMsg)
		{
			ImageIcon icon = new ImageIcon(
					JOptionpaneTest.class.getResource("/javax/swing/plaf/metal/icons/Inform.gif"));
			JOptionPane.showMessageDialog(this, "사용자에게 하고 싶은 말", "제목", JOptionPane.QUESTION_MESSAGE, icon);
		}

		else if (btn == btnInput)
		{
			String value[] = { "수박", "복숭아", "사과" };
			JOptionPane.showInputDialog(this, "입력하세요 : ", "InputWindows", JOptionPane.QUESTION_MESSAGE, null, value,
					value[2]);

		}

		else if (btn == btnOpt)
		{
			String option[] = { "Well-Done", "Medium", "Rare" };
			int returnValue = (JOptionPane.showOptionDialog(this, "스테이크를 어떻게 요리할까요?", "Steak",
					JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, option, option[0]));
			System.out.println(option[returnValue]);
		}

	}
}
