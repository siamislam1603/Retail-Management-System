
import javax.swing.*;
import java.awt.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class loginform extends javax.swing.JFrame {

    /**
     * Creates new form HomeJFrame
     */
    public loginform() {
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

        bg = new javax.swing.JPanel();
        sidePane = new javax.swing.JPanel();
        jLabel32 = new javax.swing.JLabel();
        closeBtn = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        username = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        password = new javax.swing.JPasswordField();
        signInBtn = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        registerBtn = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(1366, 728));

        bg.setBackground(new java.awt.Color(255, 255, 255));
        bg.setPreferredSize(new java.awt.Dimension(1366, 728));
        bg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        sidePane.setBackground(new java.awt.Color(54, 33, 89));
        sidePane.setPreferredSize(new java.awt.Dimension(250, 728));
        sidePane.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                sidePaneMouseDragged(evt);
            }
        });
        sidePane.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel32.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel32.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/user_1.png"))); // NOI18N
        sidePane.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 130, 360, 200));

        bg.add(sidePane, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 360, -1));

        closeBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icons8_close_window_25px.png"))); // NOI18N
        closeBtn.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        closeBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                closeBtnMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                closeBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                closeBtnMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                closeBtnMousePressed(evt);
            }
        });
        bg.add(closeBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(1340, 0, 60, 30));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 153, 153));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Login");
        bg.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 50, 1010, 50));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 102, 102));
        jLabel2.setText("User Name:");
        bg.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 230, -1, -1));

        username.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        username.setForeground(new java.awt.Color(51, 51, 51));
        username.setToolTipText("");
        username.setBorder(null);
        username.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        username.setName(""); // NOI18N
        username.setOpaque(false);
        username.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usernameActionPerformed(evt);
            }
        });
        bg.add(username, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 300, 660, 30));
        bg.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 330, 480, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 102, 102));
        jLabel3.setText("Password:");
        bg.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 380, -1, -1));
        bg.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 480, 480, -1));

        password.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        password.setForeground(new java.awt.Color(102, 102, 102));
        password.setBorder(null);
        password.setOpaque(false);
        bg.add(password, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 450, 480, 30));

        signInBtn.setBackground(new java.awt.Color(54, 33, 89));
        signInBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                signInBtnMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                signInBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                signInBtnMouseExited(evt);
            }
        });

        jLabel4.setForeground(new java.awt.Color(204, 204, 204));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Sign In");

        javax.swing.GroupLayout signInBtnLayout = new javax.swing.GroupLayout(signInBtn);
        signInBtn.setLayout(signInBtnLayout);
        signInBtnLayout.setHorizontalGroup(
            signInBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
        );
        signInBtnLayout.setVerticalGroup(
            signInBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, signInBtnLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                .addContainerGap())
        );

        bg.add(signInBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 510, 120, 50));

        registerBtn.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        registerBtn.setForeground(new java.awt.Color(0, 51, 153));
        registerBtn.setText("<html> <body> <u>Register Here!</u> </body> </html>");
        registerBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                registerBtnMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                registerBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                registerBtnMouseExited(evt);
            }
        });
        bg.add(registerBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 580, 90, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(bg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void sidePaneMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sidePaneMouseDragged
        // TODO add your handling code here:
    }//GEN-LAST:event_sidePaneMouseDragged

    private void closeBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeBtnMouseEntered
        // TODO add your handling code here:
        closeBtn.setIcon(new ImageIcon("E:\\UVA\\RetailApplication\\src\\image\\icons8_close_window_25px_1.png"));
        
    }//GEN-LAST:event_closeBtnMouseEntered

    private void closeBtnMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeBtnMousePressed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_closeBtnMousePressed

    private void closeBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeBtnMouseClicked
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_closeBtnMouseClicked

    private void closeBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeBtnMouseExited
        // TODO add your handling code here:
        closeBtn.setIcon(new ImageIcon("E:\\UVA\\RetailApplication\\src\\image\\icons8_close_window_25px.png"));
    }//GEN-LAST:event_closeBtnMouseExited

    private void usernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usernameActionPerformed

    private void signInBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_signInBtnMouseEntered
        // TODO add your handling code here:
        setBackgroundBtn(signInBtn);
    }//GEN-LAST:event_signInBtnMouseEntered

    private void signInBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_signInBtnMouseExited
        // TODO add your handling code here:
        resetBackgroundBtn(signInBtn);
    }//GEN-LAST:event_signInBtnMouseExited

    private void registerBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_registerBtnMouseEntered
        // TODO add your handling code here:
        registerBtn.setForeground(Color.red);
    }//GEN-LAST:event_registerBtnMouseEntered

    private void registerBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_registerBtnMouseExited
        // TODO add your handling code here:
        registerBtn.setForeground(new Color(0,51,153));
    }//GEN-LAST:event_registerBtnMouseExited

    private void signInBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_signInBtnMouseClicked
        try{
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String url="jdbc:sqlserver://localhost:1433;databaseName=Projectdatabase;user=sa;password=123456";
            Connection con = DriverManager.getConnection(url);
            String sql = "Select * from Userinfo where username=? and password = ?";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, username.getText());
            pst.setString(2, password.getText());
            ResultSet rs = pst.executeQuery();
            if(rs.next()){
               JOptionPane.showMessageDialog(new loginform(), "Login Successfull");
                if(JOptionPane.OK_OPTION==0){
                    dispose();
                }
                HomeJFrame f=new HomeJFrame();
                f.setSize(1366,728);
                f.setVisible(true);
            }
            else{
                JOptionPane.showMessageDialog(new loginform(), "Username and password not Correct");
                username.setText("");
                password.setText("");
            }
            con.close();
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_signInBtnMouseClicked

    private void registerBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_registerBtnMouseClicked
        // TODO add your handling code here:
        dispose();
        Adduserframe f=new Adduserframe();
        f.setSize(1366,728);
        f.setVisible(true);
    }//GEN-LAST:event_registerBtnMouseClicked
    public void resetBackgroundBtn(JPanel p){
       p.setBackground(new Color(64,43,100));
    }
    public void setBackgroundBtn(JPanel p){
        p.setBackground(new Color(85,85,118));
    }
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
            java.util.logging.Logger.getLogger(HomeJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HomeJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HomeJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HomeJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new loginform().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bg;
    private javax.swing.JLabel closeBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JPasswordField password;
    private javax.swing.JLabel registerBtn;
    private javax.swing.JPanel sidePane;
    private javax.swing.JPanel signInBtn;
    private javax.swing.JTextField username;
    // End of variables declaration//GEN-END:variables
}
