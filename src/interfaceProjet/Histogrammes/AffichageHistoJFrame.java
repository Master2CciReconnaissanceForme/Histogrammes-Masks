package interfaceProjet.Histogrammes;

import javax.swing.JFrame;

public class AffichageHistoJFrame extends JFrame {
	private static final long serialVersionUID = 1L;

	public AffichageHistoJFrame() {
		setSize(800, 600);
		
		add(new AffichageHisto(this));
		setVisible(true);
	}
}


