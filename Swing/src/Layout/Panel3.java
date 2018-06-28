package Layout;

import javax.swing.JPanel;
import javax.swing.JTextArea;

public class Panel3 extends JPanel {

	/**
	 * Create the panel.
	 */
	public Panel3()
	{
		
		JTextArea txtrHello = new JTextArea();
		txtrHello.setText("세번째 패널");
		add(txtrHello);

	}

}
