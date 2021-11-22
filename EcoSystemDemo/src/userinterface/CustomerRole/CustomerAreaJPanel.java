/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.CustomerRole;

import Business.EcoSystem;

import Business.UserAccount.UserAccount;
import java.awt.Color;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author raunak
 */
public class CustomerAreaJPanel extends javax.swing.JPanel {

    JPanel userProcessContainer;
    UserAccount userAccount;
    EcoSystem ecosystem;
    
    /**
     * Creates new form DoctorWorkAreaJPanel
     */
    public CustomerAreaJPanel(JPanel userProcessContainer, UserAccount account, EcoSystem ecosystem) {
        initComponents();
        
        this.userProcessContainer = userProcessContainer;
        this.userAccount = account;
        this.ecosystem = ecosystem;
        OrderPlace();
    }
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        rightSystemAdminPanel = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        placeOrderButtonPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        placeOrderLabel = new javax.swing.JLabel();
        orderStatusButtonPanel = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        orderStatusLabel = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        rightSystemAdminPanel.setBackground(new java.awt.Color(0, 0, 0));
        rightSystemAdminPanel.setPreferredSize(new java.awt.Dimension(940, 808));
        rightSystemAdminPanel.setLayout(new java.awt.CardLayout());

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        placeOrderButtonPanel.setBackground(new java.awt.Color(0, 0, 0));
        placeOrderButtonPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                placeOrderButtonPanelMousePressed(evt);
            }
        });

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        placeOrderLabel.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 18)); // NOI18N
        placeOrderLabel.setForeground(new java.awt.Color(51, 153, 0));
        placeOrderLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        placeOrderLabel.setText("Place Order");
        placeOrderLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                placeOrderLabelMousePressed(evt);
            }
        });

        javax.swing.GroupLayout placeOrderButtonPanelLayout = new javax.swing.GroupLayout(placeOrderButtonPanel);
        placeOrderButtonPanel.setLayout(placeOrderButtonPanelLayout);
        placeOrderButtonPanelLayout.setHorizontalGroup(
            placeOrderButtonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(placeOrderButtonPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(placeOrderLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 14, Short.MAX_VALUE))
        );
        placeOrderButtonPanelLayout.setVerticalGroup(
            placeOrderButtonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(placeOrderButtonPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(placeOrderButtonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(placeOrderLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanel1.add(placeOrderButtonPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 220, 280, -1));

        orderStatusButtonPanel.setBackground(new java.awt.Color(0, 0, 0));
        orderStatusButtonPanel.setPreferredSize(new java.awt.Dimension(264, 48));
        orderStatusButtonPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                orderStatusButtonPanelMousePressed(evt);
            }
        });

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        orderStatusLabel.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 18)); // NOI18N
        orderStatusLabel.setForeground(new java.awt.Color(51, 153, 0));
        orderStatusLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        orderStatusLabel.setText("Order Status");
        orderStatusLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                orderStatusLabelMousePressed(evt);
            }
        });

        javax.swing.GroupLayout orderStatusButtonPanelLayout = new javax.swing.GroupLayout(orderStatusButtonPanel);
        orderStatusButtonPanel.setLayout(orderStatusButtonPanelLayout);
        orderStatusButtonPanelLayout.setHorizontalGroup(
            orderStatusButtonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(orderStatusButtonPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(orderStatusLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        orderStatusButtonPanelLayout.setVerticalGroup(
            orderStatusButtonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(orderStatusButtonPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(orderStatusButtonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(orderStatusLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanel1.add(orderStatusButtonPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 310, 280, 50));

        jLabel2.setText("jLabel2");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 90, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(rightSystemAdminPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(rightSystemAdminPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 660, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void placeOrderLabelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_placeOrderLabelMousePressed
        OrderPlace();
    }//GEN-LAST:event_placeOrderLabelMousePressed
    private void OrderPlace() {
        // TODO add your handling code here:
        placeOrderButtonPanel.setBackground(new Color(255, 255, 255));
        orderStatusButtonPanel.setBackground(new Color(0, 0, 0));

        OrderPlaceJPanel placeOrderJPanel = new OrderPlaceJPanel(rightSystemAdminPanel, userAccount, ecosystem);
        rightSystemAdminPanel.add("PlaceOrderJPanel", placeOrderJPanel);
        CardLayout layout = (CardLayout) rightSystemAdminPanel.getLayout();
        layout.next(rightSystemAdminPanel);

    }
    private void placeOrderButtonPanelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_placeOrderButtonPanelMousePressed
        OrderPlace();
    }//GEN-LAST:event_placeOrderButtonPanelMousePressed

    private void orderStatusLabelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_orderStatusLabelMousePressed
        orderStatus();
    }//GEN-LAST:event_orderStatusLabelMousePressed

    private void orderStatus() {
        // TODO add your handling code here:
        orderStatusButtonPanel.setBackground(new Color(255, 255, 255));
        placeOrderButtonPanel.setBackground(new Color(0, 0, 0));
        
        OrderIStatusJPanel orderStatusJPanel = new OrderIStatusJPanel(rightSystemAdminPanel, ecosystem, userAccount);
        rightSystemAdminPanel.add("OrderStatusJPanel", orderStatusJPanel);
        CardLayout layout = (CardLayout)rightSystemAdminPanel.getLayout();
        layout.next(rightSystemAdminPanel);
    }

    private void orderStatusButtonPanelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_orderStatusButtonPanelMousePressed
        // TODO add your handling code here:
        orderStatus();
    }//GEN-LAST:event_orderStatusButtonPanelMousePressed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel orderStatusButtonPanel;
    private javax.swing.JLabel orderStatusLabel;
    private javax.swing.JPanel placeOrderButtonPanel;
    private javax.swing.JLabel placeOrderLabel;
    private javax.swing.JPanel rightSystemAdminPanel;
    // End of variables declaration//GEN-END:variables
}
