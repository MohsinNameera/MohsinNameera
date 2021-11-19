/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.SystemAdminWorkArea;
import Business.EcoSystem;
import Business.Restaurant.product;
import Business.Restaurant.Restaurant;
import Business.Restaurant.RestaurantDirectory;
import Business.UserAccount.UserAccountDirectory;
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
public class RestauranT extends javax.swing.JPanel {

    /**
     * Creates new form RestauranT
     */
    JPanel userProcessContainer;
    EcoSystem ecosystem;
    UserAccountDirectory userAccountList;

    public RestauranT(JPanel userProcessContainer, EcoSystem ecosystem) {
        initComponents();
        inListn();
        
        this.userProcessContainer = userProcessContainer;
        this.ecosystem = ecosystem;
        populate();
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
        jScrollPane1 = new javax.swing.JScrollPane();
        tblRestaurantAdmin = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        createRestaurantName = new javax.swing.JTextField();
        btnCreate = new javax.swing.JButton();
        btnModify = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        createPassword = new javax.swing.JTextField();
        createUserName = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        restaurantAddress = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        restaurantPhone = new javax.swing.JTextField();

        jPanel1.setBackground(new java.awt.Color(240, 178, 62));

        tblRestaurantAdmin.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Restaurant name", "Username", "Password"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblRestaurantAdmin);

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Manage Restaurant Admin");

        jLabel2.setText("Username");

        jLabel3.setText("Password");

        jLabel5.setText("Restaurant Name");

        btnCreate.setText("Create");
        btnCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateActionPerformed(evt);
            }
        });

        btnModify.setText("modify");
        btnModify.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModifyActionPerformed(evt);
            }
        });

        btnDelete.setText("delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        createUserName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createUserNameActionPerformed(evt);
            }
        });

        jLabel4.setText("Restaurant Address");

        jLabel6.setText("Restaurant Phone");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(86, 86, 86)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 643, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(129, 129, 129)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(70, 70, 70)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnCreate)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnModify, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(restaurantAddress)
                            .addComponent(createUserName)
                            .addComponent(createPassword)
                            .addComponent(createRestaurantName, javax.swing.GroupLayout.DEFAULT_SIZE, 259, Short.MAX_VALUE)
                            .addComponent(restaurantPhone))))
                .addContainerGap(209, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(createUserName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(createPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(createRestaurantName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(restaurantAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(restaurantPhone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCreate)
                    .addComponent(btnModify)
                    .addComponent(btnDelete))
                .addContainerGap(121, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 938, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 605, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateActionPerformed
        // TODO add your handling code here:
        if (createUserName.getText().isEmpty() || createPassword.getText().isEmpty() || createRestaurantName.getText().isEmpty() || restaurantAddress.getText().isEmpty()
            || restaurantPhone.getText().isEmpty()  ) {
            JOptionPane.showMessageDialog(null, "please enter all mandatory fields");
            return;
        }

        if (ecosystem.getUserAccountDirectory().checkIfUsernameIsUnique(createUserName.getText())) {
            Restaurant rest = new Restaurant(createUserName.getText(),
                createPassword.getText(), createRestaurantName.getText(),
                restaurantAddress.getText(),restaurantPhone.getText());
            ecosystem.getUserAccountDirectory().addUserAccount(rest);
            ecosystem.getRestaurantDirectory().addRestaurant(rest);
            populate();
            createUserName.setText("");
            createPassword.setText("");
            createRestaurantName.setText("");
            restaurantAddress.setText("");
            restaurantPhone.setText("");

        } else {
            JOptionPane.showMessageDialog(null, "Username " + createUserName.getText() + " already exists, Please enter a new one");
        }
    }//GEN-LAST:event_btnCreateActionPerformed

    private void btnModifyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModifyActionPerformed
        // TODO add your handling code here:
        System.out.println("Update");

        int selectedRow = tblRestaurantAdmin.getSelectedRow();
        if (selectedRow >= 0) {
            System.out.println("abc" + selectedRow);
            System.out.println("2");
            Restaurant rest = (Restaurant) tblRestaurantAdmin.getValueAt(selectedRow, 0);
            System.out.println("item : " + rest);
            rest.setUsername(createUserName.getText());
            rest.setPassword(createPassword.getText());
            rest.setName(createRestaurantName.getText());
            rest.setAddress(restaurantAddress.getText());
            rest.setPhone(restaurantPhone.getText());
            populate();
            createUserName.setText("");
            createPassword.setText("");
            createRestaurantName.setText("");
            restaurantAddress.setText("");
            restaurantPhone.setText("");

        } else {
            JOptionPane.showMessageDialog(null, "Select a row");
        }
    }//GEN-LAST:event_btnModifyActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        int selectedRow = tblRestaurantAdmin.getSelectedRow();

        if (selectedRow >= 0) {
            Restaurant restaurant = (Restaurant) tblRestaurantAdmin.getValueAt(selectedRow, 0);
            RestaurantDirectory restaurantDirectory = ecosystem.getRestaurantDirectory();
            restaurantDirectory.removeRestaurant(restaurant);
            JOptionPane.showMessageDialog(null, "Restaurant admin "  + createUserName.getText() + " deleted");
            populate();
            createUserName.setText("");
            createPassword.setText("");
            createRestaurantName.setText("");
            restaurantAddress.setText("");
            restaurantPhone.setText("");
        } else {
            JOptionPane.showMessageDialog(null, "Please select a row.");
        }

    }//GEN-LAST:event_btnDeleteActionPerformed
 private void populate() {
        RestaurantDirectory restaurantDirectory = ecosystem.getRestaurantDirectory();
        DefaultTableModel model = (DefaultTableModel) tblRestaurantAdmin.getModel();
        model.setRowCount(0);
        for (Restaurant restaurant : restaurantDirectory.getRestaurantList()) {
            Object[] row = new Object[3];
            row[0] = restaurant;
            row[1] = restaurant.getUsername();
            row[2] = restaurant.getPassword();
            model.addRow(row);
        }
    }
    private void inListn() {
       tblRestaurantAdmin.getSelectionModel().addListSelectionListener(new ListSelectionListener(){
        public void valueChanged(ListSelectionEvent event) {
           int selectedRow = tblRestaurantAdmin.getSelectedRow();
             if (selectedRow >= 0) {
                  Restaurant  restaurant  = (Restaurant) tblRestaurantAdmin.getValueAt(selectedRow, 0);
                 if(restaurant!=null){
                     show(restaurant);
                 }
             }
        }
    });
    }
    private void show(Restaurant restaurant) {
        System.out.println("show");
        createUserName.setText(restaurant.getUsername());
        createPassword.setText(restaurant.getPassword());
        createRestaurantName.setText(restaurant.getName());
        restaurantAddress.setText(restaurant.getAddress());
        restaurantPhone.setText(restaurant.getPhone());
        

    }

    private void createUserNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createUserNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_createUserNameActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCreate;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnModify;
    private javax.swing.JTextField createPassword;
    private javax.swing.JTextField createRestaurantName;
    private javax.swing.JTextField createUserName;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField restaurantAddress;
    private javax.swing.JTextField restaurantPhone;
    private javax.swing.JTable tblRestaurantAdmin;
    // End of variables declaration//GEN-END:variables
}
