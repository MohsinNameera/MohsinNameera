package ui.AdminRole;

import model.Supplier;
import model.SupplierDirectory;
import java.awt.CardLayout;
import java.awt.Component;
import java.math.BigInteger;
import javax.swing.JOptionPane;
import javax.swing.JPanel;


/**
 *
 * @author Mihir Mehta / Hechen Gao
 */
public class AddSupplierJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private SupplierDirectory supplierDirectory;
    boolean f1 = false;
    public AddSupplierJPanel(JPanel upc, SupplierDirectory sd) {
        initComponents();
        userProcessContainer = upc;
        supplierDirectory = sd;
        boolean f1 = false;
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitle = new javax.swing.JLabel();
        btnAdd = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        lblPatientName = new javax.swing.JLabel();
        txtPatientName = new javax.swing.JTextField();
        lblEmail = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        lblPhone = new javax.swing.JLabel();
        txtNumber = new javax.swing.JTextField();
        lblGender = new javax.swing.JLabel();
        lblAge = new javax.swing.JLabel();
        txtAge = new javax.swing.JTextField();
        lblInsurance = new javax.swing.JLabel();
        txtInsurance = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtGender = new javax.swing.JList<>();
        lblInsurance1 = new javax.swing.JLabel();
        txtcity = new javax.swing.JTextField();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblTitle.setBackground(new java.awt.Color(255, 255, 255));
        lblTitle.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/download.jpg"))); // NOI18N
        lblTitle.setText("New Person Details");
        add(lblTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 40, 382, 90));

        btnAdd.setBackground(new java.awt.Color(255, 255, 255));
        btnAdd.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnAdd.setText("Add");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });
        add(btnAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 440, 171, -1));

        btnBack.setBackground(new java.awt.Color(255, 255, 255));
        btnBack.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnBack.setText("<< Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 23, -1, -1));

        lblPatientName.setBackground(new java.awt.Color(255, 255, 255));
        lblPatientName.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblPatientName.setText("Name:");
        add(lblPatientName, new org.netbeans.lib.awtextra.AbsoluteConstraints(242, 160, -1, -1));

        txtPatientName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPatientNameActionPerformed(evt);
            }
        });
        add(txtPatientName, new org.netbeans.lib.awtextra.AbsoluteConstraints(295, 155, 171, -1));

        lblEmail.setBackground(new java.awt.Color(255, 255, 255));
        lblEmail.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblEmail.setText("Email ID:");
        add(lblEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(228, 200, -1, -1));
        add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(295, 195, 171, -1));

        lblPhone.setBackground(new java.awt.Color(255, 255, 255));
        lblPhone.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblPhone.setText("Phone Number:");
        add(lblPhone, new org.netbeans.lib.awtextra.AbsoluteConstraints(192, 235, -1, -1));
        add(txtNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(295, 235, 171, -1));

        lblGender.setBackground(new java.awt.Color(255, 255, 255));
        lblGender.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblGender.setText("Gender:");
        add(lblGender, new org.netbeans.lib.awtextra.AbsoluteConstraints(233, 267, -1, -1));

        lblAge.setBackground(new java.awt.Color(255, 255, 255));
        lblAge.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblAge.setText("Age:");
        add(lblAge, new org.netbeans.lib.awtextra.AbsoluteConstraints(252, 314, -1, -1));

        txtAge.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAgeActionPerformed(evt);
            }
        });
        add(txtAge, new org.netbeans.lib.awtextra.AbsoluteConstraints(295, 309, 171, -1));

        lblInsurance.setBackground(new java.awt.Color(255, 255, 255));
        lblInsurance.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblInsurance.setText("Insurance Number:");
        add(lblInsurance, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 354, -1, -1));
        add(txtInsurance, new org.netbeans.lib.awtextra.AbsoluteConstraints(295, 349, 171, -1));

        txtGender.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Male", "Female" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        txtGender.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        txtGender.setVisibleRowCount(2);
        jScrollPane1.setViewportView(txtGender);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(295, 264, 171, -1));

        lblInsurance1.setBackground(new java.awt.Color(255, 255, 255));
        lblInsurance1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblInsurance1.setText("City:");
        add(lblInsurance1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 390, -1, -1));
        add(txtcity, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 390, 171, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
       
        Supplier supplier = supplierDirectory.addSupplier();
        supplier.setPersonName(txtPatientName.getText());
        supplier.setPersonPhone(txtNumber.getText());
        supplier.setPersonEmail(txtEmail.getText());
        supplier.setPersonGender(txtGender.getSelectedValue());
        supplier.setPersonAge(txtAge.getText());
        supplier.setPersonInsurance(txtInsurance.getText());
        supplier.setCity(txtcity.getText());
        
          JOptionPane.showMessageDialog(null, "Patient added successfully!!", "Info", JOptionPane.INFORMATION_MESSAGE);     
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed

        backAction();
    }//GEN-LAST:event_btnBackActionPerformed

    private void txtAgeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAgeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAgeActionPerformed

    private void txtPatientNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPatientNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPatientNameActionPerformed

    private void backAction(){
        userProcessContainer.remove(this);
        Component [] componentArray = userProcessContainer.getComponents();
        Component c = componentArray[componentArray.length-1];
        ManageSuppliersJPanel ms = (ManageSuppliersJPanel) c;
        ms.refreshTable();
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnBack;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblAge;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblGender;
    private javax.swing.JLabel lblInsurance;
    private javax.swing.JLabel lblInsurance1;
    private javax.swing.JLabel lblPatientName;
    private javax.swing.JLabel lblPhone;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JTextField txtAge;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JList<String> txtGender;
    private javax.swing.JTextField txtInsurance;
    private javax.swing.JTextField txtNumber;
    private javax.swing.JTextField txtPatientName;
    private javax.swing.JTextField txtcity;
    // End of variables declaration//GEN-END:variables

}
