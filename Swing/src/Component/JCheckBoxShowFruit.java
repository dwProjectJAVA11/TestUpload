package Component;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.ImageIcon;

public class JCheckBoxShowFruit extends JFrame implements ItemListener {

	private JPanel contentPane;
	private JLabel labelApple = null;
	private JLabel labelGrape = null;
	private JLabel labelOrange = null;

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
					JCheckBoxShowFruit frame = new JCheckBoxShowFruit();
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
	public JCheckBoxShowFruit()
	{
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);

		JPanel panelLeft = new JPanel();
		contentPane.add(panelLeft, BorderLayout.WEST);
		panelLeft.setLayout(new GridLayout(0, 1, 0, 0));

		JCheckBox chkApple = new JCheckBox("Apple");
		panelLeft.add(chkApple);

		JCheckBox chkGrape = new JCheckBox("Grape");
		panelLeft.add(chkGrape);

		JCheckBox chkOrange = new JCheckBox("Orange");
		panelLeft.add(chkOrange);

		JPanel panelRight = new JPanel();
		contentPane.add(panelRight, BorderLayout.CENTER);
		panelRight.setLayout(new GridLayout(0, 3, 0, 0));

		labelApple = new JLabel("");
		// labelApple.setIcon(new
		// ImageIcon(JCheckBoxShowFruit.class.getResource("/javax/swing/plaf/metal/icons/Error.gif")));
		panelRight.add(labelApple);

		labelGrape = new JLabel("");
		// labelGrape.setIcon(new
		// ImageIcon(JCheckBoxShowFruit.class.getResource("/javax/swing/plaf/metal/icons/Inform.gif")));
		panelRight.add(labelGrape);

		labelOrange = new JLabel("");
		// labelOrange.setIcon(new
		// ImageIcon(JCheckBoxShowFruit.class.getResource("/javax/swing/plaf/metal/icons/Warn.gif")));
		panelRight.add(labelOrange);

		chkApple.addItemListener(this);
		chkGrape.addItemListener(this);
		chkOrange.addItemListener(this);

	}

	@Override
	public void itemStateChanged(ItemEvent e)
	{
		JCheckBox check = (JCheckBox)e.getItem();
		
		
		if(check.getText().equals("Apple"))
		{
			if(check.isSelected())
				labelOrange.setIcon(new ImageIcon(JCheckBoxShowFruit.class.getResource("/javax/swing/plaf/metal/icons/Error.gif")));
			else	labelOrange.setIcon(new ImageIcon(JCheckBoxShowFruit.class.getResource("")));
		}
		else if(check.getText().equals("Grape"))
		{
			labelOrange.setIcon(new ImageIcon(JCheckBoxShowFruit.class.getResource("/javax/swing/plaf/metal/icons/Inform.gif")));
		}
		else if(check.getText().equals("Orange")) {
			labelOrange.setIcon(new ImageIcon(JCheckBoxShowFruit.class.getResource("/javax/swing/plaf/metal/icons/Warn.gif")));
		}	
	}

}
