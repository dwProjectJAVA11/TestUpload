package Component;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;

public class JCheckBoxTest extends JFrame implements ItemListener {

	private JPanel contentPane;
	private JTextField textField;

	JCheckBox chkapple = null;
	JCheckBox chkpeach = null;
	JCheckBox chkgrape = null;

	String fruit = "";
	private JTextArea textArea;

	public static void main(String[] args)
	{
		EventQueue.invokeLater(new Runnable()
		{
			public void run()
			{
				try
				{
					JCheckBoxTest frame = new JCheckBoxTest();
					frame.setVisible(true);
				} catch (Exception e)
				{
					e.printStackTrace();
				}
			}
		});
	}

	public JCheckBoxTest()
	{
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);

		textField = new JTextField();
		contentPane.add(textField, BorderLayout.SOUTH);
		textField.setColumns(10);

		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.NORTH);

		chkapple = new JCheckBox("사과");
		panel.add(chkapple);

		chkpeach = new JCheckBox("복숭아");
		panel.add(chkpeach);

		chkgrape = new JCheckBox("포도");
		panel.add(chkgrape);
		
		textArea = new JTextArea();
		contentPane.add(textArea, BorderLayout.CENTER);

		chkapple.addItemListener(this);
		chkpeach.addItemListener(this);
		chkgrape.addItemListener(this);
		
		// 다중선택을 막을 수 있다.
		ButtonGroup btgroup = new ButtonGroup();
		btgroup.add(chkapple);
		btgroup.add(chkgrape);
		btgroup.add(chkpeach);

	}

	@Override
	public void itemStateChanged(ItemEvent e)
	{
		JCheckBox item = (JCheckBox) e.getItem(); // getItem -> 이벤트가 일어난 아이템을 가져온다.
//		if (item.isSelected())
//		{
//			fruit += item.getText() + " ";
//			textField.setText(fruit);
//		}
		
		if (item.isSelected())
		{
			textField.setText(textField.getText() + "" + item.getText());
			textArea.append(item.getText());
		}

		else{
			// 선택된 영역을 공백으로 바꿔주기
			// 1. 영역 선택하기
			String find = item.getText();
			String original = textField.getText();
			
			int start = original.indexOf(find);
			int end = start+find.length();
			
			textField.select(start, end);
			textField.replaceSelection("");			// .cut()도 있
		}
		
//		else
//		{
//			String find = item.getText();
//			String original = textField.getText();
//			
//			int start = original.indexOf(find);
//			int end = start+find.length();
//			
//			StringBuilder builder = new StringBuilder(original);
//			builder.delete(start, end);
//			
//			textField.setText(builder.toString().trim());
//		}
		
//		else
//		{
//			int index=0;
//			int start = 0;
//			boolean check = false;
//			char[] ch = new char[10];
//			
//			for (int i = 0; i < item.getText().length(); i++)
//			{
//				ch[i] = item.getText().charAt(i);
//			}
//
//			for (int i = index; i < fruit.length(); i++)
//			{
//				start = index;
//				
//				while(fruit.charAt(index) != ' ')
//				{
//					index++;
//				}
//				
//				for(int j = start; j<start+index;j++)
//				{
//					if((fruit.charAt(j) == ch[j])) {
//						check = true;
//					}
//					else check = false;
//				}
//			
//				if(check == true) {
//					System.out.println("true");
//					textField.setText(fruit);
//					break;
//				}
//				
//
//			}
//		}

	}

}
