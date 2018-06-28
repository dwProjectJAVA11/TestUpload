package Layout;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.CardLayout;
import java.awt.Color;

public class CardLayoutTest2 extends JFrame implements ActionListener{

	private JPanel contentPane;
	private JPanel panel1[];
	private JButton mainbtn1,mainbtn2,mainbtn3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CardLayoutTest2 frame = new CardLayoutTest2();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public CardLayoutTest2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.NORTH);
		
		mainbtn1 = new JButton("첫번째");
		panel.add(mainbtn1);
		
		mainbtn2 = new JButton("두번째");
		panel.add(mainbtn2);
		
		mainbtn3 = new JButton("세번째");
		panel.add(mainbtn3);
		
		JPanel panel_1 = new JPanel();
		contentPane.add(panel_1, BorderLayout.CENTER);
		panel_1.setLayout(new CardLayout(0, 0));
		
		//패널생성 메소드 호출
		getPanel(3);
		
		//CardLayout에 생성된 패널 붙이기
		int i=1;
		for(JPanel p:panel1) {
			panel_1.add(String.valueOf(i),p);
			i++;			
		}
		
		
		//카드 레이아웃에 보여줄 첫번째 패널 컴포넌트 추가
		JButton btn=new JButton("첫번째 패널 버튼");
		JRadioButton radio=new JRadioButton("사과");
		panel1[0].add(btn);
		panel1[0].add(radio);
		panel1[0].setBackground(Color.RED);
		//카드 레이아웃에 보여줄 두첫번째 패널 컴포넌트 추가
		JButton btn1=new JButton("두번째 패널 버튼");
		JRadioButton radio1=new JRadioButton("포도");
		panel1[1].add(btn1);
		panel1[1].add(radio1);
		panel1[1].setBackground(Color.green);
		//카드 레이아웃에 보여줄 세번째 패널 컴포넌트 추가
		JButton btn2=new JButton("세번째 패널 버튼");
		panel1[2].add(btn2);
		panel1[2].setBackground(Color.blue);
		
		mainbtn1.addActionListener(this);
		mainbtn2.addActionListener(this);
		mainbtn3.addActionListener(this);
		
	}
	
	//패널 생성
	private JPanel[] getPanel(int cnt) {
		panel1=new JPanel[cnt];
		
		for(int i=0;i<panel1.length;i++) {
			panel1[i]=new JPanel();
		}
		return panel1;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		//mainbtn 클릭시 각각의 패널 전환
		JButton btn=(JButton)e.getSource();
		
		JPanel p=(JPanel)getContentPane().getComponent(1);
		CardLayout card=(CardLayout)p.getLayout();
		
		if(btn==mainbtn1) {
			card.show(p, "1");
		}else if(btn==mainbtn2) {
			card.show(p, "2");
		}else if(btn==mainbtn3) {
			card.show(p, "3");
		}
		
	}

}
