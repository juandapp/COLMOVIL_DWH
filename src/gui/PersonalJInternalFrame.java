package gui;

import javax.swing.JPanel;

public class PersonalJInternalFrame extends javax.swing.JInternalFrame {

   
    public PersonalJInternalFrame(JPanel chartPanel, String title) {
        initComponents();
        this.setTitle(title);
        jPanelGrafica.add(chartPanel, java.awt.BorderLayout.CENTER);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelGrafica = new javax.swing.JPanel();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);

        jPanelGrafica.setBackground(new java.awt.Color(255, 255, 255));
        jPanelGrafica.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanelGrafica.setLayout(new java.awt.BorderLayout());
        getContentPane().add(jPanelGrafica, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanelGrafica;
    // End of variables declaration//GEN-END:variables
}
