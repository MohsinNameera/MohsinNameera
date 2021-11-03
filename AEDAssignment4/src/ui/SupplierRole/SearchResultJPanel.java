package ui.SupplierRole;

import model.Product;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JPanel;

/**
 *
 * @author Mihir Mehta / Hechen Gao
 */
public class SearchResultJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private Product product;
    public SearchResultJPanel(JPanel upc, Product p) {
        initComponents();
        userProcessContainer = upc;
        product = p;
        txtId.setText(String.valueOf(p.getEncounterID()));
        txtPrice.setText(String.valueOf(p.getBPUpper()));
        txtPrice1.setText(String.valueOf(p.getBPLower()));
        
        
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitle = new javax.swing.JLabel();
        lblPrice = new javax.swing.JLabel();
        txtPrice = new javax.swing.JTextField();
        btnUpdate = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        txtId = new javax.swing.JTextField();
        lblProductId = new javax.swing.JLabel();
        btnSave = new javax.swing.JButton();
        lblPrice1 = new javax.swing.JLabel();
        txtPrice1 = new javax.swing.JTextField();

        setBackground(new java.awt.Color(255, 255, 255));
        setForeground(new java.awt.Color(255, 0, 204));
        setPreferredSize(new java.awt.Dimension(650, 600));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblTitle.setBackground(new java.awt.Color(255, 255, 255));
        lblTitle.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblTitle.setText("View History");
        add(lblTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(265, 25, -1, -1));

        lblPrice.setBackground(new java.awt.Color(255, 255, 255));
        lblPrice.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblPrice.setText("BP MIN");
        add(lblPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 190, -1, -1));

        txtPrice.setEditable(false);
        txtPrice.setBackground(new java.awt.Color(255, 255, 255));
        txtPrice.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        txtPrice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPriceActionPerformed(evt);
            }
        });
        add(txtPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(265, 179, 53, -1));

        btnUpdate.setBackground(new java.awt.Color(255, 255, 255));
        btnUpdate.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnUpdate.setText("Update Product");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });
        add(btnUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(214, 306, -1, 30));

        btnBack.setBackground(new java.awt.Color(255, 255, 255));
        btnBack.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnBack.setText("<< Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 28, -1, -1));

        txtId.setEditable(false);
        add(txtId, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 140, 159, -1));

        lblProductId.setBackground(new java.awt.Color(255, 255, 255));
        lblProductId.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblProductId.setText("Encounter ID:");
        add(lblProductId, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 150, -1, -1));

        btnSave.setBackground(new java.awt.Color(255, 255, 255));
        btnSave.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnSave.setText("Save");
        btnSave.setEnabled(false);
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });
        add(btnSave, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 310, 107, 30));

        lblPrice1.setBackground(new java.awt.Color(255, 255, 255));
        lblPrice1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblPrice1.setText("BP MAX");
        add(lblPrice1, new org.netbeans.lib.awtextra.AbsoluteConstraints(196, 219, -1, -1));

        txtPrice1.setEditable(false);
        txtPrice1.setBackground(new java.awt.Color(255, 255, 255));
        txtPrice1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        add(txtPrice1, new org.netbeans.lib.awtextra.AbsoluteConstraints(265, 216, 53, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed

        //txtId.setEditable(true);
      
        txtPrice.setEditable(true);
        txtPrice1.setEditable(true);
        btnSave.setEnabled(true);
}//GEN-LAST:event_btnUpdateActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed

        backAction();
    }//GEN-LAST:event_btnBackActionPerformed

      private void backAction() {
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }
    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        product.setBPLower(Integer.parseInt(txtPrice1.getText()));
        product.setBPUpper(Integer.parseInt(txtPrice.getText()));
    }//GEN-LAST:event_btnSaveActionPerformed

    private void txtPriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPriceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPriceActionPerformed
   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JLabel lblPrice;
    private javax.swing.JLabel lblPrice1;
    private javax.swing.JLabel lblProductId;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtPrice;
    private javax.swing.JTextField txtPrice1;
    // End of variables declaration//GEN-END:variables
}
