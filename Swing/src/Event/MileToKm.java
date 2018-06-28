package Event;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JSeparator;
import javax.swing.JButton;
import java.awt.FlowLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MileToKm extends JFrame {

	private JPanel contentPane;
	private JTextField FieldInsertmile;
	private JTextField result;

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
					MileToKm frame = new MileToKm();
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
	public MileToKm()
	{
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JLabel LabelInsertMile = new JLabel("거리를 마일 단위로 입력하세요");
		contentPane.add(LabelInsertMile);
		
		FieldInsertmile = new JTextField();
		contentPane.add(FieldInsertmile);
		FieldInsertmile.setColumns(10);
		
		JButton btnNewButton = new JButton("변환");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int mile = Integer.parseInt(FieldInsertmile.getText());
				
				int km = (int)(mile*1.6);
				result.setText(km+"");
			}
		});
		contentPane.add(btnNewButton);
		
		result = new JTextField();
		contentPane.add(result);
		result.setColumns(10);
	}

}