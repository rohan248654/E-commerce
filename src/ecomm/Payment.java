/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ecomm;

/**
 *
 * @author Rohan
 */
public class Payment extends javax.swing.JFrame {
static int num;
    /**
     * Creates new form Confirm
     */
    public Payment() {
        initComponents();
    }
    public Payment(int x){
       num=x; 
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        r1 = new javax.swing.JRadioButton();
        r2 = new javax.swing.JRadioButton();
        r3 = new javax.swing.JRadioButton();
        r4 = new javax.swing.JRadioButton();
        r5 = new javax.swing.JRadioButton();
        r6 = new javax.swing.JRadioButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1300, 750));
        getContentPane().setLayout(null);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 72)); // NOI18N
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fs.jpg"))); // NOI18N
        jLabel2.setText("MOBILE  ACCESSORIES");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(60, 10, 1230, 130);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("PLEASE  CONFIRM  YOUR  ORDER");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(500, 170, 310, 60);

        buttonGroup1.add(r1);
        r1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        r1.setText("BACK COVER");
        getContentPane().add(r1);
        r1.setBounds(150, 270, 180, 23);

        buttonGroup1.add(r2);
        r2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        r2.setText("TEMPERED  GLASS");
        getContentPane().add(r2);
        r2.setBounds(150, 340, 160, 23);

        buttonGroup1.add(r3);
        r3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        r3.setText("USB  CABLE");
        getContentPane().add(r3);
        r3.setBounds(150, 410, 150, 23);

        buttonGroup1.add(r4);
        r4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        r4.setText("BACK  COVER");
        getContentPane().add(r4);
        r4.setBounds(650, 270, 180, 23);

        buttonGroup1.add(r5);
        r5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        r5.setText("TEMPERED  GLASS");
        getContentPane().add(r5);
        r5.setBounds(650, 330, 160, 23);

        buttonGroup1.add(r6);
        r6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        r6.setText("USB  CABLE");
        getContentPane().add(r6);
        r6.setBounds(650, 400, 160, 23);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("APPLE");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(180, 220, 160, 30);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("SAMSUNG");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(680, 220, 120, 30);

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setText("CONFIRM");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(1020, 433, 200, 50);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ecomm.jpg"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 1360, 770);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        if(r1.isSelected())
        {
          num = 1;
          Payment c = new Payment(num);
        }
        if(r2.isSelected())
        {
          num = 2;
          Payment c = new Payment(num);
        }
        if(r3.isSelected())
        {
          num = 3;
          Payment c = new Payment(num);
        }
        if(r4.isSelected())
        {
          num = 4;
          Payment c = new Payment(num);
        }
        if(r5.isSelected())
        {
          num = 5;
          Payment c = new Payment(num);
        }
        if(r6.isSelected())
        {
          num = 6;
          Payment c = new Payment(num);
        }
        Payment1 p = new Payment1();
        p.setVisible(true);
        this.dispose();
        
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
            java.util.logging.Logger.getLogger(Payment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Payment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Payment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Payment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Payment().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JRadioButton r1;
    private javax.swing.JRadioButton r2;
    private javax.swing.JRadioButton r3;
    private javax.swing.JRadioButton r4;
    private javax.swing.JRadioButton r5;
    private javax.swing.JRadioButton r6;
    // End of variables declaration//GEN-END:variables
}
