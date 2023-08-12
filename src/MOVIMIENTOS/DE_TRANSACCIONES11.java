package MOVIMIENTOS;

import ARCHIVOS.ManejoArchivos;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class DE_TRANSACCIONES11 extends javax.swing.JFrame {

    public DE_TRANSACCIONES11() {
        initComponents();
        txtFecha.setText(fecha());
        txtFecha.setEditable(false);
        this.setTitle("Movimiento de Transacciones");

        txtNdocumento.requestFocusInWindow();
        txtDescripcion.setEditable(false);
        txtDescripcionC.setEditable(false);

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
        BtnSalir = new javax.swing.JButton();
        BtnGuardar = new javax.swing.JButton();
        BtnLimpiar = new javax.swing.JButton();

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
        PanelCabezera.add(CbTipoDoc, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 50, 204, 30));

        jLabel3.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel3.setText("TIPO DE DOCUMENTO");
        PanelCabezera.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 152, 32));

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
        PanelCabezera.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 120, 105, 32));

        jLabel6.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel6.setText("NO. DOCUMENTO");
        PanelCabezera.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 128, 32));

        txtNdocumento.setBackground(new java.awt.Color(237, 237, 237));
        txtNdocumento.setFont(new java.awt.Font("Calibri Light", 0, 16)); // NOI18N
        txtNdocumento.setBorder(null);
        txtNdocumento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNdocumentoActionPerformed(evt);
            }
        });
        PanelCabezera.add(txtNdocumento, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 20, 142, 26));

        jLabel7.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel7.setText("DESCRIPCION");
        PanelCabezera.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 90, 105, 32));

        txtDescripcion.setBackground(new java.awt.Color(237, 237, 237));
        txtDescripcion.setFont(new java.awt.Font("Calibri Light", 0, 16)); // NOI18N
        txtDescripcion.setBorder(null);
        txtDescripcion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDescripcionActionPerformed(evt);
            }
        });
        PanelCabezera.add(txtDescripcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 90, 280, 26));

        txtMonto.setBackground(new java.awt.Color(237, 237, 237));
        txtMonto.setFont(new java.awt.Font("Calibri Light", 0, 16)); // NOI18N
        txtMonto.setBorder(null);
        txtMonto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMontoActionPerformed(evt);
            }
        });
        PanelCabezera.add(txtMonto, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 120, 142, 26));

        PanelPrincipal.add(PanelCabezera, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 690, 170));

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
        txtDebito.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtDebitoKeyPressed(evt);
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
        txtCredito.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtCreditoKeyPressed(evt);
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
        BtnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnAgregarActionPerformed(evt);
            }
        });
        jPanel1.add(BtnAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 120, 110, 40));

        PanelPrincipal.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 170, 690, 190));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 690, 152));

        BtnSalir.setBackground(new java.awt.Color(255, 0, 51));
        BtnSalir.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        BtnSalir.setForeground(new java.awt.Color(255, 255, 255));
        BtnSalir.setText("SALIR");
        BtnSalir.setBorder(null);
        BtnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnSalirActionPerformed(evt);
            }
        });
        jPanel2.add(BtnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 170, 110, 40));

        BtnGuardar.setBackground(new java.awt.Color(0, 153, 255));
        BtnGuardar.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        BtnGuardar.setForeground(new java.awt.Color(255, 255, 255));
        BtnGuardar.setText("GUARDAR");
        BtnGuardar.setBorder(null);
        BtnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnGuardarActionPerformed(evt);
            }
        });
        jPanel2.add(BtnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 170, 110, 40));

        BtnLimpiar.setBackground(new java.awt.Color(0, 153, 255));
        BtnLimpiar.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        BtnLimpiar.setForeground(new java.awt.Color(255, 255, 255));
        BtnLimpiar.setText("LIMPIAR");
        BtnLimpiar.setBorder(null);
        BtnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnLimpiarActionPerformed(evt);
            }
        });
        jPanel2.add(BtnLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 170, 110, 40));

        PanelPrincipal.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 360, 690, 230));

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

    private void txtComentarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtComentarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtComentarioActionPerformed

    private void txtNdocumentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNdocumentoActionPerformed
        if (txtNdocumento.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Debe ingresar el Código del Documento para continuar");
            txtNdocumento.grabFocus();
        } else {
            txtNcuenta.requestFocus();
        }

        String auxn = txtNdocumento.getText();
        String desc;

        int codigo = Integer.parseInt(auxn);
        boolean encontrado = false;
        Scanner s;

        try {

            File f = new File("Documentos.txt");
            if (!f.exists()) {
                JOptionPane.showMessageDialog(this, "No hay ningun registro de Documentos");
            } else {

                s = new Scanner(f);

                while (s.hasNextLine() && !encontrado) {

                    String linea = s.nextLine();
                    Scanner s1 = new Scanner(linea);

                    s1.useDelimiter("\\s*;\\s*");

                    try {
                        if (codigo == Integer.parseInt(s1.next())) {

                            txtNdocumento.setText(auxn);
                            txtDescripcion.setText(s1.next());
                            encontrado = true;
                        } else {

                            JOptionPane.showMessageDialog(this, "Este codigo no existe");
                            txtNdocumento.setText("");
                            txtNdocumento.requestFocus();
                            encontrado = false;
                        }
                    } catch (NumberFormatException e) {
                        JOptionPane.showMessageDialog(this, "Error al leer el archivo", "Error", JOptionPane.ERROR_MESSAGE);
                        System.out.println(e);
                    }
                }
            }
        } catch (FileNotFoundException e) {
            JOptionPane.showMessageDialog(this, "No se encontró el archivo", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_txtNdocumentoActionPerformed

    private void txtDescripcionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDescripcionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDescripcionActionPerformed

    private void txtNcuentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNcuentaActionPerformed
        if (txtNcuenta.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Debe ingresar el Código del Documento para continuar");
            txtNcuenta.grabFocus();
        } else {
            txtDescripcionC.requestFocus();
        }

        String auxc = txtNcuenta.getText();
        String tipoc;
        int tipo;
        int cuenta = Integer.parseInt(auxc);

        boolean encontrado = false;
        Scanner s;

        try {

            File f = new File("Catalogo.txt");
            if (!f.exists()) {
                JOptionPane.showMessageDialog(this, "No hay ningun registro de esta Cuenta");
            } else {

                s = new Scanner(f);

                while (s.hasNextLine() && !encontrado) {

                    String linea = s.nextLine();
                    Scanner s1 = new Scanner(linea);

                    s1.useDelimiter("\\s*;\\s*");

                    try {
                        if (cuenta == Integer.parseInt(s1.next())) {

                            txtNcuenta.setText(auxc);
                            txtDescripcionC.setText(s1.next());
                            tipo = Integer.parseInt(s1.next());

                            if (tipo == 0) {
                                tipoc = "General";
                                JOptionPane.showMessageDialog(this, "Esta cuenta no puede realizar transacciones");
                                BtnLimpiarActionPerformed(evt);
                                txtNcuenta.requestFocus();
                            }

                            encontrado = true;
                        } 
                    } catch (NumberFormatException e) {
                        JOptionPane.showMessageDialog(this, "Error al leer el archivo", "Error", JOptionPane.ERROR_MESSAGE);
                        System.out.println(e);
                    }
                }

                if (!encontrado) {
                    JOptionPane.showMessageDialog(this, "Este codigo de cuenta no existe");
                    txtNcuenta.setText("");
                    txtNcuenta.requestFocus();
                }
            }
        } catch (FileNotFoundException e) {
            JOptionPane.showMessageDialog(this, "No se encontró el archivo", "Error", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_txtNcuentaActionPerformed

    private void txtMontoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMontoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMontoActionPerformed

    private void BtnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnGuardarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BtnGuardarActionPerformed

    private void BtnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnSalirActionPerformed
        dispose();
    }//GEN-LAST:event_BtnSalirActionPerformed

    private void BtnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnLimpiarActionPerformed
        txtNcuenta.setText("");
        txtDescripcionC.setText("");
        txtDebito.setText("");
        txtCredito.setText("");
        txtComentario.setText("");
        txtMonto.setText("");
    }//GEN-LAST:event_BtnLimpiarActionPerformed

    private void txtCreditoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCreditoKeyPressed
        if (!txtCredito.getText().isEmpty() && txtDebito.getText().isEmpty()) {
            txtDebito.setEditable(false);
        } else {
            txtDebito.setEditable(true);
        }
    }//GEN-LAST:event_txtCreditoKeyPressed

    private void txtDebitoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDebitoKeyPressed
        if (!txtDebito.getText().isEmpty() && txtCredito.getText().isEmpty()) {
            txtCredito.setEditable(false);
        } else {
            txtCredito.setEditable(true);
        }
    }//GEN-LAST:event_txtDebitoKeyPressed

    private void BtnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnAgregarActionPerformed
        if (txtNcuenta.getText().isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "Por Favor Rellene el No. de cuenta antes de agregar", "ERROR", HEIGHT);
            txtNcuenta.grabFocus();
        } else if (!txtCredito.getText().isEmpty() && txtDebito.getText().isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "Por Favor Rellene el No. de cuenta antes de agregar", "ERROR", HEIGHT);
            txtDebito.grabFocus();
        } else if (!txtDebito.getText().isEmpty() && txtCredito.getText().isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "Por Favor Rellene el No. de cuenta antes de agregar", "ERROR", HEIGHT);
            txtCredito.grabFocus();
        } else {
            int secuencia = 0;
            String monto;

            if (!txtDebito.getText().isEmpty()) {
                monto = txtDebito.getText();
                txtMonto.setText(monto);
            } else if (!txtCredito.getText().isEmpty()) {
                monto = txtCredito.getText();
                txtMonto.setText(monto);
            }

            try {

                secuencia++;

                File f = new File("DetalleTransacciones.txt");

                if (!f.exists()) {
                    f.createNewFile();
                }

                if (txtDebito.getText().isEmpty()) {
                    txtDebito.setText("0");
                }
                if (txtCredito.getText().isEmpty()) {
                    txtCredito.setText("0");
                }

                String lineaActual = txtNdocumento.getText() + ";" + secuencia + ";" + txtNcuenta.getText() + ";"
                        + txtDescripcionC.getText() + ";" + txtDebito.getText() + ";" + txtCredito.getText()
                        + ";" + txtComentario.getText();

                ManejoArchivos file = new ManejoArchivos();

                file.GuardarDatos(lineaActual, f);
                BtnLimpiarActionPerformed(evt);
                txtNcuenta.requestFocus();

            } catch (IOException e) {
            }
        }
    }//GEN-LAST:event_BtnAgregarActionPerformed

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
    private javax.swing.JButton BtnGuardar;
    private javax.swing.JButton BtnLimpiar;
    private javax.swing.JButton BtnSalir;
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
