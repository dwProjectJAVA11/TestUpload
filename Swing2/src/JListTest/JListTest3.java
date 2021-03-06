package JListTest;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JList;
import javax.swing.JTextArea;
import javax.swing.AbstractListModel;
import javax.swing.event.ListSelectionListener;
import javax.swing.event.ListSelectionEvent;
import java.awt.GridLayout;

public class JListTest3 extends JFrame {

	private JPanel contentPane;

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
					JListTest3 frame = new JListTest3();
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
	public JListTest3()
	{
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);

		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(new GridLayout(0, 2, 0, 0));

		JList list = new JList();
		panel.add(list);
		JTextArea textArea = new JTextArea();
		panel.add(textArea);
		
		list.addListSelectionListener(new ListSelectionListener()
		{
			public void valueChanged(ListSelectionEvent e)
			{
				List<String> setList = list.getSelectedValuesList();
				
				// 선택한 항목 testArea 붙이기
				for (String str : setList) {
	//				if(e.getValueIsAdjusting())
						textArea.append(str);
				}
			}
		});

		list.setModel(new AbstractListModel()
		{
			String[] values = new String[] { "스위스", "페루", "칠레", "베트남", "아이슬란드", "터키" };

			public int getSize()
			{
				return values.length;
			}

			public Object getElementAt(int index)
			{
				return values[index];
			}
		});

		
	}

}
