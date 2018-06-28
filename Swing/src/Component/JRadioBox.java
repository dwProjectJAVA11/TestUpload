package Component;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.border.TitledBorder;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.ButtonModel;
import javax.swing.JButton;
import java.awt.GridLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class JRadioBox extends JFrame implements ActionListener {

	private JPanel contentPane;
	private ButtonGroup type;
	private ButtonGroup topping;
	private ButtonGroup size;
	private JButton btnNewButton;
	private JLabel price;
	private int priceType, priceTopping, priceSize;
	private int priceValue = priceType + priceTopping + priceSize; // this : 현재 살행하ㅗ\고있는 틓해스

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
					JRadioBox frame = new JRadioBox();
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
	public JRadioBox()
	{
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);

		JLabel label = new JLabel("자바 피자에 오신 것을 환영합니다.");
		contentPane.add(label, BorderLayout.NORTH);

		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.SOUTH);

		JPanel panel_1 = new JPanel();
		contentPane.add(panel_1, BorderLayout.CENTER);
		panel_1.setLayout(new GridLayout(1, 0, 0, 0));

		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new TitledBorder(null, "\uC885\uB958", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_1.add(panel_2);
		panel_2.setLayout(new GridLayout(0, 1, 0, 0));

		JRadioButton radioCombo = new JRadioButton("콤보");
		panel_2.add(radioCombo);

		JRadioButton radioPotato = new JRadioButton("포테이토");
		panel_2.add(radioPotato);

		JRadioButton radiomeat = new JRadioButton("불고기");
		panel_2.add(radiomeat);

		JPanel panel_3 = new JPanel();
		panel_3.setBorder(new TitledBorder(null, "\uCD94\uAC00 \uD1A0\uD551", TitledBorder.LEADING, TitledBorder.TOP,
				null, null));
		panel_1.add(panel_3);
		panel_3.setLayout(new GridLayout(0, 1, 0, 0));

		JRadioButton radioPepper = new JRadioButton("피망");
		panel_3.add(radioPepper);

		JRadioButton radioCheeze = new JRadioButton("치즈");
		panel_3.add(radioCheeze);

		JRadioButton radioPeperoni = new JRadioButton("페페로니");
		panel_3.add(radioPeperoni);

		JRadioButton radioBacon = new JRadioButton("베이컨");
		panel_3.add(radioBacon);

		JPanel panel_4 = new JPanel();
		panel_4.setBorder(new TitledBorder(null, "\uD06C\uAE30", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_1.add(panel_4);
		panel_4.setLayout(new GridLayout(0, 1, 0, 0));

		JRadioButton radioSmall = new JRadioButton("Small");
		panel_4.add(radioSmall);

		JRadioButton radioMedium = new JRadioButton("Medium");
		panel_4.add(radioMedium);

		JRadioButton radioLarge = new JRadioButton("Large");
		panel_4.add(radioLarge);

		btnNewButton = new JButton("주문");

		type = new ButtonGroup();
		type.add(radioCombo);
		type.add(radioPotato);
		type.add(radiomeat);

		topping = new ButtonGroup();
		topping.add(radioPepper);
		topping.add(radioCheeze);
		topping.add(radioPeperoni);
		topping.add(radioBacon);

		size = new ButtonGroup();
		size.add(radioSmall);
		size.add(radioMedium);
		size.add(radioLarge);

		JButton btnCancel = new JButton("취소");
		btnCancel.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				JButton btn = (JButton) e.getSource();
				if (btn.isEnabled())
				{
					type.clearSelection();
					topping.clearSelection();
					size.clearSelection();
				}
			}
		});

//		btnNewButton.addActionListener(new ActionListener()
//		{
//			public void actionPerformed(ActionEvent e)
//			{
//				JButton btn = (JButton) e.getSource();
//				if (btn.isEnabled())
//					price.setText("금액 : " + priceValue);
//			}
//		});
		panel.add(btnNewButton);
		panel.add(btnCancel);

		price = new JLabel(" ");
		panel.add(price);

		radioCombo.addActionListener(this); // this : 현재 살행하ㅗ\고있는 틓해스
		radioPotato.addActionListener(this);
		radiomeat.addActionListener(this);
		radioPepper.addActionListener(this);
		radioCheeze.addActionListener(this);
		radioPeperoni.addActionListener(this);
		radioBacon.addActionListener(this);
		radioSmall.addActionListener(this);
		radioMedium.addActionListener(this);
		radioLarge.addActionListener(this);

	}

	@Override
	public void actionPerformed(ActionEvent e)
	{
		JRadioButton btn = (JRadioButton) e.getSource();

		if (btn.isSelected())
		{
			if (btn.getText().equals("콤보"))
				priceType = 10000;
			else if (btn.getText().equals("포테이토"))
				priceType = 12000;
			else if (btn.getText().equals("불고기"))
				priceType = 14000;

			if (btn.getText().equals("피망"))
				priceTopping = 4000;
			else if (btn.getText().equals("치즈"))
				priceTopping = 5000;
			else if (btn.getText().equals("페페로니"))
				priceTopping = 6000;
			else if (btn.getText().equals("베이컨"))
				priceTopping = 8000;

			if (btn.getText().equals("Small"))
				priceSize = 0;
			else if (btn.getText().equals("Medium"))
				priceSize = 2000;
			else if (btn.getText().equals("Large"))
				priceSize = 5000;
		}
		
		if( btnNewButton.isSelected())
			System.out.println(priceValue);
	}
}
