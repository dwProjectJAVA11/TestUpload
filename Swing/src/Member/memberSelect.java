package Member;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.ScrollPane;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class memberSelect extends JFrame implements ActionListener{

	private JPanel contentPane;
	// private JTable table;
	private DefaultTableModel model;
	private JButton btnMain, btnDel;

	public static void main(String[] args)
	{
		EventQueue.invokeLater(new Runnable()
		{
			public void run()
			{
				try
				{
					memberSelect frame = new memberSelect();
					frame.setVisible(true);
				} catch (Exception e)
				{
					e.printStackTrace();
				}
			}
		});
	}

	public memberSelect()
	{
		// setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);			이거 닫으면 
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.SOUTH);
		
		btnMain = new JButton("메인");
		panel.add(btnMain);
		
		btnDel = new JButton("삭제");
		panel.add(btnDel);
		
		JScrollPane scrollPane = new JScrollPane();
		contentPane.add(scrollPane, BorderLayout.CENTER);
		
		JTable table = new JTable();
		scrollPane.setViewportView(table);
		
		String  columNames[] = {"번호","이름","나이","성별"};
		model = new DefaultTableModel(columNames ,0);
		table = new JTable(model);
		
		scrollPane.setViewportView(table);
		showTables();
		
		btnMain.addActionListener(this);
		
	}
	
	private void showTables()
	{
		
		
	}
	
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource() == btnMain)
		
		
		
	}


}
