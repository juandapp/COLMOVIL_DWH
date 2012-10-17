/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import controladores.ControladorRetiros;
import java.awt.BorderLayout;
import java.awt.CardLayout;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import org.jfree.chart.ChartPanel;

/**
 *
 * @author gustavo
 */
public class panelRetiros extends javax.swing.JPanel {

    private final ControladorRetiros controladorRetiros;
    private MainFrame main;
    JPanel jPanelBar;
    JPanel jPanelPie;

    /**
     * Creates new form panelRetiros
     */
    public panelRetiros(MainFrame main) {
        this.main = main;
        controladorRetiros = new ControladorRetiros();
        initComponents();

        jComboBoxDimension.setModel(new javax.swing.DefaultComboBoxModel(
                controladorRetiros.getDimensiones()));
        jComboBoxAtributo.setModel(new javax.swing.DefaultComboBoxModel(
                controladorRetiros.getAtributosInteresantes(jComboBoxDimension.getSelectedItem().toString())));
        jComboBoxAtributo1.setModel(new javax.swing.DefaultComboBoxModel(
                controladorRetiros.getAtributosInteresantes("Retiros")));

        imagen.setIcon(new ImageIcon("imagenes/retiros.jpg"));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelMenu = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();
        jComboBoxDimension = new javax.swing.JComboBox();
        jComboBoxAtributo = new javax.swing.JComboBox();
        jButtonPieJoin = new javax.swing.JButton();
        jButtonBarJoin = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();
        jComboBoxAtributo1 = new javax.swing.JComboBox();
        jButtonPie1 = new javax.swing.JButton();
        jButtonBar1 = new javax.swing.JButton();
        jPanelGrafica = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        imagen = new javax.swing.JLabel();

        setLayout(new java.awt.BorderLayout());

        jPanelMenu.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.lightGray, java.awt.Color.white, null, null));

        jButton3.setText("Inicio");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jComboBoxDimension.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxDimensionActionPerformed(evt);
            }
        });

        jComboBoxAtributo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxAtributoActionPerformed(evt);
            }
        });

        jButtonPieJoin.setText("Pie");
        jButtonPieJoin.setPreferredSize(new java.awt.Dimension(60, 30));
        jButtonPieJoin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPieJoinActionPerformed(evt);
            }
        });

        jButtonBarJoin.setText("Bar");
        jButtonBarJoin.setPreferredSize(new java.awt.Dimension(60, 30));
        jButtonBarJoin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBarJoinActionPerformed(evt);
            }
        });

        jLabel2.setText("Dimension");

        jLabel3.setText("Atributo");

        jLabel4.setText("Atributo");

        jComboBoxAtributo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxAtributo1ActionPerformed(evt);
            }
        });

        jButtonPie1.setText("Pie");
        jButtonPie1.setPreferredSize(new java.awt.Dimension(60, 30));
        jButtonPie1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPie1ActionPerformed(evt);
            }
        });

        jButtonBar1.setText("Bar");
        jButtonBar1.setPreferredSize(new java.awt.Dimension(60, 30));
        jButtonBar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBar1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelMenuLayout = new javax.swing.GroupLayout(jPanelMenu);
        jPanelMenu.setLayout(jPanelMenuLayout);
        jPanelMenuLayout.setHorizontalGroup(
            jPanelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jButton3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jComboBoxDimension, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jComboBoxAtributo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jSeparator4)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelMenuLayout.createSequentialGroup()
                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelMenuLayout.createSequentialGroup()
                .addGroup(jPanelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jComboBoxAtributo1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanelMenuLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButtonPie1, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jSeparator3)
                    .addGroup(jPanelMenuLayout.createSequentialGroup()
                        .addComponent(jButtonPieJoin, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonBarJoin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(1, 1, 1))
        );
        jPanelMenuLayout.setVerticalGroup(
            jPanelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelMenuLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jComboBoxDimension, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jComboBoxAtributo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonPieJoin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonBarJoin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jComboBoxAtributo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonPie1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(101, Short.MAX_VALUE))
        );

        add(jPanelMenu, java.awt.BorderLayout.WEST);

        jPanelGrafica.setName(""); // NOI18N
        jPanelGrafica.setLayout(new java.awt.CardLayout());

        jPanel1.setLayout(new java.awt.BorderLayout());
        jPanel1.add(imagen, java.awt.BorderLayout.CENTER);

        jPanelGrafica.add(jPanel1, "imagen");

        add(jPanelGrafica, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBoxAtributoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxAtributoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxAtributoActionPerformed

    private void jButtonBarJoinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBarJoinActionPerformed

        String[][] matrizCausas = controladorRetiros.reporteUnParametroJoinBarra(
                jComboBoxDimension.getSelectedItem().toString(),
                jComboBoxAtributo.getSelectedItem().toString());
        BarChart barChart = new BarChart("Retiros y Causas", matrizCausas);
        jPanelBar = barChart.getChartPanel();
        jPanelGrafica.add(jPanelBar, "jPanelBar");
        CardLayout cl = (CardLayout) (jPanelGrafica.getLayout());
        cl.show(jPanelGrafica, (String) "jPanelBar");
        main.pack();

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
        main.pack();

    }//GEN-LAST:event_jButtonPieJoinActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed

        CardLayout cl = (CardLayout) (main.panelCards.getLayout());
        cl.show(main.panelCards, (String) "menu");

    }//GEN-LAST:event_jButton3ActionPerformed

    private void jComboBoxAtributo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxAtributo1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxAtributo1ActionPerformed

    private void jButtonPie1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPie1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonPie1ActionPerformed

    private void jButtonBar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBar1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonBar1ActionPerformed

    private void jComboBoxDimensionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxDimensionActionPerformed
        jComboBoxAtributo.setModel(new javax.swing.DefaultComboBoxModel(
                controladorRetiros.getAtributosInteresantes(jComboBoxDimension.getSelectedItem().toString())));
    }//GEN-LAST:event_jComboBoxDimensionActionPerformed
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel imagen;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButtonBar1;
    private javax.swing.JButton jButtonBarJoin;
    private javax.swing.JButton jButtonPie1;
    private javax.swing.JButton jButtonPieJoin;
    private javax.swing.JComboBox jComboBoxAtributo;
    private javax.swing.JComboBox jComboBoxAtributo1;
    private javax.swing.JComboBox jComboBoxDimension;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanelGrafica;
    private javax.swing.JPanel jPanelMenu;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    // End of variables declaration//GEN-END:variables
}
