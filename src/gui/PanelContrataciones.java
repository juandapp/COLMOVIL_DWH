package gui;

public class PanelContrataciones extends javax.swing.JPanel {

    MainFrame parent;

    public PanelContrataciones(MainFrame parent) {
        this.parent = parent;
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelTitle = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(750, 400));
        setLayout(new java.awt.BorderLayout());

        jLabelTitle.setFont(new java.awt.Font("Ubuntu", 1, 50)); // NOI18N
        jLabelTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelTitle.setText("CONTRATACIONES");
        add(jLabelTitle, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabelTitle;
    // End of variables declaration//GEN-END:variables
}