import javax.swing.*;
import java.awt.*;

public class Calculator {
    private ActionButtonListener abListener;
    private JPanel bottom;
    private JTextField outField;

    public Calculator() {
        JFrame mainFrame = new JFrame();
        mainFrame.setTitle("Calculator");
        mainFrame.setBounds(100, 100, 350, 500);
        mainFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        mainFrame.setLayout(new BorderLayout());
        JPanel top = new JPanel();
        top.setLayout(new BorderLayout());
        bottom = new JPanel();
        bottom.setLayout(new GridLayout(5, 3));

        mainFrame.add(top, BorderLayout.NORTH);
        mainFrame.add(bottom, BorderLayout.CENTER);

        outField = new JTextField();
        outField.setEditable(false);
        top.add(outField, BorderLayout.CENTER);

        abListener = new ActionButtonListener(outField);
        addNumberButton();

        JButton plusBtn = new JButton("+");
        plusBtn.addActionListener(abListener);
        bottom.add(plusBtn);
        JButton minusBtn = new JButton("-");
        minusBtn.addActionListener(abListener);
        bottom.add(minusBtn);
        JButton multiplyBtn = new JButton("*");
        multiplyBtn.addActionListener(abListener);
        bottom.add(multiplyBtn);
        JButton divBtn = new JButton("/");
        divBtn.addActionListener(abListener);
        bottom.add(divBtn);
        JButton cancelBtn = new JButton("C");
        bottom.add(cancelBtn);
        cancelBtn.addActionListener(abListener);
        JButton submitBtn = new JButton("Submit");
        bottom.add(submitBtn);
        submitBtn.addActionListener(abListener);
        mainFrame.setVisible(true);
    }

    private void addNumberButton() {
        for (int i = 0; i <= 9; i++) {
            JButton digitBtn = new JButton(String.valueOf(i));
            bottom.add(digitBtn);
            digitBtn.addActionListener(abListener);
        }
    }

}