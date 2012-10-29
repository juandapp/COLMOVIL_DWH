package gui;

import controladores.ControladorRetiros;
import java.awt.CardLayout;
import javax.swing.JPanel;

public class PanelRetiros extends javax.swing.JPanel {

    private final ControladorRetiros controladorRetiros;
    private MainFrame parent;
    JPanel jPanelBar;
    JPanel jPanelPie;

    public PanelRetiros(MainFrame parent) {
        
        this.parent = parent;
        
        controladorRetiros = new ControladorRetiros();
        initComponents();

        jComboBoxDimension.setModel(new javax.swing.DefaultComboBoxModel(
                controladorRetiros.getDimensionesRelacionadas("Retiros")));
        jComboBoxAtributo.setModel(new javax.swing.DefaultComboBoxModel(
                controladorRetiros.getAtributosInteresantes(jComboBoxDimension.getSelectedItem().toString())));
        jComboBoxHechos.setModel(new javax.swing.DefaultComboBoxModel(
                controladorRetiros.getAtributosInteresantes("Retiros")));

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelMenu = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jComboBoxHechos = new javax.swing.JComboBox();
        jButtonBar1 = new javax.swing.JButton();
        jButtonPie1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jComboBoxDimension = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        jComboBoxAtributo = new javax.swing.JComboBox();
        jButtonPieJoin = new javax.swing.JButton();
        jButtonBarJoin = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jComboBoxDimension1 = new javax.swing.JComboBox();
        jLabel6 = new javax.swing.JLabel();
        jComboBoxAtributo2 = new javax.swing.JComboBox();
        jLabel7 = new javax.swing.JLabel();
        jComboBoxDimension2 = new javax.swing.JComboBox();
        jButtonBarJoin1 = new javax.swing.JButton();
        jPanelGrafica = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jPanelNorte = new javax.swing.JPanel();
        jPanelCentro = new javax.swing.JPanel();
        imagen = new javax.swing.JLabel();
        jPanelSur = new javax.swing.JPanel();

        setPreferredSize(new java.awt.Dimension(900, 650));
        setLayout(new java.awt.BorderLayout());

        jPanelMenu.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.lightGray, java.awt.Color.white, null, null));
        jPanelMenu.setPreferredSize(new java.awt.Dimension(250, 50));

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("uno"));
        jPanel3.setPreferredSize(new java.awt.Dimension(230, 120));

        jLabel4.setText("Atributo");
        jLabel4.setPreferredSize(new java.awt.Dimension(200, 15));
        jPanel3.add(jLabel4);

        jComboBoxHechos.setPreferredSize(new java.awt.Dimension(200, 30));
        jPanel3.add(jComboBoxHechos);

        jButtonBar1.setText("Bar");
        jButtonBar1.setPreferredSize(new java.awt.Dimension(90, 30));
        jButtonBar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBar1ActionPerformed(evt);
            }
        });
        jPanel3.add(jButtonBar1);

        jButtonPie1.setText("Pie");
        jButtonPie1.setPreferredSize(new java.awt.Dimension(90, 30));
        jButtonPie1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPie1ActionPerformed(evt);
            }
        });
        jPanel3.add(jButtonPie1);

        jPanelMenu.add(jPanel3);

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("dos"));
        jPanel2.setPreferredSize(new java.awt.Dimension(230, 180));

        jLabel2.setText("Dimension");
        jLabel2.setPreferredSize(new java.awt.Dimension(200, 15));
        jPanel2.add(jLabel2);

        jComboBoxDimension.setPreferredSize(new java.awt.Dimension(200, 30));
        jComboBoxDimension.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxDimensionActionPerformed(evt);
            }
        });
        jPanel2.add(jComboBoxDimension);

        jLabel3.setText("Atributo");
        jLabel3.setPreferredSize(new java.awt.Dimension(200, 15));
        jPanel2.add(jLabel3);

        jComboBoxAtributo.setPreferredSize(new java.awt.Dimension(200, 30));
        jComboBoxAtributo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxAtributoActionPerformed(evt);
            }
        });
        jPanel2.add(jComboBoxAtributo);

        jButtonPieJoin.setText("Pie");
        jButtonPieJoin.setPreferredSize(new java.awt.Dimension(90, 30));
        jButtonPieJoin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPieJoinActionPerformed(evt);
            }
        });
        jPanel2.add(jButtonPieJoin);

        jButtonBarJoin.setText("Bar");
        jButtonBarJoin.setPreferredSize(new java.awt.Dimension(90, 30));
        jButtonBarJoin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBarJoinActionPerformed(evt);
            }
        });
        jPanel2.add(jButtonBarJoin);

        jPanelMenu.add(jPanel2);

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("tres"));
        jPanel4.setPreferredSize(new java.awt.Dimension(230, 230));

        jLabel5.setText("Dimension");
        jLabel5.setPreferredSize(new java.awt.Dimension(200, 15));
        jPanel4.add(jLabel5);

        jComboBoxDimension1.setPreferredSize(new java.awt.Dimension(200, 30));
        jComboBoxDimension1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxDimension1ActionPerformed(evt);
            }
        });
        jPanel4.add(jComboBoxDimension1);

        jLabel6.setText("Atributo");
        jLabel6.setPreferredSize(new java.awt.Dimension(200, 15));
        jPanel4.add(jLabel6);

        jComboBoxAtributo2.setPreferredSize(new java.awt.Dimension(200, 30));
        jComboBoxAtributo2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxAtributo2ActionPerformed(evt);
            }
        });
        jPanel4.add(jComboBoxAtributo2);

        jLabel7.setText("Hecho");
        jLabel7.setPreferredSize(new java.awt.Dimension(200, 15));
        jPanel4.add(jLabel7);

        jComboBoxDimension2.setPreferredSize(new java.awt.Dimension(200, 30));
        jComboBoxDimension2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxDimension2ActionPerformed(evt);
            }
        });
        jPanel4.add(jComboBoxDimension2);

        jButtonBarJoin1.setText("Bar");
        jButtonBarJoin1.setPreferredSize(new java.awt.Dimension(200, 30));
        jButtonBarJoin1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBarJoin1ActionPerformed(evt);
            }
        });
        jPanel4.add(jButtonBarJoin1);

        jPanelMenu.add(jPanel4);

        add(jPanelMenu, java.awt.BorderLayout.WEST);

        jPanelGrafica.setName(""); // NOI18N
        jPanelGrafica.setLayout(new java.awt.CardLayout());

        jPanel1.setBackground(java.awt.Color.white);
        jPanel1.setLayout(new java.awt.BorderLayout());

        jPanelNorte.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanelNorte.setPreferredSize(new java.awt.Dimension(10, 150));
        jPanel1.add(jPanelNorte, java.awt.BorderLayout.PAGE_START);

        jPanelCentro.setLayout(new java.awt.BorderLayout());

        imagen.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        imagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/imagenes/retiros.jpg"))); // NOI18N
        imagen.setPreferredSize(new java.awt.Dimension(0, 0));
        jPanelCentro.add(imagen, java.awt.BorderLayout.CENTER);

        jPanel1.add(jPanelCentro, java.awt.BorderLayout.CENTER);

        jPanelSur.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanelSur.setPreferredSize(new java.awt.Dimension(10, 150));
        jPanel1.add(jPanelSur, java.awt.BorderLayout.PAGE_END);

        jPanelGrafica.add(jPanel1, "imagen");

        add(jPanelGrafica, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonPie1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPie1ActionPerformed

        String[][] matrizCausas = controladorRetiros.reporteUnParametroPie(
            jComboBoxHechos.getSelectedItem().toString());
        PieChart pieChart = new PieChart("Retiros y Causas", matrizCausas);
        jPanelPie = pieChart.getChartPanel();
        jPanelGrafica.add(jPanelPie, "jPanelPie");
        CardLayout cl = (CardLayout) (jPanelGrafica.getLayout());
        cl.show(jPanelGrafica, (String) "jPanelPie");
        parent.pack();
    }//GEN-LAST:event_jButtonPie1ActionPerformed

    private void jButtonBar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBar1ActionPerformed
        String[][] matrizCausas = controladorRetiros.reporteUnParametroBarra(
            jComboBoxHechos.getSelectedItem().toString());
        BarChart barChart = new BarChart("Retiros y Causas", matrizCausas);
        jPanelBar = barChart.getChartPanel();
        jPanelGrafica.add(jPanelBar, "jPanelBar");
        CardLayout cl = (CardLayout) (jPanelGrafica.getLayout());
        cl.show(jPanelGrafica, (String) "jPanelBar");
        parent.pack();

    }//GEN-LAST:event_jButtonBar1ActionPerformed

    private void jButtonBarJoinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBarJoinActionPerformed

        String[][] matrizCausas = controladorRetiros.reporteUnParametroJoinBarra(
            jComboBoxDimension.getSelectedItem().toString(),
            jComboBoxAtributo.getSelectedItem().toString());
        BarChart barChart = new BarChart("Retiros y Causas", matrizCausas);
        jPanelBar = barChart.getChartPanel();
        jPanelGrafica.add(jPanelBar, "jPanelBar");
        CardLayout cl = (CardLayout) (jPanelGrafica.getLayout());
        cl.show(jPanelGrafica, (String) "jPanelBar");
        parent.pack();
    }//GEN-LAST:event_jButtonBarJoinActionPerformed

    private void jButtonPieJoinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPieJoinActionPerformed

        String[][] matrizCausas = controladorRetiros.reporteUnParametroJoinPie(
            jComboBoxDimension.getSelectedItem().toString(),
            jComboBoxAtributo.getSelectedItem().toString());
        PieChart pieChart = new PieChart("Retiros y Causas", matrizCausas);
        jPanelPie = pieChart.getChartPanel();
        jPanelGrafica.add(jPanelPie, "jPanelPie");
        CardLayout cl = (CardLayout) (jPanelGrafica.getLayout());
        cl.show(jPanelGrafica, (String) "jPanelPie");
        parent.pack();
    }//GEN-LAST:event_jButtonPieJoinActionPerformed

    private void jComboBoxAtributoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxAtributoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxAtributoActionPerformed

    private void jComboBoxDimensionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxDimensionActionPerformed
        jComboBoxAtributo.setModel(new javax.swing.DefaultComboBoxModel(
            controladorRetiros.getAtributosInteresantes(jComboBoxDimension.getSelectedItem().toString())));
    }//GEN-LAST:event_jComboBoxDimensionActionPerformed

    private void jComboBoxDimension1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxDimension1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxDimension1ActionPerformed

    private void jComboBoxAtributo2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxAtributo2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxAtributo2ActionPerformed

    private void jButtonBarJoin1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBarJoin1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonBarJoin1ActionPerformed

    private void jComboBoxDimension2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxDimension2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxDimension2ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel imagen;
    private javax.swing.JButton jButtonBar1;
    private javax.swing.JButton jButtonBarJoin;
    private javax.swing.JButton jButtonBarJoin1;
    private javax.swing.JButton jButtonPie1;
    private javax.swing.JButton jButtonPieJoin;
    private javax.swing.JComboBox jComboBoxAtributo;
    private javax.swing.JComboBox jComboBoxAtributo2;
    private javax.swing.JComboBox jComboBoxDimension;
    private javax.swing.JComboBox jComboBoxDimension1;
    private javax.swing.JComboBox jComboBoxDimension2;
    private javax.swing.JComboBox jComboBoxHechos;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanelCentro;
    private javax.swing.JPanel jPanelGrafica;
    private javax.swing.JPanel jPanelMenu;
    private javax.swing.JPanel jPanelNorte;
    private javax.swing.JPanel jPanelSur;
    // End of variables declaration//GEN-END:variables
}
