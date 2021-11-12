package it.unibo.arces.wot.sepa.tools.view;

import javax.swing.JFrame;
import javax.swing.JPanel;

import it.unibo.arces.wot.sepa.tools.controller.ControllerAcl;

import java.awt.*;

public class SwingView implements ViewAcl {
	private ControllerAcl controllerAcl;
	private JFrame frame;
	
	
	public SwingView () {  //costruttore
	
		this.frame= new JFrame("ACL GENERATOR") ;
		JPanel main = new JPanel ();
		main.setLayout(new BorderLayout());
	}
	
	@Override
	public void startGui(ControllerAcl controllerAcl) {
		
		this.frame.setVisible(true);

	}
	

}
