package it.unibo.arces.wot.sepa.tools.view;

import it.unibo.arces.wot.sepa.tools.controller.ControllerRegolaGruppo;

import javax.swing.*;
import java.awt.*;

public class RegolaGruppoSwing extends RegolaSwing<ControllerRegolaGruppo> {

    public RegolaGruppoSwing(ControllerRegolaGruppo controller, JPanel containerPanel) {
        super(controller,containerPanel);
    }

    @Override
    protected JPanel createRegolaEditorPanel() {
        JPanel regolaGruppoPanel = new JPanel(new BorderLayout());
        regolaGruppoPanel.add(new JLabel("Gruppo"), BorderLayout.WEST );
        JTextField gruppoField = new JTextField("");
        regolaGruppoPanel.add(gruppoField, BorderLayout.CENTER);
        return regolaGruppoPanel;
    }
}
