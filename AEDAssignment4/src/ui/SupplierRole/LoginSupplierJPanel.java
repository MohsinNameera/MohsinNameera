package ui.SupplierRole;

import model.Supplier;
import model.SupplierDirectory;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author Mihir Mehta / Hechen Gao
 */
public class LoginSupplierJPanel extends javax.swing.JPanel {
    
    private JPanel userProcessContainer;
    private SupplierDirectory supplierDirectory;
    private Supplier supplier;
    public LoginSupplierJPanel(JPanel upc, SupplierDirectory sd) {
        initComponents();
        userProcessContainer = upc;
        supplierDirectory = sd;
        /*supplier =s;*/
        
        cmbSupplier.removeAllItems();;
        for (Supplier supplier : supplierDirectory.getSupplierlist()) {
            cmbSupplier.addItem(supplier);
        }
    }
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblSupplierChooser = new javax.swing.JLabel();
        cmbSupplier = new javax.swing.JComboBox();
        btnFind = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(650, 600));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblSupplierChooser.setBackground(new java.awt.Color(255, 255, 255));
        lblSupplierChooser.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblSupplierChooser.setForeground(new java.awt.Color(153, 0, 51));
        lblSupplierChooser.setText("Select Patient ID:");
        add(lblSupplierChooser, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 220, -1, 30));

        cmbSupplier.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        cmbSupplier.setForeground(new java.awt.Color(153, 0, 51));
        cmbSupplier.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cmbSupplier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbSupplierActionPerformed(evt);
            }
        });
        add(cmbSupplier, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 220, 188, 30));

        btnFind.setBackground(new java.awt.Color(255, 255, 255));
        btnFind.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnFind.setForeground(new java.awt.Color(153, 0, 51));
        btnFind.setText("Login");
        btnFind.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFindActionPerformed(evt);
            }
        });
        add(btnFind, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 310, -1, 30));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 0, 0));
        jLabel1.setText("Patient Information");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 130, 190, 82));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/nm-logo.png"))); // NOI18N
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 10, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void btnFindActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFindActionPerformed
        Supplier supplier = (Supplier) cmbSupplier.getSelectedItem();
        /*SupplierWorkAreaJPanel swajp = new SupplierWorkAreaJPanel(userProcessContainer, supplier);*/
        ManageProductCatalogJPanel mpcjp = new ManageProductCatalogJPanel(userProcessContainer, supplier);
        /*userProcessContainer.add("SupplierWorkAreaJPanel", swajp);*/
        userProcessContainer.add("ManageProductCatalogJPanel", mpcjp);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
        /*CardLayout layout = (CardLayout) userProcessContainer.getLayout();*/
        /*layout.next(userProcessContainer);*/


    }//GEN-LAST:event_btnFindActionPerformed

    private void cmbSupplierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbSupplierActionPerformed

    }//GEN-LAST:event_cmbSupplierActionPerformed
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnFind;
    private javax.swing.JComboBox cmbSupplier;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel lblSupplierChooser;
    // End of variables declaration//GEN-END:variables
    
}
