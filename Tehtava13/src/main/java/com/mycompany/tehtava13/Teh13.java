package com.mycompany.tehtava13;

import java.util.ArrayList;
import javax.swing.DefaultListModel;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author denisbogdanov
 */
public class Teh13 extends javax.swing.JFrame {

    ArrayList<Double> al = new ArrayList();
    DefaultListModel dlm = new DefaultListModel();

    /**
     * Creates new form Teh13
     */
    public Teh13() {
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

        btnGroup = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jtxt1 = new javax.swing.JTextField();
        jtxt2 = new javax.swing.JTextField();
        jrd1 = new javax.swing.JRadioButton();
        jrd2 = new javax.swing.JRadioButton();
        jrd3 = new javax.swing.JRadioButton();
        jrd4 = new javax.swing.JRadioButton();
        jrd5 = new javax.swing.JRadioButton();
        jrd6 = new javax.swing.JRadioButton();
        jrd7 = new javax.swing.JRadioButton();
        jButton1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jlst = new javax.swing.JList<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Merkkijonon käsittelyharjoituksia:");

        jLabel2.setText("Teksti 1");

        jLabel3.setText("Teksti 2");

        btnGroup.add(jrd1);
        jrd1.setText("Teksti1 ja Teksti2 yhtäsuuruuden vertaaminen");
        jrd1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrd1ActionPerformed(evt);
            }
        });

        btnGroup.add(jrd2);
        jrd2.setText("Teksti1 pituus");
        jrd2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrd2ActionPerformed(evt);
            }
        });

        btnGroup.add(jrd3);
        jrd3.setText("Teksti2 SUUREKSI");

        btnGroup.add(jrd4);
        jrd4.setText("Teksti1 pieneksi ja Teksti2 liitetään perään");

        btnGroup.add(jrd5);
        jrd5.setText("Teksti2: alkaako K kirjaimella?");

        btnGroup.add(jrd6);
        jrd6.setText("Teksti1: korvaa \"vaikea\" sanalla \"helppo\"");

        btnGroup.add(jrd7);
        jrd7.setText("Teksti1: Kirjoita Opel, Volvo, BMW, Mersu, ja ohjelma muuntaa merkkijonon string taulukoksi ja taulukko tulostetaan takaisin for - silmukalla Tolus - kenttään.");
        jrd7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrd7ActionPerformed(evt);
            }
        });

        jButton1.setText("Aja");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel4.setText("Tulos:");

        jScrollPane1.setViewportView(jlst);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jrd5)
                                    .addComponent(jrd4)
                                    .addComponent(jrd3)
                                    .addComponent(jrd2)
                                    .addComponent(jrd1)
                                    .addComponent(jrd6))
                                .addGap(18, 18, 18)
                                .addComponent(jLabel4)
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 564, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 14, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addGap(18, 18, 18)
                                        .addComponent(jtxt2))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addGap(18, 18, 18)
                                        .addComponent(jtxt1, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel1))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jrd7)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(358, 358, 358)
                .addComponent(jButton1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jtxt1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jtxt2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(35, 35, 35)
                                .addComponent(jrd1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jrd2))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(47, 47, 47)
                                .addComponent(jLabel4)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jrd3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jrd4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jrd5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jrd6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(17, 17, 17)))
                .addComponent(jrd7)
                .addGap(43, 43, 43)
                .addComponent(jButton1)
                .addContainerGap(78, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jrd1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrd1ActionPerformed
        String text1, text2,tulos;
        text1 = jtxt1.getText();
        text2 = jtxt2.getText();
        
        

    }//GEN-LAST:event_jrd1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        jrd1.setActionCommand("1");
        jrd2.setActionCommand("2");
        jrd3.setActionCommand("3");
        jrd4.setActionCommand("4");
        jrd5.setActionCommand("5");
        jrd6.setActionCommand("6");
        jrd7.setActionCommand("7");
        String text1, text2,tulos1, tulos2;
        String txt1 = new String(jtxt1.getText());
        String txt2 = new String(jtxt2.getText());
        
        //Radio1
        if(btnGroup.getSelection().getActionCommand().equals("1")){
            int count1 = 0;
            for(int a = 0; a<txt1.length(); a++) {
            count1++;
        }
        int count2 = 0;
        for(int i = 0; i<txt2.length(); i++) {
        count2++;
        }
        if(count1>count2){
            int tul = count1-count2;
            tulos1 ="Teksti1:ssä on " + tul + " merkkiä enemmän kuin teksti2:ssa";
            dlm.addElement(tulos1);
        }else {
            int tul = count2-count1;
            tulos1 ="Teksti2:ssä on " + tul + " merkkiä enemmän kuin teksti1:ssa";
            dlm.addElement(tulos1);
        }
            jlst.setModel(dlm);
        } 
        //Radio2
        else if(btnGroup.getSelection().getActionCommand().equals("2")){
            int count1 = 0;
            for(int a = 0; a<txt1.length(); a++) {
            count1++;
        }
            dlm.addElement("Teksti1 pituus on " + count1 + " merkkiä");
            jlst.setModel(dlm);

        }
        //Radio3
        else if(btnGroup.getSelection().getActionCommand().equals("3")){
            String txtkaksi = new String(jtxt2.getText());
            String result = txtkaksi.toUpperCase();
            dlm.addElement(result);
            jlst.setModel(dlm);
        }
        //Radio4
        else if(btnGroup.getSelection().getActionCommand().equals("4")){
            String txtyksi = new String(jtxt1.getText());
            String txtkaksi = new String(jtxt2.getText());

            String result = txtyksi.toLowerCase();
            dlm.addElement(result + " " + txtkaksi);
            jlst.setModel(dlm);
        }
        //Radio5
        else if(btnGroup.getSelection().getActionCommand().equals("5")){
            String txtkaksi = new String(jtxt2.getText());
            char c = txtkaksi.charAt(0);
            if(c == 'K'){
                dlm.addElement("ensimmäinen elementti merkkijonossa Text2 on K");
            } else {
                dlm.addElement("ensimmäinen elementti merkkijonossa Text2 ei 'K'. On " + "'" + c + "'");
            }
            jlst.setModel(dlm);
        }
        //Radoi6
        else if(btnGroup.getSelection().getActionCommand().equals("6")){
            String txtyksi = new String(jtxt1.getText());
            //System.out.println(txtyksi.replace("Hello", "GoodBye"));
            dlm.addElement(txtyksi.replace("vaikea", "helppo"));
            jlst.setModel(dlm);
        }
        //Radio7
        else if(btnGroup.getSelection().getActionCommand().equals("7")){
            String txtyksi = new String(jtxt1.getText());
            String[] words = txtyksi.split(",");
            int i=0;
            for(String word : words){
                String sana = word + " : " +i;
                i++;
                dlm.addElement(sana);
            }
            jlst.setModel(( dlm));
        }


    }//GEN-LAST:event_jButton1ActionPerformed

    private void jrd2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrd2ActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jrd2ActionPerformed

    private void jrd7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrd7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jrd7ActionPerformed

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
            java.util.logging.Logger.getLogger(Teh13.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Teh13.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Teh13.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Teh13.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Teh13().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup btnGroup;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList<String> jlst;
    private javax.swing.JRadioButton jrd1;
    private javax.swing.JRadioButton jrd2;
    private javax.swing.JRadioButton jrd3;
    private javax.swing.JRadioButton jrd4;
    private javax.swing.JRadioButton jrd5;
    private javax.swing.JRadioButton jrd6;
    private javax.swing.JRadioButton jrd7;
    private javax.swing.JTextField jtxt1;
    private javax.swing.JTextField jtxt2;
    // End of variables declaration//GEN-END:variables
}