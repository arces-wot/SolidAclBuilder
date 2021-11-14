package it.unibo.arces.wot.sepa.tools.view;

import it.unibo.arces.wot.sepa.tools.controller.ControllerRegolaClasse;
import it.unibo.arces.wot.sepa.tools.model.TipoDiClasse;

import javax.swing.*;
import java.awt.*;

public class RegolaClasseSwing extends RegolaSwing<ControllerRegolaClasse> {

    public RegolaClasseSwing(ControllerRegolaClasse controller, JPanel containerPanel) {
        super(controller, containerPanel);
    }

    @Override
    protected JPanel createRegolaEditorPanel() {
        JPanel regolaClassePanel = new JPanel(new BorderLayout());
        regolaClassePanel.add(new JLabel("Utente"), BorderLayout.WEST);
        JComboBox<TipoDiClasse> comboBox= new JComboBox<>(TipoDiClasse.values());
        comboBox.setSelectedItem(TipoDiClasse.PUBBLICA);
        regolaClassePanel.add(comboBox, BorderLayout.CENTER);

        return regolaClassePanel;
    }
}
