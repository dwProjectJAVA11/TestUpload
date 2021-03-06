package Layout;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.GridLayout;
import javax.swing.JTextField;
import java.awt.FlowLayout;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JTabbedPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class JFrameTabbedLayoutTest extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;

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
					JFrameTabbedLayoutTest frame = new JFrameTabbedLayoutTest();
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
	public JFrameTabbedLayoutTest()
	{
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		contentPane.add(tabbedPane, BorderLayout.CENTER);
		
		JPanel 회원등록 = new JPanel();
		tabbedPane.addTab("회원등록", null, 회원등록, null);
		회원등록.setLayout(new BorderLayout(0, 0));
		
		JPanel Button_등록 = new JPanel();
		회원등록.add(Button_등록, BorderLayout.SOUTH);
		
		JButton btnNewButton = new JButton("등록");
		Button_등록.add(btnNewButton);
		
		JPanel Panel_Info = new JPanel();
		회원등록.add(Panel_Info, BorderLayout.CENTER);
		Panel_Info.setLayout(new GridLayout(0, 2, 0, 0));
		
		JLabel lblNewLabel = new JLabel("이름");
		Panel_Info.add(lblNewLabel);
		
		textField = new JTextField();
		Panel_Info.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("생년월일");
		Panel_Info.add(lblNewLabel_1);
		
		textField_1 = new JTextField();
		Panel_Info.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("주소");
		Panel_Info.add(lblNewLabel_2);
		
		textField_2 = new JTextField();
		Panel_Info.add(textField_2);
		textField_2.setColumns(10);
		
		JPanel 회원조회 = new JPanel();
		tabbedPane.addTab("회원조회", null, 회원조회, null);
		회원조회.setLayout(new BorderLayout(0, 0));
		
		JPanel Panel_조회 = new JPanel();
		회원조회.add(Panel_조회, BorderLayout.NORTH);
		
		textField_6 = new JTextField();
		Panel_조회.add(textField_6);
		textField_6.setColumns(10);
		
		JButton btnNewButton_1 = new JButton("조회");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		Panel_조회.add(btnNewButton_1);
		
		JPanel panel_7 = new JPanel();
		회원조회.add(panel_7, BorderLayout.CENTER);
		panel_7.setLayout(new GridLayout(0, 2, 0, 0));
		
		JLabel label = new JLabel("이름");
		panel_7.add(label);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		panel_7.add(textField_3);
		
		JLabel label_1 = new JLabel("생년월일");
		panel_7.add(label_1);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		panel_7.add(textField_4);
		
		JLabel label_2 = new JLabel("주소");
		panel_7.add(label_2);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		panel_7.add(textField_5);
		
		JPanel 회원수정 = new JPanel();
		tabbedPane.addTab("회원수정", null, 회원수정, null);
		회원수정.setLayout(new GridLayout(1, 0, 0, 0));
		
		JPanel panel_8 = new JPanel();
		회원수정.add(panel_8);
		panel_8.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_9 = new JPanel();
		panel_8.add(panel_9, BorderLayout.NORTH);
		
		JLabel label_3 = new JLabel("수정 회원 정보 입력");
		panel_9.add(label_3);
		
		JPanel panel_10 = new JPanel();
		panel_8.add(panel_10, BorderLayout.CENTER);
		
		JLabel lblNewLabel_3 = new JLabel("No:");
		panel_10.add(lblNewLabel_3);
		
		textField_7 = new JTextField();
		panel_10.add(textField_7);
		textField_7.setColumns(25);
		
		JLabel label_4 = new JLabel("주소");
		panel_10.add(label_4);
		
		textField_8 = new JTextField();
		panel_10.add(textField_8);
		textField_8.setColumns(20);
		
		JPanel panel_11 = new JPanel();
		panel_8.add(panel_11, BorderLayout.SOUTH);
		
		JButton button = new JButton("수정");
		panel_11.add(button);
		
		JPanel 회원삭제 = new JPanel();
		tabbedPane.addTab("회원삭제", null, 회원삭제, null);
		회원삭제.setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		회원삭제.add(panel, BorderLayout.NORTH);
		
		JLabel label_5 = new JLabel("삭제할 회원 정보 입력");
		panel.add(label_5);
		
		JPanel panel_1 = new JPanel();
		회원삭제.add(panel_1, BorderLayout.CENTER);
		
		JLabel lblNewLabel_4 = new JLabel("No:");
		panel_1.add(lblNewLabel_4);
		
		textField_9 = new JTextField();
		panel_1.add(textField_9);
		textField_9.setColumns(10);
		
		JButton btnNewButton_2 = new JButton("삭제");
		panel_1.add(btnNewButton_2);
	}

}
