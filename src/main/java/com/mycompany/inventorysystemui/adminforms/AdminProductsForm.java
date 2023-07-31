/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.inventorysystemui.adminforms;

import com.mycompany.inventorysystemui.querymethods.DatabaseConnector;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.awt.Color;
import java.awt.Graphics;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;



/**
 *
 * @author Danica
 */
public class AdminProductsForm extends javax.swing.JFrame {

    /**
     * Creates new form AdminForm
     */
    public AdminProductsForm() {
       
        
        initComponents();
        showDataTableProduct();
        viewChart();     
            
    }
    public void showDataTableProduct(){
        //tO RESET THE TABLE
        productsTable.setModel(new DefaultTableModel(null,new String[]{"ID","PRODUCT","CATEGORY","QUANTITY","PRICE","TOTAL PRICE","USERID"}));
        viewChart();
        try (Connection conn = DatabaseConnector.getConnection()) {
            String sql = "SELECT * FROM public.e_products ORDER BY product_id ASC";
            try (PreparedStatement stmt = conn.prepareStatement(sql);
                ResultSet rs = stmt.executeQuery()) {
                while (rs.next()) {
                    // Process the results
                    String id = String.valueOf(rs.getInt("product_id"));                
                    String product = rs.getString("product_name");
                    String category = rs.getString("product_category");
                    String quantity =  String.valueOf(rs.getString("product_quantity"));
                    String price =  String.valueOf(rs.getString("product_price"));
                    String total =  String.valueOf(rs.getString("total_price"));
                    String userid = String.valueOf(rs.getInt("id"));
                    // Do something with the data
                    String dataProducts[] = {id,product,category,quantity,price,total,userid};
                    DefaultTableModel tblModel = (DefaultTableModel)productsTable.getModel();
                    tblModel.addRow(dataProducts);
                }
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Database connection error: " +
                e.getMessage());
        }
    }
    public void viewChart(){
        int rowCount = productsTable.getRowCount();
        String[] categories = new String[rowCount];

        // Extract categories from the table's third column
        for (int i = 0; i < rowCount; i++) {
            Object categoryObj = productsTable.getValueAt(i, 2);
            if (categoryObj != null) {
                categories[i] = categoryObj.toString();
            } else {
                // Handle null values gracefully (you can choose to skip or add a default category)
                categories[i] = "Unknown Category";
            }
        }

        // Count the occurrences of each category
        Map<String, Integer> categoryCountMap = new HashMap<>();
        for (String category : categories) {
            categoryCountMap.put(category, categoryCountMap.getOrDefault(category, 0) + 1);
        }

        // Define colors for each category (you can add more colors if needed)
        Map<String, Color> categoryColorMap = new HashMap<>();
        categoryColorMap.put("Technology and Electronics", Color.PINK);
        categoryColorMap.put("Sports and Outdoors", Color.RED);
        categoryColorMap.put("Home and Kitchen", Color.GREEN);
        categoryColorMap.put("Fashion and Apparel", Color.BLUE);
        categoryColorMap.put("Health and Beauty", Color.BLACK);
        categoryColorMap.put("Foods and Beverages", Color.YELLOW);

        // Get the Graphics object for the panel
        Graphics g = jPanel4.getGraphics();

        // Clear the panel first
        g.clearRect(0, 0, jPanel4.getWidth(), jPanel4.getHeight());

        // Draw the pie chart
        int totalCategories = categoryCountMap.size();
        double totalRowCount = rowCount; // Convert rowCount to double for accurate division
        double startAngle = 0;
        int x = jPanel4.getWidth() / 2;
        int y = jPanel4.getHeight() / 2;
        int radius = 100;

        for (Map.Entry<String, Integer> entry : categoryCountMap.entrySet()) {
            String category = entry.getKey();
            int count = entry.getValue();

            // Calculate the angle for the current category slice based on occurrences
            double sliceAngle = 360.0 * count / totalRowCount;

            // Get the color for the current category
            Color categoryColor = categoryColorMap.getOrDefault(category, Color.PINK);

            // Draw the slice with the specific color
            g.setColor(categoryColor);
            g.fillArc(x - radius, y - radius, radius * 2, radius * 2, (int) startAngle, (int) sliceAngle);

            // Calculate the middle angle of the slice
            double middleAngle = startAngle + sliceAngle / 2;

            // Calculate the position to draw the label inside the slice
            int labelX = x + (int) (1.2 * radius * Math.cos(Math.toRadians(middleAngle)));
            int labelY = y + (int) (1.2 * radius * Math.sin(Math.toRadians(middleAngle)));

            // Draw the label at the calculated position
           // g.setColor(Color.BLACK); // You can change the color for the label text
           // g.drawString(category, labelX, labelY);

            // Update the starting angle for the next slice
            startAngle += sliceAngle;
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

        jMenuItem1 = new javax.swing.JMenuItem();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jPanel5 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        productsTable = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        lblUserAcc = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        jPanel11 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        lblFoods = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        lblFashion = new javax.swing.JLabel();
        lblHealthy = new javax.swing.JLabel();
        lblChart = new javax.swing.JLabel();
        jPanel12 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtUserId = new javax.swing.JTextField();
        jPanel13 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        txtProduct = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtCategory = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtQuantity = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtPrice = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtTotalPrice = new javax.swing.JTextField();
        jPanel14 = new javax.swing.JPanel();
        btnDelete = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        jPanel15 = new javax.swing.JPanel();
        txtSearch = new javax.swing.JTextField();
        btnSearch = new javax.swing.JButton();
        btnRefresh = new javax.swing.JButton();
        btnChart = new javax.swing.JButton();

        jMenuItem1.setText("jMenuItem1");

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable2);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));
        jPanel1.setForeground(new java.awt.Color(0, 255, 204));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(0, 204, 255));

        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("PRODUCTS INVENTORY");

        btnBack.setIcon(new javax.swing.ImageIcon("C:\\Mel\\backIcon.jpg")); // NOI18N
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(btnBack)
                .addGap(280, 280, 280)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 1060, -1));

        productsTable.setAutoCreateRowSorter(true);
        productsTable.setBackground(new java.awt.Color(153, 204, 255));
        productsTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "PRODUCT ", "CATEGORY", "QUANTITY", "PRICE", "TOTAL PRICE", "USERID"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        productsTable.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        productsTable.setRowHeight(30);
        productsTable.getTableHeader().setReorderingAllowed(false);
        productsTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                productsTableMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(productsTable);

        jPanel1.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 60, 700, 210));

        jPanel3.setBackground(new java.awt.Color(0, 204, 255));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 47, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 1120, 820, -1));

        lblUserAcc.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.add(lblUserAcc, new org.netbeans.lib.awtextra.AbsoluteConstraints(329, 58, 186, 22));

        jButton2.setBackground(new java.awt.Color(0, 204, 255));
        jButton2.setIcon(new javax.swing.ImageIcon("C:\\Mel\\refreshIcon.png")); // NOI18N
        jButton2.setBorderPainted(false);
        jButton2.setContentAreaFilled(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 180, 74, 68));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 478, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 248, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 310, 480, 250));

        jPanel6.setBackground(new java.awt.Color(255, 204, 204));

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 45, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 280, -1, 30));

        jPanel7.setBackground(new java.awt.Color(255, 0, 51));

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 45, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 420, -1, 30));

        jPanel8.setBackground(new java.awt.Color(0, 255, 153));

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 45, Short.MAX_VALUE)
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 470, -1, 30));

        jPanel9.setBackground(new java.awt.Color(0, 51, 255));

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 45, Short.MAX_VALUE)
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 320, -1, 30));

        jPanel10.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 45, Short.MAX_VALUE)
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 370, -1, 30));

        jPanel11.setBackground(new java.awt.Color(255, 255, 0));

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 45, Short.MAX_VALUE)
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 520, -1, 30));

        jLabel3.setText("Sports and Outdoors");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 420, 120, 33));

        jLabel10.setText("Technology and Electronics");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 280, 158, 33));

        lblFoods.setText("Foods and Beverages");
        jPanel1.add(lblFoods, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 520, 164, 33));

        jLabel12.setText("Home and Kitchen");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 470, 110, 33));

        lblFashion.setText("Fashion and Apparel");
        jPanel1.add(lblFashion, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 320, 140, 33));

        lblHealthy.setText("Health and Beauty");
        jPanel1.add(lblHealthy, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 360, 120, 33));

        lblChart.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblChart.setText("Distribution of 6 Categories under 6 major groups");
        jPanel1.add(lblChart, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 280, 287, 35));

        jPanel12.setBackground(new java.awt.Color(204, 204, 255));
        jPanel12.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("Id:");

        txtId.setEditable(false);

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel9.setText("UserId: ");

        txtUserId.setEditable(false);

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel9)
                .addGap(33, 33, 33)
                .addComponent(txtUserId, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel9)
                        .addComponent(txtUserId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(10, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 260, 40));

        jPanel13.setBackground(new java.awt.Color(204, 204, 255));
        jPanel13.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel6.setText("Product:");

        txtProduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtProductActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel7.setText("Category:");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setText("Quantity:");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setText("Price");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel8.setText("Total Price:");

        txtTotalPrice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTotalPriceActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(29, 29, 29)
                        .addComponent(txtProduct, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(21, 21, 21)
                        .addComponent(txtCategory, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(23, 23, 23)
                        .addComponent(txtQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(51, 51, 51)
                        .addComponent(txtPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addGap(14, 14, 14)
                        .addComponent(txtTotalPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel13Layout.createSequentialGroup()
                .addContainerGap(24, Short.MAX_VALUE)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(txtProduct, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(txtCategory, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(txtQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(txtPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(txtTotalPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22))
        );

        jPanel1.add(jPanel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 260, 230));

        jPanel14.setBackground(new java.awt.Color(204, 204, 255));
        jPanel14.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        btnDelete.setBackground(new java.awt.Color(0, 204, 255));
        btnDelete.setText("REMOVE");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnUpdate.setBackground(new java.awt.Color(0, 204, 255));
        btnUpdate.setText("UPDATE");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(48, Short.MAX_VALUE))
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnDelete)
                    .addComponent(btnUpdate))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 340, 260, 60));

        jPanel15.setBackground(new java.awt.Color(204, 204, 255));
        jPanel15.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txtSearch.setEditable(false);
        txtSearch.setBackground(new java.awt.Color(255, 255, 255));
        txtSearch.setBorder(null);

        btnSearch.setBackground(new java.awt.Color(0, 204, 255));
        btnSearch.setText("SEARCH");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        btnRefresh.setBackground(new java.awt.Color(0, 204, 255));
        btnRefresh.setText("REFRESH");
        btnRefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRefreshActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel15Layout.createSequentialGroup()
                        .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(22, 22, 22)
                        .addComponent(btnRefresh, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(33, Short.MAX_VALUE))
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnSearch)
                    .addComponent(btnRefresh))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 410, 260, 120));

        btnChart.setBackground(new java.awt.Color(0, 204, 255));
        btnChart.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnChart.setText("Chart");
        btnChart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChartActionPerformed(evt);
            }
        });
        jPanel1.add(btnChart, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 570, 88, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 12, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1062, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 624, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 6, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void productsTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_productsTableMouseClicked
        
        DefaultTableModel model = (DefaultTableModel)productsTable.getModel();
        int selectRow = productsTable.getSelectedRow();
        txtId.setText(model.getValueAt(selectRow, 0).toString());
       // txtCustomer.setText(model.getValueAt(selectRow, 1).toString());
       
        txtProduct.setText(model.getValueAt(selectRow, 1).toString());
        txtCategory.setText(model.getValueAt(selectRow, 2).toString());
        txtQuantity.setText(model.getValueAt(selectRow, 3).toString());
        txtPrice.setText(model.getValueAt(selectRow, 4).toString());
        txtTotalPrice.setText(model.getValueAt(selectRow, 5).toString());
        txtSearch.setText(model.getValueAt(selectRow, 6).toString());
        txtUserId.setText(model.getValueAt(selectRow, 6).toString());
    }//GEN-LAST:event_productsTableMouseClicked

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
       
        String sql ="delete FROM e_products WHERE product_name =? ";
        try(Connection conn = DatabaseConnector.getConnection()){
           PreparedStatement pstdelete = conn.prepareStatement(sql);
           pstdelete.setString(1,txtProduct.getText());
           pstdelete.execute();
           
           JOptionPane.showMessageDialog(null,"Deleted Successfully!");
           txtId.setText("");
           txtProduct.setText("");
           txtCategory.setText("");
           txtQuantity.setText("");
           txtPrice.setText("");
           txtTotalPrice.setText("");
           txtUserId.setText("");
            productsTable.setModel(new DefaultTableModel(null,new String[]{"PRODUCTS ID","CUSTOMER","PRODUCT","CATEGORY","QUANTIY","PRICE","TOTAL PRICE"}));
            showDataTableProduct();
        }catch(Exception e){
           
            JOptionPane.showMessageDialog(null,e);
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        String id = txtId.getText();    
        String product = txtProduct.getText();
        String category = txtCategory.getText();
        String quantity = txtQuantity.getText();
        String price = txtPrice.getText();
        String total = txtTotalPrice.getText();
        String userid = txtUserId.getText();
        String sql ="update e_products set product_name = '"+product+"',product_category = '"+category+"',product_quantity = '"+quantity+"',product_price = '"+price+"',total_price = '"+total+"',id = '"+userid+"' where product_id = '"+id+"'";
        try(Connection conn = DatabaseConnector.getConnection()){
           PreparedStatement pstUpdate = conn.prepareStatement(sql);       
           pstUpdate.execute();
           
           JOptionPane.showMessageDialog(null,"Updated Successfully!");
           productsTable.setModel(new DefaultTableModel(null,new String[]{"PRODUCTS ID","PRODUCT","CATEGORY","QUANTIY","PRICE","TOTAL PRICE","USERID"}));
           showDataTableProduct();
                
        }catch(Exception e){
           
           
            JOptionPane.showMessageDialog(null,e);
        }
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed

        new AdminFormFront().setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        // TODO add your handling code here:
        btnChart.setEnabled(true);
        btnChart.setVisible(true);
        lblUserAcc.setForeground(Color.BLACK);
        lblUserAcc.setBackground(Color.BLACK);
        productsTable.setModel(new DefaultTableModel(null,new String[]{"PRODUCTS ID","CUSTOMER","PRODUCT","CATEGORY","QUANTIY","PRICE","TOTAL PRICE"}));
        searchTable();
        
    }//GEN-LAST:event_btnSearchActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        txtId.setText("");
        txtProduct.setText("");
        txtCategory.setText("");
        txtQuantity.setText("");
        txtPrice.setText("");
        txtTotalPrice.setText("");
        txtSearch.setText("");
        productsTable.setModel(new DefaultTableModel(null,new String[]{"PRODUCTS ID","CUSTOMER","PRODUCT","CATEGORY","QUANTIY","PRICE","TOTAL PRICE"}));
        showDataTableProduct();
        lblUserAcc.setText("");
    }//GEN-LAST:event_jButton2ActionPerformed

    private void txtTotalPriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTotalPriceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTotalPriceActionPerformed

    private void btnChartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChartActionPerformed
        
        
        //jPanel4.setBackground(Color.CYAN)
//        btnChart.setEnabled(false);
//        btnChart.setVisible(false);
        int rowCount = productsTable.getRowCount();
        String[] categories = new String[rowCount];

        // Extract categories from the table's third column
        for (int i = 0; i < rowCount; i++) {
            Object categoryObj = productsTable.getValueAt(i, 2);
            if (categoryObj != null) {
                categories[i] = categoryObj.toString();
            } else {
                // Handle null values gracefully (you can choose to skip or add a default category)
                categories[i] = "Unknown Category";
            }
        }

        // Count the occurrences of each category
        Map<String, Integer> categoryCountMap = new HashMap<>();
        for (String category : categories) {
            categoryCountMap.put(category, categoryCountMap.getOrDefault(category, 0) + 1);
        }

        // Define colors for each category (you can add more colors if needed)
        Map<String, Color> categoryColorMap = new HashMap<>();
        categoryColorMap.put("Technology and Electronics", Color.PINK);
        categoryColorMap.put("Sports and Outdoors", Color.RED);
        categoryColorMap.put("Home and Kitchen", Color.GREEN);
        categoryColorMap.put("Fashion and Apparel", Color.BLUE);
        categoryColorMap.put("Health and Beauty", Color.BLACK);
        categoryColorMap.put("Foods and Beverages", Color.YELLOW);

        // Get the Graphics object for the panel
        Graphics g = jPanel4.getGraphics();
        
        // Clear the panel first
        g.clearRect(0, 0, jPanel4.getWidth(), jPanel4.getHeight());
        jPanel4.setBackground(Color.white);
        // Draw the pie chart
        int totalCategories = categoryCountMap.size();
        double totalRowCount = rowCount; // Convert rowCount to double for accurate division
        double startAngle = 0;
        int x = jPanel4.getWidth() / 2;
        int y = jPanel4.getHeight() / 2;
        int radius = 100;

        for (Map.Entry<String, Integer> entry : categoryCountMap.entrySet()) {
            String category = entry.getKey();
            int count = entry.getValue();

            // Calculate the angle for the current category slice based on occurrences
            double sliceAngle = 360.0 * count / totalRowCount;

            // Get the color for the current category
            Color categoryColor = categoryColorMap.getOrDefault(category, Color.PINK);

            // Draw the slice with the specific color
            g.setColor(categoryColor);
            g.fillArc(x - radius, y - radius, radius * 2, radius * 2, (int) startAngle, (int) sliceAngle);

            // Calculate the middle angle of the slice
            double middleAngle = startAngle + sliceAngle / 2;

            // Calculate the position to draw the label inside the slice
            int labelX = x + (int) (1.2 * radius * Math.cos(Math.toRadians(middleAngle)));
            int labelY = y + (int) (1.2 * radius * Math.sin(Math.toRadians(middleAngle)));

           
           lblChart.setText("Distribution of 6 Categories under 6 major groups");
            // Update the starting angle for the next slice
            
            startAngle += sliceAngle;
        }



    }//GEN-LAST:event_btnChartActionPerformed

    private void txtProductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtProductActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtProductActionPerformed

    private void btnRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefreshActionPerformed
        // TODO add your handling code here:
        jPanel4.setBackground(Color.white);
        showDataTableProduct();
        txtId.setText("");
        txtProduct.setText("");
        txtCategory.setText("");
        txtQuantity.setText("");
        txtPrice.setText("");
        txtTotalPrice.setText("");
        txtUserId.setText("");
        txtSearch.setText("");
        btnDelete.setVisible(true);
        btnChart.setVisible(true);
        btnUpdate.setVisible(true);
        btnSearch.setVisible(true);
        
        
    }//GEN-LAST:event_btnRefreshActionPerformed

    /**
     * @param args the command line arguments
     */
    public void searchTable(){
        
        String useracc = txtSearch.getText();
        String userid = txtSearch.getText();
        lblUserAcc.setText("Customer ID: "+ useracc);
    //    lblUserAcc.setText("Customer Name: "+ useracc);
        lblUserAcc.setForeground(Color.BLACK);
        lblUserAcc.setBackground(Color.BLACK);

            try (Connection conn = DatabaseConnector.getConnection()) {
                String sql = "SELECT * FROM public.e_products where id='"+userid+"' ";
                PreparedStatement stmt = conn.prepareStatement(sql);

               // stmt.setString(1, useracc);
                   ResultSet rs = stmt.executeQuery();
                    while (rs.next()) {

                        String id = String.valueOf(rs.getInt("product_id"));
                     //   String customer = rs.getString("user_acc");
                        String product = rs.getString("product_name");
                        String category = rs.getString("product_category");
                        String quantity =  String.valueOf(rs.getString("product_quantity"));
                        String price =  String.valueOf(rs.getString("product_price"));
                        String total =  String.valueOf(rs.getString("total_price"));
                        String userid1 = String.valueOf(rs.getInt("id"));
                        // Do something with the data
                        String acoountsData[] = {id,product,category,quantity,price,total,userid1};
                        DefaultTableModel tblModel = (DefaultTableModel)productsTable.getModel();
                        tblModel.addRow(acoountsData);

                }
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "Database connection error: " +
                    e.getMessage());
            }
//    }public void viewChart(){
//        int rowCount = productsTable.getRowCount();
//        String[] categories = new String[rowCount];
//
//        // Extract categories from the table's third column
//        for (int i = 0; i < rowCount; i++) {
//            Object categoryObj = productsTable.getValueAt(i, 2);
//            if (categoryObj != null) {
//                categories[i] = categoryObj.toString();
//            } else {
//                // Handle null values gracefully (you can choose to skip or add a default category)
//                categories[i] = "Unknown Category";
//            }
//        }
//
//        // Count the occurrences of each category
//        Map<String, Integer> categoryCountMap = new HashMap<>();
//        for (String category : categories) {
//            categoryCountMap.put(category, categoryCountMap.getOrDefault(category, 0) + 1);
//        }
//
//        // Define colors for each category (you can add more colors if needed)
//        Map<String, Color> categoryColorMap = new HashMap<>();
//        categoryColorMap.put("Technology and Electronics", Color.PINK);
//        categoryColorMap.put("Sports and Outdoors", Color.RED);
//        categoryColorMap.put("Home and Kitchen", Color.GREEN);
//        categoryColorMap.put("Fashion and Apparel", Color.BLUE);
//        categoryColorMap.put("Health and Beauty", Color.BLACK);
//        categoryColorMap.put("Foods and Beverages", Color.YELLOW);
//
//        // Get the Graphics object for the panel
//        Graphics g = jPanel4.getGraphics();
//
//        // Clear the panel first
//        g.clearRect(0, 0, jPanel4.getWidth(), jPanel4.getHeight());
//
//        // Draw the pie chart
//        int totalCategories = categoryCountMap.size();
//        double totalRowCount = rowCount; // Convert rowCount to double for accurate division
//        double startAngle = 0;
//        int x = jPanel4.getWidth() / 2;
//        int y = jPanel4.getHeight() / 2;
//        int radius = 100;
//
//        for (Map.Entry<String, Integer> entry : categoryCountMap.entrySet()) {
//            String category = entry.getKey();
//            int count = entry.getValue();
//
//            // Calculate the angle for the current category slice based on occurrences
//            double sliceAngle = 360.0 * count / totalRowCount;
//
//            // Get the color for the current category
//            Color categoryColor = categoryColorMap.getOrDefault(category, Color.PINK);
//
//            // Draw the slice with the specific color
//            g.setColor(categoryColor);
//            g.fillArc(x - radius, y - radius, radius * 2, radius * 2, (int) startAngle, (int) sliceAngle);
//
//            // Calculate the middle angle of the slice
//            double middleAngle = startAngle + sliceAngle / 2;
//
//            // Calculate the position to draw the label inside the slice
//            int labelX = x + (int) (1.2 * radius * Math.cos(Math.toRadians(middleAngle)));
//            int labelY = y + (int) (1.2 * radius * Math.sin(Math.toRadians(middleAngle)));
//
//            // Draw the label at the calculated position
//           // g.setColor(Color.BLACK); // You can change the color for the label text
//           // g.drawString(category, labelX, labelY);
//
//            // Update the starting angle for the next slice
//            startAngle += sliceAngle;
//        }   
}
    public static void main(String args[]) {
      

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
            new AdminProductsForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnChart;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnRefresh;
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable2;
    private javax.swing.JLabel lblChart;
    private javax.swing.JLabel lblFashion;
    private javax.swing.JLabel lblFoods;
    private javax.swing.JLabel lblHealthy;
    private javax.swing.JLabel lblUserAcc;
    private javax.swing.JTable productsTable;
    private javax.swing.JTextField txtCategory;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtPrice;
    private javax.swing.JTextField txtProduct;
    private javax.swing.JTextField txtQuantity;
    private javax.swing.JTextField txtSearch;
    private javax.swing.JTextField txtTotalPrice;
    private javax.swing.JTextField txtUserId;
    // End of variables declaration//GEN-END:variables
}
