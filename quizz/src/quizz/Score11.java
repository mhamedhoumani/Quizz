/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quizz;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JFrame;

/**
 *
 * @author Mhame
 */
public class Score11 extends javax.swing.JFrame {

    /**
     * Creates new form Score
     */
    public Score11() {
        initComponents();
         setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
         jLabel2.setText(Pass.s);
         select();
         select1();
    
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
        jButton1 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(getPreferredSize());
        setMinimumSize(getPreferredSize());
        setPreferredSize(new java.awt.Dimension(750, 800));
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 204, 51));
        jLabel1.setText("dsfsdfsdf");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(230, 410, 110, 65);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 0, 0));
        jLabel2.setText("fdsfsdf");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(370, 170, 290, 65);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("نتيجتك في إختبار الدرس ١٥ هي :");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(420, 410, 300, 77);

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton1.setText("الرجوع إلى القائمة");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(330, 550, 228, 70);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setText("نتيجتك في إختبار الدرس ١٤ هي :");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(420, 340, 300, 77);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 204, 51));
        jLabel6.setText("dsfsdfsdf");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(230, 350, 110, 65);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/quizz/pict.jpg"))); // NOI18N
        jLabel4.setText("jLabel4");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(0, 0, 720, 990);

        pack();
    }// </editor-fold>//GEN-END:initComponents
    String scores;
    String scores2;
    public void select()
{
     String sql ="Select score from table1 where username=? ";
//"Select * from table1 where username=? and password=?";

try
{  
    
    Class.forName("com.mysql.jdbc.Driver");
    
    Connection con = DriverManager.getConnection("jdbc:mysql://"+Pass.x+":3306/javademo?" + "user=root&password=");
    PreparedStatement pst = con.prepareStatement(sql);
    pst.setString(1,Pass.s);
   // pst.setString(2,jTextField2.getText());
    
pst.execute();
    ResultSet rs = pst.executeQuery();

//s=rs.getString("username");
  //  System.out.println(s);
    if(rs.next())
        
   {
       scores=rs.getString("score");
        jLabel6.setText(scores);
       //JOptionPane.showMessageDialog(null,"Username and Password Accepted!"); 
       System.out.println(scores);
     //  Videos p=new Videos();
    //   p.setVisible(true);
  //    Question1 b=new Question1();
   //    b.setVisible(true);
       System.out.println("salut");
   }//else //JOptionPane.showMessageDialog(null,"Wrong Username and Password!");
}       catch (SQLException ex) {
        //    Logger.getLogger(Pass.class.getName()).log(Level.SEVERE, null, ex);
       } catch (ClassNotFoundException ex) {
       //     Logger.getLogger(Pass.class.getName()).log(Level.SEVERE, null, ex);
        
   // TODO add your handling code here:
                  
    }                                    
}
        public void select1()
{
     String sql ="Select score1 from table1 where username=? ";
//"Select * from table1 where username=? and password=?";

try
{  
    
    Class.forName("com.mysql.jdbc.Driver");
    
    Connection con = DriverManager.getConnection("jdbc:mysql://"+Pass.x+":3306/javademo?" + "user=root&password=");
    PreparedStatement pst = con.prepareStatement(sql);
    pst.setString(1,Pass.s);
   // pst.setString(2,jTextField2.getText());
    
pst.execute();
    ResultSet rs = pst.executeQuery();

//s=rs.getString("username");
  //  System.out.println(s);
    if(rs.next())
        
   {
       scores2=rs.getString("score1");
       //JOptionPane.showMessageDialog(null,"Username and Password Accepted!");
       jLabel1.setText(scores2);
       System.out.println(scores2);
     //  Videos p=new Videos();
    //   p.setVisible(true);
  //    Question1 b=new Question1();
   //    b.setVisible(true);
       System.out.println("salut");
   }//else //JOptionPane.showMessageDialog(null,"Wrong Username and Password!");
}       catch (SQLException ex) {
        //    Logger.getLogger(Pass.class.getName()).log(Level.SEVERE, null, ex);
       } catch (ClassNotFoundException ex) {
       //     Logger.getLogger(Pass.class.getName()).log(Level.SEVERE, null, ex);
        
   // TODO add your handling code here:
                  
    }                                    
}
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        principal i=new principal();
        i.setVisible(true);
        this.setVisible(false);
               
 
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
            java.util.logging.Logger.getLogger(Score11.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Score11.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Score11.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Score11.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Score11().setVisible(true);
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
    // End of variables declaration//GEN-END:variables
}
