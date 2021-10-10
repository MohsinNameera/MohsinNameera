/*
 * ProductManagerWorkAreaJPanel.java
 *
 * Created on October 3, 2008, 8:06 AM
 */
package ui.CustomerRole;

import java.awt.CardLayout;
import javax.swing.JPanel;
import model.MOL;
import model.SupplierDirectory;







/**
 *
 * @author Rushabh
 */
public class CustomerWorkAreaJPanel extends javax.swing.JPanel {

    JPanel userProcessContainer;
    SupplierDirectory supplierDirectory;
    MOL mol;

    /** Creates new form ProductManagerWorkAreaJPanel */
    public CustomerWorkAreaJPanel(JPanel userProcessContainer, SupplierDirectory supplierDirectory, MOL mol) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.supplierDirectory = supplierDirectory;
        this.mol = mol;
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */


    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitle = new javax.swing.JLabel();
        btnBrowseCatalog = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));

        lblTitle.setBackground(new java.awt.Color(0, 0, 0));
        lblTitle.setFont(new java.awt.Font("Lucida Grande", 1, 24)); // NOI18N
        lblTitle.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/WhatsApp Image 2021-10-08 at 9.49.49 PM.jpeg"))); // NOI18N
        lblTitle.setText("Welcome Dear Customer!");
        lblTitle.setIconTextGap(20);

        btnBrowseCatalog.setBackground(new java.awt.Color(0, 0, 0));
        btnBrowseCatalog.setForeground(new java.awt.Color(255, 255, 255));
        btnBrowseCatalog.setText("BOOK YOUR CAB>>");
        btnBrowseCatalog.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBrowseCatalogActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(237, 237, 237)
                .addComponent(btnBrowseCatalog)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(137, Short.MAX_VALUE)
                .addComponent(lblTitle)
                .addGap(132, 132, 132))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(108, 108, 108)
                .addComponent(lblTitle)
                .addGap(98, 98, 98)
                .addComponent(btnBrowseCatalog)
                .addContainerGap(315, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents
    private void btnBrowseCatalogActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBrowseCatalogActionPerformed
        // TODO add your handling code here:
         BrowseProductsJPanel bpjp= new BrowseProductsJPanel(userProcessContainer, supplierDirectory, mol);
        userProcessContainer.add("BrowseProductsJPanel", bpjp);
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        layout.next(userProcessContainer);

        
    }//GEN-LAST:event_btnBrowseCatalogActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBrowseCatalog;
    private javax.swing.JLabel lblTitle;
    // End of variables declaration//GEN-END:variables
}