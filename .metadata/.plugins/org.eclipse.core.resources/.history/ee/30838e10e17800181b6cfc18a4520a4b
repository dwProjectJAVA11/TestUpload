package JListTest;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JTextField;
import javax.swing.UIManager;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

public class JFileChooserTest2 extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JTextField textField;
	private JFileChooser file;
	private JButton btnOpen, btnSave;

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
					UIManager.setLookAndFeel("com.jtatto.plaf.aluminium.AluminiumLookAndFeel");
					//UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
					//UIManager.setLookAndFeel("com.sun.java.swing.plaf.motif.MotifLookAndFeel");
					
					
					JFileChooserTest2 frame = new JFileChooserTest2();
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
	public JFileChooserTest2()
	{
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);

		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.NORTH);

		btnOpen = new JButton("open");
		btnOpen.setFont(new Font("굴림", Font.PLAIN, 18));
		panel.add(btnOpen);

		btnSave = new JButton("save");
		btnSave.setFont(new Font("굴림", Font.PLAIN, 18));
		panel.add(btnSave);

		textField = new JTextField();
		textField.setFont(new Font("굴림", Font.PLAIN, 16));
		panel.add(textField);
		textField.setColumns(10);

		btnOpen.addActionListener(this);
		btnSave.addActionListener(this);

		file = new JFileChooser();
	}

	@Override
	public void actionPerformed(ActionEvent e)
	{
		JButton btn = (JButton) e.getSource();
		// 열기 : 0 -> FileChooser.APPROVE_OPTION
		// 취소 : 1 -> FileChooser.CANCEL_OPTION
		//
		int reVal = 0;

		if (btn == btnOpen)
		{
			reVal = file.showOpenDialog(this);

			// JFileChooser 를 열고 사용자가 선택한 파일의 경로 가져오기
			if (reVal == JFileChooser.APPROVE_OPTION)
			{
				File f = file.getSelectedFile();
				textField.setText(f.getPath());
			}
			else
			{
				textField.setText("취소버튼 클릭");
			}
		}
		else
		{	// 저장 창을 띄울  때 default 디텍토리를 c:/로 변경
			file.setCurrentDirectory(new File("c:/"));
			
			//file.addChoosableFileFilter(new FileNameExtensionFilter("images","jpg","gif","bmp"));
			file.addChoosableFileFilter(new FileNameExtensionFilter("텍스트파일(*.txt)","txt"));
			
			reVal = file.showSaveDialog(this);
			if(reVal == JFileChooser.APPROVE_OPTION)
			{
				
			}
		}

	}

}
