/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.tehtava11;

import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

/**
 *
 * @author denisbogdanov
 */
public class Teh11 extends javax.swing.JFrame {

    /**
     * Creates new form Teh11
     */
    int x[] = new int [5];
    int lkm=0;
    double ki=0;
    DefaultListModel dlm = new DefaultListModel();
    public Teh11() {
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jtxtNimi = new javax.swing.JTextField();
        jtxtIka = new javax.swing.JTextField();
        jBtn = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jtxtKeskiika = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jlstNimet = new javax.swing.JList<>();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Anna henkilöiden nimiä ja ikiä yksitellen max.5 henkilöille, lisään ne taulukkoon ja listaan.");

        jLabel2.setText("Nimi:");

        jLabel3.setText("Ikä:");

        jBtn.setText("Lisää listaan");
        jBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnActionPerformed(evt);
            }
        });

        jLabel4.setText("Keski-ikä:");

        jtxtKeskiika.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtKeskiikaActionPerformed(evt);
            }
        });

        jScrollPane2.setViewportView(jlstNimet);

        jButton1.setText("Tyhjenää");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(119, 119, 119)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel4)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jtxtKeskiika, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(134, 134, 134))
                                .addComponent(jBtn, javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel3)
                                        .addComponent(jLabel2))
                                    .addGap(50, 50, 50)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jtxtIka, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jtxtNimi, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jButton1)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel1)
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jtxtNimi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jtxtIka, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBtn)
                    .addComponent(jButton1))
                .addGap(19, 19, 19)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jtxtKeskiika, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(89, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnActionPerformed
        // TODO add your handling code here:
        int ika;
        double nimiika;
        try {
        ika = Integer.parseInt(jtxtIka.getText());
        }
        
        catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Vain numeroita ikässä kiitos. Virhe: " + e.getMessage() , "Virhe", JOptionPane.ERROR_MESSAGE);
            return;
        }
        try{
            nimiika = Double.parseDouble(jtxtNimi.getText());
            JOptionPane.showMessageDialog(null, "Nimessä ei saa olla numeroita: " , "Virhe", JOptionPane.ERROR_MESSAGE);
            return;
        } 
        catch (NumberFormatException e) {      
        }
        x[lkm] = Integer.parseInt(jtxtIka.getText());
        Taytalista();
        lkm++;
        jtxtKeskiika.setText(String.valueOf(Laskekeskiika()));
        //jtxtL.setText(String.valueOf(x.length));
        
    }//GEN-LAST:event_jBtnActionPerformed

    private void jtxtKeskiikaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtKeskiikaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtKeskiikaActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        jtxtNimi.setText(null);
        jtxtIka.setText(null);
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
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Teh11.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Teh11.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Teh11.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Teh11.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Teh11().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBtn;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JList<String> jlstNimet;
    private javax.swing.JTextField jtxtIka;
    private javax.swing.JTextField jtxtKeskiika;
    private javax.swing.JTextField jtxtNimi;
    // End of variables declaration//GEN-END:variables

    private void Taytalista() {
        dlm.addElement(jtxtNimi.getText()+" ikä: " + jtxtIka.getText() + "\n");
        jlstNimet.setModel(dlm);
    }
    
    private double Laskekeskiika(){
    double keskiarvo=0, summa=0;
    for(int i=0; i<x.length; i++) {
        summa+=x[i];
    }
    keskiarvo = summa/lkm;
    return keskiarvo;        
}

    

}
