package ui.SupplierRole;

import model.Product;
import model.Supplier;
import java.awt.CardLayout;
import java.awt.Component;
import java.util.Calendar;
import javax.swing.JOptionPane;
import javax.swing.JPanel;


/**
 *
 * @author Mihir Mehta / Hechen Gao
 */
public class CreateNewProductJPanel extends javax.swing.JPanel {

    JPanel userProcessContainer;
    Supplier supplier;
    public CreateNewProductJPanel(JPanel upc, Supplier s){
        initComponents();
        userProcessContainer = upc;
        supplier = s;
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnAdd = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtBP1 = new javax.swing.JTextField();
        txtBP2 = new javax.swing.JTextField();
        EncounterDate = new com.toedter.calendar.JDateChooser();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtresults = new javax.swing.JList<>();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(650, 600));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 0, 51));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/download.jpg"))); // NOI18N
        jLabel1.setText("Patient Profile");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 30, -1, -1));

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(153, 0, 51));
        jLabel3.setText("Results");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 250, -1, 30));

        btnAdd.setBackground(new java.awt.Color(255, 255, 255));
        btnAdd.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnAdd.setForeground(new java.awt.Color(153, 0, 51));
        btnAdd.setText("Add Details");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });
        add(btnAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 340, 108, 42));

        btnBack.setBackground(new java.awt.Color(255, 255, 255));
        btnBack.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnBack.setForeground(new java.awt.Color(153, 0, 51));
        btnBack.setText("<< Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, -1, -1));

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel6.setText("---");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 190, -1, 30));

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(153, 0, 51));
        jLabel7.setText("Date");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 130, 50, 30));

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(153, 0, 51));
        jLabel8.setText("Blood Pressure");
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 180, -1, 30));

        txtBP1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBP1ActionPerformed(evt);
            }
        });
        add(txtBP1, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 190, 35, 33));
        add(txtBP2, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 190, 35, 33));
        add(EncounterDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 130, 171, 30));

        txtresults.setForeground(new java.awt.Color(153, 0, 51));
        txtresults.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Normal", "Abnormal" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(txtresults);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 240, 110, 50));
    }// </editor-fold>//GEN-END:initComponents
    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        int BPUpper=0;
        int BPLower=0;
        
        try{
            BPUpper=Integer.parseInt(txtBP1.getText());
            BPLower=Integer.parseInt(txtBP2.getText());
         
           
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Invalid Information", "Info", JOptionPane.INFORMATION_MESSAGE);
            return;
        }
                
        Product p = supplier.getProductCatalog().addProduct();
        p.setBPUpper(BPUpper);
        p.setBPLower(BPLower);
        p.setResults(txtresults.getSelectedValue());
        p.setEncounterDate(EncounterDate.getDate());
       
        JOptionPane.showMessageDialog(null, "Patient Encounter details added !", "Info", JOptionPane.INFORMATION_MESSAGE);
}//GEN-LAST:event_btnAddActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed

        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        ManageProductCatalogJPanel manageProductCatalogJPanel = (ManageProductCatalogJPanel) component;
        manageProductCatalogJPanel.refreshTable();
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed

    private void txtBP1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBP1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBP1ActionPerformed
   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser EncounterDate;
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnBack;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtBP1;
    private javax.swing.JTextField txtBP2;
    private javax.swing.JList<String> txtresults;
    // End of variables declaration//GEN-END:variables
}
