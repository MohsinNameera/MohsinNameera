

package userinterface.RestaurantAdminRole;

import Business.EcoSystem;
import Business.UserAccount.UserAccount;
import java.awt.Color;

import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author  raunak
 */
public class RestaurantJPanel extends javax.swing.JPanel {
    
    JPanel userProcessContainer;
    EcoSystem ecosystem;
    UserAccount userAccount;
    /** Creates new form AdminWorkAreaJPanel */
    public RestaurantJPanel(JPanel userProcessContainer,UserAccount userAccount, EcoSystem ecosystem) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.ecosystem=ecosystem;
        this.userAccount = userAccount;
        orders();
        //valueLabel.setText();
    }
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        manageOrdersButtonPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        manageOrdersButtonLabel = new javax.swing.JLabel();
        manageMenuButtonPanel = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        manageMenuButtonLabel = new javax.swing.JLabel();
        manageInfoButtonPanel = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        manageInfoButtonLabel = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        rightSystemAdminPanel = new javax.swing.JPanel();

        setBackground(new java.awt.Color(0, 0, 0));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        manageOrdersButtonPanel.setBackground(new java.awt.Color(0, 0, 0));
        manageOrdersButtonPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                manageOrdersButtonPanelMousePressed(evt);
            }
        });

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        manageOrdersButtonLabel.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 18)); // NOI18N
        manageOrdersButtonLabel.setForeground(new java.awt.Color(0, 153, 0));
        manageOrdersButtonLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        manageOrdersButtonLabel.setText("Manage Orders");
        manageOrdersButtonLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                manageOrdersButtonLabelMousePressed(evt);
            }
        });

        javax.swing.GroupLayout manageOrdersButtonPanelLayout = new javax.swing.GroupLayout(manageOrdersButtonPanel);
        manageOrdersButtonPanel.setLayout(manageOrdersButtonPanelLayout);
        manageOrdersButtonPanelLayout.setHorizontalGroup(
            manageOrdersButtonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(manageOrdersButtonPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(manageOrdersButtonLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 212, Short.MAX_VALUE)
                .addContainerGap())
        );
        manageOrdersButtonPanelLayout.setVerticalGroup(
            manageOrdersButtonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(manageOrdersButtonPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(manageOrdersButtonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(manageOrdersButtonLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanel1.add(manageOrdersButtonPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 210, 280, -1));

        manageMenuButtonPanel.setBackground(new java.awt.Color(0, 0, 0));
        manageMenuButtonPanel.setPreferredSize(new java.awt.Dimension(264, 48));
        manageMenuButtonPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                manageMenuButtonPanelMousePressed(evt);
            }
        });

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        manageMenuButtonLabel.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 18)); // NOI18N
        manageMenuButtonLabel.setForeground(new java.awt.Color(0, 153, 0));
        manageMenuButtonLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        manageMenuButtonLabel.setText("Manage Menu");
        manageMenuButtonLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                manageMenuButtonLabelMousePressed(evt);
            }
        });

        javax.swing.GroupLayout manageMenuButtonPanelLayout = new javax.swing.GroupLayout(manageMenuButtonPanel);
        manageMenuButtonPanel.setLayout(manageMenuButtonPanelLayout);
        manageMenuButtonPanelLayout.setHorizontalGroup(
            manageMenuButtonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(manageMenuButtonPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(manageMenuButtonLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 216, Short.MAX_VALUE)
                .addContainerGap())
        );
        manageMenuButtonPanelLayout.setVerticalGroup(
            manageMenuButtonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(manageMenuButtonPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(manageMenuButtonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(manageMenuButtonLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanel1.add(manageMenuButtonPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 290, 280, 50));

        manageInfoButtonPanel.setBackground(new java.awt.Color(0, 0, 0));
        manageInfoButtonPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                manageInfoButtonPanelMousePressed(evt);
            }
        });

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        manageInfoButtonLabel.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 18)); // NOI18N
        manageInfoButtonLabel.setForeground(new java.awt.Color(0, 153, 0));
        manageInfoButtonLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        manageInfoButtonLabel.setText("Manage Info");

        javax.swing.GroupLayout manageInfoButtonPanelLayout = new javax.swing.GroupLayout(manageInfoButtonPanel);
        manageInfoButtonPanel.setLayout(manageInfoButtonPanelLayout);
        manageInfoButtonPanelLayout.setHorizontalGroup(
            manageInfoButtonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(manageInfoButtonPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(manageInfoButtonLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(13, Short.MAX_VALUE))
        );
        manageInfoButtonPanelLayout.setVerticalGroup(
            manageInfoButtonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(manageInfoButtonPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(manageInfoButtonLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel1.add(manageInfoButtonPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 360, 280, 50));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/rest.png"))); // NOI18N
        jLabel2.setText("jLabel2");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 70, 200, -1));

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 280, 670));

        rightSystemAdminPanel.setBackground(new java.awt.Color(0, 0, 0));
        rightSystemAdminPanel.setPreferredSize(new java.awt.Dimension(1200, 900));
        rightSystemAdminPanel.setLayout(new java.awt.CardLayout());
        add(rightSystemAdminPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 0, 710, 670));
    }// </editor-fold>//GEN-END:initComponents

    private void manageOrdersButtonLabelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_manageOrdersButtonLabelMousePressed
        orders();
    }//GEN-LAST:event_manageOrdersButtonLabelMousePressed
    private void orders() {
        // TODO add your handling code here:
        manageOrdersButtonPanel.setBackground(new Color(255,255,255));
        manageMenuButtonPanel.setBackground(new Color(0,0,0));
        manageInfoButtonPanel.setBackground(new Color(0,0,0));
        orderJPanel OrderJPanel = new orderJPanel(rightSystemAdminPanel,ecosystem,userAccount);
        rightSystemAdminPanel.add("OrderJPanel",OrderJPanel);
        CardLayout layout = (CardLayout) rightSystemAdminPanel.getLayout();
        layout.next(rightSystemAdminPanel);
    }

    private void manageOrdersButtonPanelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_manageOrdersButtonPanelMousePressed
        // TODO add your handling code here:
        orders();
    }//GEN-LAST:event_manageOrdersButtonPanelMousePressed

    private void manageMenuButtonLabelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_manageMenuButtonLabelMousePressed
        menu();
    }//GEN-LAST:event_manageMenuButtonLabelMousePressed
    private void menu() {
        // TODO add your handling code here:
        manageMenuButtonPanel.setBackground(new Color(255,255,255));
        manageOrdersButtonPanel.setBackground(new Color(0,0,0));
        manageInfoButtonPanel.setBackground(new Color(0,0,0));
        menuJPanel MenuJPanel = new menuJPanel(rightSystemAdminPanel,userAccount,ecosystem);
        rightSystemAdminPanel.add("MenuJPanel",MenuJPanel);
        CardLayout layout = (CardLayout) rightSystemAdminPanel.getLayout();
        layout.next(rightSystemAdminPanel);
    }

    private void manageMenuButtonPanelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_manageMenuButtonPanelMousePressed
        // TODO add your handling code here:
        menu();
    }//GEN-LAST:event_manageMenuButtonPanelMousePressed

    private void manageInfoButtonPanelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_manageInfoButtonPanelMousePressed
        info();
    }//GEN-LAST:event_manageInfoButtonPanelMousePressed
    private void info() {
        // TODO add your handling code here:
        manageInfoButtonPanel.setBackground(new Color(255,255,255));
        manageOrdersButtonPanel.setBackground(new Color(0,0,0));
        manageMenuButtonPanel.setBackground(new Color(0,0,0));
        RestaurantDetailsJPanel RestaurantDetailsJPanel = new RestaurantDetailsJPanel(rightSystemAdminPanel,ecosystem, userAccount);
        rightSystemAdminPanel.add("RestaurantDetailsJPanel",RestaurantDetailsJPanel);
        CardLayout layout = (CardLayout) rightSystemAdminPanel.getLayout();
        layout.next(rightSystemAdminPanel);
    }

   
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel manageInfoButtonLabel;
    private javax.swing.JPanel manageInfoButtonPanel;
    private javax.swing.JLabel manageMenuButtonLabel;
    private javax.swing.JPanel manageMenuButtonPanel;
    private javax.swing.JLabel manageOrdersButtonLabel;
    private javax.swing.JPanel manageOrdersButtonPanel;
    private javax.swing.JPanel rightSystemAdminPanel;
    // End of variables declaration//GEN-END:variables
    
}
