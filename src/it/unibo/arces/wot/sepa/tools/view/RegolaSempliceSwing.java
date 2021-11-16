package it.unibo.arces.wot.sepa.tools.view;
import it.unibo.arces.wot.sepa.tools.controller.ControllerRegolaSemplice;

import javax.swing.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
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
        utenteField.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                controller.inserisciUserWebId(utenteField.getText());
            }
            @Override
            public void removeUpdate(DocumentEvent e) {
                controller.inserisciUserWebId(utenteField.getText());
            }
            @Override
            public void changedUpdate(DocumentEvent e) {
                controller.inserisciUserWebId(utenteField.getText());
            }
        });
        return regolaSemplicePanel;
    }
}
