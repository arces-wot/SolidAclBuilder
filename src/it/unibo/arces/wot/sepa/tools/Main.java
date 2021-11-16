package it.unibo.arces.wot.sepa.tools;
import it.unibo.arces.wot.sepa.tools.controller.ControllerAcl;
import it.unibo.arces.wot.sepa.tools.controller.ControllerAclImpl;
import it.unibo.arces.wot.sepa.tools.model.Acl;
import it.unibo.arces.wot.sepa.tools.model.AclImpl;
import it.unibo.arces.wot.sepa.tools.view.SwingView;
import it.unibo.arces.wot.sepa.tools.view.ViewAcl;

public class Main {
	
	public static void main(String[] args) {
		
		String risorsa = "";
		Acl acl = new AclImpl (risorsa);
		ControllerAcl controllerAcl = new ControllerAclImpl (acl);
		
		ViewAcl viewAcl = new SwingView(); 
		viewAcl.startGui(controllerAcl);
	}

}
