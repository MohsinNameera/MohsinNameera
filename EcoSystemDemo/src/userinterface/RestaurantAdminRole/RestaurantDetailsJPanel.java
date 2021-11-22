/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.RestaurantAdminRole;
import Business.EcoSystem;
import Business.Restaurant.Restaurant;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author namir
 */
public class RestaurantDetailsJPanel extends javax.swing.JPanel {
    JPanel userProcessContainer;
    EcoSystem ecosystem;
    UserAccount userAccount;
    Restaurant restaurant;
    /**
     * Creates new form RestaurantDetailsJPanel
     */
    public RestaurantDetailsJPanel(JPanel userProcessContainer, EcoSystem ecosystem, UserAccount userAccount) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.ecosystem = ecosystem;
        this.userAccount = userAccount;
        restaurant = (Restaurant)userAccount;
        Show(restaurant);
        confirmButton.setVisible(false);
        resetButton.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        restaurantName = new javax.swing.JTextField();
        updateButton = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        restaurantAddress = new javax.swing.JTextField();
        restaurantPhone = new javax.swing.JTextField();
        confirmButton = new javax.swing.JButton();
        resetButton = new javax.swing.JButton();

        setBackground(new java.awt.Color(0, 0, 0));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setPreferredSize(new java.awt.Dimension(1200, 800));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 153, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText(" RESTAURANT INFORMATION");
        jLabel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 20, 430, -1));

        jLabel2.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 153, 0));
        jLabel2.setText("Restaurant name");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 140, 122, -1));
        jPanel1.add(restaurantName, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 140, 309, -1));

        updateButton.setBackground(new java.awt.Color(255, 255, 255));
        updateButton.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 18)); // NOI18N
        updateButton.setForeground(new java.awt.Color(51, 153, 0));
        updateButton.setText("Update");
        updateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateButtonActionPerformed(evt);
            }
        });
        jPanel1.add(updateButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 340, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 153, 0));
        jLabel3.setText("Restaurant Address");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 190, 122, -1));

        jLabel4.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 153, 0));
        jLabel4.setText("Restaurant Phone");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 240, 122, -1));
        jPanel1.add(restaurantAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 190, 309, -1));

        restaurantPhone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                restaurantPhoneActionPerformed(evt);
            }
        });
        jPanel1.add(restaurantPhone, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 240, 309, -1));

        confirmButton.setBackground(new java.awt.Color(255, 255, 255));
        confirmButton.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 18)); // NOI18N
        confirmButton.setForeground(new java.awt.Color(51, 153, 0));
        confirmButton.setText("Confirm");
        confirmButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmButtonActionPerformed(evt);
            }
        });
        jPanel1.add(confirmButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 340, -1, -1));

        resetButton.setBackground(new java.awt.Color(255, 255, 255));
        resetButton.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 18)); // NOI18N
        resetButton.setForeground(new java.awt.Color(51, 153, 0));
        resetButton.setText("Reset");
        resetButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetButtonActionPerformed(evt);
            }
        });
        jPanel1.add(resetButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 340, -1, -1));

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-2, 0, 1040, 680));
    }// </editor-fold>//GEN-END:initComponents

    private void updateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateButtonActionPerformed
        // TODO add your handling code here:
        confirmButton.setVisible(true);
        resetButton.setVisible(true);
        setVisibleEditable(true);

        //populateTable();
    }//GEN-LAST:event_updateButtonActionPerformed

    private void restaurantPhoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_restaurantPhoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_restaurantPhoneActionPerformed

    private void confirmButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmButtonActionPerformed
        // TODO add your handling code here:
        restaurant.setName(restaurantName.getText());
        restaurant.setAddress(restaurantAddress.getText());
        restaurant.setPhone(restaurantPhone.getText());
        setVisibleEditable(false);
    }//GEN-LAST:event_confirmButtonActionPerformed

    private void resetButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetButtonActionPerformed
        // TODO add your handling code here:
        restaurantName.setText("");
        restaurantAddress.setText("");
        restaurantPhone.setText("");

    }//GEN-LAST:event_resetButtonActionPerformed
    private void setVisibleEditable(boolean value) {
        restaurantName.setEditable(value);
        restaurantAddress.setEditable(value);
        restaurantPhone.setEditable(value);
       restaurantName.setEnabled(value);
       restaurantAddress.setEnabled(value);
       restaurantPhone.setEnabled(value);
        
    }

    private void Show(Restaurant restaurant) {
        System.out.println("Shivi");
        setVisibleEditable(false);
        restaurantName.setText(restaurant.getName());
        restaurantAddress.setText(restaurant.getAddress());
        restaurantPhone.setText(restaurant.getPhone());
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton confirmButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton resetButton;
    private javax.swing.JTextField restaurantAddress;
    private javax.swing.JTextField restaurantName;
    private javax.swing.JTextField restaurantPhone;
    private javax.swing.JButton updateButton;
    // End of variables declaration//GEN-END:variables
}
