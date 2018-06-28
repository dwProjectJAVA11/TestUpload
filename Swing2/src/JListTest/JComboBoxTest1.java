package JListTest;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JComboBox;
import javax.swing.ComboBoxEditor;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class JComboBoxTest1 extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

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
					JComboBoxTest1 frame = new JComboBoxTest1();
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
	public JComboBoxTest1()
	{
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JComboBox comboBox = new JComboBox();
		comboBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// 콤보박스에서 선택한 값을 텍스트필드에 보여주기
				//Combobox.get
				String str = comboBox.getSelectedItem().toString();
				textField.setText(str);
			}
		});
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"수성", "금성", "지구", "화성", "목성", "토성", "천왕성", "해왕성"}));
		contentPane.add(comboBox, BorderLayout.NORTH);
		
		textField = new JTextField();
		contentPane.add(textField, BorderLayout.SOUTH);
		textField.setColumns(10);
	}

}
