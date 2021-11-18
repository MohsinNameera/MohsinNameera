/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface;

import Business.Customer.Customer;
import Business.EcoSystem;
import Business.DB4OUtil.DB4OUtil;
import Business.DeliveryMan.DeliveryMan;
import Business.Restaurant.Restaurant;
import Business.Restaurant.RestaurantDirectory;
import Business.Organization;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Lingfeng
 */
public class MainJFrame extends javax.swing.JFrame {

    /**
     * Creates new form MainJFrame
     */
    private EcoSystem system;
    private DB4OUtil dB4OUtil = DB4OUtil.getInstance();
    UserAccount userAccount;

    public MainJFrame() {
       this.setUndecorated(true);
        initComponents();
        system = dB4OUtil.retrieveSystem();
        loginJPanel.setVisible(true);
        container1.setVisible(false);
        leftPanel.setVisible(false);
    }
    private void changePanel(UserAccount userAccount) {
        if (userAccount != null) {
            String greetings = "Hi";
            if (userAccount instanceof Customer){
                    greetings =  greetings + " " + ((Customer)userAccount).getName();
                    container1.add("workArea", userAccount.getRole().createWorkArea(container1, (Customer)userAccount, system));
            }else if(userAccount instanceof Restaurant){
                    greetings =  greetings + " " + ((Restaurant)userAccount).getName();
                    container1.add("workArea", userAccount.getRole().createWorkArea(container1, (Restaurant)userAccount, system));
            }else if(userAccount instanceof DeliveryMan){
                    greetings =  greetings + " " + ((DeliveryMan)userAccount).getName();
                    container1.add("workArea", userAccount.getRole().createWorkArea(container1, (DeliveryMan)userAccount, system));
            }else{
                 container1.add("workArea", userAccount.getRole().createWorkArea(container1, userAccount, system));
            }
            greetingUserLabel.setText(greetings + " !!!");
            CardLayout layout = (CardLayout) container1.getLayout();
            layout.next(container1);
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

        leftPanel = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        greetingUserLabel = new javax.swing.JLabel();
        container1 = new javax.swing.JPanel();
        loginJPanel = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        userNameJTextField1 = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        passwordField1 = new javax.swing.JPasswordField();
        loginButton = new javax.swing.JLabel();
        cancelButton = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 0));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        leftPanel.setBackground(new java.awt.Color(0, 0, 0));
        leftPanel.setPreferredSize(new java.awt.Dimension(1200, 60));
        leftPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setBackground(new java.awt.Color(0, 0, 0));
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-shutdown-30.png"))); // NOI18N
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel3MousePressed(evt);
            }
        });
        leftPanel.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1140, 2, 60, 60));

        greetingUserLabel.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        leftPanel.add(greetingUserLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 500, 60));

        getContentPane().add(leftPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        container1.setBackground(new java.awt.Color(0, 0, 0));
        container1.setForeground(new java.awt.Color(255, 255, 255));
        container1.setLayout(new java.awt.CardLayout());
        getContentPane().add(container1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 61, 1200, 750));

        loginJPanel.setBackground(new java.awt.Color(0, 0, 0));
        loginJPanel.setPreferredSize(new java.awt.Dimension(1200, 802));
        loginJPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("fjbjkvnc");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 831, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        loginJPanel.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 1, 240, 830));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(240, 178, 62)));
        jPanel3.setPreferredSize(new java.awt.Dimension(302, 34));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 14)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("USERNAME");
        jLabel5.setBorder(new javax.swing.border.MatteBorder(null));
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(1, 2, 80, 30));

        userNameJTextField1.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(31, 50, 97)));
        userNameJTextField1.setCaretColor(new java.awt.Color(255, 255, 255));
        userNameJTextField1.setDisabledTextColor(new java.awt.Color(16, 10, 55));
        userNameJTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userNameJTextField1ActionPerformed(evt);
            }
        });
        jPanel3.add(userNameJTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(84, 1, 210, 30));

        loginJPanel.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 300, 290, 30));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(240, 178, 62)));
        jPanel4.setPreferredSize(new java.awt.Dimension(302, 34));

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 14)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("PASSWORD");
        jLabel6.setBorder(new javax.swing.border.MatteBorder(null));

        passwordField1.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(31, 50, 97)));
        passwordField1.setCaretColor(new java.awt.Color(255, 255, 255));
        passwordField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordField1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(passwordField1, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(passwordField1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        loginJPanel.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 370, 290, 30));

        loginButton.setBackground(new java.awt.Color(255, 255, 255));
        loginButton.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 18)); // NOI18N
        loginButton.setForeground(new java.awt.Color(255, 255, 255));
        loginButton.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        loginButton.setText("LOGIN");
        loginButton.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 102, 0)));
        loginButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                loginButtonMousePressed(evt);
            }
        });
        loginJPanel.add(loginButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 430, 210, 30));

        cancelButton.setBackground(new java.awt.Color(255, 255, 255));
        cancelButton.setForeground(new java.awt.Color(255, 255, 255));
        cancelButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/cancel.png"))); // NOI18N
        cancelButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                cancelButtonMousePressed(evt);
            }
        });
        loginJPanel.add(cancelButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(1150, 10, 40, 30));

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Uber-Eats-Transparent - Copy.png"))); // NOI18N
        loginJPanel.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 90, 240, 170));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/6b1525302df7a2226bdd0b586712110a - Copy.gif"))); // NOI18N
        jLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 0)));
        jLabel1.setPreferredSize(new java.awt.Dimension(600, 400));
        loginJPanel.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 510, 800, 310));

        getContentPane().add(loginJPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MousePressed
        logout();
    }//GEN-LAST:event_jLabel3MousePressed

    private void userNameJTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userNameJTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_userNameJTextField1ActionPerformed

    private void passwordField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordField1ActionPerformed

    private void loginButtonMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginButtonMousePressed
        // TODO add your handling code here:
        String userName = userNameJTextField1.getText();
        char[] passwordCharArray = passwordField1.getPassword();
        String password = String.valueOf(passwordCharArray);

        userAccount=system.getUserAccountDirectory().authenticateUser(userName, password);
      
        if(userAccount==null){
            JOptionPane.showMessageDialog(null, "Invalid credentials");
            return;
        }else{
            loginJPanel.setVisible(false);
            container1.setVisible(true);
            leftPanel.setVisible(true);
            userNameJTextField1.setText("");
            passwordField1.setText("");
            changePanel(userAccount);
        }
       
    }//GEN-LAST:event_loginButtonMousePressed

    private void cancelButtonMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelButtonMousePressed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_cancelButtonMousePressed
private void logout() {    
        container1.removeAll();
        dB4OUtil.storeSystem(system);
        loginJPanel.setVisible(true);
        container1.setVisible(false);
        leftPanel.setVisible(false);
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
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainJFrame().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel cancelButton;
    private javax.swing.JPanel container1;
    private javax.swing.JLabel greetingUserLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel leftPanel;
    private javax.swing.JLabel loginButton;
    private javax.swing.JPanel loginJPanel;
    private javax.swing.JPasswordField passwordField1;
    private javax.swing.JTextField userNameJTextField1;
    // End of variables declaration//GEN-END:variables
}