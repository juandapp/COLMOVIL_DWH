package gui;

import javax.swing.JPanel;
import logica.LogicaRetiros;

public class PanelRetiros extends javax.swing.JPanel {

    private LogicaRetiros logicaRetiros;
    private MainFrame parent;

    public PanelRetiros(MainFrame parent) {
        this.parent = parent;
        logicaRetiros = new LogicaRetiros();
        initComponents();

        Object[] hechosInteresantes = logicaRetiros.getHechos();
        Object[] dimensionesRelacionadas = logicaRetiros.getDimensionesRelacionadas();
        Object[] atributosInteresantes = logicaRetiros.getAtributosInteresantes(0);


        jComboBoxHechos.setModel(new javax.swing.DefaultComboBoxModel(hechosInteresantes));
        jComboBoxDimension.setModel(new javax.swing.DefaultComboBoxModel(dimensionesRelacionadas));
        jComboBoxAtributo.setModel(new javax.swing.DefaultComboBoxModel(atributosInteresantes));

        jComboBoxHechos1.setModel(new javax.swing.DefaultComboBoxModel(hechosInteresantes));
        jComboBoxDimension1.setModel(new javax.swing.DefaultComboBoxModel(dimensionesRelacionadas));
        jComboBoxAtributo1.setModel(new javax.swing.DefaultComboBoxModel(atributosInteresantes));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelMenu = new javax.swing.JPanel();
        jPanelUno = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jComboBoxHechos = new javax.swing.JComboBox();
        jButtonBar = new javax.swing.JButton();
        jButtonPie = new javax.swing.JButton();
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
        jComboBoxAtributo1 = new javax.swing.JComboBox();
        jLabel7 = new javax.swing.JLabel();
        jComboBoxHechos1 = new javax.swing.JComboBox();
        jButtonBarJoin1 = new javax.swing.JButton();
        jPanelMain = new javax.swing.JPanel();
        jPanelNorte = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        jInternalFrame1 = new javax.swing.JInternalFrame();
        jPanelGrafica = new javax.swing.JPanel();
        jLabelImagen = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(1000, 600));
        setLayout(new java.awt.BorderLayout());

        jPanelMenu.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanelMenu.setPreferredSize(new java.awt.Dimension(240, 50));

        jPanelUno.setBorder(javax.swing.BorderFactory.createTitledBorder("Uno"));
        jPanelUno.setPreferredSize(new java.awt.Dimension(230, 110));

        jLabel4.setText("Atributo");
        jLabel4.setPreferredSize(new java.awt.Dimension(200, 15));
        jPanelUno.add(jLabel4);

        jComboBoxHechos.setFont(new java.awt.Font("Ubuntu", 0, 13)); // NOI18N
        jComboBoxHechos.setPreferredSize(new java.awt.Dimension(200, 25));
        jPanelUno.add(jComboBoxHechos);

        jButtonBar.setText("Bar");
        jButtonBar.setPreferredSize(new java.awt.Dimension(80, 25));
        jButtonBar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBarActionPerformed(evt);
            }
        });
        jPanelUno.add(jButtonBar);

        jButtonPie.setText("Pie");
        jButtonPie.setPreferredSize(new java.awt.Dimension(80, 25));
        jButtonPie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPieActionPerformed(evt);
            }
        });
        jPanelUno.add(jButtonPie);

        jPanelMenu.add(jPanelUno);

        jPanelDos.setBorder(javax.swing.BorderFactory.createTitledBorder("Dos"));
        jPanelDos.setPreferredSize(new java.awt.Dimension(230, 160));

        jLabel2.setText("Dimensiones Relacionadas");
        jLabel2.setPreferredSize(new java.awt.Dimension(200, 15));
        jPanelDos.add(jLabel2);

        jComboBoxDimension.setFont(new java.awt.Font("Ubuntu", 0, 13)); // NOI18N
        jComboBoxDimension.setPreferredSize(new java.awt.Dimension(200, 25));
        jComboBoxDimension.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxDimensionActionPerformed(evt);
            }
        });
        jPanelDos.add(jComboBoxDimension);

        jLabel3.setText("Atributo");
        jLabel3.setPreferredSize(new java.awt.Dimension(200, 15));
        jPanelDos.add(jLabel3);

        jComboBoxAtributo.setFont(new java.awt.Font("Ubuntu", 0, 13)); // NOI18N
        jComboBoxAtributo.setPreferredSize(new java.awt.Dimension(200, 25));
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
        jPanelTres.setPreferredSize(new java.awt.Dimension(230, 210));

        jLabel5.setText("Dimension");
        jLabel5.setPreferredSize(new java.awt.Dimension(200, 15));
        jPanelTres.add(jLabel5);

        jComboBoxDimension1.setFont(new java.awt.Font("Ubuntu", 0, 13)); // NOI18N
        jComboBoxDimension1.setPreferredSize(new java.awt.Dimension(200, 25));
        jComboBoxDimension1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxDimension1ActionPerformed(evt);
            }
        });
        jPanelTres.add(jComboBoxDimension1);

        jLabel6.setText("Atributo");
        jLabel6.setPreferredSize(new java.awt.Dimension(200, 15));
        jPanelTres.add(jLabel6);

        jComboBoxAtributo1.setFont(new java.awt.Font("Ubuntu", 0, 13)); // NOI18N
        jComboBoxAtributo1.setPreferredSize(new java.awt.Dimension(200, 25));
        jPanelTres.add(jComboBoxAtributo1);

        jLabel7.setText("Hecho");
        jLabel7.setPreferredSize(new java.awt.Dimension(200, 15));
        jPanelTres.add(jLabel7);

        jComboBoxHechos1.setFont(new java.awt.Font("Ubuntu", 0, 13)); // NOI18N
        jComboBoxHechos1.setPreferredSize(new java.awt.Dimension(200, 25));
        jPanelTres.add(jComboBoxHechos1);

        jButtonBarJoin1.setText("Bar");
        jButtonBarJoin1.setPreferredSize(new java.awt.Dimension(170, 25));
        jButtonBarJoin1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBarJoin1ActionPerformed(evt);
            }
        });
        jPanelTres.add(jButtonBarJoin1);

        jPanelMenu.add(jPanelTres);

        add(jPanelMenu, java.awt.BorderLayout.WEST);

        jPanelMain.setName(""); // NOI18N
        jPanelMain.setLayout(new java.awt.BorderLayout());

        jPanelNorte.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanelNorte.setPreferredSize(new java.awt.Dimension(10, 150));
        jPanelNorte.setLayout(new java.awt.BorderLayout());

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Espacio pensado para agregar más funcionalidades"));
        jPanelNorte.add(jPanel1, java.awt.BorderLayout.CENTER);

        jPanelMain.add(jPanelNorte, java.awt.BorderLayout.NORTH);

        jInternalFrame1.setClosable(true);
        jInternalFrame1.setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);
        jInternalFrame1.setIconifiable(true);
        jInternalFrame1.setMaximizable(true);
        jInternalFrame1.setResizable(true);
        jInternalFrame1.setNormalBounds(new java.awt.Rectangle(0, 0, 500, 500));
        jInternalFrame1.setVisible(true);

        jPanelGrafica.setBackground(new java.awt.Color(255, 255, 255));
        jPanelGrafica.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanelGrafica.setLayout(new java.awt.BorderLayout());

        jLabelImagen.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelImagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/imagenes/retiros.jpg"))); // NOI18N
        jLabelImagen.setPreferredSize(new java.awt.Dimension(0, 0));
        jPanelGrafica.add(jLabelImagen, java.awt.BorderLayout.CENTER);

        jInternalFrame1.getContentPane().add(jPanelGrafica, java.awt.BorderLayout.CENTER);

        jInternalFrame1.setBounds(0, 0, 760, 450);
        jDesktopPane1.add(jInternalFrame1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        try {
            jInternalFrame1.setMaximum(true);
        } catch (java.beans.PropertyVetoException e1) {
            e1.printStackTrace();
        }

        jPanelMain.add(jDesktopPane1, java.awt.BorderLayout.CENTER);

        add(jPanelMain, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonPieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPieActionPerformed
        final int hecho = jComboBoxHechos.getSelectedIndex();
        PieChart pieChart = logicaRetiros.reporteUnParametroPie(hecho);
        updateGrafica(pieChart.getChartPanel());
    }//GEN-LAST:event_jButtonPieActionPerformed

    private void jButtonBarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBarActionPerformed
        final int hecho = jComboBoxHechos.getSelectedIndex();
        BarChart barChart = logicaRetiros.reporteUnParametroBarra(hecho);
        updateGrafica(barChart.getChartPanel());
    }//GEN-LAST:event_jButtonBarActionPerformed

    private void jButtonBarJoinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBarJoinActionPerformed
        int dimension = jComboBoxDimension.getSelectedIndex();
        int atributo = jComboBoxAtributo.getSelectedIndex();
        BarChart barChart = logicaRetiros.reporteUnParametroJoinBarra(dimension, atributo);
        updateGrafica(barChart.getChartPanel());
    }//GEN-LAST:event_jButtonBarJoinActionPerformed

    private void jButtonPieJoinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPieJoinActionPerformed
        int dimension = jComboBoxDimension.getSelectedIndex();
        int atributo = jComboBoxAtributo.getSelectedIndex();
        PieChart pieChart = logicaRetiros.reporteUnParametroJoinPie(dimension, atributo);
        updateGrafica(pieChart.getChartPanel());
    }//GEN-LAST:event_jButtonPieJoinActionPerformed

    private void jComboBoxDimensionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxDimensionActionPerformed
        int dimension = jComboBoxDimension.getSelectedIndex();
        Object[] atributosInteresantes = logicaRetiros.getAtributosInteresantes(dimension);
        jComboBoxAtributo.setModel(new javax.swing.DefaultComboBoxModel(atributosInteresantes));
    }//GEN-LAST:event_jComboBoxDimensionActionPerformed

    private void jComboBoxDimension1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxDimension1ActionPerformed
        int dimension = jComboBoxDimension1.getSelectedIndex();
        Object[] atributosInteresantes = logicaRetiros.getAtributosInteresantes(dimension);
        jComboBoxAtributo1.setModel(new javax.swing.DefaultComboBoxModel(atributosInteresantes));
    }//GEN-LAST:event_jComboBoxDimension1ActionPerformed

    private void jButtonBarJoin1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBarJoin1ActionPerformed
        final int hecho = jComboBoxHechos1.getSelectedIndex();
        int dimension = jComboBoxDimension1.getSelectedIndex();
        int atributo = jComboBoxAtributo1.getSelectedIndex();
        BarChart barChart = logicaRetiros.reporteBivariadoBarra(hecho, atributo, dimension);
        updateGrafica(barChart.getChartPanel());
    }//GEN-LAST:event_jButtonBarJoin1ActionPerformed

    private void updateGrafica(JPanel chartPanel) {
        jPanelGrafica.removeAll();
        jPanelGrafica.add(chartPanel, java.awt.BorderLayout.CENTER);
        jPanelGrafica.updateUI();
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonBar;
    private javax.swing.JButton jButtonBarJoin;
    private javax.swing.JButton jButtonBarJoin1;
    private javax.swing.JButton jButtonPie;
    private javax.swing.JButton jButtonPieJoin;
    private javax.swing.JComboBox jComboBoxAtributo;
    private javax.swing.JComboBox jComboBoxAtributo1;
    private javax.swing.JComboBox jComboBoxDimension;
    private javax.swing.JComboBox jComboBoxDimension1;
    private javax.swing.JComboBox jComboBoxHechos;
    private javax.swing.JComboBox jComboBoxHechos1;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabelImagen;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanelDos;
    private javax.swing.JPanel jPanelGrafica;
    private javax.swing.JPanel jPanelMain;
    private javax.swing.JPanel jPanelMenu;
    private javax.swing.JPanel jPanelNorte;
    private javax.swing.JPanel jPanelTres;
    private javax.swing.JPanel jPanelUno;
    // End of variables declaration//GEN-END:variables
}
