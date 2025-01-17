/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.kalkulator3rumus;

import java.awt.Color;

/**
 *
 * @author acer
 */
public class KalkulatorFile extends javax.swing.JFrame {

    /**
     * Creates new form KalkulatorFile
     */
    public KalkulatorFile() {
        initComponents();
        
        // getContentPane to change background color
        Color bg = new Color(204,204,255);
        getContentPane().setBackground(bg);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Title = new javax.swing.JLabel();
        HeadingPersegi = new javax.swing.JLabel();
        jLabelSisi1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtsisipersegi = new javax.swing.JTextField();
        txtluaspersegi = new javax.swing.JTextField();
        txtkelilingpersegi = new javax.swing.JTextField();
        HeadingBelahKetupat = new javax.swing.JLabel();
        HeadingSegitiga = new javax.swing.JLabel();
        jLabelD1 = new javax.swing.JLabel();
        jLabelD2 = new javax.swing.JLabel();
        txtd1ketupat = new javax.swing.JTextField();
        txtd2ketupat = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txtluasketupat = new javax.swing.JTextField();
        txtkelilingketupat = new javax.swing.JTextField();
        buttonKetupat = new javax.swing.JButton();
        buttonPersegi = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        txttinggisegitiga = new javax.swing.JTextField();
        txtalassegitiga = new javax.swing.JTextField();
        jLabelSisi2 = new javax.swing.JLabel();
        txtsisiketupat = new javax.swing.JTextField();
        jLabelSisi3 = new javax.swing.JLabel();
        txtsisisegitiga = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jLabel17 = new javax.swing.JLabel();
        txtluassegitiga = new javax.swing.JTextField();
        txtkelilingsegitiga = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(204, 204, 255));

        Title.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        Title.setText("Kalkulator Bangun Datar");

        HeadingPersegi.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        HeadingPersegi.setForeground(new java.awt.Color(204, 0, 0));
        HeadingPersegi.setText("Persegi");

        jLabelSisi1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabelSisi1.setForeground(new java.awt.Color(204, 0, 0));
        jLabelSisi1.setText("Masukkan Sisi:");

        jLabel4.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 0, 0));
        jLabel4.setText("Hasil Luas");

        jLabel5.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(204, 0, 0));
        jLabel5.setText("Hasil Keliling");

        txtsisipersegi.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        txtsisipersegi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtsisipersegiActionPerformed(evt);
            }
        });

        txtluaspersegi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtluaspersegiActionPerformed(evt);
            }
        });

        HeadingBelahKetupat.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        HeadingBelahKetupat.setForeground(new java.awt.Color(0, 0, 153));
        HeadingBelahKetupat.setText("Belah Ketupat");

        HeadingSegitiga.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        HeadingSegitiga.setForeground(new java.awt.Color(102, 51, 0));
        HeadingSegitiga.setText("Segitiga Sama Sisi");

        jLabelD1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabelD1.setForeground(new java.awt.Color(0, 0, 153));
        jLabelD1.setText("Masukkan D1:");

        jLabelD2.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabelD2.setForeground(new java.awt.Color(0, 0, 153));
        jLabelD2.setText("Masukkan D2:");

        txtd1ketupat.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        txtd1ketupat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtd1ketupatActionPerformed(evt);
            }
        });

        txtd2ketupat.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        txtd2ketupat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtd2ketupatActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 0, 153));
        jLabel11.setText("Hasil Luas");

        jLabel12.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 0, 153));
        jLabel12.setText("Hasil Keliling");

        buttonKetupat.setBackground(new java.awt.Color(204, 255, 255));
        buttonKetupat.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        buttonKetupat.setText("Hitung L dan K");
        buttonKetupat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonKetupatActionPerformed(evt);
            }
        });

        buttonPersegi.setBackground(new java.awt.Color(255, 204, 204));
        buttonPersegi.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        buttonPersegi.setText("Hitung L dan K");
        buttonPersegi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonPersegiActionPerformed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(102, 51, 0));
        jLabel13.setText("Masukkan Tinggi:");

        jLabel14.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(102, 51, 0));
        jLabel14.setText("Masukkan Alas:");

        txttinggisegitiga.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        txttinggisegitiga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txttinggisegitigaActionPerformed(evt);
            }
        });

        txtalassegitiga.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        txtalassegitiga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtalassegitigaActionPerformed(evt);
            }
        });

        jLabelSisi2.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabelSisi2.setForeground(new java.awt.Color(0, 0, 153));
        jLabelSisi2.setText("Masukkan Sisi:");

        txtsisiketupat.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        txtsisiketupat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtsisiketupatActionPerformed(evt);
            }
        });

        jLabelSisi3.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabelSisi3.setForeground(new java.awt.Color(102, 51, 0));
        jLabelSisi3.setText("Masukkan Sisi:");

        txtsisisegitiga.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        txtsisisegitiga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtsisisegitigaActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(204, 255, 204));
        jButton3.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jButton3.setText("Hitung L dan K");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel17.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(102, 51, 0));
        jLabel17.setText("Hasil Keliling");

        jLabel18.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(102, 51, 0));
        jLabel18.setText("Hasil Luas");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(14, 14, 14)
                                            .addComponent(jLabel4))
                                        .addComponent(jLabel5)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(txtsisipersegi)
                                            .addComponent(jLabelSisi1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addComponent(HeadingPersegi, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(14, 14, 14))
                                            .addComponent(buttonPersegi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                    .addGap(20, 20, 20))
                                .addComponent(txtluaspersegi, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtkelilingpersegi, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(49, 49, 49)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelD2)
                            .addComponent(txtd1ketupat, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtd2ketupat, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelSisi2)
                            .addComponent(txtsisiketupat, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(buttonKetupat)
                            .addComponent(jLabelD1)
                            .addComponent(HeadingBelahKetupat)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtkelilingketupat, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(19, 19, 19)
                                        .addComponent(jLabel11)))
                                .addGap(2, 2, 2))
                            .addComponent(txtluasketupat, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(2, 2, 2)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(HeadingSegitiga)
                        .addGap(32, 32, 32))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtluassegitiga)
                                .addComponent(txtkelilingsegitiga, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(8, 8, 8)
                                    .addComponent(jLabel17))
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(21, 21, 21)
                                    .addComponent(jLabel18)))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel14)
                                    .addComponent(jLabel13)
                                    .addComponent(txttinggisegitiga, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtalassegitiga, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabelSisi3)
                                    .addComponent(txtsisisegitiga, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jButton3)
                                    .addGap(18, 18, 18))))
                        .addGap(48, 48, 48))))
            .addGroup(layout.createSequentialGroup()
                .addGap(154, 154, 154)
                .addComponent(Title)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Title)
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(HeadingPersegi)
                    .addComponent(HeadingBelahKetupat)
                    .addComponent(HeadingSegitiga))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelSisi1)
                    .addComponent(jLabelD1)
                    .addComponent(jLabel14))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtsisipersegi, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtd1ketupat, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtalassegitiga, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelD2)
                            .addComponent(jLabel13))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtd2ketupat, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txttinggisegitiga, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(buttonPersegi, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabelSisi3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtsisisegitiga, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtluaspersegi, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabelSisi2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtsisiketupat, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtkelilingpersegi, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(buttonKetupat, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, 20, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtluasketupat, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtkelilingketupat, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel18)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtluassegitiga, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel17)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtkelilingsegitiga, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(33, 33, 33))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtsisipersegiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtsisipersegiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtsisipersegiActionPerformed

    private void txtd1ketupatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtd1ketupatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtd1ketupatActionPerformed

    private void txtd2ketupatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtd2ketupatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtd2ketupatActionPerformed

    private void txttinggisegitigaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txttinggisegitigaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txttinggisegitigaActionPerformed

    private void txtalassegitigaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtalassegitigaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtalassegitigaActionPerformed

    private void txtsisiketupatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtsisiketupatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtsisiketupatActionPerformed

    private void txtsisisegitigaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtsisisegitigaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtsisisegitigaActionPerformed

    private void txtluaspersegiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtluaspersegiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtluaspersegiActionPerformed

    private void buttonPersegiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonPersegiActionPerformed
        // TODO add your handling code here:
         double sisi = Double.parseDouble(txtsisipersegi.getText());
         double luas = sisi * sisi;
         double keliling = 4 * sisi;

         txtluaspersegi.setText(String.valueOf(luas));
         txtkelilingpersegi.setText(String.valueOf(keliling));
    }//GEN-LAST:event_buttonPersegiActionPerformed

    private void buttonKetupatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonKetupatActionPerformed
        // TODO add your handling code here:
        double diagonal1 = Double.parseDouble(txtd1ketupat.getText());
        double diagonal2 = Double.parseDouble(txtd2ketupat.getText());
        double sisi = Double.parseDouble(txtsisiketupat.getText());
        
        double luas = (diagonal1 * diagonal2) / 2;
        double keliling = 4 * sisi;

        txtluasketupat.setText(String.valueOf(luas));
        txtkelilingketupat.setText(String.valueOf(keliling));        
    }//GEN-LAST:event_buttonKetupatActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        double alas = Double.parseDouble(txtalassegitiga.getText());
        double tinggi = Double.parseDouble(txttinggisegitiga.getText());
        double sisi = Double.parseDouble(txtsisisegitiga.getText());
        
        double luas = (alas * tinggi) / 2;
        double keliling = 3 * sisi;

        txtluassegitiga.setText(String.valueOf(luas));
        txtkelilingsegitiga.setText(String.valueOf(keliling));
    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(KalkulatorFile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(KalkulatorFile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(KalkulatorFile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(KalkulatorFile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new KalkulatorFile().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel HeadingBelahKetupat;
    private javax.swing.JLabel HeadingPersegi;
    private javax.swing.JLabel HeadingSegitiga;
    private javax.swing.JLabel Title;
    private javax.swing.JButton buttonKetupat;
    private javax.swing.JButton buttonPersegi;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabelD1;
    private javax.swing.JLabel jLabelD2;
    private javax.swing.JLabel jLabelSisi1;
    private javax.swing.JLabel jLabelSisi2;
    private javax.swing.JLabel jLabelSisi3;
    private javax.swing.JTextField txtalassegitiga;
    private javax.swing.JTextField txtd1ketupat;
    private javax.swing.JTextField txtd2ketupat;
    private javax.swing.JTextField txtkelilingketupat;
    private javax.swing.JTextField txtkelilingpersegi;
    private javax.swing.JTextField txtkelilingsegitiga;
    private javax.swing.JTextField txtluasketupat;
    private javax.swing.JTextField txtluaspersegi;
    private javax.swing.JTextField txtluassegitiga;
    private javax.swing.JTextField txtsisiketupat;
    private javax.swing.JTextField txtsisipersegi;
    private javax.swing.JTextField txtsisisegitiga;
    private javax.swing.JTextField txttinggisegitiga;
    // End of variables declaration//GEN-END:variables
}
