/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ecomm;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;

/**
 *
 * @author smart
 */
public class Billing extends javax.swing.JFrame {
static String name;
static String pass;
static String spec;
static String product;
static int price;
static int ca;
static int num;
public String h = "";
public int g = 0;
    /**
     * Creates new form billing
     */
    public Billing() {
        initComponents();
       
        Payment p1 = new Payment();
        this.ca=p1.num;
        System.out.println(ca);
        System.out.println(num);
        switch(ca){
            case 1:
                AppleBack b = new AppleBack();
                 h=b.product;
                 g=b.price;
                break;
                
            case 2 :
                AppleTemperd c = new AppleTemperd();
                
                 h=c.product;
                 g=c.price;
                break;
                
            case 3 :
                AppleUsb d = new AppleUsb();
                
                h=d.product;
              g=d.price;
               break;
                
            case 4 :
                SamsungBack e = new SamsungBack();
                
                h=e.product;
                g=e.price;
                break;
                
            case 5 :
                SamsungGuard1 f = new SamsungGuard1();
                
                h=f.product;
               g=f.price;
                break;
                
            case 6 :
                SamsungUsb g1 = new SamsungUsb();
                
                h=g1.product;
                g=g1.price;
                break;
        }
        Login l = new Login();
        l1.setText(h);
        l2.setText(l.name);
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
        l1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        l2 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        t1 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1300, 750));
        getContentPane().setLayout(null);

        jLabel2.setBackground(new java.awt.Color(204, 204, 255));
        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("PRODUCT NAME :");
        jLabel2.setOpaque(true);
        getContentPane().add(jLabel2);
        jLabel2.setBounds(390, 140, 149, 33);

        l1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        l1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(l1);
        l1.setBounds(640, 140, 332, 33);

        jLabel4.setBackground(new java.awt.Color(204, 204, 255));
        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("CONTACT NUMBER : ");
        jLabel4.setOpaque(true);
        getContentPane().add(jLabel4);
        jLabel4.setBounds(390, 310, 149, 33);

        jLabel5.setBackground(new java.awt.Color(204, 204, 255));
        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("CUSTOMER NAME :");
        jLabel5.setOpaque(true);
        getContentPane().add(jLabel5);
        jLabel5.setBounds(390, 220, 149, 35);

        jLabel6.setBackground(new java.awt.Color(204, 204, 255));
        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("BILLING ADDRESS :");
        jLabel6.setOpaque(true);
        getContentPane().add(jLabel6);
        jLabel6.setBounds(390, 390, 149, 30);

        l2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        l2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(l2);
        l2.setBounds(640, 220, 330, 40);

        jButton2.setBackground(new java.awt.Color(204, 204, 255));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton2.setText("CONTINUE >>");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(810, 640, 240, 60);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 72)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fs.jpg"))); // NOI18N
        jLabel1.setText("MOBILE  ACCESSORIES");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(30, 0, 1230, 100);
        getContentPane().add(t1);
        t1.setBounds(639, 310, 330, 40);

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(640, 390, 330, 100);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
       
      Login l1 = new Login();
      String n = l1.name;
      String p = l1.pass;
      UserHome1 u1 = new UserHome1();
      String s = u1.spec;
        try{
             Class.forName("oracle.jdbc.driver.OracleDriver"); 
             Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","Rohan", "Rohan");
           PreparedStatement pst = con.prepareStatement("Insert into TRANSACTION values(?,?,?,?,?)");
           pst.setString(1,n);
           pst.setString(2,p);
           pst.setString(3,h);
           pst.setString(4,s);
           pst.setInt(5,g);
           int x = pst.executeUpdate();
           if (x>0)
            {
              JOptionPane.showMessageDialog(this,"SUCCESSFULLY PURCHASED");
            }
            else {
               JOptionPane.showMessageDialog(this,"ERROR PLEASE LOOK INTO THE DETAILS");
            }
           con.close();
          
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(this,e);
            }
      
        Thanks c = new Thanks();
        c.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(Billing.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Billing.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Billing.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Billing.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Billing().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JLabel l1;
    private javax.swing.JLabel l2;
    private javax.swing.JTextField t1;
    // End of variables declaration//GEN-END:variables
}
