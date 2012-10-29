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
        jPanelUno = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jComboBoxHechos = new javax.swing.JComboBox();
        jButtonBar1 = new javax.swing.JButton();
        jButtonPie1 = new javax.swing.JButton();
        jPanelDos = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jComboBoxDimension = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        jComboBoxAtributo = new javax.swing.JComboBox();
        jButtonPieJoin = new javax.swing.JButton();
        jButtonBarJoin = new javax.swing.JButton();
        jPanelTres = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jComboBoxDimension1 = new javax.swing.JComboBox();
        jLabel6 = new javax.swing.JLabel();
        jComboBoxAtributo2 = new javax.swing.JComboBox();
        jLabel7 = new javax.swing.JLabel();
        jComboBoxDimension2 = new javax.swing.JComboBox();
        jButtonBarJoin1 = new javax.swing.JButton();
        jPanelMain = new javax.swing.JPanel();
        jPanelNorte = new javax.swing.JPanel();
        jPanelGrafica = new javax.swing.JPanel();
        jLabelImagen = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(900, 650));
        setLayout(new java.awt.BorderLayout());

        jPanelMenu.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.lightGray, java.awt.Color.white, null, null));
        jPanelMenu.setPreferredSize(new java.awt.Dimension(210, 50));

        jPanelUno.setBorder(javax.swing.BorderFactory.createTitledBorder("Uno"));
        jPanelUno.setPreferredSize(new java.awt.Dimension(200, 110));

        jLabel4.setText("Atributo");
        jLabel4.setPreferredSize(new java.awt.Dimension(170, 15));
        jPanelUno.add(jLabel4);

        jComboBoxHechos.setPreferredSize(new java.awt.Dimension(170, 25));
        jPanelUno.add(jComboBoxHechos);

        jButtonBar1.setText("Bar");
        jButtonBar1.setPreferredSize(new java.awt.Dimension(80, 25));
        jButtonBar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBar1ActionPerformed(evt);
            }
        });
        jPanelUno.add(jButtonBar1);

        jButtonPie1.setText("Pie");
        jButtonPie1.setPreferredSize(new java.awt.Dimension(80, 25));
        jButtonPie1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPie1ActionPerformed(evt);
            }
        });
        jPanelUno.add(jButtonPie1);

        jPanelMenu.add(jPanelUno);

        jPanelDos.setBorder(javax.swing.BorderFactory.createTitledBorder("Dos"));
        jPanelDos.setPreferredSize(new java.awt.Dimension(200, 160));

        jLabel2.setText("Dimension");
        jLabel2.setPreferredSize(new java.awt.Dimension(170, 15));
        jPanelDos.add(jLabel2);

        jComboBoxDimension.setPreferredSize(new java.awt.Dimension(170, 25));
        jComboBoxDimension.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxDimensionActionPerformed(evt);
            }
        });
        jPanelDos.add(jComboBoxDimension);

        jLabel3.setText("Atributo");
        jLabel3.setPreferredSize(new java.awt.Dimension(170, 15));
        jPanelDos.add(jLabel3);

        jComboBoxAtributo.setPreferredSize(new java.awt.Dimension(170, 25));
        jPanelDos.add(jComboBoxAtributo);

        jButtonPieJoin.setText("Pie");
        jButtonPieJoin.setPreferredSize(new java.awt.Dimension(80, 25));
        jButtonPieJoin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPieJoinActionPerformed(evt);
            }
        });
        jPanelDos.add(jButtonPieJoin);

        jButtonBarJoin.setText("Bar");
        jButtonBarJoin.setPreferredSize(new java.awt.Dimension(80, 25));
        jButtonBarJoin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBarJoinActionPerformed(evt);
            }
        });
        jPanelDos.add(jButtonBarJoin);

        jPanelMenu.add(jPanelDos);

        jPanelTres.setBorder(javax.swing.BorderFactory.createTitledBorder("Tres"));
        jPanelTres.setPreferredSize(new java.awt.Dimension(200, 210));

        jLabel5.setText("Dimension");
        jLabel5.setPreferredSize(new java.awt.Dimension(170, 15));
        jPanelTres.add(jLabel5);

        jComboBoxDimension1.setPreferredSize(new java.awt.Dimension(170, 25));
        jPanelTres.add(jComboBoxDimension1);

        jLabel6.setText("Atributo");
        jLabel6.setPreferredSize(new java.awt.Dimension(170, 15));
        jPanelTres.add(jLabel6);

        jComboBoxAtributo2.setPreferredSize(new java.awt.Dimension(170, 25));
        jPanelTres.add(jComboBoxAtributo2);

        jLabel7.setText("Hecho");
        jLabel7.setPreferredSize(new java.awt.Dimension(170, 15));
        jPanelTres.add(jLabel7);

        jComboBoxDimension2.setPreferredSize(new java.awt.Dimension(170, 25));
        jPanelTres.add(jComboBoxDimension2);

        jButtonBarJoin1.setText("Bar");
        jButtonBarJoin1.setPreferredSize(new java.awt.Dimension(170, 25));
        jPanelTres.add(jButtonBarJoin1);

        jPanelMenu.add(jPanelTres);

        add(jPanelMenu, java.awt.BorderLayout.WEST);

        jPanelMain.setName(""); // NOI18N
        jPanelMain.setLayout(new java.awt.BorderLayout());

        jPanelNorte.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanelNorte.setPreferredSize(new java.awt.Dimension(10, 200));
        jPanelMain.add(jPanelNorte, java.awt.BorderLayout.PAGE_START);

        jPanelGrafica.setBackground(new java.awt.Color(255, 255, 255));
        jPanelGrafica.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanelGrafica.setLayout(new java.awt.BorderLayout());

        jLabelImagen.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelImagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/imagenes/retiros.jpg"))); // NOI18N
        jLabelImagen.setPreferredSize(new java.awt.Dimension(0, 0));
        jPanelGrafica.add(jLabelImagen, java.awt.BorderLayout.CENTER);

        jPanelMain.add(jPanelGrafica, java.awt.BorderLayout.CENTER);

        add(jPanelMain, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonPie1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPie1ActionPerformed
        String[][] matrizCausas = controladorRetiros.reporteUnParametroPie(
                jComboBoxHechos.getSelectedItem().toString());
        PieChart pieChart = new PieChart("Retiros y Causas", matrizCausas);
        jPanelGrafica.removeAll();
        jPanelGrafica.add(pieChart.getChartPanel(), java.awt.BorderLayout.CENTER);
        jPanelGrafica.updateUI();

    }//GEN-LAST:event_jButtonPie1ActionPerformed

    private void jButtonBar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBar1ActionPerformed
        String[][] matrizCausas = controladorRetiros.reporteUnParametroBarra(
                jComboBoxHechos.getSelectedItem().toString());
        BarChart barChart = new BarChart("Retiros y Causas", matrizCausas);
        jPanelBar = barChart.getChartPanel();
        jPanelGrafica.removeAll();
        jPanelGrafica.add(barChart.getChartPanel(), java.awt.BorderLayout.CENTER);
        jPanelGrafica.updateUI();

    }//GEN-LAST:event_jButtonBar1ActionPerformed

    private void jButtonBarJoinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBarJoinActionPerformed
        String[][] matrizCausas = controladorRetiros.reporteUnParametroJoinBarra(
                jComboBoxDimension.getSelectedItem().toString(),
                jComboBoxAtributo.getSelectedItem().toString());

        BarChart barChart = new BarChart("Retiros y Causas", matrizCausas);
        jPanelBar = barChart.getChartPanel();

        jPanelGrafica.removeAll();
        jPanelGrafica.add(barChart.getChartPanel(), java.awt.BorderLayout.CENTER);
        jPanelGrafica.updateUI();
    }//GEN-LAST:event_jButtonBarJoinActionPerformed

    private void jButtonPieJoinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPieJoinActionPerformed

        String[][] matrizCausas = controladorRetiros.reporteUnParametroJoinPie(
                jComboBoxDimension.getSelectedItem().toString(),
                jComboBoxAtributo.getSelectedItem().toString());
        PieChart pieChart = new PieChart("Retiros y Causas", matrizCausas);
        jPanelPie = pieChart.getChartPanel();

        jPanelGrafica.removeAll();
        jPanelGrafica.add(pieChart.getChartPanel(), java.awt.BorderLayout.CENTER);
        jPanelGrafica.updateUI();
    }//GEN-LAST:event_jButtonPieJoinActionPerformed

    private void jComboBoxDimensionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxDimensionActionPerformed
        jComboBoxAtributo.setModel(new javax.swing.DefaultComboBoxModel(
                controladorRetiros.getAtributosInteresantes(jComboBoxDimension.getSelectedItem().toString())));
    }//GEN-LAST:event_jComboBoxDimensionActionPerformed
    // Variables declaration - do not modify//GEN-BEGIN:variables
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
    private javax.swing.JLabel jLabelImagen;
    private javax.swing.JPanel jPanelDos;
    private javax.swing.JPanel jPanelGrafica;
    private javax.swing.JPanel jPanelMain;
    private javax.swing.JPanel jPanelMenu;
    private javax.swing.JPanel jPanelNorte;
    private javax.swing.JPanel jPanelTres;
    private javax.swing.JPanel jPanelUno;
    // End of variables declaration//GEN-END:variables
}
