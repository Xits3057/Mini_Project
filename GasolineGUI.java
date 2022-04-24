package mini_project;

import java.text.DecimalFormat;
import javax.swing.JOptionPane;

public class GasolineGUI extends javax.swing.JFrame {

    static final double PTT[] = {36.50, 33.24, 41.54, 29.34};
    static final double BCP[] = {37.74, 35.24, 42.64, 28.99};
    static final double SHELL[] = {37.34, 35.04, 41.84, 28.20};
    static final double ESSO[] = {37.03, 35.34, 41.55, 29.10};

    static int carType = 0;
    static int oilType = 0;
    static int petrolType = 0;
    static int amount = 0;
    static int brand = 0;
    static int R = 0;
    static double litre = 0;
    static String txtoil = "";

    public GasolineGUI() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        rdoPTT = new javax.swing.JRadioButton();
        rdoBCF = new javax.swing.JRadioButton();
        rdoShell = new javax.swing.JRadioButton();
        rdoESSO = new javax.swing.JRadioButton();
        cbxCartype = new javax.swing.JComboBox<>();
        cbxOiltype = new javax.swing.JComboBox<>();
        btnReceipt = new javax.swing.JButton();
        btnTax = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tarResult = new javax.swing.JTextArea();
        btnClear = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        txtfAmount = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Angsana New", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 255));
        jLabel1.setText("เติมน้ำมัน");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("เลือกปั้ม");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("ประเภทรถ");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setText("ประเภทน้ำมัน");

        buttonGroup1.add(rdoPTT);
        rdoPTT.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        rdoPTT.setText("ปตท");

        buttonGroup1.add(rdoBCF);
        rdoBCF.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        rdoBCF.setText("บางจาก");

        buttonGroup1.add(rdoShell);
        rdoShell.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        rdoShell.setText("เชลล์");

        buttonGroup1.add(rdoESSO);
        rdoESSO.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        rdoESSO.setText("เอสโซ่");

        cbxCartype.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Sedan", "Pickup" }));
        cbxCartype.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxCartypeActionPerformed(evt);
            }
        });

        cbxOiltype.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Gasohol 95", "Gasohol 91", "Benzin 91", "Diesel" }));
        cbxOiltype.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxOiltypeActionPerformed(evt);
            }
        });

        btnReceipt.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnReceipt.setText("พิมพ์ใบเสร็จ");
        btnReceipt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReceiptActionPerformed(evt);
            }
        });

        btnTax.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnTax.setText("พิมพ์ใบกำกับภาษี");
        btnTax.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTaxActionPerformed(evt);
            }
        });

        tarResult.setEditable(false);
        tarResult.setColumns(20);
        tarResult.setRows(5);
        jScrollPane1.setViewportView(tarResult);

        btnClear.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnClear.setText("Clear");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });

        btnExit.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnExit.setText("Exit");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setText("ระบุจำนวนเงิน");

        txtfAmount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtfAmountActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(136, 136, 136)
                                .addComponent(jLabel1))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addGap(18, 18, 18)
                                        .addComponent(rdoPTT))
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cbxOiltype, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cbxCartype, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(rdoBCF)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(btnTax)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(rdoShell)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(rdoESSO))))
                                    .addComponent(txtfAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(77, 77, 77)
                        .addComponent(btnClear)
                        .addGap(115, 115, 115)
                        .addComponent(btnExit))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 441, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(btnReceipt)))
                .addContainerGap(23, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(71, 71, 71)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(rdoPTT))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel3))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rdoBCF)
                            .addComponent(rdoShell)
                            .addComponent(rdoESSO))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cbxCartype, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(cbxOiltype, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtfAmount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnReceipt)
                    .addComponent(btnTax))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnClear)
                    .addComponent(btnExit))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnReceiptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReceiptActionPerformed
        if (R == 0) {
            amount = Integer.parseInt(txtfAmount.getText());
            brand();
            litre = getlitre();
            txtoil = oil();
            R++;
        }
        tarResult.setText(tarResult.getText() + "            ------------------------------\n");
        switch (brand) {
            case 1:
                tarResult.setText(tarResult.getText() + "            PTT Gas Station\n");
                break;
            case 2:
                tarResult.setText(tarResult.getText() + "            BCP Gas Station\n");
                break;
            case 3:
                tarResult.setText(tarResult.getText() + "            Shell Gas Station\n");
                break;
            case 4:
                tarResult.setText(tarResult.getText() + "            Esso Gas Station\n");
                break;
        }
        tarResult.setText(tarResult.getText() + "            Receipt\n");
        tarResult.setText(tarResult.getText() + "            ------------------------------\n");
        tarResult.setText(tarResult.getText() + String.format("            " + txtoil + "     %.1f", litre) + " Litre     " + amount + "Baht\n");
        tarResult.setText(tarResult.getText() + "            ------------------------------\n");
    }//GEN-LAST:event_btnReceiptActionPerformed

    private void cbxCartypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxCartypeActionPerformed
        carType = cbxCartype.getSelectedIndex();        // TODO add your handling code here:
    }//GEN-LAST:event_cbxCartypeActionPerformed

    private void cbxOiltypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxOiltypeActionPerformed
        oilType = cbxOiltype.getSelectedIndex();        // TODO add your handling code here:
    }//GEN-LAST:event_cbxOiltypeActionPerformed

    private void btnTaxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTaxActionPerformed
        double vat, vatp;
        if (R == 0) {
            amount = Integer.parseInt(txtfAmount.getText());
            brand();
            litre = getlitre();
            txtoil = oil();
            R++;
        }
        tarResult.setText(tarResult.getText() + "            ------------------------------\n");
        switch (brand) {
            case 1:
                tarResult.setText(tarResult.getText() + "            PTT Gas Station\n");
                break;
            case 2:
                tarResult.setText(tarResult.getText() + "            BCP Gas Station\n");
                break;
            case 3:
                tarResult.setText(tarResult.getText() + "            Shell Gas Station\n");
                break;
            case 4:
                tarResult.setText(tarResult.getText() + "            Esso Gas Station\n");
                break;
        }
        tarResult.setText(tarResult.getText() + "            Tax Invoice\n");
        tarResult.setText(tarResult.getText() + "            ------------------------------\n");
        tarResult.setText(tarResult.getText() + String.format("            " + txtoil + "     %.1f", litre) + " Litre     " + amount + "Baht\n\n");
        vat = amount / 1.07;
        tarResult.setText(tarResult.getText() + String.format("            Amount       : %.1f \n", vat));
        vatp = (amount / 1.07) * 0.07;
        tarResult.setText(tarResult.getText() + "            Vat 7%       : ");
        tarResult.setText(tarResult.getText() + String.format("%.1f \n", vatp));
        tarResult.setText(tarResult.getText() + "            Total Amount : " + amount + "\n");
        tarResult.setText(tarResult.getText() + "            ------------------------------\n");
    }//GEN-LAST:event_btnTaxActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        carType = 0;
        oilType = 0;
        petrolType = 0;
        amount = 0;
        brand = 0;
        R = 0;
        litre = 0;
        txtoil = ""; 
        tarResult.setText("");// TODO add your handling code here:
    }//GEN-LAST:event_btnClearActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
    int option = JOptionPane.showConfirmDialog(rootPane, "Exit?");        
        System.exit(0);         // TODO add your handling code here:
    }//GEN-LAST:event_btnExitActionPerformed

    private void txtfAmountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtfAmountActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtfAmountActionPerformed
    void brand() {
        if (rdoPTT.isSelected()) {
            brand = 1;
        }
        if (rdoBCF.isSelected()) {
            brand = 2;
        }
        if (rdoShell.isSelected()) {
            brand = 3;
        }
        if (rdoESSO.isSelected()) {
            brand = 4;
        }
    }

    static double getlitre() {
        double litre;
        double price = getPrice();
        litre = (double) amount / price;
        return litre;
    }

    static double getPrice() {
        double price = 0;
        //   brand--;
        switch (brand) {
            case 1:
                price = PTT[oilType];
                break;
            case 2:
                price = BCP[oilType];
                break;
            case 3:
                price = SHELL[oilType];
                break;
            case 4:
                price = ESSO[oilType];
                break;
        }
        return price;
    }

    static String oil() {
        oilType = oilType + 1;
        switch (oilType) {
            case 1:
                txtoil = "Gasohol 95";
                break;
            case 2:
                txtoil = "Gasohol 91";
                break;
            case 3:
                txtoil = "Benzin 91";
                break;
            default:
                txtoil = "HSD";
        }
        return txtoil;
    }

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
            java.util.logging.Logger.getLogger(GasolineGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GasolineGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GasolineGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GasolineGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GasolineGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnReceipt;
    private javax.swing.JButton btnTax;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> cbxCartype;
    private javax.swing.JComboBox<String> cbxOiltype;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton rdoBCF;
    private javax.swing.JRadioButton rdoESSO;
    private javax.swing.JRadioButton rdoPTT;
    private javax.swing.JRadioButton rdoShell;
    private javax.swing.JTextArea tarResult;
    private javax.swing.JTextField txtfAmount;
    // End of variables declaration//GEN-END:variables
}
