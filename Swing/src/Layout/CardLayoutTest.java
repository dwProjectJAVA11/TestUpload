package Layout;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import javax.swing.border.EmptyBorder;
import java.awt.CardLayout;
import java.awt.Color;

public class CardLayoutTest extends JFrame {

	private JPanel contentPane;
	private JPanel redCard, blueCard, orangeCard;

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
					CardLayoutTest frame = new CardLayoutTest();
					frame.setVisible(true);
					
					// 각 패널들이 자동으로 스위치 되도록 만들기
					Thread t = new Thread() {
						@Override
						public void run()
						{
							for(int i =0 ;i<20;i++)
							{
								try
								{
									Thread.sleep(2000);	
								}
								catch (InterruptedException e)
								{
									e.printStackTrace();
								}
								SwingUtilities.invokeLater(new Runnable() {
									@Override
									public void run()
									{
										CardLayout cardLayout
										= (CardLayout)frame.getContentPane().getLayout();
										cardLayout.next(frame.getContentPane());
									}
								});
								
							}
						}
					};
					
					t.start();
					
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
	public CardLayoutTest()
	{
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new CardLayout(0, 0));

		contentPane.add("RedCard",getCard());
		contentPane.add("blueCard",getCard());
		contentPane.add("orangeCard",getCard());
		
	}
	
	private JPanel getCard()
	{
		if(redCard == null)
		{
			redCard = new JPanel();
			redCard.setBackground(Color.red);
			return redCard;
		}
		
		else if(blueCard == null)
		{
			blueCard = new JPanel();
			blueCard.setBackground(Color.blue);
			return blueCard;
		}
		
		else if(orangeCard == null)
		{
			orangeCard = new JPanel();
			orangeCard.setBackground(Color.orange);
			return orangeCard;
		}
		
		return null;
	}

}
