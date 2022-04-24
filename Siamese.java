package mini_project;

import javax.swing.JOptionPane;

/**
 *
 * @author Asmin
 */
public class Siamese extends javax.swing.JFrame {

    /**
     * Creates new form Siamese
     */
    public Siamese() {
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

        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tarResult = new javax.swing.JTextArea();
        btnRandom = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("เซี่ยมซี");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 153, 51));
        jLabel1.setText("เสี่ยงเซี่ยมซี");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel3.setText("ผลการทำนาย");

        tarResult.setEditable(false);
        tarResult.setColumns(20);
        tarResult.setFont(new java.awt.Font("Angsana New", 1, 24)); // NOI18N
        tarResult.setLineWrap(true);
        tarResult.setRows(5);
        jScrollPane1.setViewportView(tarResult);

        btnRandom.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnRandom.setText("เขย่าเซี่ยมซี");
        btnRandom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRandomActionPerformed(evt);
            }
        });

        btnExit.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnExit.setText("Exit");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mini_project/SiamesePNG.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnExit)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnRandom)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 393, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel1))))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(444, 444, 444)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 327, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(35, 35, 35)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnExit)
                            .addComponent(btnRandom)))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRandomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRandomActionPerformed
        //   int num = 4;
        int num = RandomNum();
        Siamese(num);
    }//GEN-LAST:event_btnRandomActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
    int option = JOptionPane.showConfirmDialog(rootPane, "Exit?");        
        System.exit(0);      // TODO add your handling code here:
    }//GEN-LAST:event_btnExitActionPerformed

    int RandomNum() {
        int min = 1;
        int max = 18;
        int random_int = (int) Math.floor(Math.random() * (max - min + 1) + min);
        System.out.println(random_int);
        return random_int;
    }

    void Siamese(int num) {
        switch (num) {
            case 1:
                tarResult.setText("คําทํานายที่สิบเก้า เซียมซีใบนี้ว่าด้วย ชะตาชีวิตช่วงนี้ จะมีความร้อนใจด้วยการ"
                        + "เจ็บป่วย แต่ลาภผลน้อย เนื้อคู่ช่วยท่านได้ แต่ความรักอาจจะมีอุปสรรคบ้าง การ"
                        + "งานดี ท่านควรหมั่นไหว้พระกวนอิมโพธิสัตว์ สิ่งร้ายอาจจะกลายเป็นดี");
                break;
            case 2:
                tarResult.setText("คําทํานายที่ยี่สิบ เซียมซีใบนี้ว่าด้วย ชะตาชีวิตช่วงนี้ ไม่มีอุปสรรค จะทําการใดก็ดี"
                        + "หมด การงานควรระวัง การมีปากเสียงกับผู้อื่น เจ็บป่วยไม่มี เนื้อคู่เป็นผุ้มีบุญ"
                        + "สรรพสิ่งสมประสงค์ดีนักแล");
                break;
            case 3:
                tarResult.setText("คําทํานายที่ยี่สิบเอ็ด เซียมซีใบนี้ว่าด้วย ชะตาชีวิตช่วงนี้ จะมีโชคลาภและจะมีผู้\n"
                        + "หใญ่มาคุ้มครอง การงานเจริญรุ่งเรือง เนื้อคู่อยู่ไม่ไกล เจ็บป่วยจะหายเร็ว สรรพสิ่ง\n"
                        + "สมประสงค์ แต่ควรหมั่นไหว้พระทําบุญสร้างบารมีเอาไว้บ้าง เพื่อภายหน้า\n"
                        + "ลูกหลานจะได้ดี เพราะที่ทําเอาไว้");
                break;
            case 4:
                tarResult.setText("ทํานายที่ยี่สิบสอง เซียมซีใบนี้ว่าด้วย ชะตาชีวิตช่วงนี้ เปรียบเหมือนต้นไม้ที่กําลัง\n"
                        + "เขียวชะอุ่ม หมายถึงจะได้ลาภเงินทองไหลมาเทมา การงานจะเจริญก้าวหน้า เนื้อคู่\n"
                        + "จะเป็นผู้ช่วยให้ท่านเจริญยิ่งขึ้น เจ็บป่วยไม่มี สรรพสิ่งสมดังปรารถนาทุกประการดี\n"
                        + "นักแล");
                break;
            case 5:
                tarResult.setText("คําทํานายที่ยี่สิบสาม เซียมซีใบนี้ว่าด้วย ชะตาชีวิตช่วงนี้ จะเกิดถ้วยความให้เกรง\n"
                        + "สตรีเป็นศัตรูจงหนัก มิฉะนั้น จะถูกฟ้องหาเพราะชู้เมีย ไม่ควรเดินทางกลางคืน\n"
                        + "การงานไม่มีอุปสรรค อาจจะเจ็บป่วยเสียเงินทอง จึงควรไหว้พระให้ท่านคุ้มครอง\n"
                        + "สิ่งต่าง ๆ อาจกลายเป็นดี");
                break;
            case 6:
                tarResult.setText("คําทํานายที่ยี่สิบสี่ เซียมซีใบนี้ว่าด้วย ชะตาชีวิตช่วงนี้ จะได้รับความร้อนใจมิฉะนั้น\n"
                        + "อาจจะมีอันตราย การงานมีอุปสรรค เจ็บป่วยหายยาก มีบุตรเลี้ยงยาก จงหมั่นไป\n"
                        + "ไหว้เทพเจ้าแห่งชะตาราศรี (ไท่ส่วย-เอี้ย) แล้วทุกสิ่งจะกลายเป็นดี");
                break;
            case 7:
                tarResult.setText("คําทํานายที่ยี่สิบห้า เซียมซีใบนี้ว่าด้วย ชะตาชีวิตช่วงนี้ จะได้ โชคลาภและอํานาจ\n"
                        + "การค้าขายรุ่งเรือง เจ็บป่วยจะมีหมอดีมารักษา เนื้อคู่อยู่ด้วยกันจะประเสริฐ ท่าน\n"
                        + "จะได้บุตรที่ดี สรรพสิ่งสมประสงค์ดีนักแล");
                break;
            case 8:
                tarResult.setText("คําทํานายที่ยี่สิบหก เซียมซีใบนี้ว่าด้วย ชะตาชีวิตช่วงนี้ จะมีผู้มาให้โชคลาภ การ\n"
                        + "งานอาจจะมีอุปสรรค เจ็บป่วยหายเร็ว ไม่ช้าจะได้เนื้อคู่ ท่านควรจะหมั่นไหว้พระ\n"
                        + "และเทพเจ้าแห่งโชคลาภ (ใช้ซิ้งเอี้ย) แล้วการค้าจะดี");
                break;
            case 9:
                tarResult.setText("คําทํานายที่ยี่สิบเจ็ด เซียมซีใบนี้ว่าด้วย ชะตาชีวิตช่วงนี้ จะเสียทรัพย์และของรัก\n"
                        + "จงระวังในการเดินทางไกล การค้าไม่มีโชคลาภ เจ็บป่วยหายยาก ท่านควรจะไป\n"
                        + "ไหว้พระและขอพรจากเทพเจ้าแห่งยา (หั่วท้อเซียงซือ) แล้วสรรพสิ่งต่าง ๆ จะ\n"
                        + "กลายเป็นดี");
                break;
            case 10:
                tarResult.setText("คําทํานายที่ยี่สิบแปด เซียมซีใบนี้ว่าด้วย ชะตาชีวิตช่วงนี้ เปรียบเหมือนพระ\n"
                        + "อาทิตย์อันร้อนแรง หมายถึงการงานจะเจริญรุ่งเรือง เจ็บป่วยจะมีหมอดีมารักษา\n"
                        + "จะมีเนื้อคู่ที่พร้อมด้วยทรัพย์สมบัติ สรรพสิ่งที่ขอจะได้สมดังใจหมายแล");
                break;
            case 11:
                tarResult.setText("คําทํานายที่ยี่สิบเก้า เซียมซีใบนี้ว่าด้วย ชะตาชีวิตช่วงนี้จะได้ยศฐาบรรดาศักดิ์ และ\n"
                        + "สรรพสิ่งลาภจะบริบูรณ์ด้วยทรัพย์สมบัติ การงานเจริญรุ่งเรือง ไม่มีโรคภัยอันตราย\n"
                        + "ความรักสมหวัง สรรพสิ่งไม่มีอุปสรรคดีนักแล");
                break;
            case 12:
                tarResult.setText("คําทํานายที่สามสิบ เซียมซีใบนี้ว่าด้วย ชะตาชีวิตช่วงนี้ ไม่สมดังใจหมายจะเกิด\n"
                        + "ความร้อนใจ เจ็บป่วยไข้หายยาก และอาจจะเสียของรักไป ท่านควรจะหมั่นขอพร\n"
                        + "จากพระกวนอิมโพธิสัตว์และเทพเจ้าแห่งยา(หั่วท้อเซียงซือ) สิ่งร้ายจะกลายเป็นดี");
                break;
            case 13:
                tarResult.setText("คําทํานายที่สามสิบเอ็ด เซียมซีใบนี้ว่าด้วย ชะตาชีวิตช่วงนี้ จะได้ลาภเพราะความ\n"
                        + "ฝัน จะได้ผ้าผ่อนของใช้สอยสรรพสิ่งไม่เหน็ดเหนื่อย การงานไม่มีอุปสรรค อายุยืน\n"
                        + "ยาว จะมีเนื้อคู่และบุตรสุดที่รัก ถ้าเป็นความจะชนะแล");
                break;
            case 14:
                tarResult.setText("คําทํานายที่สามสิบสอง เซียมซีใบนี้ว่าด้วย ชะตาชีวิตช่วงนี้ จักได้ลาภแก้วแหวน\n"
                        + "เงินทอง บริบูรณ์ไปด้วยสมบัติการงานก้าวหน้า อนาคตรุ่งเรือง เนื้อคู่มีบุญ อายุยืน\n"
                        + "ยาว สรรพสิ่งสมดังประสงค์ดีนักแล");
                break;
            case 15:
                tarResult.setText("คําทํานายที่สามสิบสาม เซียมซีใบนี้ว่าด้วย ชะตาชีวิตช่วงนี้ เปรียบเหมือนพระ\n"
                        + "อาทิตย์อันร้อนแรง หมายถึงการงานจะเจริญรุ่งเรือง เจ็บป่วยจะมีหมอดีมารักษา\n"
                        + "จะมีเนื้อคู่ที่พร้อมด้วยทรัพย์สมบัติ สรรพสิ่งที่ขอจะได้สมดังใจหมายแล");
                break;
            case 16:
                tarResult.setText("คําทํานายที่สามสิบสี่ เซียมซีใบนี้ว่าด้วย ชะตาชีวิตช่วงนี้ จะมีการเจ็บป่วยอยู่บ้าง\n"
                        + "การค้าขายไม่คล่องตัว โชคลาภยังมีน้อย เนื้อคู่จะช่วยท่านได้ จงหมั่นไหว้พระ\n"
                        + "ทําบุญขอพรให้มาก ๆ จะสมปรารถนาทุกประการ");
                break;
            case 17:
                tarResult.setText("คําทํานายที่สามสิบห้า เซียมซีใบนี้ว่าด้วย ชะตาชีวิตช่วงนี้ จะได้ลาภและเนื้อคู่ การ\n"
                        + "งานไม่มีอุปสรรค เจ็บป่วยจะมีหมอดีมารักษา มิฉะนั้นจะมีผู้ใหญ่คุ้มครอง จงหมั่น\n"
                        + "ไหว้พระขอพรจะดีนักแล");
                break;
            case 18:
                tarResult.setText("คําทํานายที่สามสิบหก เซียมซีใบนี้ว่าด้วย ชะตาชีวิตช่วงนี้ เข้าสู่โชคลาภจะมี\n"
                        + "ผู้สูงอายุมาให้โชค มิฉะนั้นจะมีเนื้อคู่พร้อมด้วยทรัพย์สมบัติ การค้าขายไม่มี\n"
                        + "อุปสรรค เจ็บป่วยจะมีหมอดีมารักษา สรรพสิ่งดังใจหมาย ถ้าเป็นความจะชนะแล");
                break;
        }//end switch-case loop

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
            java.util.logging.Logger.getLogger(Siamese.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Siamese.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Siamese.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Siamese.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Siamese().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnRandom;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea tarResult;
    // End of variables declaration//GEN-END:variables

}
