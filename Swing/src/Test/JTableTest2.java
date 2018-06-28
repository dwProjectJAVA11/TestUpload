package Test;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import java.awt.event.ActionListener;
import java.util.Arrays;
import java.util.List;
import java.awt.event.ActionEvent;

public class JTableTest2 extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JTextField txtName;
	private JTextField txtAge;
	private JTextField txtGender;
	private JTable table;
	private DefaultTableModel model;
	private JButton btnInput, btnDel;

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
					JTableTest2 frame = new JTableTest2();
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
	public JTableTest2()
	{
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
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
		btnDel.addActionListener(this);

	}

	@Override
	public void actionPerformed(ActionEvent e)
	{

		// 입력 버튼
		if (e.getSource() == btnInput)
		{
			// txtName,txtAge,txtGender 가져오기
			String name = txtName.getText();
			String age = txtAge.getText();
			String gender = txtGender.getText();
			
			// 데이터를 배열로 변경
			Object[] rowData = { name, age, gender };
			// 모델에 데이터 add
			model.addRow(rowData);
			// List <String> list = Arrays.asList(name,age,gender);
			// Object[] rowData2 = list.toArray();			-> 이런 방법도 있어~
			
			// txtField는 다음 데이터 입력을 위해 내용 삭제
			txtName.setText("");
			txtAge.setText("");
			txtGender.setText("");
		}
		
		else
		{
			// 삭제 버튼
			if(e.getSource() == btnDel )
			{
				// 현재 테이블에서 선택된 행 삭제
				int row = table.getSelectedRow();
				model.removeRow(row);
			}
		}
	}

}
