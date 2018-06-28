package Member;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import java.awt.event.ActionListener;
import java.util.Arrays;
import java.util.List;
import java.awt.event.ActionEvent;

public class MemberMain extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JTextField txtName;
	private JTextField txtAge;
	private JTextField txtGender;

	private JTable table;
	private DefaultTableModel model;

	private JButton btnInput, btnDel, btnSel;

	public static void main(String[] args)
	{
		EventQueue.invokeLater(new Runnable()
		{
			public void run()
			{
				try
				{
					MemberMain frame = new MemberMain();
					frame.setVisible(true);
				} catch (Exception e)
				{
					e.printStackTrace();
				}
			}
		});
	}

	public MemberMain()
	{
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 525, 303);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);

		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.SOUTH);

		JLabel lblNewLabel = new JLabel("이름");
		panel.add(lblNewLabel);

		txtName = new JTextField();
		panel.add(txtName);
		txtName.setColumns(5);

		JLabel lblNewLabel_1 = new JLabel("나이");
		panel.add(lblNewLabel_1);

		txtAge = new JTextField();
		panel.add(txtAge);
		txtAge.setColumns(5);

		JLabel label = new JLabel("성별");
		panel.add(label);

		txtGender = new JTextField();
		panel.add(txtGender);
		txtGender.setColumns(5);

		btnInput = new JButton("입력");

		panel.add(btnInput);

		btnSel = new JButton("조회");
		panel.add(btnSel);

		btnDel = new JButton("삭제");
		panel.add(btnDel);

		JScrollPane scrollPane = new JScrollPane();
		contentPane.add(scrollPane, BorderLayout.CENTER);

		// 테이블에 보여줄 모델 생성
		String columnNames[] = { "이름", "나이", "성별" };
		model = new DefaultTableModel(columnNames, 0);
		table = new JTable(model);
		// table.setModel(model);
		scrollPane.setViewportView(table);

		btnInput.addActionListener(this);
		btnSel.addActionListener(this);
		btnDel.addActionListener(this);

	}

	@Override
	public void actionPerformed(ActionEvent e)
	{
		MemberDAO dao = new MemberDAO();

		// 입력 버튼
		if (e.getSource() == btnInput)
		{
			// txtName,txtAge,txtGender 가져오기
			String name = txtName.getText();
			String age = txtAge.getText();
			String gender = txtGender.getText();
			
			// 데이터를 배열로 변경
			Object[] rowData = { name, age, gender };

			// DB MemberTBL에 추가하기
			int result = dao.insert(name, Integer.parseInt(age), gender);
			if (result == 0)
			{
				JOptionPane.showMessageDialog(this, "입력실패", "입력", JOptionPane.CLOSED_OPTION);
			}

			// 모델에 데이터 add
			model.addRow(rowData);
			
			// txtField는 다음 데이터 입력을 위해 내용 삭제
			txtName.setText("");
			txtAge.setText("");
			txtGender.setText("");
		}

		else if (e.getSource() == btnSel)
		{
			memberSelect sel = new memberSelect();
			sel.setVisible(true);
		}

		else
		{
			// 삭제 버튼 - 현재 테이블에서 선택된 행 삭제
			int row = table.getSelectedRow();
			model.removeRow(row);
		}
	}

}
