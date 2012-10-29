package gui;

import java.awt.CardLayout;
import javax.swing.JPanel;

public class MainFrame extends javax.swing.JFrame {

    public MainFrame() {
        initComponents();
        
        
        jPanelMain.remove(jPanelContrataciones);
        jPanelContrataciones = new PanelContrataciones(this);
        jPanelMain.add(jPanelContrataciones, "jPanelContrataciones");
        
        jPanelMain.remove(jPanelConsumos);
        jPanelConsumos = new PanelConsumos(this);
        jPanelMain.add(jPanelConsumos, "jPanelConsumos");
        
        jPanelMain.remove(jPanelRetiros);
        jPanelRetiros = new PanelRetiros(this);
        jPanelMain.add(jPanelRetiros, "jPanelRetiros");
        
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
        jLabelTitulo = new javax.swing.JLabel();
        jLabelLogoUV = new javax.swing.JLabel();
        jPanelRetiros = new javax.swing.JPanel();
        jPanelContrataciones = new javax.swing.JPanel();
        jPanelConsumos = new javax.swing.JPanel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItemSali = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new java.awt.BorderLayout(0, 5));

        jPanelMenuPrincipal.setLayout(new java.awt.GridLayout(1, 4, 20, 0));

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

        jPanelHome.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanelHome.setPreferredSize(new java.awt.Dimension(700, 330));
        jPanelHome.setLayout(new java.awt.GridLayout(2, 0));

        jLabelTitulo.setFont(new java.awt.Font("Ubuntu", 1, 80)); // NOI18N
        jLabelTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelTitulo.setText("COLMOVIL - DWH");
        jPanelHome.add(jLabelTitulo);

        jLabelLogoUV.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelLogoUV.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/imagenes/UNIVALLE.jpg"))); // NOI18N
        jPanelHome.add(jLabelLogoUV);

        jPanelMain.add(jPanelHome, "jPanelHome");

        jPanelRetiros.setLayout(null);
        jPanelMain.add(jPanelRetiros, "jPanelRetiros");

        jPanelContrataciones.setLayout(null);
        jPanelMain.add(jPanelContrataciones, "jPanelContrataciones");

        jPanelConsumos.setLayout(null);
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
        setBounds((screenSize.width-710)/2, (screenSize.height-430)/2, 710, 430);
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItemSaliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemSaliActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jMenuItemSaliActionPerformed

    private void jButtonRetirosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRetirosActionPerformed
        CardLayout cl = (CardLayout) (jPanelMain.getLayout());
        cl.show(jPanelMain, "jPanelRetiros");
        UpdateFrameSize(jPanelRetiros);
    }//GEN-LAST:event_jButtonRetirosActionPerformed

    private void jButtonContratacionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonContratacionesActionPerformed
        CardLayout cl = (CardLayout) (jPanelMain.getLayout());
        cl.show(jPanelMain, "jPanelContrataciones");
        UpdateFrameSize(jPanelContrataciones);
    }//GEN-LAST:event_jButtonContratacionesActionPerformed

    private void jButtonConsumosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonConsumosActionPerformed
        CardLayout cl = (CardLayout) (jPanelMain.getLayout());
        cl.show(jPanelMain, "jPanelConsumos");
        UpdateFrameSize(jPanelConsumos);
    }//GEN-LAST:event_jButtonConsumosActionPerformed

    private void jButtonHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonHomeActionPerformed
        CardLayout cl = (CardLayout) (jPanelMain.getLayout());
        cl.show(jPanelMain, "jPanelHome");
        UpdateFrameSize(jPanelHome);
    }//GEN-LAST:event_jButtonHomeActionPerformed

    private void UpdateFrameSize(JPanel panel){
        int newHeight=panel.getPreferredSize().height+70;
        int newWidth=panel.getPreferredSize().width+10;
        
        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width - newWidth) / 2, (screenSize.height - newHeight) / 2, newWidth, newHeight);
    }
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
    private javax.swing.JLabel jLabelLogoUV;
    private javax.swing.JLabel jLabelTitulo;
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
