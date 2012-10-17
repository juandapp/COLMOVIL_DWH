/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import controladores.ControladorRetiros;
import java.awt.CardLayout;
import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

/**
 *
 * @author gustavo
 */
public class MainFrame extends javax.swing.JFrame {


    /**
     * Creates new form MainFrame
     */
    public MainFrame() {
       initComponents();
       panelRetiros retiros = new panelRetiros(this);
       panelCards.add(retiros, "retiros");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelCards = new javax.swing.JPanel();
        menuBotones = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItemSali = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panelCards.setLayout(new java.awt.CardLayout());

        menuBotones.setBorder(javax.swing.BorderFactory.createEmptyBorder(50, 50, 50, 50));
        menuBotones.setLayout(new java.awt.GridLayout(3, 3, 30, 30));

        jButton1.setText("Retiros");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        menuBotones.add(jButton1);

        jButton2.setText("jButton2");
        menuBotones.add(jButton2);

        jButton7.setText("jButton7");
        menuBotones.add(jButton7);

        jButton3.setText("jButton3");
        menuBotones.add(jButton3);

        jButton4.setText("jButton4");
        menuBotones.add(jButton4);

        jButton6.setText("jButton6");
        menuBotones.add(jButton6);

        jButton8.setText("jButton8");
        menuBotones.add(jButton8);

        jButton5.setText("jButton5");
        menuBotones.add(jButton5);

        jButton9.setText("jButton9");
        menuBotones.add(jButton9);

        panelCards.add(menuBotones, "menu");

        getContentPane().add(panelCards, java.awt.BorderLayout.CENTER);

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
        setBounds((screenSize.width-873)/2, (screenSize.height-562)/2, 873, 562);
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItemSaliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemSaliActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jMenuItemSaliActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       CardLayout cl = (CardLayout)(panelCards.getLayout());
       cl.show(panelCards, (String)"retiros");
       
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            javax.swing.UIManager.setLookAndFeel(javax.swing.UIManager.getSystemLookAndFeelClassName());
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainFrame().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItemSali;
    private javax.swing.JPanel menuBotones;
    public javax.swing.JPanel panelCards;
    // End of variables declaration//GEN-END:variables
}
