package it.unibo.arces.wot.sepa.tools.view;

import it.unibo.arces.wot.sepa.tools.controller.ControllerRegola;
import it.unibo.arces.wot.sepa.tools.model.TipoDiPermesso;

import javax.swing.*;
import java.awt.*;

public abstract class RegolaSwing<T extends ControllerRegola> extends JPanel {

    public RegolaSwing(T controller) {
        this.setLayout( new BoxLayout( this,BoxLayout.PAGE_AXIS));
        JPanel  topRow = new JPanel(new BorderLayout());
        topRow.add( new JLabel ("Permessi"), BorderLayout.WEST);
        topRow.add(createCheckBoxPanel(), BorderLayout.CENTER);
        topRow.add(createDeleteButton(), BorderLayout.EAST);
        this.add(topRow);
        this.add(createRegolaEditorPanel());
        this.setMaximumSize(new Dimension(Integer.MAX_VALUE, (int) this.getPreferredSize().getHeight()));
    }

    private JButton createDeleteButton() {

        return new JButton("Delete");
    }

    private JPanel createCheckBoxPanel(){
        JPanel checkBoxPanel = new JPanel(new FlowLayout());
        for (TipoDiPermesso permesso : TipoDiPermesso.values()){
            JCheckBox checkBox =new JCheckBox(permesso.toString());
            checkBoxPanel.add(checkBox);
        }
        return checkBoxPanel;

    }

    protected abstract JPanel createRegolaEditorPanel();
}
