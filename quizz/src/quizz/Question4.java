/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quizz;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import static quizz.Question1.score;

/**
 *
 * @author Mhame
 */
public class Question4 extends javax.swing.JFrame {
JOptionPane d = new JOptionPane();
public static int score2;
    /**
     * Creates new form Question4
     */
    public Question4() {
        initComponents();
        jLabel8.setText(Pass.s);
        jLabel5.setText("Score: 00");
        Question4.score2=0;
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
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
        jButton1 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(2000, 2000));
        setMinimumSize(new java.awt.Dimension(2000, 2000));
        getContentPane().setLayout(null);

        jCheckBox1.setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().add(jCheckBox1);
        jCheckBox1.setBounds(1110, 540, 30, 23);

        jCheckBox2.setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().add(jCheckBox2);
        jCheckBox2.setBounds(1110, 580, 21, 21);

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton1.setText("الإجابة");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(930, 660, 140, 40);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setText("Score: "+Question1.score);
        getContentPane().add(jLabel5);
        jLabel5.setBounds(760, 20, 140, 22);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("\tمن عناصر الخارطة: عنوان الخارطة، اطار الخارطة، شبكة الاحداثيات، مفتاح الخارطة اتجاه الخارطة مقياس الرسم ");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(380, 540, 720, 20);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("\tمن أنواع الرموز المستخدمة في مفتاح الخارطة نقطية، خطية، مساحية، نسبية");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(600, 580, 510, 17);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/quizz/5.png"))); // NOI18N
        jLabel6.setText("jLabel6");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(0, 680, 730, 80);

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/quizz/5.png"))); // NOI18N
        jLabel7.setText("jLabel7");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(0, 750, 740, 110);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel8.setText("jLabel8");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(600, 20, 140, 20);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/quizz/5.png"))); // NOI18N
        getContentPane().add(jLabel4);
        jLabel4.setBounds(0, 0, 780, 730);

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton2.setText("تخطي السؤال");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(743, 660, 170, 40);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/quizz/una4.jpg"))); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(720, 0, 1280, 850);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
if(jCheckBox1.isSelected()==true && jCheckBox2.isSelected()==false)
{
//jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/quizz/map6.png")));
score2=score2+10;
            jLabel5.setText("Score: "+score2);
 d.showMessageDialog( this, "الجواب صحيح! ",
                "الجواب", JOptionPane.INFORMATION_MESSAGE);
 
 Question5 r=new Question5();
 r.setVisible(true);
 this.setVisible(false);
 
      // d.showMessageDialog( this, "الجواب صحيح! ",
            //    "الجواب", JOptionPane.QUESTION_MESSAGE);       
            
            
// TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed
    else d.showMessageDialog( this, "الجواب خطأ ! ",
                "الجواب", JOptionPane.INFORMATION_MESSAGE); }
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        Question5 r=new Question5();
 r.setVisible(true);
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
            java.util.logging.Logger.getLogger(Question4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Question4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Question4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Question4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Question4().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    // End of variables declaration//GEN-END:variables
}
