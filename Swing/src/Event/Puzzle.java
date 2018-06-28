package Event;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import javax.swing.BoxLayout;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.FlowLayout;
import javax.swing.JLabel;
import java.awt.event.ActionListener;

class PuzzleButton extends JButton {
	static int cnt = 0;
	int index;

	public PuzzleButton(String str)
	{
		super(str);
		index = cnt++;
	}
}

public class Puzzle extends JFrame implements ActionListener {

	private JPanel contentPane;
	private PuzzleButton btn[] = new PuzzleButton[9];

	public static void main(String[] args)
	{
		EventQueue.invokeLater(new Runnable()
		{
			public void run()
			{
				try
				{
					Puzzle frame = new Puzzle();
					frame.setVisible(true);
				} catch (Exception e)
				{
					e.printStackTrace();
				}
			}
		});
	}

	public Puzzle()
	{
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));

		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(new GridLayout(0, 3, 0, 0));

		for (int i = 0; i < btn.length; i++)
		{
			btn[i] = new PuzzleButton((i + 1) + "");
		}

		btn[8] = new PuzzleButton("");
		btn[8].index = 8;

		for (int i = 0; i < btn.length; i++)
		{
			panel.add(btn[i]);
			btn[i].addActionListener(this);
		}

		JButton btnReset = new JButton("Reset");
		btnReset.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{

				for (int i = 0; i < btn.length; i++)
				{
					if (i != 8)
						btn[i].setText("" + (i + 1));
					else
						btn[i].setText("");
				}

			}
		});
		contentPane.add(btnReset, BorderLayout.SOUTH);

	}

	public void actionPerformed(ActionEvent e)
	{
		PuzzleButton p = (PuzzleButton) e.getSource();

		int rNum = p.index + 1;
		// 내가 선택한 값

		if (rNum >= 1 && rNum <= 9)
		{
			if (rNum % 3 == 1) // 오른쪽만 검사
			{
				if (btn[rNum].getText().equals("")) // 오른쪽
				{
					btn[rNum].setText(btn[rNum - 1].getText());
					btn[rNum - 1].setText("");
				}

				else if (btn[rNum - 1].index > 1 && btn[rNum - 4].getText().equals("")) // 위
				{
					btn[rNum - 4].setText(btn[rNum - 1].getText());
					btn[rNum - 1].setText("");
				}

				else if (btn[rNum - 1].index < 7 && btn[rNum + 2].getText().equals("")) // 아래
				{
					btn[rNum + 2].setText(btn[rNum - 1].getText());
					btn[rNum - 1].setText("");
				}

				else
				{

				}
			}

			else if (rNum % 3 == 2) // 왼쪽과 오른쪽 위 아래 검사
			{
				if (btn[rNum].getText().equals("")) // 오른쪽
				{
					btn[rNum].setText(btn[rNum - 1].getText());
					btn[rNum - 1].setText("");
				}

				else if (btn[rNum - 2].getText().equals("")) // 왼쪽
				{
					btn[rNum - 2].setText(btn[rNum - 1].getText());
					btn[rNum - 1].setText("");
				}

				else if (btn[rNum - 1].index > 1 && btn[rNum - 4].getText().equals("")) // 위
				{
					btn[rNum - 4].setText(btn[rNum - 1].getText());
					btn[rNum - 1].setText("");
				}

				else if (btn[rNum].index < 7 && btn[rNum + 2].getText().equals("")) // 아래
				{
					btn[rNum + 2].setText(btn[rNum - 1].getText());
					btn[rNum - 1].setText("");
				}

				else
				{

				}

			}

			else if (rNum % 3 == 0) // 왼쪽만 검사
			{
				if (btn[rNum - 2].getText().equals("")) // 왼쪽
				{
					btn[rNum - 2].setText(btn[rNum - 1].getText());
					btn[rNum - 1].setText("");
				}

				else if (btn[rNum - 1].index > 4 && btn[rNum - 4].getText().equals("")) // 위
				{
					btn[rNum - 4].setText(btn[rNum - 1].getText());
					btn[rNum - 1].setText("");
				}

				else if (btn[rNum].index < 9 && btn[rNum + 2].getText().equals("")) // 아래
				{
					btn[rNum + 2].setText(btn[rNum - 1].getText());
					btn[rNum - 1].setText("");
				}

			}

		}

	}

}
