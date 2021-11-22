/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.RestaurantAdminRole;
import Business.EcoSystem;
import Business.UserAccount.UserAccount;
import Business.UserAccount.UserAccountDirectory;
import Business.WorkQueue.orderWorkRequest;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import java.util.List;
import javax.swing.JPanel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;
//import userinterface.CustomerRole.OrderDetailsJPanel;

/**
 *
 * @author namir
 */
public class orderJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManageOrderJPanel
     */
    JPanel userProcessContainer;
    EcoSystem ecosystem;
    UserAccountDirectory userAccountList;
    private List<WorkRequest> workRequestList;
    UserAccount account;
    public orderJPanel(JPanel userProcessContainer,EcoSystem ecosystem, UserAccount account) {
        initComponents();
        initListners();
        this.userProcessContainer=userProcessContainer;
        this.ecosystem=ecosystem;
        this.account = account;
        populatRestaurantTable();
    }
     private void populatRestaurantTable(){
        DefaultTableModel model = (DefaultTableModel) tblRestaurantWorkRequest.getModel();
        model.setRowCount(0);
        workRequestList = ecosystem.getWorkQueue().getWorkRequestListRestaurant(account);
        for (WorkRequest request : workRequestList) {
            Object[] row = new Object[tblRestaurantWorkRequest.getColumnCount()];
            row[0] = request;
            row[1] = request.getCustomer();
            row[2] = request.getStatus();
            row[3] = request.getRequestDate();
            model.addRow(row);
        }
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
        jScrollPane1 = new javax.swing.JScrollPane();
        tblRestaurantWorkRequest = new javax.swing.JTable();

        setBackground(new java.awt.Color(0, 0, 0));
        setPreferredSize(new java.awt.Dimension(1200, 900));

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setPreferredSize(new java.awt.Dimension(1200, 900));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 153, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText(" ORDER");
        jLabel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 2, true));
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 30, 130, -1));

        tblRestaurantWorkRequest.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Message", "Customer Name", "Status", "Date"
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
        tblRestaurantWorkRequest.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        tblRestaurantWorkRequest.setGridColor(new java.awt.Color(255, 255, 255));
        tblRestaurantWorkRequest.setPreferredSize(new java.awt.Dimension(500, 500));
        jScrollPane1.setViewportView(tblRestaurantWorkRequest);
        tblRestaurantWorkRequest.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        if (tblRestaurantWorkRequest.getColumnModel().getColumnCount() > 0) {
            tblRestaurantWorkRequest.getColumnModel().getColumn(0).setResizable(false);
            tblRestaurantWorkRequest.getColumnModel().getColumn(0).setPreferredWidth(10);
            tblRestaurantWorkRequest.getColumnModel().getColumn(1).setPreferredWidth(10);
            tblRestaurantWorkRequest.getColumnModel().getColumn(2).setPreferredWidth(10);
            tblRestaurantWorkRequest.getColumnModel().getColumn(3).setPreferredWidth(10);
        }

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 110, 690, 372));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 982, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 982, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 657, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 657, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents
        private void initListners() {
        tblRestaurantWorkRequest.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
            public void valueChanged(ListSelectionEvent event) {
                int selectedRow = tblRestaurantWorkRequest.getSelectedRow();
                if (selectedRow >= 0) {
                    WorkRequest request = (WorkRequest) tblRestaurantWorkRequest.getValueAt(selectedRow, 0);
                    if (request instanceof orderWorkRequest) {
                        orderWorkRequest orderWorkRequest = (orderWorkRequest) tblRestaurantWorkRequest.getValueAt(selectedRow, 0);
                        if (orderWorkRequest != null) {
                           orderDetailsJPanel OrderDetailsJPanel = new orderDetailsJPanel(userProcessContainer,ecosystem,account,orderWorkRequest);
                           userProcessContainer.add("OrderDetailsJPanel", OrderDetailsJPanel);
                           CardLayout layout = (CardLayout)userProcessContainer.getLayout();
                           layout.next(userProcessContainer);
                        }
                    }

                }
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblRestaurantWorkRequest;
    // End of variables declaration//GEN-END:variables
}
