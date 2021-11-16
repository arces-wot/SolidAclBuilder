package it.unibo.arces.wot.sepa.tools.view;
import it.unibo.arces.wot.sepa.tools.controller.ControllerAcl;
import it.unibo.arces.wot.sepa.tools.controller.ControllerRegolaClasse;
import it.unibo.arces.wot.sepa.tools.controller.ControllerRegolaGruppo;
import it.unibo.arces.wot.sepa.tools.controller.ControllerRegolaSemplice;

import javax.swing.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SwingView implements ViewAcl {
	private ControllerAcl controllerAcl;
	private JFrame frame;
	private JPanel  regolePanel;

	public SwingView () {  //costruttore
	
		this.frame= new JFrame("ACL GENERATOR") ;
		this.frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.frame.add(createMainPanel());
		this.frame.setLocation(300,300);
		this.frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
		this.frame.setMinimumSize(new Dimension(650, 300));
	}

	private JPanel createMainPanel (){
		JPanel main = new JPanel (new BorderLayout());
		main.add(createActionPanel(), BorderLayout.NORTH);
		this.regolePanel = new JPanel();
		this.regolePanel.setLayout(new BoxLayout(this.regolePanel, BoxLayout.PAGE_AXIS));
		JScrollPane scrollPanel = new JScrollPane(
				this.regolePanel,
				JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
				JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
		main.add(scrollPanel, BorderLayout.CENTER);
		return main ;
	}

	private JPanel createActionPanel (){
		JPanel actionPanel =new JPanel ();
		actionPanel.setLayout(new BoxLayout(actionPanel,BoxLayout.PAGE_AXIS));
		actionPanel.add(createGenerateAclButton());
		actionPanel.add(createButtonRegolaPanel ());
		actionPanel.add(createRisorsaPanel());
		return actionPanel;
	}

	private JButton createGenerateAclButton (){
		JButton aclButton =new JButton("Generate ACL");
		aclButton.addActionListener(e->this.controllerAcl.generaAcl());
		return aclButton;

	}

	private JPanel createButtonRegolaPanel (){
		JPanel buttonRegolaPanel = new JPanel (new FlowLayout());
		buttonRegolaPanel.add(createButtonRegolaSemplice());
		buttonRegolaPanel.add(createButtonRegolaGruppo());
		buttonRegolaPanel.add(createButtonRegolaClasse());
		return buttonRegolaPanel;
	}

	private JButton createButtonRegolaSemplice(){
		JButton regolaSempliceButton = new JButton("Regola Semplice");
		regolaSempliceButton.addActionListener( e -> {
			ControllerRegolaSemplice controllerRegola = this.controllerAcl.aggiungiRegolaSemplice();
			this.regolePanel.add(new RegolaSempliceSwing(controllerRegola, this.regolePanel));
			this.regolePanel.revalidate();
		});
		return regolaSempliceButton;
	}

	private JButton createButtonRegolaGruppo(){
		JButton regolaGruppoButton = new JButton("Regola Gruppo");
		regolaGruppoButton.addActionListener(e -> {
			ControllerRegolaGruppo controllerRegola = this.controllerAcl.aggiungiRegolaGruppo();
			this.regolePanel.add(new RegolaGruppoSwing(controllerRegola, this.regolePanel));
			this.regolePanel.revalidate();
		});
		return regolaGruppoButton;
	}

	private JButton createButtonRegolaClasse(){
		JButton regolaClasseButton = new JButton("Regola Classe");
		regolaClasseButton.addActionListener(e -> {
			ControllerRegolaClasse controllerRegola = this.controllerAcl.aggiungiRegolaClasse();
			this.regolePanel.add(new RegolaClasseSwing(controllerRegola, this.regolePanel));
			this.regolePanel.revalidate();
		});
		return regolaClasseButton;
	}

	private JPanel createRisorsaPanel(){
		JPanel risorsaPanel = new JPanel ( new BorderLayout());
		JTextField urlRisorsa = new JTextField("");
		risorsaPanel.add(urlRisorsa, BorderLayout.CENTER);
		risorsaPanel.add(new JLabel("Risorsa Protetta"), BorderLayout.WEST);
		urlRisorsa.getDocument().addDocumentListener(new DocumentListener() {
			@Override
			public void insertUpdate(DocumentEvent e) {
				controllerAcl.inserisciUrlRisorsa(urlRisorsa.getText());
			}

			@Override
			public void removeUpdate(DocumentEvent e) {
				controllerAcl.inserisciUrlRisorsa(urlRisorsa.getText());
			}

			@Override
			public void changedUpdate(DocumentEvent e) {
				controllerAcl.inserisciUrlRisorsa(urlRisorsa.getText());
			}
		});
		return risorsaPanel;
	}

	@Override
	public void startGui(ControllerAcl controllerAcl) {
        this.controllerAcl=controllerAcl;
		this.frame.setVisible(true);
	}
	

}
