package it.unibo.arces.wot.sepa.tools.view;
import it.unibo.arces.wot.sepa.tools.controller.ControllerRegolaGruppo;

import javax.swing.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
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
        gruppoField.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {controller.inserisciGroupWebId(gruppoField.getText());}
            @Override
            public void removeUpdate(DocumentEvent e) {controller.inserisciGroupWebId(gruppoField.getText());}
            @Override public void changedUpdate(DocumentEvent e) {
                controller.inserisciGroupWebId(gruppoField.getText());}
        });
        return regolaGruppoPanel;
    }
}
