package it.unibo.arces.wot.sepa.tools.view;
import it.unibo.arces.wot.sepa.tools.controller.ControllerAcl;
import javax.swing.*;
import java.awt.*;

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

		this.regolePanel.add(new RegolaSempliceSwing(null));
		this.regolePanel.add(new RegolaSempliceSwing(null));
		this.regolePanel.add(new RegolaClasseSwing(null));
		this.regolePanel.add(new RegolaGruppoSwing(null));


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
		//eventlistener
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
		return regolaSempliceButton;
	}

	private JButton createButtonRegolaGruppo(){
		JButton regolaGruppoButton = new JButton("Regola Gruppo");
		return regolaGruppoButton;
	}

	private JButton createButtonRegolaClasse(){
		JButton regolaGruppoButton = new JButton("Regola Classe");
		return regolaGruppoButton;
	}

	private JPanel createRisorsaPanel(){
		JPanel risorsaPanel = new JPanel ( new BorderLayout());
		JTextField urlRisorsa = new JTextField("");
		risorsaPanel.add(urlRisorsa, BorderLayout.CENTER);
		risorsaPanel.add(new JLabel("Risorsa Protetta"), BorderLayout.WEST);
		return risorsaPanel;
	}

	//private JPanel createRegolaPanel (){
	//	JPanel regolaPanel =new JPanel (new BorderLayout());
		//regolaPanel.add(new JLabel("Permessi"), BorderLayout.WEST);
		//regolaPanel.add(creationCheckBoxPanel(), BorderLayout.CENTER);
		//regolaPanel.add( new JButton("Delete"), BorderLayout.EAST);
		//regolaPanel.add( creationAgentPanel(), BorderLayout.SOUTH );
	//	return regolaPanel;
	//}

	private JPanel creationAgentPanel(){
		JPanel agentPanel =new JPanel (new BorderLayout());
		JTextField agent = new JTextField("");
		agentPanel.add(new JLabel("Agent"),BorderLayout.WEST);
		agentPanel.add(agent, BorderLayout.CENTER);
		return agentPanel;
	}


	@Override
	public void startGui(ControllerAcl controllerAcl) {

		this.frame.setVisible(true);

	}
	

}
