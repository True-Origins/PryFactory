package com.mycompany.pryfactory;

import Interfaz.ClsIFigura;

public class FrmFactory extends javax.swing.JFrame {

    /**
     * Creates new form FrmFactory
     */
    public FrmFactory() {
        initComponents();
        GG();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        cmbFiguras = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtL1 = new javax.swing.JTextField();
        txtL2 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtArea = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtPerimetro = new javax.swing.JTextField();
        txtDetalles = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtL3 = new javax.swing.JTextField();
        btnCalcular = new javax.swing.JButton();
        lblaltura = new javax.swing.JLabel();
        txtL4 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(255, 102, 102));

        cmbFiguras.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        cmbFiguras.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cuadrado", "Rectángulo", "Triángulo", "Círculo", "Octágono" }));
        cmbFiguras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbFigurasActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Lado 1 (Base):");
        jLabel1.setToolTipText("");

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Seleccione figura:");
        jLabel2.setToolTipText("");

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Lado 2 (Altura):");
        jLabel3.setToolTipText("");

        txtL1.setBackground(new java.awt.Color(255, 255, 255));
        txtL1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        txtL1.setForeground(new java.awt.Color(255, 102, 102));

        txtL2.setBackground(new java.awt.Color(255, 255, 255));
        txtL2.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        txtL2.setForeground(new java.awt.Color(255, 102, 102));

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Área:");
        jLabel4.setToolTipText("");

        txtArea.setBackground(new java.awt.Color(255, 255, 255));
        txtArea.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        txtArea.setForeground(new java.awt.Color(255, 102, 102));

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Perímetro:");
        jLabel5.setToolTipText("");

        txtPerimetro.setBackground(new java.awt.Color(255, 255, 255));
        txtPerimetro.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        txtPerimetro.setForeground(new java.awt.Color(255, 102, 102));

        txtDetalles.setBackground(new java.awt.Color(255, 255, 255));
        txtDetalles.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        txtDetalles.setForeground(new java.awt.Color(255, 102, 102));

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Detalles");
        jLabel6.setToolTipText("");

        jLabel7.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Figuras");
        jLabel7.setToolTipText("");

        jLabel8.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Lado 3:");
        jLabel8.setToolTipText("");

        txtL3.setBackground(new java.awt.Color(255, 255, 255));
        txtL3.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        txtL3.setForeground(new java.awt.Color(255, 102, 102));

        btnCalcular.setBackground(new java.awt.Color(255, 255, 255));
        btnCalcular.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnCalcular.setForeground(new java.awt.Color(255, 102, 102));
        btnCalcular.setText("Calcular");
        btnCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcularActionPerformed(evt);
            }
        });

        lblaltura.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblaltura.setForeground(new java.awt.Color(255, 255, 255));
        lblaltura.setText("Lado 4:");
        lblaltura.setToolTipText("");

        txtL4.setBackground(new java.awt.Color(255, 255, 255));
        txtL4.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        txtL4.setForeground(new java.awt.Color(255, 102, 102));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(187, 187, 187)
                .addComponent(jLabel7)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtL2, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtL1, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGap(36, 36, 36)
                            .addComponent(cmbFiguras, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(jLabel1))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(jLabel3))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtL3, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(lblaltura)
                    .addComponent(txtL4, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel6)
                    .addComponent(jLabel4)
                    .addComponent(txtDetalles)
                    .addComponent(jLabel5)
                    .addComponent(txtPerimetro)
                    .addComponent(txtArea, javax.swing.GroupLayout.PREFERRED_SIZE, 533, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnCalcular)
                .addGap(673, 673, 673))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(16, 16, 16)
                    .addComponent(jLabel2)
                    .addContainerGap(675, Short.MAX_VALUE)))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnCalcular)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtArea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtPerimetro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtDetalles, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(76, 76, 76)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(cmbFiguras, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(43, 43, 43)
                                        .addComponent(jLabel1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtL1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel8)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtL3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(txtL2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtL4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(lblaltura)))))
                        .addGap(80, 80, 80)))
                .addContainerGap(25, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(71, 71, 71)
                    .addComponent(jLabel2)
                    .addContainerGap(384, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcularActionPerformed
        if ("Cuadrado".equals(cmbFiguras.getSelectedItem().toString())) {
            ClsIFigura Cuadrado = new ClsFabrica().fabricar(cmbFiguras.getSelectedItem().toString());
            this.txtArea.setText(Cuadrado.Area(Double.parseDouble(txtL1.getText()), Double.parseDouble(txtL1.getText()), Double.parseDouble(txtL1.getText()), Double.parseDouble(txtL1.getText())));
            this.txtPerimetro.setText(Cuadrado.Perimetro(Double.parseDouble(txtL1.getText()), Double.parseDouble(txtL1.getText()), Double.parseDouble(txtL1.getText())));
            txtDetalles.setText(Cuadrado.Descripcion());
        } else if ("Rectángulo".equals(cmbFiguras.getSelectedItem().toString())) {
            ClsIFigura Rect = new ClsFabrica().fabricar(cmbFiguras.getSelectedItem().toString());
            this.txtArea.setText(Rect.Area(Double.parseDouble(txtL1.getText()), Double.parseDouble(txtL2.getText()), Double.parseDouble(txtL1.getText()), Double.parseDouble(txtL1.getText())));
            this.txtPerimetro.setText(Rect.Perimetro(Double.parseDouble(txtL1.getText()), Double.parseDouble(txtL2.getText()), Double.parseDouble(txtL1.getText())));
            txtDetalles.setText(Rect.Descripcion());
        } else if ("Triángulo".equals(cmbFiguras.getSelectedItem().toString())) {
            ClsIFigura Tri = new ClsFabrica().fabricar(cmbFiguras.getSelectedItem().toString());
            this.txtArea.setText(Tri.Area(Double.parseDouble(txtL1.getText()), Double.parseDouble(txtL2.getText()), Double.parseDouble(txtL3.getText()), Double.parseDouble(txtL4.getText())));
            this.txtPerimetro.setText(Tri.Perimetro(Double.parseDouble(txtL1.getText()), Double.parseDouble(txtL2.getText()), Double.parseDouble(txtL3.getText())));
            txtDetalles.setText(Tri.Descripcion());
        } else if ("Círculo".equals(cmbFiguras.getSelectedItem().toString())) {
            ClsIFigura Circ = new ClsFabrica().fabricar(cmbFiguras.getSelectedItem().toString());
            this.txtArea.setText(Circ.Area(Double.parseDouble(txtL1.getText()), Double.parseDouble(txtL1.getText()), Double.parseDouble(txtL1.getText()), Double.parseDouble(txtL1.getText())));
            this.txtPerimetro.setText(Circ.Perimetro(Double.parseDouble(txtL1.getText()), Double.parseDouble(txtL1.getText()), Double.parseDouble(txtL1.getText())));
            txtDetalles.setText(Circ.Descripcion());
        } else if ("Octágono".equals(cmbFiguras.getSelectedItem().toString())) {
            ClsIFigura Octa = new ClsFabrica().fabricar(cmbFiguras.getSelectedItem().toString());
            this.txtArea.setText(Octa.Area(Double.parseDouble(txtL1.getText()), Double.parseDouble(txtL2.getText()), Double.parseDouble(txtL1.getText()), Double.parseDouble(txtL1.getText())));
            this.txtPerimetro.setText(Octa.Perimetro(Double.parseDouble(txtL1.getText()), Double.parseDouble(txtL1.getText()), Double.parseDouble(txtL1.getText())));
            txtDetalles.setText(Octa.Descripcion());
        }
    }//GEN-LAST:event_btnCalcularActionPerformed

    private void cmbFigurasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbFigurasActionPerformed
        GG();
    }//GEN-LAST:event_cmbFigurasActionPerformed

    public void GG() {
        if ("Cuadrado".equals(cmbFiguras.getSelectedItem().toString())) {
            jLabel1.setVisible(true);
            jLabel3.setVisible(false);
            jLabel8.setVisible(false);
            lblaltura.setVisible(false);
            txtL1.setVisible(true);
            txtL2.setVisible(false);
            txtL3.setVisible(false);
            txtL4.setVisible(false);
        } else if ("Rectángulo".equals(cmbFiguras.getSelectedItem().toString())) {
            jLabel1.setVisible(true);
            jLabel3.setVisible(true);
            jLabel8.setVisible(false);
            lblaltura.setVisible(false);
            txtL1.setVisible(true);
            txtL2.setVisible(true);
            txtL3.setVisible(false);
            txtL4.setVisible(false);
        } else if ("Triángulo".equals(cmbFiguras.getSelectedItem().toString())) {
            jLabel1.setText("Lado");
            jLabel3.setText("Lado 2");
            lblaltura.setText("Altura");
            jLabel1.setVisible(true);
            jLabel3.setVisible(true);
            jLabel8.setVisible(true);
            lblaltura.setVisible(true);
            txtL1.setVisible(true);
            txtL2.setVisible(true);
            txtL3.setVisible(true);
            txtL4.setVisible(true);
        } else if ("Círculo".equals(cmbFiguras.getSelectedItem().toString())) {
            jLabel1.setText("Lado");
            jLabel1.setVisible(true);
            jLabel3.setVisible(false);
            jLabel8.setVisible(false);
            lblaltura.setVisible(false);
            txtL1.setVisible(true);
            txtL2.setVisible(false);
            txtL3.setVisible(false);
            txtL4.setVisible(false);
        } else if ("Octágono".equals(cmbFiguras.getSelectedItem().toString())) {
            jLabel1.setText("Lado");
            jLabel3.setText("Apotema");
            jLabel1.setVisible(true);
            jLabel3.setVisible(true);
            jLabel8.setVisible(false);
            lblaltura.setVisible(false);
            txtL1.setVisible(true);
            txtL2.setVisible(true);
            txtL3.setVisible(false);
            txtL4.setVisible(false);
        }
    }

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
            java.util.logging.Logger.getLogger(FrmFactory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmFactory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmFactory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmFactory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmFactory().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCalcular;
    private javax.swing.JComboBox<String> cmbFiguras;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblaltura;
    private javax.swing.JTextField txtArea;
    private javax.swing.JTextField txtDetalles;
    private javax.swing.JTextField txtL1;
    private javax.swing.JTextField txtL2;
    private javax.swing.JTextField txtL3;
    private javax.swing.JTextField txtL4;
    private javax.swing.JTextField txtPerimetro;
    // End of variables declaration//GEN-END:variables
}
