package User;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.nio.file.attribute.UserPrincipalNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class UserMain extends JFrame {

	private JPanel contentPane;
	private JTable table;
	private DefaultTableModel model;

	public static void main(String[] args)
	{
		EventQueue.invokeLater(new Runnable()
		{
			public void run()
			{
				try
				{
					UserMain frame = new UserMain();
					frame.setVisible(true);
				} catch (Exception e)
				{
					e.printStackTrace();
				}
			}
		});
	}

	public UserMain()
	{
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);

		JScrollPane scrollPane = new JScrollPane();
		getContentPane().add(scrollPane, BorderLayout.CENTER);

		String columNames[] = { "no", "name", "birthday", "addr" };
		model = new DefaultTableModel(columNames, 0);
		table = new JTable(model);
		scrollPane.setViewportView(table);

		showRows();
	}

	private void showRows()
	{
		UserDAO dao = new UserDAO();
		ArrayList<UserVO> list = dao.getUsers();

		for (UserVO vo : list)
		{
			int no = vo.getNo();
			String name = vo.getName();
			Date bir = vo.getBirthday();
			String addr = vo.getAddress();
			List<Object> userRow = Arrays.asList(no, name, bir, addr);
			model.addRow(userRow.toArray());
		}
	}
}
