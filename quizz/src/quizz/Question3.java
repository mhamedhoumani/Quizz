/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quizz;

import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import static quizz.Question1.score;

/**
 *
 * @author Mhame
 */
public class Question3 extends javax.swing.JFrame {
    JOptionPane d=new JOptionPane();
    /**
     * Creates new form Question3
     */
    public Question3() {
        initComponents();
        jLabel10.setText(Pass.s);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }
    
    public void update(String query)
            
    {
        
      Connection con=null;
      Statement st=null;
      try{
          
          con=DriverManager.getConnection("jdbc:mysql://"+Pass.x+":3306/javademo?" + "user=root&password=");
          st=con.createStatement();
          st.executeUpdate(query);
         // JOptionPane.showMessageDialog(null, "executer");
          
      }catch(Exception ex)
      { JOptionPane.showMessageDialog(null, ex.getMessage());
    }
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jCheckBox1 = new javax.swing.JCheckBox();
        jCheckBox2 = new javax.swing.JCheckBox();
        jCheckBox3 = new javax.swing.JCheckBox();
        jCheckBox4 = new javax.swing.JCheckBox();
        jCheckBox5 = new javax.swing.JCheckBox();
        jButton1 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1500, 1500));
        setMinimumSize(new java.awt.Dimension(1500, 1500));
        getContentPane().setLayout(null);

        jCheckBox1.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jCheckBox1.setAlignmentX(0.5F);
        jCheckBox1.setAutoscrolls(true);
        getContentPane().add(jCheckBox1);
        jCheckBox1.setBounds(910, 600, 21, 21);

        jCheckBox2.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jCheckBox2.setAutoscrolls(true);
        jCheckBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox2ActionPerformed(evt);
            }
        });
        getContentPane().add(jCheckBox2);
        jCheckBox2.setBounds(910, 560, 21, 21);

        jCheckBox3.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jCheckBox3.setAutoscrolls(true);
        jCheckBox3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox3ActionPerformed(evt);
            }
        });
        getContentPane().add(jCheckBox3);
        jCheckBox3.setBounds(910, 440, 21, 21);

        jCheckBox4.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jCheckBox4.setAutoscrolls(true);
        jCheckBox4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox4ActionPerformed(evt);
            }
        });
        getContentPane().add(jCheckBox4);
        jCheckBox4.setBounds(910, 480, 21, 21);

        jCheckBox5.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jCheckBox5.setAutoscrolls(true);
        jCheckBox5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox5ActionPerformed(evt);
            }
        });
        getContentPane().add(jCheckBox5);
        jCheckBox5.setBounds(910, 520, 21, 21);

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton1.setText("الإجابة");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(810, 660, 160, 50);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setText("Score: "+Question1.score);
        getContentPane().add(jLabel5);
        jLabel5.setBounds(630, 30, 140, 22);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("عمان");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(870, 440, 50, 17);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText(" قطر");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(870, 480, 40, 17);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("الكويت");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(860, 520, 44, 17);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setText(" المغرب");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(860, 560, 50, 17);

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setText("الأردن ");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(860, 600, 50, 17);

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel10.setText("jLabel10");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(510, 30, 120, 20);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/quizz/5.png"))); // NOI18N
        jLabel3.setText("jLabel3");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(0, 0, 670, 220);

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton2.setText("تخطي السؤال");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(620, 660, 170, 50);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/quizz/una3.jpg"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(664, 0, 830, 870);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/quizz/7.png"))); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, 210, 760, 680);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       
  //String sql ="UPDATE table1 SET score = ? WHERE username = ?";

//"insert into table1 (username,password,score) values(?,?,?)";
  //"UPDATE table1 SET score = ? WHERE username = ? "
        //"Select * from table1 where username=? and password=?";

    //    try
      //  {
////
        //    Class.forName("com.mysql.jdbc.Driver");

          //  Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/javademo?" + "user=root&password=");
          //  PreparedStatement pst = con.prepareStatement(sql);
          //  pst.setString(1,jLabel10.getText());
        //    pst.setString(2,jTextField2.getText());
         //   pst.setString(3,jLabel5.getText());
         //   pst.execute();
       //     JOptionPane.showMessageDialog(null,"Student was successfully Add to the database");

            //ResultSet rs = pst.executeQuery();

            // if(rs.next())

            //  {

                //    Question1 b=new Question1();
                //     b.setVisible(true);
                // System.out.println("salut");
                //  }
  //      }       catch (SQLException ex) {
            //    Logger.getLogger(Pass.class.getName()).log(Level.SEVERE, null, ex);
       // } catch (ClassNotFoundException ex) {
            //     Logger.getLogger(Pass.class.getName()).log(Level.SEVERE, null, ex);

            // TODO add your handling code here:
//try{
    
  //  update("UPDATE table1 SET score = '"+jLabel5.getText()+"' WHERE username = '"+jLabel10.getText()+"'");
    
   
//}catch(Exception ex){}
    

                 
        URL h;
        h = Videos.class.getResource("/quizz/mpa2.jpg");
        System.out.println(h);
        if(jCheckBox3.isSelected()==true && jCheckBox4.isSelected()==true && jCheckBox5.isSelected()==true && jCheckBox1.isSelected()==true && jCheckBox2.isSelected()==false)
      
        {
             jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/quizz/1.png")));
              d.showMessageDialog( this, "الجواب صحيح! ", 
                "الجواب", JOptionPane.INFORMATION_MESSAGE);
              score=score+10;
            jLabel5.setText("Score: "+Question1.score);
        update("UPDATE table1 SET score = '"+jLabel5.getText()+"' WHERE username = '"+jLabel10.getText()+"'");
        //  jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\Mhame\\Documents\\NetBeansProjects\\quizz\\src\\quizz\\mpa2.jpg"));
       Score x=new Score();
       x.setVisible(true);
       this.setVisible(false);
       Question1.score=0;
        } else d.showMessageDialog( this, "الجواب خطأ ! ",
                "الجواب", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_jButton1ActionPerformed
    
    private void jCheckBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox2ActionPerformed

    private void jCheckBox3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox3ActionPerformed

    private void jCheckBox5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox5ActionPerformed

    private void jCheckBox4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox4ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        Videos i=new Videos();
        i.setVisible(true);
        update("UPDATE table1 SET score = '"+jLabel5.getText()+"' WHERE username = '"+jLabel10.getText()+"'");
       Question1.score=0;
         this.setVisible(false);
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
            java.util.logging.Logger.getLogger(Question3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Question3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Question3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Question3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Question3().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JCheckBox jCheckBox3;
    private javax.swing.JCheckBox jCheckBox4;
    private javax.swing.JCheckBox jCheckBox5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    // End of variables declaration//GEN-END:variables
}
