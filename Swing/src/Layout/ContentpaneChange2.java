package Layout;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

public class ContentpaneChange2 extends JFrame implements ActionListener{

	private JPanel contentPane;
	private JMenuItem mnFirst, mnSecond, mnThird;

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
					ContentpaneChange2 frame = new ContentpaneChange2();
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
	public ContentpaneChange2()
	{
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnNewMenu = new JMenu("첫번째");
		menuBar.add(mnNewMenu);
		
		mnFirst = new JMenuItem("첫번째");
		mnNewMenu.add(mnFirst);
		
		JMenu mnNewMenu_1 = new JMenu("두번째");
		menuBar.add(mnNewMenu_1);
		
		mnSecond = new JMenuItem("두번째");
		mnNewMenu_1.add(mnSecond);
		
		JMenu mnNewMenu_2 = new JMenu("세번째");
		menuBar.add(mnNewMenu_2);
		
		mnThird = new JMenuItem("세번째");
		mnNewMenu_2.add(mnThird);
		
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		mnFirst.addActionListener(this);
		mnSecond.addActionListener(this);
		mnThird.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e)
	{
		JMenuItem item = (JMenuItem)e.getSource();
		
		if(item == mnFirst)
		{
			setContentPane(new Panel1());
			validate();
		}
		
		else if(item == mnSecond)
		{
			setContentPane(new Panel2());
			validate();
		}
		
		else
		{
			setContentPane(new Panel3());
			validate();
		}
		
	}

}
