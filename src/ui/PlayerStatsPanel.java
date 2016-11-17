package ui;

import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;

import bean.Player;

public class PlayerStatsPanel extends JPanel {

	private static final long serialVersionUID = 1L;
	
	public PlayerStatsPanel(Player p) {
		this.setPreferredSize(new Dimension(150, 70));
		this.setLayout(new BorderLayout());
		JLabel jl1 = new JLabel(p.getName());
		JLabel jl2 = new JLabel(p.getClasse());
		JLabel jl3 = new JLabel(""+p.getGorgees());
		// TODO Afficher les données en temps réel + image + nb à trouver
/*		BufferedImage bfim = utils.Utils.resize(Constante.couronne, 70, 70);
		JLabel jl4 = new JLabel(new ImageIcon(bfim));*/
		JPanel jp = new  JPanel();
		jp.setLayout(new BoxLayout(jp, BoxLayout.Y_AXIS));
		jp.add(jl1);
		jp.add(jl2);
		jp.add(jl3);
//		this.add(jl4, BorderLayout.WEST);
		this.add(jp, BorderLayout.CENTER);
	}

}
