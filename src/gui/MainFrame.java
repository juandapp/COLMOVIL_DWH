package gui;

import java.awt.CardLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MainFrame extends javax.swing.JFrame {

    private String currentPanel;

    public MainFrame() {
        initComponents();

        currentPanel = "jPanelHome";

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

        jPanelMain = new javax.swing.JPanel();
        jPanelHome = new javax.swing.JPanel();
        jLabelTitulo = new javax.swing.JLabel();
        jLabelLogoUV = new javax.swing.JLabel();
        jPanelRetiros = new javax.swing.JPanel();
        jPanelContrataciones = new javax.swing.JPanel();
        jPanelConsumos = new javax.swing.JPanel();
        jToolBar1 = new javax.swing.JToolBar();
        jButtonHome = new javax.swing.JButton();
        jSeparator3 = new javax.swing.JToolBar.Separator();
        jButtonConsumos = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JToolBar.Separator();
        jButtonRetiros = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JToolBar.Separator();
        jButtonContrataciones = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItemSali = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItemMosaico = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanelMain.setPreferredSize(new java.awt.Dimension(700, 350));
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

        jToolBar1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jToolBar1.setRollover(true);
        jToolBar1.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N

        jButtonHome.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jButtonHome.setText("Home");
        jButtonHome.setFocusable(false);
        jButtonHome.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonHome.setPreferredSize(new java.awt.Dimension(150, 40));
        jButtonHome.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButtonHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonHomeActionPerformed(evt);
            }
        });
        jToolBar1.add(jButtonHome);
        jToolBar1.add(jSeparator3);

        jButtonConsumos.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jButtonConsumos.setText("Consumos");
        jButtonConsumos.setFocusable(false);
        jButtonConsumos.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonConsumos.setPreferredSize(new java.awt.Dimension(150, 40));
        jButtonConsumos.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButtonConsumos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonConsumosActionPerformed(evt);
            }
        });
        jToolBar1.add(jButtonConsumos);
        jToolBar1.add(jSeparator2);

        jButtonRetiros.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jButtonRetiros.setText("Retiros");
        jButtonRetiros.setFocusable(false);
        jButtonRetiros.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonRetiros.setPreferredSize(new java.awt.Dimension(150, 40));
        jButtonRetiros.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButtonRetiros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRetirosActionPerformed(evt);
            }
        });
        jToolBar1.add(jButtonRetiros);
        jToolBar1.add(jSeparator1);

        jButtonContrataciones.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jButtonContrataciones.setText("Contrataciones");
        jButtonContrataciones.setFocusable(false);
        jButtonContrataciones.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonContrataciones.setPreferredSize(new java.awt.Dimension(150, 40));
        jButtonContrataciones.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButtonContrataciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonContratacionesActionPerformed(evt);
            }
        });
        jToolBar1.add(jButtonContrataciones);

        getContentPane().add(jToolBar1, java.awt.BorderLayout.NORTH);

        jMenu1.setText("Archivo");

        jMenuItemSali.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Q, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItemSali.setText("Salir");
        jMenuItemSali.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemSaliActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItemSali);

        jMenuBar1.add(jMenu1);

        jMenu3.setText("Ventana");

        jMenuItemMosaico.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_M, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItemMosaico.setText("Mosaico");
        jMenuItemMosaico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemMosaicoActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItemMosaico);

        jMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_T, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem2.setText("Mostar Todas");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem2);

        jMenuBar1.add(jMenu3);

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
        currentPanel = "jPanelRetiros";
        UpdateFrameSize(jPanelRetiros);
    }//GEN-LAST:event_jButtonRetirosActionPerformed

    private void jButtonContratacionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonContratacionesActionPerformed
        CardLayout cl = (CardLayout) (jPanelMain.getLayout());
        cl.show(jPanelMain, "jPanelContrataciones");
        currentPanel = "jPanelContrataciones";
        UpdateFrameSize(jPanelContrataciones);
    }//GEN-LAST:event_jButtonContratacionesActionPerformed

    private void jButtonConsumosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonConsumosActionPerformed
        CardLayout cl = (CardLayout) (jPanelMain.getLayout());
        cl.show(jPanelMain, "jPanelConsumos");
        currentPanel = "jPanelConsumos";
        UpdateFrameSize(jPanelConsumos);
    }//GEN-LAST:event_jButtonConsumosActionPerformed

    private void jButtonHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonHomeActionPerformed
        CardLayout cl = (CardLayout) (jPanelMain.getLayout());
        cl.show(jPanelMain, "jPanelHome");
        currentPanel = "jPanelHome";
        UpdateFrameSize(jPanelHome);
    }//GEN-LAST:event_jButtonHomeActionPerformed

    private void jMenuItemMosaicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemMosaicoActionPerformed
        if (currentPanel.endsWith("jPanelRetiros")) {
            ((PanelRetiros) jPanelRetiros).tileInternalframes();
        }
    }//GEN-LAST:event_jMenuItemMosaicoActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        if (currentPanel.endsWith("jPanelRetiros")) {
            ((PanelRetiros) jPanelRetiros).maximizarTodos();
        }
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void UpdateFrameSize(JPanel panel) {
        if (this.getExtendedState() != JFrame.MAXIMIZED_BOTH) {
            int newHeight = panel.getPreferredSize().height + 30 + 40 + 30;
            int newWidth = panel.getPreferredSize().width + 10;

            java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
            setBounds((screenSize.width - newWidth) / 2, (screenSize.height - newHeight) / 2, newWidth, newHeight);
        }
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
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItemMosaico;
    private javax.swing.JMenuItem jMenuItemSali;
    private javax.swing.JPanel jPanelConsumos;
    private javax.swing.JPanel jPanelContrataciones;
    private javax.swing.JPanel jPanelHome;
    private javax.swing.JPanel jPanelMain;
    private javax.swing.JPanel jPanelRetiros;
    private javax.swing.JToolBar.Separator jSeparator1;
    private javax.swing.JToolBar.Separator jSeparator2;
    private javax.swing.JToolBar.Separator jSeparator3;
    private javax.swing.JToolBar jToolBar1;
    // End of variables declaration//GEN-END:variables
}
