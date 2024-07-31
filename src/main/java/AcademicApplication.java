import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AcademicApplication extends JFrame {
    private JPanel mainPanel;
    private JLabel titleLabel;
    private JRadioButton yesButton, noButton;
    private JTextField studentNoField;
    private JButton nextPageButton;

    public AcademicApplication() {
        super("Academic Application Process");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 300);
        setLocationRelativeTo(null);

        mainPanel = new JPanel(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.fill = GridBagConstraints.HORIZONTAL;

        titleLabel = new JLabel("Do you already have a student number?");
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.gridwidth = 2;
        mainPanel.add(titleLabel, gbc);

        yesButton = new JRadioButton("Yes");
        noButton = new JRadioButton("No");
        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(yesButton);
        buttonGroup.add(noButton);
        gbc.gridx = 0;
        gbc.gridy = 1;
        mainPanel.add(yesButton, gbc);
        gbc.gridx = 1;
        mainPanel.add(noButton, gbc);

        studentNoField = new JTextField(10);
        studentNoField.setEnabled(false); // Initially disabled
        gbc.gridx = 0;
        gbc.gridy = 2;
        gbc.gridwidth = 2;
        mainPanel.add(studentNoField, gbc);

        nextPageButton = new JButton("Next Page");
        gbc.gridx = 0;
        gbc.gridy = 3;
        gbc.gridwidth = 2;
        mainPanel.add(nextPageButton, gbc);

        add(mainPanel);

        yesButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                studentNoField.setEnabled(true);
            }
        });

        noButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                studentNoField.setEnabled(false);
                studentNoField.setText("");
            }
        });

        nextPageButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Handle next page logic here
            }
        });

        setVisible(true);
    }

    public static void main(String[] args) {
        new AcademicApplication();
    }
}

