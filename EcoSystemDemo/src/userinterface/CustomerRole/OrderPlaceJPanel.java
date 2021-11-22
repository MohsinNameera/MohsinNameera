/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.CustomerRole;
import Business.Customer.Customer;
import Business.EcoSystem;
import Business.Restaurant.product;
import Business.Restaurant.menu;
import Business.Restaurant.Restaurant;
import Business.Restaurant.RestaurantDirectory;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.productWithQty;
import Business.WorkQueue.orderWorkRequest;

import java.awt.CardLayout;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author namir
 */
public class OrderPlaceJPanel extends javax.swing.JPanel {
    private JPanel userProcessContainer;
    private UserAccount userAccount;
    private Customer customer;
    private DefaultTableModel menuTable;
    private DefaultTableModel cartTable;
    private int index = -1;
    private int row = 0;
    private int column = 0;
    private int quantity = 0;
    private EcoSystem ecosystem;
    private RestaurantDirectory resturantDirectory;
    private List<productWithQty> itemsWithQuantityList = new ArrayList<productWithQty>();

    /**
     * Creates new form OrderPlaceJPanel
     */
    public OrderPlaceJPanel(JPanel userProcessContainer, UserAccount account, EcoSystem ecosystem) {
        initComponents();
        initListners();
        this.userProcessContainer = userProcessContainer;
        this.userAccount = account;
        this.ecosystem = ecosystem;
        customer = (Customer) account;
        resturantDirectory = ecosystem.getRestaurantDirectory();
        menuTable = (DefaultTableModel) tblOrder.getModel();
        cartTable = (DefaultTableModel) tblCart.getModel();
        populateRestaurantsList(resturantDirectory.getRestaurantList());
        if (resturantDirectory.getRestaurantList().size() > 0) {
            index = 0;
            populateMenu();
        }
        totalPrice.setEditable(false);

    }

    public boolean isItemSelected(product item) {
        int nRow = tblOrder.getRowCount();
        int count1 = 0;
        boolean s = true;

        for (int i = 0; i < nRow; i++) {
            if (null != tblOrder.getValueAt(i, 2)) {
                if ((Boolean) tblOrder.getValueAt(i, 2) == false) {
                    count1++;
                }
            }
        }
        if (count1 == nRow) {
            s = false;
            JOptionPane.showMessageDialog(null, "Please select an item");
        }
        return s;
    }

    public void populateRestaurantsList(ArrayList<Restaurant> restaurantList) {
        for (Restaurant restaurant : restaurantList) {
            restaurantComboBox.addItem(restaurant.getName());
        }
    }

    private void populateMenu() {
        menuTable.setRowCount(0);
        //createAddToCartButton();
        Restaurant restaurant = resturantDirectory.getRestaurantList().get(index);
        menu menu = restaurant.getMenu();
        List<product> items = menu.getproductList();
        for (product item : items) {
            Object[] row = new Object[menuTable.getColumnCount()];
            row[0] = item;
            row[1] = item.getpPrice();
            menuTable.addRow(row);
        }
    }

    private void initListners() {
        tblOrder.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
            public void valueChanged(ListSelectionEvent event) {
                int selectedRow = tblOrder.getSelectedRow();
                if (selectedRow >= 0) {
                    product item = (product) tblOrder.getValueAt(selectedRow, 0);
                    if (item != null) {
                        String response = JOptionPane.showInputDialog("Please provide Quantity");
                        try {
                            quantity = Integer.parseInt(response);
                        } catch (NumberFormatException e) {

                        }
                        if (quantity != 0) {
                            productWithQty itemWithQuantity = new productWithQty(item, quantity);
                            itemsWithQuantityList.add(itemWithQuantity);
                            System.out.println("QUANTITY : " + quantity);
                            populateItemsWithQuantityTable();
                        }

                    }
                }
            }
        });
    }

    private void populateItemsWithQuantityTable() {
        double total = 0.0;
        cartTable.setRowCount(0);
        for (productWithQty itemWithQuantity : itemsWithQuantityList) {
            Object[] row = new Object[cartTable.getColumnCount()];
            row[0] = itemWithQuantity;
            row[1] = itemWithQuantity.getQty();
            row[2] = itemWithQuantity.getProduct().getpPrice() * itemWithQuantity.getQty();
            total += itemWithQuantity.getProduct().getpPrice() * itemWithQuantity.getQty();
            cartTable.addRow(row);
        }
        totalPrice.setText(total + "");
    }

    private boolean createOrder() {

        if (itemsWithQuantityList.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Please add items to cart, it cannot be empty");
            return false;
        } else {
            orderWorkRequest orderWorkRequest = new orderWorkRequest();
            orderWorkRequest.setProductssWithQtyList(itemsWithQuantityList);
            orderWorkRequest.setMessage(message.getText());
            if (customer != null) {
                orderWorkRequest.setCustomer(customer);
            } else {
                System.out.println("Customer is null");
                return false;
            }
            Restaurant restaurant = resturantDirectory.getRestaurantList().get(index);
            if (restaurant != null) {
                orderWorkRequest.setRestaurant(restaurant);
            } else {
                System.out.println("Restaurant is null");
                return false;
            }
            orderWorkRequest.setRequestDate(new Date());
            orderWorkRequest.setStatus("Ordered");
            ecosystem.getWorkQueue().addWorkRequest(orderWorkRequest);
            return true;

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
        requestTestJButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        message = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblOrder = new javax.swing.JTable();
        restaurantComboBox = new javax.swing.JComboBox<>();
        enterpriseLabel1 = new javax.swing.JLabel();
        cartScrollPane = new javax.swing.JScrollPane();
        tblCart = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        totalPrice = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(0, 0, 0));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        requestTestJButton.setBackground(new java.awt.Color(255, 255, 255));
        requestTestJButton.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 18)); // NOI18N
        requestTestJButton.setForeground(new java.awt.Color(51, 153, 0));
        requestTestJButton.setText("Request Order");
        requestTestJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                requestTestJButtonActionPerformed(evt);
            }
        });
        jPanel1.add(requestTestJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 470, -1, -1));

        jLabel1.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 153, 0));
        jLabel1.setText("Custom Message");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 380, -1, -1));
        jPanel1.add(message, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 370, 190, 60));

        jLabel2.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 153, 0));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Menu");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 100, -1));

        tblOrder.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Item Name", "Item Price"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblOrder);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, 370, 130));

        restaurantComboBox.setForeground(new java.awt.Color(51, 153, 0));
        restaurantComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                restaurantComboBoxActionPerformed(evt);
            }
        });
        jPanel1.add(restaurantComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 60, 190, -1));

        enterpriseLabel1.setFont(new java.awt.Font("Tw Cen MT Condensed", 3, 18)); // NOI18N
        enterpriseLabel1.setForeground(new java.awt.Color(51, 153, 0));
        enterpriseLabel1.setText("Select Restaurant");
        jPanel1.add(enterpriseLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 60, 130, 30));

        tblCart.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Item Name", "Item Qty", "Item Price"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class, java.lang.Double.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        cartScrollPane.setViewportView(tblCart);

        jPanel1.add(cartScrollPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 140, 440, 130));

        jLabel3.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 153, 0));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("CART");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 110, 100, -1));

        jLabel4.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 153, 0));
        jLabel4.setText("Total");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 310, 60, 30));

        totalPrice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                totalPriceActionPerformed(evt);
            }
        });
        jPanel1.add(totalPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 310, 100, 30));

        jLabel5.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 153, 0));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("PLACE ORDER");
        jLabel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 10, 250, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/orderpage.gif"))); // NOI18N
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, 530, 480));

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1190, 1000));
    }// </editor-fold>//GEN-END:initComponents

    private void requestTestJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_requestTestJButtonActionPerformed
        if (createOrder()) {
            JOptionPane.showMessageDialog(null, "Ordered Placed Successfully");
            OrderIStatusJPanel orderStatusJPanel = new OrderIStatusJPanel(userProcessContainer, ecosystem, customer);
            userProcessContainer.add("OrderStatusJPanel", orderStatusJPanel);
            CardLayout layout = (CardLayout) userProcessContainer.getLayout();
            layout.next(userProcessContainer);
        }

    }//GEN-LAST:event_requestTestJButtonActionPerformed

    private void restaurantComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_restaurantComboBoxActionPerformed
        index = restaurantComboBox.getSelectedIndex();
        //clear of the selected items
        itemsWithQuantityList.clear();
        populateMenu();
        populateItemsWithQuantityTable();
    }//GEN-LAST:event_restaurantComboBoxActionPerformed

    private void totalPriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_totalPriceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_totalPriceActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane cartScrollPane;
    private javax.swing.JLabel enterpriseLabel1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField message;
    private javax.swing.JButton requestTestJButton;
    private javax.swing.JComboBox<String> restaurantComboBox;
    private javax.swing.JTable tblCart;
    private javax.swing.JTable tblOrder;
    private javax.swing.JTextField totalPrice;
    // End of variables declaration//GEN-END:variables
}
