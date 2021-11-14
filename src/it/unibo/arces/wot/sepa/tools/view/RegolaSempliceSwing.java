package it.unibo.arces.wot.sepa.tools.view;

import it.unibo.arces.wot.sepa.tools.controller.ControllerRegolaSemplice;

import javax.swing.*;
import java.awt.*;

public class RegolaSempliceSwing extends RegolaSwing<ControllerRegolaSemplice> {


    public RegolaSempliceSwing(ControllerRegolaSemplice controller,JPanel containerPanel) {
        super(controller,containerPanel);
    }

    @Override
    protected JPanel createRegolaEditorPanel() {
        JPanel regolaSemplicePanel = new JPanel(new BorderLayout());
        regolaSemplicePanel.add(new JLabel("Utente"), BorderLayout.WEST );
        JTextField utenteField = new JTextField("");
        regolaSemplicePanel.add(utenteField, BorderLayout.CENTER);
        return regolaSemplicePanel;
    }

}
