import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class firstPageGui extends JFrame implements ActionListener {
    private JPanel panelCenter, panelSouth, panelNorth;
    private JLabel lblHeading, lblAbout, lblCputApp, lblServices, lblShortText;
    private JButton BtnApply;

    public firstPageGui() {
        super("CPUT Online Application");
        panelCenter = new JPanel ();
        panelSouth = new JPanel ();
        panelNorth = new JPanel ();
        
        lblHeading = new JLabel ("CPUT ONLINE APPLICATION");
        lblAbout = new JLabel ("About | ");
        lblCputApp = new JLabel ("Study at CPUT |");
        lblServices= new JLabel ("Services");
        lblShortText= new JLabel ("Welcome to CPUT, 2025 Course offering and applicaions!");
        
        BtnApply = new JButton ("Apply Here!");
    }
    
    public void setGUI(){
        panelNorth.setLayout(new FlowLayout());
        panelCenter.setLayout(new GridLayout(2,1));
        panelSouth.setLayout(new FlowLayout());
        
        panelNorth.setPreferredSize(new Dimension(90,100));
        panelSouth.setPreferredSize(new Dimension(90,80));
        panelCenter.setPreferredSize(new Dimension(100,90));
        
        //panelNorth.setBackground(new Color());
        
        panelNorth.add(lblAbout);
        panelNorth.add(lblCputApp);
        panelNorth.add(lblServices);
        
        panelNorth.setAlignmentX(JPanel.LEFT_ALIGNMENT);
        
        panelCenter.add(lblHeading);
        lblHeading.setHorizontalAlignment(JLabel.CENTER);
        panelCenter.add(lblShortText);
        lblShortText.setHorizontalAlignment(JLabel.CENTER);
        lblShortText.setBounds(5,6,40,30);
        
        panelSouth.add(BtnApply);
        
        this.add(panelNorth, BorderLayout.NORTH);
        this.add(panelCenter, BorderLayout.CENTER);
        this.add(panelSouth, BorderLayout.SOUTH);
        
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        BtnApply.addActionListener(this);
        
        this.setSize(400,300);
        this.setVisible(true); 
        this.setLocationRelativeTo(null);
        
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        new AcademicApplication();
    }
    
      public static void main(String[] args) {
      new firstPageGui().setGUI();
      
    }
}
