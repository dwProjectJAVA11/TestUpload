package Component;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import javax.swing.JButton;

public class JRadioButton extends JFrame implements ActionListener{

	private JPanel contentPane;
	private JTextField textField;
	private ButtonGroup grp;

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
					JRadioButton frame = new JRadioButton();
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
	public JRadioButton()
	{
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.NORTH);
		
		JLabel label = new JLabel("선호하는 동물 : ");
		panel.add(label);
		
		textField = new JTextField();
		panel.add(textField);
		textField.setColumns(10);
		
		JPanel panelList = new JPanel();
		contentPane.add(panelList, BorderLayout.CENTER);
		panelList.setLayout(new BoxLayout(panelList, BoxLayout.Y_AXIS));
		
		javax.swing.JRadioButton RadioButton_Cat = new javax.swing.JRadioButton("고양이");
		panelList.add(RadioButton_Cat);
		
		javax.swing.JRadioButton RadioButton_Dog = new javax.swing.JRadioButton("강아지");
		panelList.add(RadioButton_Dog);
		
		javax.swing.JRadioButton RadioButton_Hamster = new javax.swing.JRadioButton("햄스터");
		panelList.add(RadioButton_Hamster);
		
		javax.swing.JRadioButton RadioButton_Rabbit = new javax.swing.JRadioButton("토끼");
		panelList.add(RadioButton_Rabbit);
		
		javax.swing.JRadioButton RadioButton_Penguin = new javax.swing.JRadioButton("펭귄");
		panelList.add(RadioButton_Penguin);
		
		javax.swing.JRadioButton RadioButton_what = new javax.swing.JRadioButton("음");
		panelList.add(RadioButton_what);

		RadioButton_Cat.addActionListener(this);
		RadioButton_Dog.addActionListener(this);
		RadioButton_Hamster.addActionListener(this);
		RadioButton_Rabbit.addActionListener(this);
		RadioButton_Penguin.addActionListener(this);
		RadioButton_what.addActionListener(this);

		grp = new ButtonGroup();
		grp.add(RadioButton_Cat);
		grp.add(RadioButton_Dog);
		grp.add(RadioButton_Hamster);
		grp.add(RadioButton_Penguin);
		grp.add(RadioButton_Rabbit);
		grp.add(RadioButton_what);
		
		JButton Reset = new JButton("선택 초기화");
		Reset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				grp.clearSelection();
				textField.setText("");			}
		});
		panelList.add(Reset);
		
	}

	@Override
	public void actionPerformed(ActionEvent e)
	{
		// 선택된 동물의 이름이 나오게 만들기
//		grp.
		textField.setText(e.getActionCommand());
		
	}

}
