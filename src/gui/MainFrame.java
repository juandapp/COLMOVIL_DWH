package gui;

import java.awt.CardLayout;

public class MainFrame extends javax.swing.JFrame {

    public MainFrame() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelMenuPrincipal = new javax.swing.JPanel();
        jButtonHome = new javax.swing.JButton();
        jButtonRetiros = new javax.swing.JButton();
        jButtonContrataciones = new javax.swing.JButton();
        jButtonConsumos = new javax.swing.JButton();
        jPanelMain = new javax.swing.JPanel();
        jPanelHome = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jPanelRetiros = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanelContrataciones = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanelConsumos = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItemSali = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new java.awt.BorderLayout(10, 0));

        jPanelMenuPrincipal.setLayout(new java.awt.GridLayout(1, 4, 10, 0));

        jButtonHome.setText("Home");
        jButtonHome.setPreferredSize(new java.awt.Dimension(60, 40));
        jButtonHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonHomeActionPerformed(evt);
            }
        });
        jPanelMenuPrincipal.add(jButtonHome);

        jButtonRetiros.setText("Retiros");
        jButtonRetiros.setPreferredSize(new java.awt.Dimension(60, 40));
        jButtonRetiros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRetirosActionPerformed(evt);
            }
        });
        jPanelMenuPrincipal.add(jButtonRetiros);

        jButtonContrataciones.setText("Contrataciones");
        jButtonContrataciones.setPreferredSize(new java.awt.Dimension(60, 40));
        jButtonContrataciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonContratacionesActionPerformed(evt);
            }
        });
        jPanelMenuPrincipal.add(jButtonContrataciones);

        jButtonConsumos.setText("Consumos");
        jButtonConsumos.setPreferredSize(new java.awt.Dimension(60, 40));
        jButtonConsumos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonConsumosActionPerformed(evt);
            }
        });
        jPanelMenuPrincipal.add(jButtonConsumos);

        getContentPane().add(jPanelMenuPrincipal, java.awt.BorderLayout.NORTH);

        jPanelMain.setLayout(new java.awt.CardLayout());

        jPanelHome.setBackground(new java.awt.Color(242, 241, 225));
        jPanelHome.setLayout(new java.awt.BorderLayout());

        jLabel4.setFont(new java.awt.Font("Ubuntu", 1, 50)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("COLMOVIL - DWH");
        jPanelHome.add(jLabel4, java.awt.BorderLayout.CENTER);

        jPanelMain.add(jPanelHome, "jPanelHome");

        jPanelRetiros.setBackground(new java.awt.Color(242, 241, 235));
        jPanelRetiros.setLayout(new java.awt.BorderLayout());

        jLabel1.setFont(new java.awt.Font("Ubuntu", 1, 50)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("RETIROS");
        jPanelRetiros.add(jLabel1, java.awt.BorderLayout.CENTER);

        jPanelMain.add(jPanelRetiros, "jPanelRetiros");

        jPanelContrataciones.setBackground(new java.awt.Color(242, 241, 245));
        jPanelContrataciones.setLayout(new java.awt.BorderLayout());

        jLabel2.setFont(new java.awt.Font("Ubuntu", 1, 50)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("CONTRATACIONES");
        jPanelContrataciones.add(jLabel2, java.awt.BorderLayout.CENTER);

        jPanelMain.add(jPanelContrataciones, "jPanelContrataciones");

        jPanelConsumos.setBackground(new java.awt.Color(242, 241, 255));
        jPanelConsumos.setLayout(new java.awt.BorderLayout());

        jLabel3.setFont(new java.awt.Font("Ubuntu", 1, 50)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("CONSUMOS");
        jPanelConsumos.add(jLabel3, java.awt.BorderLayout.CENTER);

        jPanelMain.add(jPanelConsumos, "jPanelConsumos");

        getContentPane().add(jPanelMain, java.awt.BorderLayout.CENTER);

        jMenu1.setText("Archivo");

        jMenuItemSali.setText("Salir");
        jMenuItemSali.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemSaliActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItemSali);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Ayuda");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-610)/2, (screenSize.height-367)/2, 610, 367);
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItemSaliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemSaliActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jMenuItemSaliActionPerformed

    private void jButtonRetirosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRetirosActionPerformed
        CardLayout cl = (CardLayout) (jPanelMain.getLayout());
        cl.show(jPanelMain, "jPanelRetiros");

    }//GEN-LAST:event_jButtonRetirosActionPerformed

    private void jButtonContratacionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonContratacionesActionPerformed
        CardLayout cl = (CardLayout) (jPanelMain.getLayout());
        cl.show(jPanelMain, "jPanelContrataciones");
    }//GEN-LAST:event_jButtonContratacionesActionPerformed

    private void jButtonConsumosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonConsumosActionPerformed
        CardLayout cl = (CardLayout) (jPanelMain.getLayout());
        cl.show(jPanelMain, "jPanelConsumos");
    }//GEN-LAST:event_jButtonConsumosActionPerformed

    private void jButtonHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonHomeActionPerformed
        CardLayout cl = (CardLayout) (jPanelMain.getLayout());
        cl.show(jPanelMain, "jPanelHome");
    }//GEN-LAST:event_jButtonHomeActionPerformed

    //<editor-fold defaultstate="collapsed" desc="main()">
    public static void main(String args[]) {
        try {
            javax.swing.UIManager.setLookAndFeel(javax.swing.UIManager.getSystemLookAndFeelClassName());
        } catch (Exception ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainFrame().setVisible(true);
            }
        });
    }
    //</editor-fold>
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonConsumos;
    private javax.swing.JButton jButtonContrataciones;
    private javax.swing.JButton jButtonHome;
    private javax.swing.JButton jButtonRetiros;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItemSali;
    private javax.swing.JPanel jPanelConsumos;
    private javax.swing.JPanel jPanelContrataciones;
    private javax.swing.JPanel jPanelHome;
    private javax.swing.JPanel jPanelMain;
    private javax.swing.JPanel jPanelMenuPrincipal;
    private javax.swing.JPanel jPanelRetiros;
    // End of variables declaration//GEN-END:variables
}
