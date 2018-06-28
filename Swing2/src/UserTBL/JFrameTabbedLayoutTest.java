package UserTBL;

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
import java.text.SimpleDateFormat;
import java.util.Date;
import java.awt.event.ActionEvent;

public class JFrameTabbedLayoutTest extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JTextField tabJoin_txtName;
	private JTextField tabJoin_txtBirth;
	private JTextField tabJoin_txtAddr;
	
	private JTextField tabFind_txtNum;
	private JTextField tabFind_txtName;
	private JTextField tabFind_txtBirth;
	private JTextField tabFind_txtAddr;
	private JTextField tabMod_txtNum;
	private JTextField textField_8;
	private JTextField tabDel_txtNum;

	private JButton btnJoin;
	private JButton btnMod;
	private JButton btnFind;
	private JButton btnDel;

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

		JPanel tabJoinMember = new JPanel();
		tabbedPane.addTab("회원등록", null, tabJoinMember, null);
		tabJoinMember.setLayout(new BorderLayout(0, 0));

		JPanel btnJoinMem = new JPanel();
		tabJoinMember.add(btnJoinMem, BorderLayout.SOUTH);

		btnJoin = new JButton("등록");
		btnJoinMem.add(btnJoin);

		JPanel panelJoinMember = new JPanel();
		tabJoinMember.add(panelJoinMember, BorderLayout.CENTER);
		panelJoinMember.setLayout(new GridLayout(0, 2, 0, 0));

		JLabel lblNewLabel = new JLabel("이름");
		panelJoinMember.add(lblNewLabel);

		tabJoin_txtName = new JTextField();
		panelJoinMember.add(tabJoin_txtName, BorderLayout.CENTER);
		tabJoin_txtName.setColumns(10);

		JLabel lblNewLabel_1 = new JLabel("생년월일");
		panelJoinMember.add(lblNewLabel_1);

		tabJoin_txtBirth = new JTextField();
		panelJoinMember.add(tabJoin_txtBirth);
		tabJoin_txtBirth.setColumns(10);

		JLabel lblNewLabel_2 = new JLabel("주소");
		panelJoinMember.add(lblNewLabel_2);

		tabJoin_txtAddr = new JTextField();
		panelJoinMember.add(tabJoin_txtAddr);
		tabJoin_txtAddr.setColumns(10);

		JPanel tabFindMem = new JPanel();
		tabbedPane.addTab("회원조회", null, tabFindMem, null);
		tabFindMem.setLayout(new BorderLayout(0, 0));

		JPanel panelFind = new JPanel();
		tabFindMem.add(panelFind, BorderLayout.NORTH);

		tabFind_txtNum = new JTextField();
		panelFind.add(tabFind_txtNum);
		tabFind_txtNum.setColumns(10);

		btnFind = new JButton("조회");
		panelFind.add(btnFind);

		JPanel panelFindMem = new JPanel();
		tabFindMem.add(panelFindMem, BorderLayout.CENTER);
		panelFindMem.setLayout(new GridLayout(0, 2, 0, 0));

		JLabel label = new JLabel("이름");
		panelFindMem.add(label);

		tabFind_txtName = new JTextField();
		tabFind_txtName.setColumns(10);
		panelFindMem.add(tabFind_txtName);

		JLabel label_1 = new JLabel("생년월일");
		panelFindMem.add(label_1);

		tabFind_txtBirth = new JTextField();
		tabFind_txtBirth.setColumns(10);
		panelFindMem.add(tabFind_txtBirth);

		JLabel label_2 = new JLabel("주소");
		panelFindMem.add(label_2);

		tabFind_txtAddr = new JTextField();
		tabFind_txtAddr.setColumns(10);
		panelFindMem.add(tabFind_txtAddr);

		JPanel tabpanelModify = new JPanel();
		tabbedPane.addTab("회원수정", null, tabpanelModify, null);
		tabpanelModify.setLayout(new GridLayout(1, 0, 0, 0));

		JPanel panelModify = new JPanel();
		tabpanelModify.add(panelModify);
		panelModify.setLayout(new BorderLayout(0, 0));

		JPanel panel_9 = new JPanel();
		panelModify.add(panel_9, BorderLayout.NORTH);

		JLabel label_3 = new JLabel("수정 회원 정보 입력");
		panel_9.add(label_3);

		JPanel panel_10 = new JPanel();
		panelModify.add(panel_10, BorderLayout.CENTER);

		JLabel lblNewLabel_3 = new JLabel("No:");
		panel_10.add(lblNewLabel_3);

		tabMod_txtNum = new JTextField();
		panel_10.add(tabMod_txtNum);
		tabMod_txtNum.setColumns(25);

		JLabel label_4 = new JLabel("주소");
		panel_10.add(label_4);

		textField_8 = new JTextField();
		panel_10.add(textField_8);
		textField_8.setColumns(20);

		JPanel panel_11 = new JPanel();
		panelModify.add(panel_11, BorderLayout.SOUTH);

		btnMod = new JButton("수정");
		panel_11.add(btnMod);

		JPanel tabpanelDelete = new JPanel();
		tabbedPane.addTab("회원삭제", null, tabpanelDelete, null);
		tabpanelDelete.setLayout(new BorderLayout(0, 0));

		JPanel panelNotify = new JPanel();
		tabpanelDelete.add(panelNotify, BorderLayout.NORTH);

		JLabel label_5 = new JLabel("삭제할 회원 정보 입력");
		panelNotify.add(label_5);

		JPanel panelDelete = new JPanel();
		tabpanelDelete.add(panelDelete, BorderLayout.CENTER);

		JLabel lblNewLabel_4 = new JLabel("No:");
		panelDelete.add(lblNewLabel_4);

		tabDel_txtNum = new JTextField();
		panelDelete.add(tabDel_txtNum);
		tabDel_txtNum.setColumns(10);

		btnDel = new JButton("삭제");
		btnDel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		panelDelete.add(btnDel);

		tabJoin_txtName.addActionListener(this);
		tabJoin_txtBirth.addActionListener(this);
		tabJoin_txtAddr.addActionListener(this);
		
		tabFind_txtNum.addActionListener(this);
		tabFind_txtName.addActionListener(this);
		tabFind_txtBirth.addActionListener(this);
		tabFind_txtAddr.addActionListener(this);
		tabMod_txtNum.addActionListener(this);
		textField_8.addActionListener(this);
		tabDel_txtNum.addActionListener(this);
		
		btnJoin.addActionListener(this);
		btnMod.addActionListener(this);
		btnFind.addActionListener(this);
		btnDel.addActionListener(this);

	}

	@Override
	public void actionPerformed(ActionEvent e)
	{
		UserVO vo = new UserVO();
		UserDAO dao = new UserDAO();
		String name, birth, addr;

		if (e.getSource() == btnJoin)
		{
			Date datebirth;
			SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");

			birth = tabJoin_txtBirth.getText();
			name = tabJoin_txtName.getText();
			addr = tabJoin_txtAddr.getText();

			//datebirth = formatter.parse(birth);

			System.out.println(name + " " + addr);

			vo.setName(tabJoin_txtName.getText());
			//vo.setBirthday(birth.valueOf("1994-10-31"));
			vo.setAddress(tabJoin_txtAddr.getText());
			dao.registUser(vo);

		}

		else if (e.getSource() == btnFind)
		{
			vo.setNo(Integer.parseInt(tabFind_txtNum.getText()));
			dao.getUser(vo);
			
			tabFind_txtName.setText(vo.getName());
		//	tabFind_txtBirth.setText(vo.getBirthday());
			tabFind_txtAddr.setText(vo.getAddress());
			
		}
		
		else if(e.getSource() == btnDel)
		{
			int DelNum = Integer.parseInt(tabDel_txtNum.getText());
			vo.getNo();
			dao.removeUser(vo);
		}
	}

}
