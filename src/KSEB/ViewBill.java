/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package KSEB;
import java.sql.*;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *
 * @author nyesteventuretechnologies
 */
public class ViewBill extends javax.swing.JFrame {
public int id;
    /**
     * Creates new form ViewBill
     */
    public ViewBill() {
        initComponents();
       
    }
    
       public  ViewBill(String consumerNumber) {
         
        initComponents();
        
         this.setBounds(200, 100, 559, 500);
        this.setResizable(false);
        try
        {
            
            Database d=new Database();
         //   String id=consumerNumber;
           // Pre  System.out.println("-------------------------------"+consumerNumber);paredStatement ps=d.con.prepareStatement("select register.id,bill.consumer,bill.fromdate,bill.todate,bill.amount,bill.due,bill.disconnect FROM register INNER JOIN bill ON register.id=bill.id");
              System.out.println("---------consumerNumber----------------------"+consumerNumber);
            PreparedStatement ps=d.con.prepareStatement("select * from bill where consumer=?");
            ps.setString(1, consumerNumber);
            ResultSet rs=ps.executeQuery();
            while(rs.next())
                    
            {
                  System.out.println("---------consumerNumber----------------------"+rs.getString(2));
              jTextField1.setText(rs.getString(1));
             jTextField1.setEditable(false);
             jTextField2.setText(rs.getString(2)); 
               jTextField2.setEditable(false);
            jTextField3.setText(rs.getString(6));
              jTextField3.setEditable(false);
            jTextField4.setText(rs.getString(3)); 
              jTextField4.setEditable(false);
              jTextField5.setText(rs.getString(4)); 
              jTextField5.setEditable(false);
             jTextField6.setText(rs.getString(7));
               jTextField6.setEditable(false);
            jTextField7.setText(rs.getString(8));
               jTextField7.setEditable(false);
                       
            
          }  
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
  //return consumerNumber;
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
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jTextField7 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel2.setText("VIEW BILL");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(230, 20, 100, 20);

        jLabel3.setText("Bill No");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(50, 80, 80, 20);

        jLabel4.setText("Consumer No");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(50, 130, 110, 20);
        getContentPane().add(jTextField1);
        jTextField1.setBounds(210, 66, 190, 30);

        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField2);
        jTextField2.setBounds(210, 120, 190, 30);

        jLabel5.setText("Amount");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(50, 180, 90, 16);
        getContentPane().add(jTextField3);
        jTextField3.setBounds(210, 170, 190, 30);

        jLabel6.setText("From Date");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(50, 240, 110, 16);
        getContentPane().add(jTextField4);
        jTextField4.setBounds(210, 230, 190, 30);

        jLabel7.setText("To Date");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(50, 300, 90, 16);
        getContentPane().add(jTextField5);
        jTextField5.setBounds(210, 290, 190, 30);

        jLabel8.setText("Due Date");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(50, 350, 100, 16);
        getContentPane().add(jTextField6);
        jTextField6.setBounds(210, 340, 190, 30);

        jLabel9.setText("Disconnection Date");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(50, 400, 130, 16);

        jTextField7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField7ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField7);
        jTextField7.setBounds(210, 390, 190, 30);

        jButton1.setText("Pay Now");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(220, 430, 97, 29);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/KSEB/image.jpg"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 560, 470);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jTextField7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField7ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        
        try
        {
            Database d=new Database();
            int id = Integer.parseInt(jTextField1.getText());
            if(d.approve(id))
            {
               
                JOptionPane.showMessageDialog(this, "Payment Successsfully..");
                
            }
            else
            {
                JOptionPane.showMessageDialog(this, "Payment error..");
            }
            
        }
    catch(Exception e)
    {
        System.out.println("....."+e);
    }
       
    
//        
        // TODO add your handling code here:
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
            java.util.logging.Logger.getLogger(ViewBill.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewBill.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewBill.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewBill.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() 
            {
                new ViewBill().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    // End of variables declaration//GEN-END:variables

    
}