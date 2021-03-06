package JListTest;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.JTextField;
import javax.swing.JScrollPane;
import javax.swing.JList;

public class JListTest4 extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JList list;
	DefaultListModel<String> model = new DefaultListModel<>();

	public static void main(String[] args)
	{
		EventQueue.invokeLater(new Runnable()
		{
			public void run()
			{
				try
				{
					JListTest4 frame = new JListTest4();
					frame.setVisible(true);
				} catch (Exception e)
				{
					e.printStackTrace();
				}
			}
		});
	}

	public JListTest4()
	{
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);

		textField = new JTextField();
		textField.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent e)
			{
				// textField에 데이터를 입력 후 엔터를 치면 JList에 추가

				// textField에 있는 내용 가져오기
				String str = textField.getText();

				// list에 추가(model에 내용을 추가한 후 model을 list setting하기)
				model.addElement(str); // index값이 필요없기 때문에 add가 아닌 aE로 추가한다.
				textField.setText("");

			}
		});
		contentPane.add(textField, BorderLayout.NORTH);
		textField.setColumns(10);

		JScrollPane scrollPane = new JScrollPane();
		contentPane.add(scrollPane, BorderLayout.CENTER);

		list = new JList(); // 1. 생성자에 Model을 넣어주거나 2. 생성자는 default로 하고 list.setModel
		list.setModel(model);
		scrollPane.setViewportView(list);

		list.addListSelectionListener(new ListSelectionListener()
		{
			@Override
			public void valueChanged(ListSelectionEvent e)
			{
				// 마우스 누르고 떼는 순간 모두 인식돼서 두 번 불리기 때문에 막아준다.
				// 선택된 값 삭제하기
				int delPos = list.getSelectedIndex();
				if(delPos!=-1) {
					model.removeElementAt(delPos);
				}
			}
		});
	}
}
