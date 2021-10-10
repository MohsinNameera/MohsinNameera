package ui.AdminRole;

import model.SupplierDirectory;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author  Mihir Mehta / Hechen Gao
 */
public class AdminWorkAreaJPanel extends javax.swing.JPanel {
  
    private JPanel userProcessContainer;
    private SupplierDirectory supplierDirectory;
    public AdminWorkAreaJPanel(JPanel userProcessContainer,SupplierDirectory supplierDirectory) {
        
        initComponents();
        this.userProcessContainer=userProcessContainer;
        this.supplierDirectory=supplierDirectory;
    }
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnManageSuppliers = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(0, 0, 0));
        setPreferredSize(new java.awt.Dimension(650, 600));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnManageSuppliers.setText("MANAGE CABS>>");
        btnManageSuppliers.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnManageSuppliers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageSuppliersActionPerformed(evt);
            }
        });
        add(btnManageSuppliers, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 220, -1, -1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Administrator's Work Area");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 20, 626, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void btnManageSuppliersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageSuppliersActionPerformed
    ManageSuppliersJPanel ms = new ManageSuppliersJPanel(userProcessContainer, supplierDirectory);
    userProcessContainer.add("ManageSupplierAdministrative", ms);
    CardLayout layout = (CardLayout) userProcessContainer.getLayout();
    layout.next(userProcessContainer);
    }//GEN-LAST:event_btnManageSuppliersActionPerformed
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnManageSuppliers;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
    
}
