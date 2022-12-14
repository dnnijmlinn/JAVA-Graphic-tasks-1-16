/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.tehtava4;

import java.awt.Color;
import javax.swing.JOptionPane;

/**
 *
 * @author denisbogdanov
 */
public class Teh4JFrame extends javax.swing.JFrame {

    /**
     * Creates new form Teh4JFrame
     */
    public Teh4JFrame() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        radioGMaksutaparyhma = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jtxtMaara = new javax.swing.JTextField();
        jtxtHinta = new javax.swing.JTextField();
        jbtnLaske = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jtxtLoppusumma = new javax.swing.JTextField();
        jradioVISA = new javax.swing.JRadioButton();
        jradioOP = new javax.swing.JRadioButton();
        jradioKateinen = new javax.swing.JRadioButton();
        jlblLeveysvirhe = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Määritä tuotteiden määrä, hinta ja valitse maksutapa, niin ohjelma laskee tilauksen loppusumman.");

        jLabel2.setText("Määrä:");

        jLabel3.setText("Hinta/kpl:");

        jbtnLaske.setText("Laske");
        jbtnLaske.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnLaskeActionPerformed(evt);
            }
        });

        jLabel4.setText("Tilauksen loppusumma:");

        radioGMaksutaparyhma.add(jradioVISA);
        jradioVISA.setText("VISA: - 1% alennus");

        radioGMaksutaparyhma.add(jradioOP);
        jradioOP.setText("OP tilisiirto kertamaksulla: -2% alennus");

        radioGMaksutaparyhma.add(jradioKateinen);
        jradioKateinen.setText("Käteinen + 2% hintaa lisää");

        jlblLeveysvirhe.setText("Button");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 624, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jradioKateinen)
                                    .addComponent(jradioOP)
                                    .addComponent(jradioVISA)
                                    .addComponent(jbtnLaske)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel2)
                                            .addComponent(jLabel3))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jtxtMaara, javax.swing.GroupLayout.DEFAULT_SIZE, 122, Short.MAX_VALUE)
                                            .addComponent(jtxtHinta))))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtxtLoppusumma, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jlblLeveysvirhe)
                        .addGap(88, 88, 88))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel1)
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jtxtMaara, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jtxtHinta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addComponent(jradioVISA)
                .addGap(18, 18, 18)
                .addComponent(jradioOP)
                .addGap(18, 18, 18)
                .addComponent(jradioKateinen)
                .addGap(18, 18, 18)
                .addComponent(jbtnLaske)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jtxtLoppusumma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlblLeveysvirhe))
                .addGap(15, 15, 15))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbtnLaskeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnLaskeActionPerformed
        // TODO add your handling code here:
        try {
            
        double maara = Double.parseDouble(jtxtMaara.getText());
        double hinta = Double.parseDouble(jtxtHinta.getText());
        }
        
        catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Vain numeroita kentässä kiitos. Virhe: " + e.getMessage() , "Virhe", JOptionPane.ERROR_MESSAGE);
            jlblLeveysvirhe.setForeground(Color.red);
            jlblLeveysvirhe.setText("Virhe kentässä. Oleppas tarkkana!");
            jlblLeveysvirhe.setVisible(true);
            return;
        }

        double maara = Double.parseDouble(jtxtMaara.getText());
        double hinta = Double.parseDouble(jtxtHinta.getText());

        if(maara > 0 && maara < 1000 && hinta > 0 && hinta < 10000){
            jradioVISA.setActionCommand("VISA");
            jradioOP.setActionCommand("OP");
            jradioKateinen.setActionCommand("Käteinen");

            jtxtLoppusumma.setText("Valitsit:maksutavaksi: " + radioGMaksutaparyhma.getSelection().getActionCommand());
        
            if(radioGMaksutaparyhma.getSelection().getActionCommand().equals("VISA")){
                double tulos = (maara * hinta) * 0.99;
                jtxtLoppusumma.setText(String.valueOf(tulos));
            
            } else if(radioGMaksutaparyhma.getSelection().getActionCommand().equals("OP")){
                double tulos = (maara * hinta) * 0.98;
                jtxtLoppusumma.setText(String.valueOf(tulos));

            } else if(radioGMaksutaparyhma.getSelection().getActionCommand().equals("Käteinen")){
                double tulos = (maara * hinta) * 1.02;
                jtxtLoppusumma.setText(String.valueOf(tulos));
            }
        } else if(maara < 0 ){
            jlblLeveysvirhe.setText("Tuotteiden määrä oltava > 0!");
        } else if(maara > 1000 ){
            jlblLeveysvirhe.setText("Tuotteiden määrä oltava < 1000!");
        } else if(hinta < 0 ){
            jlblLeveysvirhe.setText("Tuotteiden hinnan/kpl oltava > 0!");
        } else if(hinta > 10000){
            jlblLeveysvirhe.setText("Tuotteiden hinnan/kpl oltava < 10000 eur.!");
        }
        
    }//GEN-LAST:event_jbtnLaskeActionPerformed

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
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Teh4JFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Teh4JFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Teh4JFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Teh4JFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Teh4JFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JButton jbtnLaske;
    private javax.swing.JButton jlblLeveysvirhe;
    private javax.swing.JRadioButton jradioKateinen;
    private javax.swing.JRadioButton jradioOP;
    private javax.swing.JRadioButton jradioVISA;
    private javax.swing.JTextField jtxtHinta;
    private javax.swing.JTextField jtxtLoppusumma;
    private javax.swing.JTextField jtxtMaara;
    private javax.swing.ButtonGroup radioGMaksutaparyhma;
    // End of variables declaration//GEN-END:variables
}
