
import javax.swing.*;
import java.awt.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class Inventoryform extends javax.swing.JFrame {

    /**
     * Creates new form HomeJFrame
     */
    public Inventoryform() {
        initComponents();
         try {
            
           Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
           Connection connection = DriverManager.getConnection(
                    "jdbc:sqlserver://localhost:1433;databaseName=Projectdatabase;selectMethod=cursor", "sa", "123456");
           
            System.out.println("sdfsdfsdfs");
            Statement statement = connection.createStatement();
            ResultSet r=statement.executeQuery("select productid,productname,suppliername,categoryname,originalprice,stock from ProductInventory");
            Inventorytable.setModel(DbUtils.resultSetToTableModel(r));
            
        } catch (Exception e) {
            
            
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

        bg = new javax.swing.JPanel();
        sidePane = new javax.swing.JPanel();
        inventoryBtn = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        saleBtn = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        dashboardBtn = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        categoryBtn = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        supplierBtn = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        productBtn = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        customerBtn = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        paymentBtn = new javax.swing.JPanel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        closeBtn = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        updateBtn = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        addBtn = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Inventorytable = new javax.swing.JTable();
        inventoryToProductBtn = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAlwaysOnTop(true);
        setUndecorated(true);
        setResizable(false);

        bg.setBackground(new java.awt.Color(255, 255, 255));
        bg.setPreferredSize(new java.awt.Dimension(1366, 728));
        bg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        sidePane.setBackground(new java.awt.Color(54, 33, 89));
        sidePane.setPreferredSize(new java.awt.Dimension(250, 728));
        sidePane.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                sidePaneMouseDragged(evt);
            }
        });
        sidePane.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        inventoryBtn.setBackground(new java.awt.Color(85, 85, 118));
        inventoryBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                inventoryBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                inventoryBtnMouseExited(evt);
            }
        });
        inventoryBtn.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icons8_in_inventory_15px.png"))); // NOI18N
        inventoryBtn.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 30, 42));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 204, 204));
        jLabel2.setText("Product Inventory");
        inventoryBtn.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 11, 134, -1));

        sidePane.add(inventoryBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 320, 250, -1));

        saleBtn.setBackground(new java.awt.Color(64, 43, 100));
        saleBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                saleBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                saleBtnMouseExited(evt);
            }
        });
        saleBtn.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icons8_land_sales_filled_15px.png"))); // NOI18N
        saleBtn.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 30, 42));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 204, 204));
        jLabel4.setText("Sales");
        saleBtn.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 11, 134, -1));

        sidePane.add(saleBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 280, 250, -1));

        dashboardBtn.setBackground(new java.awt.Color(64, 43, 100));
        dashboardBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dashboardBtnMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                dashboardBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                dashboardBtnMouseExited(evt);
            }
        });
        dashboardBtn.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icons8_dashboard_15px.png"))); // NOI18N
        dashboardBtn.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 30, 42));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(204, 204, 204));
        jLabel6.setText("Dashboard");
        dashboardBtn.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 11, 134, -1));

        sidePane.add(dashboardBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 250, -1));

        categoryBtn.setBackground(new java.awt.Color(64, 43, 100));
        categoryBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                categoryBtnMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                categoryBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                categoryBtnMouseExited(evt);
            }
        });
        categoryBtn.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icons8_dashboard_15px_1.png"))); // NOI18N
        categoryBtn.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 30, 42));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(204, 204, 204));
        jLabel8.setText("Category");
        categoryBtn.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 11, 134, -1));

        sidePane.add(categoryBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 250, -1));

        supplierBtn.setBackground(new java.awt.Color(64, 43, 100));
        supplierBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                supplierBtnMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                supplierBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                supplierBtnMouseExited(evt);
            }
        });
        supplierBtn.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icons8_supplier_15px.png"))); // NOI18N
        supplierBtn.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 30, 42));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(204, 204, 204));
        jLabel10.setText("Suppliers");
        supplierBtn.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 11, 134, -1));

        sidePane.add(supplierBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 160, 250, -1));

        productBtn.setBackground(new java.awt.Color(64, 43, 100));
        productBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                productBtnMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                productBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                productBtnMouseExited(evt);
            }
        });
        productBtn.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icons8_box_15px_1.png"))); // NOI18N
        productBtn.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 30, 42));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(204, 204, 204));
        jLabel12.setText("Products");
        productBtn.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 11, 134, -1));

        sidePane.add(productBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 200, 250, -1));

        customerBtn.setBackground(new java.awt.Color(64, 43, 100));
        customerBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                customerBtnMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                customerBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                customerBtnMouseExited(evt);
            }
        });
        customerBtn.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icons8_crowd_filled_15px.png"))); // NOI18N
        customerBtn.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 30, 42));

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(204, 204, 204));
        jLabel14.setText("Customers");
        customerBtn.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 11, 134, -1));

        sidePane.add(customerBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 240, 250, -1));

        jLabel17.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(204, 204, 204));
        jLabel17.setText("Retail Management");
        sidePane.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, -1));
        sidePane.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 220, 10));

        paymentBtn.setBackground(new java.awt.Color(64, 43, 100));
        paymentBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                paymentBtnMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                paymentBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                paymentBtnMouseExited(evt);
            }
        });
        paymentBtn.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel32.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icons8_in_inventory_15px.png"))); // NOI18N
        paymentBtn.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 30, 42));

        jLabel33.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel33.setForeground(new java.awt.Color(204, 204, 204));
        jLabel33.setText("Payment");
        paymentBtn.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 11, 134, -1));

        sidePane.add(paymentBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 360, 250, -1));

        bg.add(sidePane, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 250, -1));

        jPanel1.setBackground(new java.awt.Color(122, 72, 221));

        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(204, 204, 204));
        jLabel15.setText("Product Inventory");

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icons8_in_inventory_50px.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(jLabel16)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel15)
                .addContainerGap(760, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel15)
                .addContainerGap(25, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        bg.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 30, 1180, 100));

        closeBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icons8_close_window_25px.png"))); // NOI18N
        closeBtn.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        closeBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                closeBtnMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                closeBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                closeBtnMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                closeBtnMousePressed(evt);
            }
        });
        bg.add(closeBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(1340, 0, 60, 30));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        updateBtn.setBackground(new java.awt.Color(64, 43, 100));
        updateBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                updateBtnMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                updateBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                updateBtnMouseExited(evt);
            }
        });

        jLabel19.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(204, 204, 204));
        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel19.setText("Update");

        javax.swing.GroupLayout updateBtnLayout = new javax.swing.GroupLayout(updateBtn);
        updateBtn.setLayout(updateBtnLayout);
        updateBtnLayout.setHorizontalGroup(
            updateBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel19, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
        );
        updateBtnLayout.setVerticalGroup(
            updateBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(updateBtnLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel19)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.add(updateBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 0, 110, -1));

        addBtn.setBackground(new java.awt.Color(64, 43, 100));
        addBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addBtnMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                addBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                addBtnMouseExited(evt);
            }
        });

        jLabel20.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(204, 204, 204));
        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel20.setText("Add");

        javax.swing.GroupLayout addBtnLayout = new javax.swing.GroupLayout(addBtn);
        addBtn.setLayout(addBtnLayout);
        addBtnLayout.setHorizontalGroup(
            addBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel20, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
        );
        addBtnLayout.setVerticalGroup(
            addBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addBtnLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel20)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.add(addBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 0, 110, -1));

        Inventorytable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Product Id", "Product Name", "Supplier Name", "Category ", "Original price", "Stock"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, true, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(Inventorytable);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 610, -1));

        inventoryToProductBtn.setBackground(new java.awt.Color(64, 43, 100));
        inventoryToProductBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                inventoryToProductBtnMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                inventoryToProductBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                inventoryToProductBtnMouseExited(evt);
            }
        });

        jLabel21.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(204, 204, 204));
        jLabel21.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel21.setText("Supply To Shop");

        javax.swing.GroupLayout inventoryToProductBtnLayout = new javax.swing.GroupLayout(inventoryToProductBtn);
        inventoryToProductBtn.setLayout(inventoryToProductBtnLayout);
        inventoryToProductBtnLayout.setHorizontalGroup(
            inventoryToProductBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel21, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
        );
        inventoryToProductBtnLayout.setVerticalGroup(
            inventoryToProductBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(inventoryToProductBtnLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel21)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.add(inventoryToProductBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 0, -1, -1));

        bg.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 210, 610, 490));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(bg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void closeBtnMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeBtnMousePressed
        // TODO add your handling code here:

    }//GEN-LAST:event_closeBtnMousePressed

    private void closeBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeBtnMouseExited
        // TODO add your handling code here:
        closeBtn.setIcon(new ImageIcon("E:\\UVA\\RetailApplication\\src\\image\\icons8_close_window_25px.png"));
    }//GEN-LAST:event_closeBtnMouseExited

    private void closeBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeBtnMouseEntered
        // TODO add your handling code here:
        closeBtn.setIcon(new ImageIcon("E:\\UVA\\RetailApplication\\src\\image\\icons8_close_window_25px_1.png"));

    }//GEN-LAST:event_closeBtnMouseEntered

    private void closeBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeBtnMouseClicked
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_closeBtnMouseClicked

    private void sidePaneMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sidePaneMouseDragged
        // TODO add your handling code here:
    }//GEN-LAST:event_sidePaneMouseDragged

    private void customerBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_customerBtnMouseExited
        // TODO add your handling code here:
        resetBackgroundBtn(customerBtn);
    }//GEN-LAST:event_customerBtnMouseExited

    private void customerBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_customerBtnMouseEntered
        // TODO add your handling code here:
        setBackgroundBtn(customerBtn);
    }//GEN-LAST:event_customerBtnMouseEntered

    private void productBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_productBtnMouseExited
        // TODO add your handling code here:
        resetBackgroundBtn(productBtn);
    }//GEN-LAST:event_productBtnMouseExited

    private void productBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_productBtnMouseEntered
        // TODO add your handling code here:
        setBackgroundBtn(productBtn);
    }//GEN-LAST:event_productBtnMouseEntered

    private void supplierBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_supplierBtnMouseExited
        resetBackgroundBtn(supplierBtn);
    }//GEN-LAST:event_supplierBtnMouseExited

    private void supplierBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_supplierBtnMouseEntered
        setBackgroundBtn(supplierBtn);
    }//GEN-LAST:event_supplierBtnMouseEntered

    private void categoryBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_categoryBtnMouseExited
        // TODO add your handling code here:
        resetBackgroundBtn(categoryBtn);
    }//GEN-LAST:event_categoryBtnMouseExited

    private void categoryBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_categoryBtnMouseEntered
        // TODO add your handling code here:
        setBackgroundBtn(categoryBtn);
    }//GEN-LAST:event_categoryBtnMouseEntered

    private void categoryBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_categoryBtnMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_categoryBtnMouseClicked

    private void dashboardBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dashboardBtnMouseExited
        // TODO add your handling code here:
        resetBackgroundBtn(dashboardBtn);
    }//GEN-LAST:event_dashboardBtnMouseExited

    private void dashboardBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dashboardBtnMouseEntered
        // TODO add your handling code here:
        setBackgroundBtn(dashboardBtn);
    }//GEN-LAST:event_dashboardBtnMouseEntered

    private void saleBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_saleBtnMouseExited
        // TODO add your handling code here:
        resetBackgroundBtn(saleBtn);
    }//GEN-LAST:event_saleBtnMouseExited

    private void saleBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_saleBtnMouseEntered
        // TODO add your handling code here:
        setBackgroundBtn(saleBtn);
    }//GEN-LAST:event_saleBtnMouseEntered

    private void inventoryBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_inventoryBtnMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_inventoryBtnMouseExited

    private void inventoryBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_inventoryBtnMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_inventoryBtnMouseEntered

    private void addBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addBtnMouseClicked
        Insertproduct add=new Insertproduct();
        add.setSize(1366,728);
        dispose();
        add.setVisible(true);
    }//GEN-LAST:event_addBtnMouseClicked

    private void addBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addBtnMouseEntered
        setBackgroundBtn(addBtn);
    }//GEN-LAST:event_addBtnMouseEntered

    private void addBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addBtnMouseExited
        // TODO add your handling code here:
        resetBackgroundBtn(addBtn);
    }//GEN-LAST:event_addBtnMouseExited

    private void dashboardBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dashboardBtnMouseClicked
        // TODO add your handling code here:
        HomeJFrame f=new HomeJFrame();
        f.setSize(1366,728);
        dispose();
        f.setVisible(true);
    }//GEN-LAST:event_dashboardBtnMouseClicked

    private void supplierBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_supplierBtnMouseClicked
        Supplier f=new Supplier();
        f.setSize(1366,728);
        dispose();
        f.setVisible(true);
    }//GEN-LAST:event_supplierBtnMouseClicked

    private void inventoryToProductBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_inventoryToProductBtnMouseClicked
        // TODO add your handling code here:
        DefaultTableModel model=(DefaultTableModel)Inventorytable.getModel();
        int selectedrow=Inventorytable.getSelectedRow();
        String p = model.getValueAt(selectedrow,0).toString();
        int pid=Integer.parseInt(p);
        product f=new product(pid);
        f.setSize(1366,728);
        dispose();
        f.setVisible(true);
    }//GEN-LAST:event_inventoryToProductBtnMouseClicked

    private void inventoryToProductBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_inventoryToProductBtnMouseEntered
        // TODO add your handling code here:
        setBackgroundBtn(inventoryToProductBtn);
    }//GEN-LAST:event_inventoryToProductBtnMouseEntered

    private void inventoryToProductBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_inventoryToProductBtnMouseExited
        // TODO add your handling code here:
        resetBackgroundBtn(inventoryToProductBtn);
    }//GEN-LAST:event_inventoryToProductBtnMouseExited

    private void paymentBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_paymentBtnMouseClicked
        // TODO add your handling code here:
        payment f=new payment();
        f.setSize(1366,728);
        dispose();
        f.setVisible(true);
    }//GEN-LAST:event_paymentBtnMouseClicked

    private void paymentBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_paymentBtnMouseEntered
        // TODO add your handling code here:
        setBackgroundBtn(paymentBtn);
    }//GEN-LAST:event_paymentBtnMouseEntered

    private void paymentBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_paymentBtnMouseExited
        // TODO add your handling code here:
        resetBackgroundBtn(paymentBtn);
    }//GEN-LAST:event_paymentBtnMouseExited

    private void customerBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_customerBtnMouseClicked
        // TODO add your handling code here:
        customer f=new customer();
        f.setSize(1366,728);
        dispose();
        f.setVisible(true);
    }//GEN-LAST:event_customerBtnMouseClicked

    private void productBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_productBtnMouseClicked
        // TODO add your handling code here:
        product f=new product(0);
        f.setSize(1366,728);
        dispose();
        f.setVisible(true);
    }//GEN-LAST:event_productBtnMouseClicked

    private void updateBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updateBtnMouseExited
        // TODO add your handling code here:
        resetBackgroundBtn(updateBtn);
    }//GEN-LAST:event_updateBtnMouseExited

    private void updateBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updateBtnMouseEntered
        // TODO add your handling code here:
        setBackgroundBtn(updateBtn);
    }//GEN-LAST:event_updateBtnMouseEntered

    private void updateBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updateBtnMouseClicked

    }//GEN-LAST:event_updateBtnMouseClicked
    public void resetBackgroundBtn(JPanel p){
       p.setBackground(new Color(64,43,100));
    }
    public void setBackgroundBtn(JPanel p){
        p.setBackground(new Color(85,85,118));
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(HomeJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HomeJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HomeJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HomeJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Inventoryform().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Inventorytable;
    private javax.swing.JPanel addBtn;
    private javax.swing.JPanel bg;
    private javax.swing.JPanel categoryBtn;
    private javax.swing.JLabel closeBtn;
    private javax.swing.JPanel customerBtn;
    private javax.swing.JPanel dashboardBtn;
    private javax.swing.JPanel inventoryBtn;
    private javax.swing.JPanel inventoryToProductBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JPanel paymentBtn;
    private javax.swing.JPanel productBtn;
    private javax.swing.JPanel saleBtn;
    private javax.swing.JPanel sidePane;
    private javax.swing.JPanel supplierBtn;
    private javax.swing.JPanel updateBtn;
    // End of variables declaration//GEN-END:variables
}
