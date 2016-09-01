package ui;

import java.awt.FlowLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class PlayerSelectArea extends JPanel {

	private static final long serialVersionUID = 1L;
	private JTextField jtf;
	private JLabel jlbl;
	
	public PlayerSelectArea(JTextField jtf, JLabel jlbl) {
		this.setJlbl(jlbl);
		this.setJtf(jtf);
		this.setLayout(new FlowLayout());
		this.add(jlbl);
		this.add(jtf);
	}

	public JTextField getJtf() {
		return jtf;
	}

	public void setJtf(JTextField jtf) {
		this.jtf = jtf;
	}

	public JLabel getJlbl() {
		return jlbl;
	}

	public void setJlbl(JLabel jlbl) {
		this.jlbl = jlbl;
	}

}
