package gui;

import java.awt.CardLayout;
import java.awt.Dimension;
import java.beans.PropertyVetoException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JInternalFrame;
import javax.swing.JPanel;
import logica.LogicaRetiros;

public class PanelRetiros extends javax.swing.JPanel {

    private LogicaRetiros logicaRetiros;
    private MainFrame parent;

    public PanelRetiros(MainFrame parent) {
        this.parent = parent;
        logicaRetiros = new LogicaRetiros();
        initComponents();

        jComboBoxHechos.setModel(new javax.swing.DefaultComboBoxModel(logicaRetiros.getDataComboBoxHechos()));

        jComboBoxDimensiones.setModel(new javax.swing.DefaultComboBoxModel(logicaRetiros.getDataComboBoxDimensiones()));
        jComboBoxAtributos.setModel(new javax.swing.DefaultComboBoxModel(logicaRetiros.getDataComboBoxAtributos(0)));

        jComboBoxDimensiones1.setModel(new javax.swing.DefaultComboBoxModel(logicaRetiros.getDataComboBoxDimensiones1()));
        jComboBoxAtributos1.setModel(new javax.swing.DefaultComboBoxModel(logicaRetiros.getDataComboBoxAtributos1(0)));
        jComboBoxHechos1.setModel(new javax.swing.DefaultComboBoxModel(logicaRetiros.getDataComboBoxHechos1()));

        jComboBoxDimensionesA.setModel(new javax.swing.DefaultComboBoxModel(logicaRetiros.getDataComboBoxDimensionesA()));
        jComboBoxAtributosA.setModel(new javax.swing.DefaultComboBoxModel(logicaRetiros.getDataComboBoxAtributosA(0)));
        jComboBoxDimensionesB.setModel(new javax.swing.DefaultComboBoxModel(logicaRetiros.getDataComboBoxDimensionesB()));
        jComboBoxAtributosB.setModel(new javax.swing.DefaultComboBoxModel(logicaRetiros.getDataComboBoxAtributosB(0)));

        loadDatajComboBoxValores();
        loadDatajComboBoxValoresA();
        loadDatajComboBoxValoresB();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelMain = new javax.swing.JPanel();
        jDesktopPane = new javax.swing.JDesktopPane();
        jPanelOpciones = new javax.swing.JPanel();
        jToolBarOpciones = new javax.swing.JToolBar();
        jBAnalisisUnidimensional = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JToolBar.Separator();
        jBAnalisisBidimensional = new javax.swing.JButton();
        jPanelCardLayout = new javax.swing.JPanel();
        jPanelUniDimensional = new javax.swing.JPanel();
        jPanelUno = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jComboBoxHechos = new javax.swing.JComboBox();
        jButtonBar = new javax.swing.JButton();
        jButtonPie = new javax.swing.JButton();
        jPanelDos = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jComboBoxDimensiones = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        jComboBoxAtributos = new javax.swing.JComboBox();
        jButtonBarJoin = new javax.swing.JButton();
        jButtonPieJoin = new javax.swing.JButton();
        jPanelTres = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jComboBoxDimensiones1 = new javax.swing.JComboBox();
        jLabel10 = new javax.swing.JLabel();
        jComboBoxAtributos1 = new javax.swing.JComboBox();
        jLabel11 = new javax.swing.JLabel();
        jComboBoxValores = new javax.swing.JComboBox();
        jLabel12 = new javax.swing.JLabel();
        jComboBoxHechos1 = new javax.swing.JComboBox();
        jButtonBarJoin2 = new javax.swing.JButton();
        jButtonPieJoin2 = new javax.swing.JButton();
        jPanelBiDimensional = new javax.swing.JPanel();
        jPanelCuatro = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jComboBoxDimensionesA = new javax.swing.JComboBox();
        jLabel6 = new javax.swing.JLabel();
        jComboBoxAtributosA = new javax.swing.JComboBox();
        jLabel13 = new javax.swing.JLabel();
        jComboBoxValoresA = new javax.swing.JComboBox();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel8 = new javax.swing.JLabel();
        jComboBoxDimensionesB = new javax.swing.JComboBox();
        jLabel7 = new javax.swing.JLabel();
        jComboBoxAtributosB = new javax.swing.JComboBox();
        jLabel14 = new javax.swing.JLabel();
        jComboBoxValoresB = new javax.swing.JComboBox();
        jButtonBarJoin1 = new javax.swing.JButton();
        jButtonPieJoin1 = new javax.swing.JButton();

        setPreferredSize(new java.awt.Dimension(1000, 600));
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentResized(java.awt.event.ComponentEvent evt) {
                formComponentResized(evt);
            }
        });
        setLayout(new java.awt.BorderLayout());

        jPanelMain.setName(""); // NOI18N
        jPanelMain.setLayout(new java.awt.BorderLayout());
        jPanelMain.add(jDesktopPane, java.awt.BorderLayout.CENTER);

        add(jPanelMain, java.awt.BorderLayout.CENTER);

        jPanelOpciones.setPreferredSize(new java.awt.Dimension(270, 50));
        jPanelOpciones.setLayout(new java.awt.BorderLayout());

        jToolBarOpciones.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jToolBarOpciones.setFloatable(false);
        jToolBarOpciones.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jToolBarOpciones.setRollover(true);
        jToolBarOpciones.setPreferredSize(new java.awt.Dimension(25, 600));

        jBAnalisisUnidimensional.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/imagenes/Uni.jpg"))); // NOI18N
        jBAnalisisUnidimensional.setFocusable(false);
        jBAnalisisUnidimensional.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jBAnalisisUnidimensional.setPreferredSize(new java.awt.Dimension(40, 200));
        jBAnalisisUnidimensional.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jBAnalisisUnidimensional.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBAnalisisUnidimensionalActionPerformed(evt);
            }
        });
        jToolBarOpciones.add(jBAnalisisUnidimensional);
        jToolBarOpciones.add(jSeparator1);

        jBAnalisisBidimensional.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/imagenes/Bi.jpg"))); // NOI18N
        jBAnalisisBidimensional.setFocusable(false);
        jBAnalisisBidimensional.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jBAnalisisBidimensional.setPreferredSize(new java.awt.Dimension(40, 200));
        jBAnalisisBidimensional.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jBAnalisisBidimensional.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBAnalisisBidimensionalActionPerformed(evt);
            }
        });
        jToolBarOpciones.add(jBAnalisisBidimensional);

        jPanelOpciones.add(jToolBarOpciones, java.awt.BorderLayout.WEST);

        jPanelCardLayout.setLayout(new java.awt.CardLayout());

        jPanelUniDimensional.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanelUniDimensional.setPreferredSize(new java.awt.Dimension(240, 50));
        jPanelUniDimensional.setRequestFocusEnabled(false);

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

        jPanelUniDimensional.add(jPanelUno);

        jPanelDos.setBorder(javax.swing.BorderFactory.createTitledBorder("Dos"));
        jPanelDos.setPreferredSize(new java.awt.Dimension(230, 160));

        jLabel2.setText("Dimension Relacionada");
        jLabel2.setPreferredSize(new java.awt.Dimension(200, 15));
        jPanelDos.add(jLabel2);

        jComboBoxDimensiones.setFont(new java.awt.Font("Ubuntu", 0, 13)); // NOI18N
        jComboBoxDimensiones.setPreferredSize(new java.awt.Dimension(200, 25));
        jComboBoxDimensiones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxDimensionesActionPerformed(evt);
            }
        });
        jPanelDos.add(jComboBoxDimensiones);

        jLabel3.setText("Atributo");
        jLabel3.setPreferredSize(new java.awt.Dimension(200, 15));
        jPanelDos.add(jLabel3);

        jComboBoxAtributos.setFont(new java.awt.Font("Ubuntu", 0, 13)); // NOI18N
        jComboBoxAtributos.setPreferredSize(new java.awt.Dimension(200, 25));
        jPanelDos.add(jComboBoxAtributos);

        jButtonBarJoin.setText("Bar");
        jButtonBarJoin.setPreferredSize(new java.awt.Dimension(80, 25));
        jButtonBarJoin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBarJoinActionPerformed(evt);
            }
        });
        jPanelDos.add(jButtonBarJoin);

        jButtonPieJoin.setText("Pie");
        jButtonPieJoin.setPreferredSize(new java.awt.Dimension(80, 25));
        jButtonPieJoin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPieJoinActionPerformed(evt);
            }
        });
        jPanelDos.add(jButtonPieJoin);

        jPanelUniDimensional.add(jPanelDos);

        jPanelTres.setBorder(javax.swing.BorderFactory.createTitledBorder("Tres"));
        jPanelTres.setPreferredSize(new java.awt.Dimension(230, 260));

        jLabel9.setText("Dimension Relacionada");
        jLabel9.setPreferredSize(new java.awt.Dimension(200, 15));
        jPanelTres.add(jLabel9);

        jComboBoxDimensiones1.setFont(new java.awt.Font("Ubuntu", 0, 13)); // NOI18N
        jComboBoxDimensiones1.setPreferredSize(new java.awt.Dimension(200, 25));
        jComboBoxDimensiones1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxDimensiones1ActionPerformed(evt);
            }
        });
        jPanelTres.add(jComboBoxDimensiones1);

        jLabel10.setText("Atributo");
        jLabel10.setPreferredSize(new java.awt.Dimension(200, 15));
        jPanelTres.add(jLabel10);

        jComboBoxAtributos1.setFont(new java.awt.Font("Ubuntu", 0, 13)); // NOI18N
        jComboBoxAtributos1.setPreferredSize(new java.awt.Dimension(200, 25));
        jComboBoxAtributos1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxAtributos1ActionPerformed(evt);
            }
        });
        jPanelTres.add(jComboBoxAtributos1);

        jLabel11.setText("Valor");
        jLabel11.setPreferredSize(new java.awt.Dimension(200, 15));
        jPanelTres.add(jLabel11);

        jComboBoxValores.setFont(new java.awt.Font("Ubuntu", 0, 13)); // NOI18N
        jComboBoxValores.setPreferredSize(new java.awt.Dimension(200, 25));
        jPanelTres.add(jComboBoxValores);

        jLabel12.setText("Hecho");
        jLabel12.setPreferredSize(new java.awt.Dimension(200, 15));
        jPanelTres.add(jLabel12);

        jComboBoxHechos1.setFont(new java.awt.Font("Ubuntu", 0, 13)); // NOI18N
        jComboBoxHechos1.setPreferredSize(new java.awt.Dimension(200, 25));
        jPanelTres.add(jComboBoxHechos1);

        jButtonBarJoin2.setText("Bar");
        jButtonBarJoin2.setPreferredSize(new java.awt.Dimension(80, 25));
        jButtonBarJoin2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBarJoin2ActionPerformed(evt);
            }
        });
        jPanelTres.add(jButtonBarJoin2);

        jButtonPieJoin2.setText("Pie");
        jButtonPieJoin2.setPreferredSize(new java.awt.Dimension(80, 25));
        jButtonPieJoin2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPieJoin2ActionPerformed(evt);
            }
        });
        jPanelTres.add(jButtonPieJoin2);

        jPanelUniDimensional.add(jPanelTres);

        jPanelCardLayout.add(jPanelUniDimensional, "jPanelMenu");

        jPanelBiDimensional.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanelBiDimensional.setPreferredSize(new java.awt.Dimension(240, 50));
        jPanelBiDimensional.setRequestFocusEnabled(false);

        jPanelCuatro.setBorder(javax.swing.BorderFactory.createTitledBorder("Cuatro"));
        jPanelCuatro.setPreferredSize(new java.awt.Dimension(230, 370));

        jLabel5.setText("Dimension A");
        jLabel5.setPreferredSize(new java.awt.Dimension(200, 15));
        jPanelCuatro.add(jLabel5);

        jComboBoxDimensionesA.setFont(new java.awt.Font("Ubuntu", 0, 13)); // NOI18N
        jComboBoxDimensionesA.setPreferredSize(new java.awt.Dimension(200, 25));
        jComboBoxDimensionesA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxDimensionesAActionPerformed(evt);
            }
        });
        jPanelCuatro.add(jComboBoxDimensionesA);

        jLabel6.setText("Atributo A");
        jLabel6.setPreferredSize(new java.awt.Dimension(200, 15));
        jPanelCuatro.add(jLabel6);

        jComboBoxAtributosA.setFont(new java.awt.Font("Ubuntu", 0, 13)); // NOI18N
        jComboBoxAtributosA.setPreferredSize(new java.awt.Dimension(200, 25));
        jComboBoxAtributosA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxAtributosAActionPerformed(evt);
            }
        });
        jPanelCuatro.add(jComboBoxAtributosA);

        jLabel13.setText("Valor");
        jLabel13.setPreferredSize(new java.awt.Dimension(200, 15));
        jPanelCuatro.add(jLabel13);

        jComboBoxValoresA.setFont(new java.awt.Font("Ubuntu", 0, 13)); // NOI18N
        jComboBoxValoresA.setPreferredSize(new java.awt.Dimension(200, 25));
        jPanelCuatro.add(jComboBoxValoresA);

        jSeparator2.setPreferredSize(new java.awt.Dimension(220, 5));
        jPanelCuatro.add(jSeparator2);

        jLabel8.setText("Dimension B");
        jLabel8.setPreferredSize(new java.awt.Dimension(200, 15));
        jPanelCuatro.add(jLabel8);

        jComboBoxDimensionesB.setFont(new java.awt.Font("Ubuntu", 0, 13)); // NOI18N
        jComboBoxDimensionesB.setPreferredSize(new java.awt.Dimension(200, 25));
        jComboBoxDimensionesB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxDimensionesBActionPerformed(evt);
            }
        });
        jPanelCuatro.add(jComboBoxDimensionesB);

        jLabel7.setText("Atributo B");
        jLabel7.setPreferredSize(new java.awt.Dimension(200, 15));
        jPanelCuatro.add(jLabel7);

        jComboBoxAtributosB.setFont(new java.awt.Font("Ubuntu", 0, 13)); // NOI18N
        jComboBoxAtributosB.setPreferredSize(new java.awt.Dimension(200, 25));
        jComboBoxAtributosB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxAtributosBActionPerformed(evt);
            }
        });
        jPanelCuatro.add(jComboBoxAtributosB);

        jLabel14.setText("Valores");
        jLabel14.setPreferredSize(new java.awt.Dimension(200, 15));
        jPanelCuatro.add(jLabel14);

        jComboBoxValoresB.setFont(new java.awt.Font("Ubuntu", 0, 13)); // NOI18N
        jComboBoxValoresB.setPreferredSize(new java.awt.Dimension(200, 25));
        jPanelCuatro.add(jComboBoxValoresB);

        jButtonBarJoin1.setText("Bar");
        jButtonBarJoin1.setPreferredSize(new java.awt.Dimension(80, 25));
        jButtonBarJoin1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBarJoin1ActionPerformed(evt);
            }
        });
        jPanelCuatro.add(jButtonBarJoin1);

        jButtonPieJoin1.setText("Pie");
        jButtonPieJoin1.setPreferredSize(new java.awt.Dimension(80, 25));
        jButtonPieJoin1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPieJoin1ActionPerformed(evt);
            }
        });
        jPanelCuatro.add(jButtonPieJoin1);

        jPanelBiDimensional.add(jPanelCuatro);

        jPanelCardLayout.add(jPanelBiDimensional, "jPanelMenu1");

        jPanelOpciones.add(jPanelCardLayout, java.awt.BorderLayout.CENTER);

        add(jPanelOpciones, java.awt.BorderLayout.WEST);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonPieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPieActionPerformed
        final int hecho = jComboBoxHechos.getSelectedIndex();
        PieChart pieChart = logicaRetiros.reporteUnParametroPie(hecho);
        addChartPanelInsideInternalFrame(pieChart.getChartPanel(), pieChart.getCharTitle());
    }//GEN-LAST:event_jButtonPieActionPerformed

    private void jButtonBarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBarActionPerformed
        final int hecho = jComboBoxHechos.getSelectedIndex();
        BarChart barChart = logicaRetiros.reporteUnParametroBarra(hecho);
        addChartPanelInsideInternalFrame(barChart.getChartPanel(), barChart.getCharTitle());
    }//GEN-LAST:event_jButtonBarActionPerformed

    private void jButtonBarJoinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBarJoinActionPerformed
        int dimension = jComboBoxDimensiones.getSelectedIndex();
        int atributo = jComboBoxAtributos.getSelectedIndex();
        BarChart barChart = logicaRetiros.reporteUnParametroJoinBarra(dimension, atributo);
        addChartPanelInsideInternalFrame(barChart.getChartPanel(),barChart.getCharTitle());
    }//GEN-LAST:event_jButtonBarJoinActionPerformed

    private void jButtonPieJoinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPieJoinActionPerformed
        int dimension = jComboBoxDimensiones.getSelectedIndex();
        int atributo = jComboBoxAtributos.getSelectedIndex();
        PieChart pieChart = logicaRetiros.reporteUnParametroJoinPie(dimension, atributo);
        addChartPanelInsideInternalFrame(pieChart.getChartPanel(), pieChart.getCharTitle());
    }//GEN-LAST:event_jButtonPieJoinActionPerformed

    private void jComboBoxDimensionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxDimensionesActionPerformed
        int dimension = jComboBoxDimensiones.getSelectedIndex();
        Object[] atributosInteresantes = logicaRetiros.getDataComboBoxAtributos(dimension);
        jComboBoxAtributos.setModel(new javax.swing.DefaultComboBoxModel(atributosInteresantes));
    }//GEN-LAST:event_jComboBoxDimensionesActionPerformed

    private void jComboBoxDimensionesAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxDimensionesAActionPerformed
        int dimension = jComboBoxDimensionesA.getSelectedIndex();
        Object[] atributosInteresantes = logicaRetiros.getDataComboBoxAtributosA(dimension);
        jComboBoxAtributosA.setModel(new javax.swing.DefaultComboBoxModel(atributosInteresantes));
        loadDatajComboBoxValoresA();
    }//GEN-LAST:event_jComboBoxDimensionesAActionPerformed

    private void jButtonBarJoin1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBarJoin1ActionPerformed
        int dimensionA = jComboBoxDimensionesA.getSelectedIndex();
        int atributoA = jComboBoxAtributosA.getSelectedIndex();
        String valorA = jComboBoxValoresA.getSelectedItem().toString();
        
        int dimensionB = jComboBoxDimensionesB.getSelectedIndex();
        int atributoB = jComboBoxAtributosB.getSelectedIndex();
        String valorB = jComboBoxValoresB.getSelectedItem().toString();

        BarChart barChart = logicaRetiros.reporteBiDimensionalBarra(dimensionA, atributoA, valorA, dimensionB, atributoB, valorB);
        addChartPanelInsideInternalFrame(barChart.getChartPanel(), barChart.getCharTitle());
    }//GEN-LAST:event_jButtonBarJoin1ActionPerformed

    private void jBAnalisisUnidimensionalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBAnalisisUnidimensionalActionPerformed
        CardLayout cl = (CardLayout) (jPanelCardLayout.getLayout());
        cl.show(jPanelCardLayout, "jPanelMenu");
    }//GEN-LAST:event_jBAnalisisUnidimensionalActionPerformed

    private void jBAnalisisBidimensionalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBAnalisisBidimensionalActionPerformed
        CardLayout cl = (CardLayout) (jPanelCardLayout.getLayout());
        cl.show(jPanelCardLayout, "jPanelMenu1");
    }//GEN-LAST:event_jBAnalisisBidimensionalActionPerformed

    private void formComponentResized(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentResized
        jDesktopPane.updateUI();
        tileInternalframes();
    }//GEN-LAST:event_formComponentResized

    private void jComboBoxDimensiones1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxDimensiones1ActionPerformed
        int dimension = jComboBoxDimensiones1.getSelectedIndex();
        Object[] atributosInteresantes = logicaRetiros.getDataComboBoxAtributos1(dimension);
        jComboBoxAtributos1.setModel(new javax.swing.DefaultComboBoxModel(atributosInteresantes));
        loadDatajComboBoxValores();
    }//GEN-LAST:event_jComboBoxDimensiones1ActionPerformed

    private void jComboBoxAtributos1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxAtributos1ActionPerformed
        loadDatajComboBoxValores();
    }//GEN-LAST:event_jComboBoxAtributos1ActionPerformed

    private void jButtonBarJoin2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBarJoin2ActionPerformed
        int hecho = jComboBoxHechos1.getSelectedIndex();
        int dimension = jComboBoxDimensiones1.getSelectedIndex();
        int atributo = jComboBoxAtributos1.getSelectedIndex();
        String valor = jComboBoxValores.getSelectedItem().toString();
        BarChart barChart = logicaRetiros.reporteBivariadoBarra(dimension, atributo, valor, hecho);
        addChartPanelInsideInternalFrame(barChart.getChartPanel(), barChart.getCharTitle());
    }//GEN-LAST:event_jButtonBarJoin2ActionPerformed

    private void jComboBoxDimensionesBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxDimensionesBActionPerformed
        int dimension = jComboBoxDimensionesB.getSelectedIndex();
        Object[] atributosInteresantes = logicaRetiros.getDataComboBoxAtributosB(dimension);
        jComboBoxAtributosB.setModel(new javax.swing.DefaultComboBoxModel(atributosInteresantes));
        loadDatajComboBoxValoresB();
    }//GEN-LAST:event_jComboBoxDimensionesBActionPerformed

    private void jComboBoxAtributosAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxAtributosAActionPerformed
        loadDatajComboBoxValoresA();
    }//GEN-LAST:event_jComboBoxAtributosAActionPerformed

    private void jComboBoxAtributosBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxAtributosBActionPerformed
        loadDatajComboBoxValoresB();
    }//GEN-LAST:event_jComboBoxAtributosBActionPerformed

    private void jButtonPieJoin2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPieJoin2ActionPerformed
        int hecho = jComboBoxHechos1.getSelectedIndex();
        int dimension = jComboBoxDimensiones1.getSelectedIndex();
        int atributo = jComboBoxAtributos1.getSelectedIndex();
        String valor = jComboBoxValores.getSelectedItem().toString();
        MultiplePieChart multiplePieChart = logicaRetiros.reporteBivariadoPie(dimension, atributo, valor, hecho);
        addChartPanelInsideInternalFrame(multiplePieChart.getChartPanel(), multiplePieChart.getCharTitle());
    }//GEN-LAST:event_jButtonPieJoin2ActionPerformed

    private void jButtonPieJoin1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPieJoin1ActionPerformed
        int dimensionA = jComboBoxDimensionesA.getSelectedIndex();
        int atributoA = jComboBoxAtributosA.getSelectedIndex();
        String valorA = jComboBoxValoresA.getSelectedItem().toString();
        
        int dimensionB = jComboBoxDimensionesB.getSelectedIndex();
        int atributoB = jComboBoxAtributosB.getSelectedIndex();
        String valorB = jComboBoxValoresB.getSelectedItem().toString();

        MultiplePieChart multiplePieChart = logicaRetiros.reporteBiDimensionalPie(dimensionA, atributoA, valorA, dimensionB, atributoB, valorB);
        addChartPanelInsideInternalFrame(multiplePieChart.getChartPanel(), multiplePieChart.getCharTitle());
    }//GEN-LAST:event_jButtonPieJoin1ActionPerformed

    private void addChartPanelInsideInternalFrame(JPanel chartPanel, String title) {
        PersonalJInternalFrame personalJInternalFrame = new PersonalJInternalFrame(chartPanel, title);
        personalJInternalFrame.setBounds(0, 0, 760, 450);
        jDesktopPane.add(personalJInternalFrame, javax.swing.JLayeredPane.DEFAULT_LAYER);
        personalJInternalFrame.setVisible(true);
        tileInternalframes();

    }

    public void tileInternalframes() {

        // contar cantidad de frames
        JInternalFrame[] allframes = jDesktopPane.getAllFrames();
        System.out.println("\n\nallframes.length: " + allframes.length);

        ArrayList<JInternalFrame> allframesArray = new ArrayList<>();

        for (int i = 0; i < allframes.length; i++) {
            if (!allframes[i].isIcon()) {
                if (!jInternalFrameRepetido(allframesArray, allframes[i])) {
                    allframesArray.add(allframes[i]);
                }
            }
        }

        int count = allframesArray.size();
        if (count == 0) {
            return;
        }
        System.out.println("count: " + count);

        // Determinar el tamaño de la grilla
        int sqrt = (int) Math.sqrt(count);
        int rows = sqrt;
        int cols = sqrt;
        System.out.println("rows: " + rows + " cols: " + cols);

        if (rows * cols < count) {
            cols++;
            if (rows * cols < count) {
                rows++;
            }
        }

        System.out.println("rowsAfter: " + rows + " colsAfter: " + cols);

        // Definir los valores iniciales del tamaño del DesktopPane
        Dimension size = jDesktopPane.getSize();
        int w = size.width / cols;
        int h = (size.height - 30) / rows;
        int x = 0;
        int y = 0;

        // Iterate over the frames, deiconifying any iconified frames and then
        // relocating & resizing each.
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols && ((i * cols) + j < count); j++) {
                JInternalFrame f = allframesArray.get((i * cols) + j);

                if (!f.isClosed() && !f.isIcon()) {
                    try {
                        f.setIcon(false);
                    } catch (PropertyVetoException ignored) {
                    }
                }
                jDesktopPane.getDesktopManager().resizeFrame(f, x, y, w, h);
                x += w;
            }
            y += h; // start the next row
            x = 0;
        }
    }

    private boolean jInternalFrameRepetido(ArrayList<JInternalFrame> allframesArray, JInternalFrame jInternalFrame) {
        for (int i = 0; i < allframesArray.size(); i++) {
            if (allframesArray.get(i) == jInternalFrame) {
                return true;
            }
        }
        return false;
    }

    public void maximizarTodos() {
        JInternalFrame[] allframes = jDesktopPane.getAllFrames();

        for (int i = 0; i < allframes.length; i++) {
            try {
                JInternalFrame jInternalFrame = allframes[i];
                jInternalFrame.show();
                jInternalFrame.setIcon(false);
            } catch (PropertyVetoException ex) {
                Logger.getLogger(PanelRetiros.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        tileInternalframes();
    }

    public void cerrarTodos() {
        JInternalFrame[] allframes = jDesktopPane.getAllFrames();
        for (int i = 0; i < allframes.length; i++) {
            JInternalFrame jInternalFrame = allframes[i];
            jInternalFrame.dispose();
        }
    }

    public void minimizarTodos() {
        JInternalFrame[] allframes = jDesktopPane.getAllFrames();
        for (int i = 0; i < allframes.length; i++) {
            try {
                JInternalFrame jInternalFrame = allframes[i];
                jInternalFrame.setIcon(true);
            } catch (PropertyVetoException ex) {
                Logger.getLogger(PanelRetiros.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    private void loadDatajComboBoxValores() {
        int dimension = jComboBoxDimensiones1.getSelectedIndex();
        int atributo = jComboBoxAtributos1.getSelectedIndex();
        Object[] valores = logicaRetiros.getDataComboBoxValores(dimension, atributo);
        jComboBoxValores.setModel(new javax.swing.DefaultComboBoxModel(valores));
    }

    private void loadDatajComboBoxValoresA() {
        int dimension = jComboBoxDimensionesA.getSelectedIndex();
        int atributo = jComboBoxAtributosA.getSelectedIndex();
        Object[] valores = logicaRetiros.getDataComboBoxValoresA(dimension, atributo);
        jComboBoxValoresA.setModel(new javax.swing.DefaultComboBoxModel(valores));
    }

    private void loadDatajComboBoxValoresB() {
        int dimension = jComboBoxDimensionesB.getSelectedIndex();
        int atributo = jComboBoxAtributosB.getSelectedIndex();
        Object[] valores = logicaRetiros.getDataComboBoxValoresB(dimension, atributo);
        jComboBoxValoresB.setModel(new javax.swing.DefaultComboBoxModel(valores));
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBAnalisisBidimensional;
    private javax.swing.JButton jBAnalisisUnidimensional;
    private javax.swing.JButton jButtonBar;
    private javax.swing.JButton jButtonBarJoin;
    private javax.swing.JButton jButtonBarJoin1;
    private javax.swing.JButton jButtonBarJoin2;
    private javax.swing.JButton jButtonPie;
    private javax.swing.JButton jButtonPieJoin;
    private javax.swing.JButton jButtonPieJoin1;
    private javax.swing.JButton jButtonPieJoin2;
    private javax.swing.JComboBox jComboBoxAtributos;
    private javax.swing.JComboBox jComboBoxAtributos1;
    private javax.swing.JComboBox jComboBoxAtributosA;
    private javax.swing.JComboBox jComboBoxAtributosB;
    private javax.swing.JComboBox jComboBoxDimensiones;
    private javax.swing.JComboBox jComboBoxDimensiones1;
    private javax.swing.JComboBox jComboBoxDimensionesA;
    private javax.swing.JComboBox jComboBoxDimensionesB;
    private javax.swing.JComboBox jComboBoxHechos;
    private javax.swing.JComboBox jComboBoxHechos1;
    private javax.swing.JComboBox jComboBoxValores;
    private javax.swing.JComboBox jComboBoxValoresA;
    private javax.swing.JComboBox jComboBoxValoresB;
    private javax.swing.JDesktopPane jDesktopPane;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanelBiDimensional;
    private javax.swing.JPanel jPanelCardLayout;
    private javax.swing.JPanel jPanelCuatro;
    private javax.swing.JPanel jPanelDos;
    private javax.swing.JPanel jPanelMain;
    private javax.swing.JPanel jPanelOpciones;
    private javax.swing.JPanel jPanelTres;
    private javax.swing.JPanel jPanelUniDimensional;
    private javax.swing.JPanel jPanelUno;
    private javax.swing.JToolBar.Separator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JToolBar jToolBarOpciones;
    // End of variables declaration//GEN-END:variables
}
