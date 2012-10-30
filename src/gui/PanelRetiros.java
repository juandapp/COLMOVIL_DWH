package gui;

import java.awt.CardLayout;
import java.awt.Dimension;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.beans.PropertyVetoException;
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

        Object[] hechosInteresantes = logicaRetiros.getHechos();
        Object[] dimensionesRelacionadas = logicaRetiros.getDimensionesRelacionadas();
        Object[] atributosInteresantes = logicaRetiros.getAtributosInteresantes(0);


        jComboBoxHechos.setModel(new javax.swing.DefaultComboBoxModel(hechosInteresantes));
        jComboBoxDimension.setModel(new javax.swing.DefaultComboBoxModel(dimensionesRelacionadas));
        jComboBoxAtributo.setModel(new javax.swing.DefaultComboBoxModel(atributosInteresantes));

        jComboBoxAtributoB.setModel(new javax.swing.DefaultComboBoxModel(hechosInteresantes));
        jComboBoxDimensionA.setModel(new javax.swing.DefaultComboBoxModel(dimensionesRelacionadas));
        jComboBoxAtributoA.setModel(new javax.swing.DefaultComboBoxModel(atributosInteresantes));

        cargarValores();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelMain = new javax.swing.JPanel();
        jDesktopPane = new javax.swing.JDesktopPane();
        jPanelOpciones = new javax.swing.JPanel();
        jToolBarOpciones = new javax.swing.JToolBar();
        jBAnalisisUnidimensional = new javax.swing.JButton();
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
        jComboBoxDimension = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        jComboBoxAtributo = new javax.swing.JComboBox();
        jButtonPieJoin = new javax.swing.JButton();
        jButtonBarJoin = new javax.swing.JButton();
        jBMostrarTodos = new javax.swing.JButton();
        jPanelBiDimensional = new javax.swing.JPanel();
        jPanelTres = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jComboBoxDimensionA = new javax.swing.JComboBox();
        jLabel6 = new javax.swing.JLabel();
        jComboBoxAtributoA = new javax.swing.JComboBox();
        jLabel8 = new javax.swing.JLabel();
        jComboBoxDimensionB = new javax.swing.JComboBox();
        jLabel7 = new javax.swing.JLabel();
        jComboBoxAtributoB = new javax.swing.JComboBox();
        jButtonBarJoin1 = new javax.swing.JButton();

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
        jToolBarOpciones.setPreferredSize(new java.awt.Dimension(30, 600));

        jBAnalisisUnidimensional.setText("A");
        jBAnalisisUnidimensional.setFocusable(false);
        jBAnalisisUnidimensional.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jBAnalisisUnidimensional.setPreferredSize(new java.awt.Dimension(50, 80));
        jBAnalisisUnidimensional.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jBAnalisisUnidimensional.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBAnalisisUnidimensionalActionPerformed(evt);
            }
        });
        jToolBarOpciones.add(jBAnalisisUnidimensional);

        jBAnalisisBidimensional.setText("B");
        jBAnalisisBidimensional.setFocusable(false);
        jBAnalisisBidimensional.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jBAnalisisBidimensional.setPreferredSize(new java.awt.Dimension(50, 80));
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

        jPanelUniDimensional.add(jPanelDos);

        jBMostrarTodos.setText("Mostrar Todos");
        jBMostrarTodos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBMostrarTodosActionPerformed(evt);
            }
        });
        jPanelUniDimensional.add(jBMostrarTodos);

        jPanelCardLayout.add(jPanelUniDimensional, "jPanelMenu");

        jPanelBiDimensional.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanelBiDimensional.setPreferredSize(new java.awt.Dimension(240, 50));
        jPanelBiDimensional.setRequestFocusEnabled(false);

        jPanelTres.setBorder(javax.swing.BorderFactory.createTitledBorder("Cuatro"));
        jPanelTres.setPreferredSize(new java.awt.Dimension(230, 260));

        jLabel5.setText("Dimension A");
        jLabel5.setPreferredSize(new java.awt.Dimension(200, 15));
        jPanelTres.add(jLabel5);

        jComboBoxDimensionA.setFont(new java.awt.Font("Ubuntu", 0, 13)); // NOI18N
        jComboBoxDimensionA.setPreferredSize(new java.awt.Dimension(200, 25));
        jComboBoxDimensionA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxDimensionAActionPerformed(evt);
            }
        });
        jPanelTres.add(jComboBoxDimensionA);

        jLabel6.setText("Atributo A");
        jLabel6.setPreferredSize(new java.awt.Dimension(200, 15));
        jPanelTres.add(jLabel6);

        jComboBoxAtributoA.setFont(new java.awt.Font("Ubuntu", 0, 13)); // NOI18N
        jComboBoxAtributoA.setPreferredSize(new java.awt.Dimension(200, 25));
        jComboBoxAtributoA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxAtributoAActionPerformed(evt);
            }
        });
        jPanelTres.add(jComboBoxAtributoA);

        jLabel8.setText("Dimension B");
        jLabel8.setPreferredSize(new java.awt.Dimension(200, 15));
        jPanelTres.add(jLabel8);

        jComboBoxDimensionB.setFont(new java.awt.Font("Ubuntu", 0, 13)); // NOI18N
        jComboBoxDimensionB.setPreferredSize(new java.awt.Dimension(200, 25));
        jPanelTres.add(jComboBoxDimensionB);

        jLabel7.setText("Atributo B");
        jLabel7.setPreferredSize(new java.awt.Dimension(200, 15));
        jPanelTres.add(jLabel7);

        jComboBoxAtributoB.setFont(new java.awt.Font("Ubuntu", 0, 13)); // NOI18N
        jComboBoxAtributoB.setPreferredSize(new java.awt.Dimension(200, 25));
        jPanelTres.add(jComboBoxAtributoB);

        jButtonBarJoin1.setText("Bar");
        jButtonBarJoin1.setPreferredSize(new java.awt.Dimension(170, 25));
        jButtonBarJoin1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBarJoin1ActionPerformed(evt);
            }
        });
        jPanelTres.add(jButtonBarJoin1);

        jPanelBiDimensional.add(jPanelTres);

        jPanelCardLayout.add(jPanelBiDimensional, "jPanelMenu1");

        jPanelOpciones.add(jPanelCardLayout, java.awt.BorderLayout.CENTER);

        add(jPanelOpciones, java.awt.BorderLayout.WEST);
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

    private void jComboBoxDimensionAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxDimensionAActionPerformed
        int dimension = jComboBoxDimensionA.getSelectedIndex();
        Object[] atributosInteresantes = logicaRetiros.getAtributosInteresantes(dimension);
        jComboBoxAtributoA.setModel(new javax.swing.DefaultComboBoxModel(atributosInteresantes));
    }//GEN-LAST:event_jComboBoxDimensionAActionPerformed

    private void jButtonBarJoin1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBarJoin1ActionPerformed
        int dimensionA = jComboBoxDimensionA.getSelectedIndex();
        int atributoA = jComboBoxAtributoA.getSelectedIndex();
        int dimensionB = jComboBoxDimensionB.getSelectedIndex();
        int atributoB = jComboBoxAtributoB.getSelectedIndex();

        BarChart barChart = logicaRetiros.reporteBiDimensionalBarra(dimensionA, atributoA, dimensionB, atributoB);
        updateGrafica(barChart.getChartPanel());
    }//GEN-LAST:event_jButtonBarJoin1ActionPerformed

    private void jBAnalisisUnidimensionalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBAnalisisUnidimensionalActionPerformed
        CardLayout cl = (CardLayout) (jPanelCardLayout.getLayout());
        cl.show(jPanelCardLayout, "jPanelMenu");
    }//GEN-LAST:event_jBAnalisisUnidimensionalActionPerformed

    private void jBAnalisisBidimensionalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBAnalisisBidimensionalActionPerformed
        CardLayout cl = (CardLayout) (jPanelCardLayout.getLayout());
        cl.show(jPanelCardLayout, "jPanelMenu1");
    }//GEN-LAST:event_jBAnalisisBidimensionalActionPerformed

    private void jComboBoxValorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxValorActionPerformed
    }//GEN-LAST:event_jComboBoxValorActionPerformed

    private void jComboBoxAtributoAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxAtributoAActionPerformed
        cargarValores();
    }//GEN-LAST:event_jComboBoxAtributoAActionPerformed

    private void jBMostrarTodosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBMostrarTodosActionPerformed
                
        // How many frames do we have?
        JInternalFrame[] allframes = jDesktopPane.getAllFrames();
        int count = allframes.length;
        if (count == 0) {
            return;
        }

        // Determine the necessary grid size
        count = count / 2;
        int sqrt = (int) Math.sqrt(count);
        int rows = sqrt;
        int cols = sqrt;

        if (rows * cols < count) {
            cols++;
            if (rows * cols < count) {
                rows++;
            }
        }
        
        // Define some initial values for size & location.
        Dimension size = jDesktopPane.getSize();

        int w = size.width / cols;
        int h = (size.height - 30) / rows;
        int x = 0;
        int y = 0;

        // Iterate over the frames, deiconifying any iconified frames and then
        // relocating & resizing each.
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols && ((i * cols) + j < count); j++) {
                JInternalFrame f = allframes[(i * cols) + j];

                if (!f.isClosed() && f.isIcon()) {
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
    }//GEN-LAST:event_jBMostrarTodosActionPerformed

    private void formComponentResized(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentResized
        jDesktopPane.updateUI();
        jBMostrarTodos.doClick();        
    }//GEN-LAST:event_formComponentResized

    private void updateGrafica(JPanel chartPanel) {
        PersonalJInternalFrame personalJInternalFrame = new PersonalJInternalFrame(chartPanel, "hola");
        personalJInternalFrame.setBounds(0, 0, 760, 450);
        jDesktopPane.add(personalJInternalFrame, javax.swing.JLayeredPane.DEFAULT_LAYER);
        /*try {
            personalJInternalFrame.setMaximum(true);
        } catch (PropertyVetoException ex) {
            Logger.getLogger(PanelRetiros.class.getName()).log(Level.SEVERE, null, ex);
        }*/
        personalJInternalFrame.setVisible(true);
        jBMostrarTodos.doClick();
    }

    private void cargarValores() {
        int dimension = jComboBoxDimensionA.getSelectedIndex();
        int atributo = jComboBoxAtributoA.getSelectedIndex();
        Object[] valores = logicaRetiros.getValores(dimension, atributo);
        jComboBoxDimensionB.setModel(new javax.swing.DefaultComboBoxModel(valores));
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBAnalisisBidimensional;
    private javax.swing.JButton jBAnalisisUnidimensional;
    private javax.swing.JButton jBMostrarTodos;
    private javax.swing.JButton jButtonBar;
    private javax.swing.JButton jButtonBarJoin;
    private javax.swing.JButton jButtonBarJoin1;
    private javax.swing.JButton jButtonPie;
    private javax.swing.JButton jButtonPieJoin;
    private javax.swing.JComboBox jComboBoxAtributo;
    private javax.swing.JComboBox jComboBoxAtributoA;
    private javax.swing.JComboBox jComboBoxAtributoB;
    private javax.swing.JComboBox jComboBoxDimension;
    private javax.swing.JComboBox jComboBoxDimensionA;
    private javax.swing.JComboBox jComboBoxDimensionB;
    private javax.swing.JComboBox jComboBoxHechos;
    private javax.swing.JDesktopPane jDesktopPane;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanelBiDimensional;
    private javax.swing.JPanel jPanelCardLayout;
    private javax.swing.JPanel jPanelDos;
    private javax.swing.JPanel jPanelMain;
    private javax.swing.JPanel jPanelOpciones;
    private javax.swing.JPanel jPanelTres;
    private javax.swing.JPanel jPanelUniDimensional;
    private javax.swing.JPanel jPanelUno;
    private javax.swing.JToolBar jToolBarOpciones;
    // End of variables declaration//GEN-END:variables
}
