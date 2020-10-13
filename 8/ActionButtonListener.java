import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ActionButtonListener implements ActionListener {
    private JTextField outField;
    private StringBuilder sb;

    public ActionButtonListener(JTextField outField) {
        this.outField = outField;
        this.sb = new StringBuilder();
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        JButton jButton = (JButton) e.getSource();

        if ("C".equals(jButton.getText())) {
            clearField();
        } else if ("Submit".equals(jButton.getText())) {
            try {
                sumValue();
            } catch (Exception ex) {
                System.out.println(ex.getMessage());
            }
        } else {
            addValue(jButton);
        }
    }

    private void clearField() {
        outField.setText("");
    }

    private void addValue(JButton jButton) {
        String val = sb.append(outField.getText())
                .append(jButton.getText())
                .toString();
        outField.setText(val);
        sb.setLength(0);
    }

    private void sumValue() throws ScriptException {
        ScriptEngineManager scriptEngineManager = new ScriptEngineManager();
        ScriptEngine scriptEngine = scriptEngineManager.getEngineByName("Nashorn");
        Object result = scriptEngine.eval(outField.getText());
        clearField();
        outField.setText(result.toString());
    }

}

