package MOVIMIENTOS;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DE_TRANSACCIONES11 extends javax.swing.JFrame {

    public DE_TRANSACCIONES11() {
        initComponents();
        txtFecha.setText(fecha());
        txtFecha.setEditable(false);
        PanelCabezera.requestFocusInWindow();
        this.setTitle("Movimiento de Transacciones");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelPrincipal = new javax.swing.JPanel();
        PanelCabezera = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        CbTipoDoc = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        txtFecha = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtNdocumento = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtDescripcion = new javax.swing.JTextField();
        txtMonto = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtDebito = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtDescripcionC = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtNcuenta = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtCredito = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtComentario = new javax.swing.JTextField();
        BtnAgregar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TablaRegistros = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        PanelPrincipal.setBackground(new java.awt.Color(255, 255, 255));
        PanelPrincipal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        PanelCabezera.setBackground(new java.awt.Color(255, 255, 255));
        PanelCabezera.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel2.setText("FECHA");
        PanelCabezera.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 10, 50, 30));

        CbTipoDoc.setBackground(new java.awt.Color(237, 237, 237));
        CbTipoDoc.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        CbTipoDoc.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "COMPROVANTE DE PAGO", "COMPROVANTE DE DEVOLUCION", "CONSIGNACIONES", "FACTURA DE VENTA", "FACTURA DE COMPRA", "LETRAS DE CAMBIO", "PRESUPUESTOS", "RECIBO DE COBRO", "RECIBO DE PAGO", "RECIBO DE CAJA", "VALES", " " }));
        CbTipoDoc.setToolTipText("");
        CbTipoDoc.setBorder(null);
        CbTipoDoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CbTipoDocActionPerformed(evt);
            }
        });
        PanelCabezera.add(CbTipoDoc, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 70, 204, 30));

        jLabel3.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel3.setText("TIPO DE DOCUMENTO");
        PanelCabezera.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 152, 32));

        txtFecha.setBackground(new java.awt.Color(237, 237, 237));
        txtFecha.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        txtFecha.setBorder(null);
        txtFecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFechaActionPerformed(evt);
            }
        });
        PanelCabezera.add(txtFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 10, 100, 30));

        jLabel5.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel5.setText("MONTO");
        PanelCabezera.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 150, 105, 32));

        jLabel6.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel6.setText("NO. DOCUMENTO");
        PanelCabezera.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 128, 32));

        txtNdocumento.setBackground(new java.awt.Color(237, 237, 237));
        txtNdocumento.setFont(new java.awt.Font("Calibri Light", 0, 16)); // NOI18N
        txtNdocumento.setBorder(null);
        txtNdocumento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNdocumentoActionPerformed(evt);
            }
        });
        PanelCabezera.add(txtNdocumento, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 30, 142, 26));

        jLabel7.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel7.setText("DESCRIPCION");
        PanelCabezera.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 110, 105, 32));

        txtDescripcion.setBackground(new java.awt.Color(237, 237, 237));
        txtDescripcion.setFont(new java.awt.Font("Calibri Light", 0, 16)); // NOI18N
        txtDescripcion.setBorder(null);
        txtDescripcion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDescripcionActionPerformed(evt);
            }
        });
        PanelCabezera.add(txtDescripcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 110, 280, 26));

        txtMonto.setBackground(new java.awt.Color(237, 237, 237));
        txtMonto.setFont(new java.awt.Font("Calibri Light", 0, 16)); // NOI18N
        txtMonto.setBorder(null);
        txtMonto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMontoActionPerformed(evt);
            }
        });
        PanelCabezera.add(txtMonto, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 150, 142, 26));

        PanelPrincipal.add(PanelCabezera, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 690, 200));

        jPanel1.setBackground(new java.awt.Color(0, 153, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("DEBITO");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 50, 32));

        txtDebito.setBackground(new java.awt.Color(237, 237, 237));
        txtDebito.setFont(new java.awt.Font("Calibri Light", 0, 16)); // NOI18N
        txtDebito.setBorder(null);
        txtDebito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDebitoActionPerformed(evt);
            }
        });
        jPanel1.add(txtDebito, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 70, 90, 26));

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel4.setText("COMENTARIO");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 70, 105, 30));

        txtDescripcionC.setBackground(new java.awt.Color(237, 237, 237));
        txtDescripcionC.setFont(new java.awt.Font("Calibri Light", 0, 16)); // NOI18N
        txtDescripcionC.setBorder(null);
        txtDescripcionC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDescripcionCActionPerformed(evt);
            }
        });
        jPanel1.add(txtDescripcionC, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 30, 230, 26));

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("NO. CUENTA");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 100, 32));

        txtNcuenta.setBackground(new java.awt.Color(237, 237, 237));
        txtNcuenta.setFont(new java.awt.Font("Calibri Light", 0, 16)); // NOI18N
        txtNcuenta.setBorder(null);
        txtNcuenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNcuentaActionPerformed(evt);
            }
        });
        jPanel1.add(txtNcuenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 30, 142, 26));

        jLabel9.setBackground(new java.awt.Color(255, 255, 255));
        jLabel9.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("CREDITO");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 70, 70, 32));

        txtCredito.setBackground(new java.awt.Color(237, 237, 237));
        txtCredito.setFont(new java.awt.Font("Calibri Light", 0, 16)); // NOI18N
        txtCredito.setBorder(null);
        txtCredito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCreditoActionPerformed(evt);
            }
        });
        jPanel1.add(txtCredito, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 70, 100, 26));

        jLabel10.setBackground(new java.awt.Color(255, 255, 255));
        jLabel10.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel10.setText("DESCRIPCION");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 30, 105, 30));

        txtComentario.setBackground(new java.awt.Color(237, 237, 237));
        txtComentario.setFont(new java.awt.Font("Calibri Light", 0, 16)); // NOI18N
        txtComentario.setBorder(null);
        txtComentario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtComentarioActionPerformed(evt);
            }
        });
        jPanel1.add(txtComentario, new org.netbeans.lib.awtextra.AbsoluteConstraints(482, 70, 190, 26));

        BtnAgregar.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        BtnAgregar.setText("AGREGAR");
        jPanel1.add(BtnAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 120, 110, 40));

        PanelPrincipal.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 200, 690, 190));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        TablaRegistros.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        TablaRegistros.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "SEC", "CUENTA", "DESCRIPCION", "DEBITO", "CREDITO", "COMENTARIO"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(TablaRegistros);
        if (TablaRegistros.getColumnModel().getColumnCount() > 0) {
            TablaRegistros.getColumnModel().getColumn(0).setResizable(false);
            TablaRegistros.getColumnModel().getColumn(1).setResizable(false);
            TablaRegistros.getColumnModel().getColumn(2).setResizable(false);
            TablaRegistros.getColumnModel().getColumn(3).setResizable(false);
            TablaRegistros.getColumnModel().getColumn(4).setResizable(false);
            TablaRegistros.getColumnModel().getColumn(5).setResizable(false);
        }

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 690, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
        );

        PanelPrincipal.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 390, 690, 200));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(PanelPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 690, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(PanelPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 589, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CbTipoDocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CbTipoDocActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CbTipoDocActionPerformed

    private void txtDescripcionCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDescripcionCActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDescripcionCActionPerformed

    private void txtFechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFechaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFechaActionPerformed

    private void txtDebitoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDebitoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDebitoActionPerformed

    private void txtComentarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtComentarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtComentarioActionPerformed

    private void txtNdocumentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNdocumentoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNdocumentoActionPerformed

    private void txtDescripcionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDescripcionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDescripcionActionPerformed

    private void txtNcuentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNcuentaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNcuentaActionPerformed

    private void txtCreditoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCreditoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCreditoActionPerformed

    private void txtMontoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMontoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMontoActionPerformed
    
    public static String fecha() {
        Date fecha = new Date();
        SimpleDateFormat formatoFecha = new SimpleDateFormat(" dd/MM/YYYY");
        return formatoFecha.format(fecha);
    }

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DE_TRANSACCIONES11().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnAgregar;
    private javax.swing.JComboBox<String> CbTipoDoc;
    private javax.swing.JPanel PanelCabezera;
    private javax.swing.JPanel PanelPrincipal;
    private javax.swing.JTable TablaRegistros;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtComentario;
    private javax.swing.JTextField txtCredito;
    private javax.swing.JTextField txtDebito;
    private javax.swing.JTextField txtDescripcion;
    private javax.swing.JTextField txtDescripcionC;
    private javax.swing.JTextField txtFecha;
    private javax.swing.JTextField txtMonto;
    private javax.swing.JTextField txtNcuenta;
    private javax.swing.JTextField txtNdocumento;
    // End of variables declaration//GEN-END:variables
}
