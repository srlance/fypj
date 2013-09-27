package sg.edu.nyp.ui;

import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;

public class mainpage extends JPanel {

	/**
	 * Create the panel.
	 */
	public mainpage() {
		setBackground(Color.WHITE);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setVerticalAlignment(SwingConstants.TOP);
		lblNewLabel.setIcon(new ImageIcon(mainpage.class.getResource("/sg/edu/nyp/images/ALMSuite - Cropped.jpg")));
		add(lblNewLabel);

	}

}
