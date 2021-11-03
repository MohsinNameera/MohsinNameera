package ui.SupplierRole;

import java.awt.CardLayout;
import ui.AdminRole.ManageSuppliersJPanel;
import java.awt.Component;
import javax.swing.JPanel;
import model.Product;

/**
 *
 * @author Mihir Mehta / Hechen Gao
 */
public class ViewProductDetailJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private Product product;
    public ViewProductDetailJPanel(JPanel upc, Product p) {
        initComponents();
        userProcessContainer = upc;
        product = p;
        txtId.setText(String.valueOf(p.getEncounterID()));
        txtPrice.setText(String.valueOf(p.getBPUpper()));
        txtPrice1.setText(String.valueOf(p.getBPLower()));
        txtPrice2.setText(p.getResults());
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitle = new javax.swing.JLabel();
        btnUpdate = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        btnSave = new javax.swing.JButton();
        lblPrice = new javax.swing.JLabel();
        txtPrice = new javax.swing.JTextField();
        txtId = new javax.swing.JTextField();
        lblProductId = new javax.swing.JLabel();
        lblPrice1 = new javax.swing.JLabel();
        txtPrice1 = new javax.swing.JTextField();
        lblPrice2 = new javax.swing.JLabel();
        txtPrice2 = new javax.swing.JTextField();

        setBackground(new java.awt.Color(255, 255, 255));
        setForeground(new java.awt.Color(255, 51, 255));
        setPreferredSize(new java.awt.Dimension(650, 600));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblTitle.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblTitle.setText("View ");
        add(lblTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 70, -1, -1));

        btnUpdate.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnUpdate.setText("Update Details");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });
        add(btnUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 310, -1, -1));

        btnBack.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        btnBack.setText("<< Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 28, -1, -1));

        btnSave.setBackground(new java.awt.Color(255, 255, 255));
        btnSave.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnSave.setText("Save");
        btnSave.setEnabled(false);
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });
        add(btnSave, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 360, 123, -1));

        lblPrice.setBackground(new java.awt.Color(255, 255, 255));
        lblPrice.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblPrice.setText("BP MIN");
        add(lblPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 180, -1, -1));

        txtPrice.setEditable(false);
        txtPrice.setBackground(new java.awt.Color(255, 255, 255));
        txtPrice.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        txtPrice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPriceActionPerformed(evt);
            }
        });
        add(txtPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 180, 53, -1));

        txtId.setEditable(false);
        txtId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdActionPerformed(evt);
            }
        });
        add(txtId, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 140, 159, -1));

        lblProductId.setBackground(new java.awt.Color(255, 255, 255));
        lblProductId.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblProductId.setText(" ID:");
        add(lblProductId, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 150, -1, -1));

        lblPrice1.setBackground(new java.awt.Color(255, 255, 255));
        lblPrice1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblPrice1.setText("BP MAX");
        add(lblPrice1, new org.netbeans.lib.awtextra.AbsoluteConstraints(196, 219, -1, -1));

        txtPrice1.setEditable(false);
        txtPrice1.setBackground(new java.awt.Color(255, 255, 255));
        txtPrice1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        add(txtPrice1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 210, 53, -1));

        lblPrice2.setBackground(new java.awt.Color(255, 255, 255));
        lblPrice2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblPrice2.setText("Results");
        add(lblPrice2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 250, -1, -1));

        txtPrice2.setEditable(false);
        txtPrice2.setBackground(new java.awt.Color(255, 255, 255));
        txtPrice2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        add(txtPrice2, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 250, 90, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed

        //txtId.setEditable(true);
        txtPrice.setEditable(true);
        txtPrice1.setEditable(true);
        txtPrice2.setEditable(true);
        btnSave.setEnabled(true);
}//GEN-LAST:event_btnUpdateActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed

        backAction();
    }//GEN-LAST:event_btnBackActionPerformed

      private void backAction() {
        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        ManageProductCatalogJPanel manageProductCatalogJPanel = (ManageProductCatalogJPanel) component;
        manageProductCatalogJPanel.refreshTable();
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }
    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        product.setBPLower(Integer.parseInt(txtPrice1.getText()));
        product.setBPUpper(Integer.parseInt(txtPrice.getText()));
        product.setResults(txtPrice2.getText());
    }//GEN-LAST:event_btnSaveActionPerformed

    private void txtIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdActionPerformed

    private void txtPriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPriceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPriceActionPerformed
   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JLabel lblPrice;
    private javax.swing.JLabel lblPrice1;
    private javax.swing.JLabel lblPrice2;
    private javax.swing.JLabel lblProductId;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtPrice;
    private javax.swing.JTextField txtPrice1;
    private javax.swing.JTextField txtPrice2;
    // End of variables declaration//GEN-END:variables
}
