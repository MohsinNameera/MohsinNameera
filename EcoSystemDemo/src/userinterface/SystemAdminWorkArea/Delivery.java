/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.SystemAdminWorkArea;
import Business.DeliveryMan.DeliveryMan;
import Business.DeliveryMan.DeliveryManDirectory;
import Business.EcoSystem;
import Business.Restaurant.Restaurant;
import Business.UserAccount.UserAccountDirectory;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author namir
 */
public class Delivery extends javax.swing.JPanel {

    /**
     * Creates new form Delivery
     */
    JPanel userProcessContainer;
    EcoSystem ecosystem;
    UserAccountDirectory userAccountList;

    public Delivery(JPanel userProcessContainer,EcoSystem ecosystem) {
        initComponents();
        inListn();
        this.userProcessContainer=userProcessContainer;
        this.ecosystem=ecosystem;
        tblDeliveryMan.getTableHeader().setFont(new Font("Tw Cen MT Condensed", Font.BOLD,18));
        tblDeliveryMan.getTableHeader().setOpaque(true);
        tblDeliveryMan.getTableHeader().setBackground(Color.GREEN);
        tblDeliveryMan.getTableHeader().setForeground(Color.BLACK);
        tblDeliveryMan.setRowHeight(25);
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
        tblDeliveryMan = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        btnDeliveryMan = new javax.swing.JButton();
        btnModify = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        createUserName = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        createPassword = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        createName = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        createPhone = new javax.swing.JTextField();

        setBackground(new java.awt.Color(0, 0, 0));

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setPreferredSize(new java.awt.Dimension(1200, 900));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblDeliveryMan.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        tblDeliveryMan.setForeground(new java.awt.Color(56, 90, 174));
        tblDeliveryMan.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "NAME", "PHONE", "USERNAME", "PASSWORD"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblDeliveryMan.setGridColor(new java.awt.Color(56, 90, 174));
        tblDeliveryMan.setIntercellSpacing(new java.awt.Dimension(5, 5));
        tblDeliveryMan.setSelectionBackground(new java.awt.Color(240, 178, 62));
        jScrollPane1.setViewportView(tblDeliveryMan);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 80, 643, 165));

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 153, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Manage Delivery Man");
        jLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 5));
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 20, 320, -1));

        btnDeliveryMan.setBackground(new java.awt.Color(255, 255, 255));
        btnDeliveryMan.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 18)); // NOI18N
        btnDeliveryMan.setForeground(new java.awt.Color(51, 153, 0));
        btnDeliveryMan.setText("CREATE");
        btnDeliveryMan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeliveryManActionPerformed(evt);
            }
        });
        jPanel1.add(btnDeliveryMan, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 310, 90, -1));

        btnModify.setBackground(new java.awt.Color(255, 255, 255));
        btnModify.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 18)); // NOI18N
        btnModify.setForeground(new java.awt.Color(51, 153, 0));
        btnModify.setText("UPDATE");
        btnModify.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModifyActionPerformed(evt);
            }
        });
        jPanel1.add(btnModify, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 370, 90, -1));

        btnDelete.setBackground(new java.awt.Color(255, 255, 255));
        btnDelete.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 18)); // NOI18N
        btnDelete.setForeground(new java.awt.Color(51, 153, 0));
        btnDelete.setText("DELETE");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });
        jPanel1.add(btnDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 430, 90, -1));

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 18)); // NOI18N
        jLabel2.setText("Username");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        createUserName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createUserNameActionPerformed(evt);
            }
        });
        jPanel2.add(createUserName, new org.netbeans.lib.awtextra.AbsoluteConstraints(88, 10, 240, 30));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 280, 340, 50));

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 18)); // NOI18N
        jLabel3.setText("Password");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));
        jPanel3.add(createPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 10, 240, 30));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 350, 340, 50));

        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 18)); // NOI18N
        jLabel4.setText("Name");
        jPanel4.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, -1, -1));
        jPanel4.add(createName, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 10, 240, 30));

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 420, 340, 50));

        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 18)); // NOI18N
        jLabel5.setText("Phone");
        jPanel5.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, -1, -1));
        jPanel5.add(createPhone, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 10, 240, 30));

        jPanel1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 490, 340, 50));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 994, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 994, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 641, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 641, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnDeliveryManActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeliveryManActionPerformed
        // TODO add your handling code here:

        if( createUserName.getText().isEmpty()||createPassword.getText().isEmpty()|| createName.getText().isEmpty() ||  createPhone.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(null, "please enter all mandatory fields");
            return;
        }

        if(ecosystem.getUserAccountDirectory().checkIfUsernameIsUnique(createUserName.getText())){
            DeliveryMan deliveryMan = new DeliveryMan(createUserName.getText(), createPassword.getText(), createName.getText(),  createPhone.getText());
            ecosystem.getUserAccountDirectory().addUserAccount(deliveryMan);
            ecosystem.getDeliveryManDirectory().addDeliveryMan(deliveryMan);
            populate();
            createUserName.setText("");
            createPassword.setText("");
            createName.setText("");
            createPhone.setText("");
        }else{
            JOptionPane.showMessageDialog(null, "Username " + createUserName.getText() + " already exists !!!, Please try a new one");
        }
    }//GEN-LAST:event_btnDeliveryManActionPerformed

    private void btnModifyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModifyActionPerformed
        System.out.println("Update");

        int selectedRow = tblDeliveryMan.getSelectedRow();
        if (selectedRow >= 0) {
            System.out.println("abc" + selectedRow);
            System.out.println("2");
            DeliveryMan deliveryMan = (DeliveryMan) tblDeliveryMan.getValueAt(selectedRow, 0);
            System.out.println("item : " + deliveryMan);
            deliveryMan.setUsername(createUserName.getText());
            deliveryMan.setPassword(createPassword.getText());
            deliveryMan.setName(createName.getText());
            deliveryMan.setPhone(createPhone.getText());
            populate();
            createUserName.setText("");
            createPassword.setText("");
            createName.setText("");
            createPhone.setText("");

        } else {
            JOptionPane.showMessageDialog(null, "Please select a row");
        }
    }//GEN-LAST:event_btnModifyActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed

        int selectedRow = tblDeliveryMan.getSelectedRow();

        if (selectedRow >= 0) {
            DeliveryMan deliveryMan = (DeliveryMan) tblDeliveryMan.getValueAt(selectedRow, 0);
            DeliveryManDirectory deliveryManDirectory = ecosystem.getDeliveryManDirectory();
            deliveryManDirectory.removeDeliveryMan(deliveryMan);
            JOptionPane.showMessageDialog(null, "Delivery Man  "  + createUserName.getText() + " deleted");
            populate();
            createUserName.setText("");
            createPassword.setText("");
            createName.setText("");
            createPhone.setText("");
        } else {
            JOptionPane.showMessageDialog(null, "Please select a row.");
        }
    }//GEN-LAST:event_btnDeleteActionPerformed
    private void populate() {
        DeliveryManDirectory deliveryManDirectory = ecosystem.getDeliveryManDirectory();
        DefaultTableModel model = (DefaultTableModel) tblDeliveryMan.getModel();

        model.setRowCount(0);
        for (DeliveryMan deliveryMan : deliveryManDirectory.getDeliveryManList()) {
                    Object[] row = new Object[4];
                    row[0] = deliveryMan;
                    row[1] = deliveryMan.getPhone();       
                    row[2] = deliveryMan.getUsername();
                    row[3] = deliveryMan.getPassword();
                    model.addRow(row);
                
            }
        
    }
    
      private void inListn() {
       tblDeliveryMan.getSelectionModel().addListSelectionListener(new ListSelectionListener(){
        public void valueChanged(ListSelectionEvent event) {
           int selectedRow = tblDeliveryMan.getSelectedRow();
             if (selectedRow >= 0) {
                  DeliveryMan  deliveryMan  = (DeliveryMan) tblDeliveryMan.getValueAt(selectedRow, 0);
                 if(deliveryMan!=null){
                     show(deliveryMan);
                 }
             }
        }
    });
    }

    private void show(DeliveryMan deliveryMan) {
        System.out.println("show");
        createUserName.setText(deliveryMan.getUsername());
        createPassword.setText(deliveryMan.getPassword());
        createName.setText(deliveryMan.getName());
        createPhone.setText(deliveryMan.getPhone());
        

    }

    private void createUserNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createUserNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_createUserNameActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnDeliveryMan;
    private javax.swing.JButton btnModify;
    private javax.swing.JTextField createName;
    private javax.swing.JTextField createPassword;
    private javax.swing.JTextField createPhone;
    private javax.swing.JTextField createUserName;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblDeliveryMan;
    // End of variables declaration//GEN-END:variables
}
