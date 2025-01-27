package librarysystem;

import java.awt.BorderLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class CheckOutContinueWindow extends JPanel{
	private static final long serialVersionUID = 1L;
	private JFrame parentFrame; //will need when we want to alert message

	public CheckOutContinueWindow() {
		setLayout(new BorderLayout());
		JLabel lblTitle = new JLabel("Checking out continuing ...");
		add(lblTitle, BorderLayout.NORTH);

		JPanel pnlAdd = new JPanel(); 
		pnlAdd.setLayout(new GridBagLayout());  

		GridBagConstraints c = new GridBagConstraints();
		//c.gridwidth = 1;
		//left 
		c.gridx=0;
		c.gridy=0;
		pnlAdd.add(new JLabel("Book Info"), c);
		c.gridy=1;
		pnlAdd.add(new JLabel("ISBN : "), c);
		c.gridy=2;
		pnlAdd.add(new JLabel("Title : "), c);
		c.gridy=3;
		pnlAdd.add(new JLabel("Due Date : "), c);

		//right 
		c.gridx=1;
		c.gridy=1;
		pnlAdd.add(new JLabel("Testing isbn"), c);

		c.gridy=2;
		pnlAdd.add(new JLabel("Testing title"), c);
		c.gridy=3;
		pnlAdd.add(new JLabel("Testing due date"), c);

		c.gridx=1;
		c.gridy=4;
		JButton btnContinue = new JButton("Continue");
		btnContinue.addActionListener(new ContinueButtonListener());
		pnlAdd.add(btnContinue, c);

		add(pnlAdd, BorderLayout.CENTER);
	}

	public void setParentJFrame(JFrame parent) {
		this.parentFrame = parent;
	}

	class ContinueButtonListener implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			System.out.println("Gonna continue");	
			SharedWindow.cl.show(SharedWindow.cards, "Check Out List");
		}
	}
}
