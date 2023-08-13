package MOVIMIENTOS;

import ARCHIVOS.ManejoArchivos;
import MENU_PRINCIPAL.LOgin;
import java.awt.Color;
import java.awt.Font;
import java.awt.HeadlessException;
import java.awt.event.KeyEvent;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.plaf.FontUIResource;
import javax.swing.table.DefaultTableModel;
import texto.TextPrompt;

public class DE_TRANSACCIONES11 extends javax.swing.JFrame {

    public DefaultTableModel TablaM;
    private int secuencia = 0;
    String usuario = LOgin.getUsuario();
    boolean estatus;

    public DE_TRANSACCIONES11() {
        initComponents();
        txtFecha.setText(fecha());
        txtFecha.setEditable(false);
        this.setTitle("Movimiento de Transacciones");

        txtNdocumento.requestFocusInWindow();
        txtDescripcion.setEditable(false);
        txtDescripcionC.setEditable(false);
        txtMonto.setEditable(false);

        TablaM = (DefaultTableModel) TablaRegistros.getModel();

        UIManager.put("OptionPane.messageFont", new FontUIResource(new Font("Century Gothic", Font.PLAIN, 14)));
        UIManager.put("OptionPane.messageForeground", Color.black);

        TextPrompt ndoc = new TextPrompt(" Digite No. del documento", txtNdocumento, TextPrompt.Show.ALWAYS);
        ndoc.setForeground(Color.gray);

        TextPrompt ncuent = new TextPrompt(" Digite el No. de cuenta", txtNcuenta, TextPrompt.Show.ALWAYS);
        ncuent.setForeground(Color.gray);
        TextPrompt deb = new TextPrompt(" Digite el Debito", txtDebito, TextPrompt.Show.ALWAYS);
        deb.setForeground(Color.gray);
        TextPrompt cred = new TextPrompt(" Digite el Credito", txtCredito, TextPrompt.Show.ALWAYS);
        cred.setForeground(Color.gray);
        TextPrompt com = new TextPrompt(" Digite un Comentario", txtComentario, TextPrompt.Show.ALWAYS);
        com.setForeground(Color.gray);
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
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        PanelPrincipal.setBackground(new java.awt.Color(255, 255, 255));
        PanelPrincipal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        PanelCabezera.setBackground(new java.awt.Color(255, 255, 255));
        PanelCabezera.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel2.setText("FECHA");
        PanelCabezera.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 10, 50, 30));

        CbTipoDoc.setBackground(new java.awt.Color(237, 237, 237));
        CbTipoDoc.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        CbTipoDoc.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0. AJUSTE", "1.COMPROVANTE DE PAGO", "2. COMPROVANTE DE DEVOLUCION", "3. CONSIGNACIONES", "4. ENTRADA", "5. FACTURA DE VENTA", "6. FACTURA DE COMPRA", "7. LETRAS DE CAMBIO", "8. PRESUPUESTOS", "9. RECIBO DE COBRO", "10. RECIBO DE PAGO", "11. RECIBO DE CAJA", "12.SALIDA", "13. VALES", " ", " " }));
        CbTipoDoc.setToolTipText("");
        CbTipoDoc.setBorder(null);
        CbTipoDoc.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                CbTipoDocItemStateChanged(evt);
            }
        });
        PanelCabezera.add(CbTipoDoc, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 50, 280, 30));

        jLabel3.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel3.setText("TIPO DE DOCUMENTO");
        PanelCabezera.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 152, 32));

        txtFecha.setBackground(new java.awt.Color(237, 237, 237));
        txtFecha.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        txtFecha.setBorder(null);
        PanelCabezera.add(txtFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 10, 100, 30));

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
        txtNdocumento.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNdocumentoKeyTyped(evt);
            }
        });
        PanelCabezera.add(txtNdocumento, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 20, 280, 26));

        jLabel7.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel7.setText("DESCRIPCION");
        PanelCabezera.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 90, 105, 32));

        txtDescripcion.setBackground(new java.awt.Color(237, 237, 237));
        txtDescripcion.setFont(new java.awt.Font("Calibri Light", 0, 16)); // NOI18N
        txtDescripcion.setBorder(null);
        PanelCabezera.add(txtDescripcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 90, 280, 26));

        txtMonto.setBackground(new java.awt.Color(237, 237, 237));
        txtMonto.setFont(new java.awt.Font("Calibri Light", 0, 16)); // NOI18N
        txtMonto.setBorder(null);
        PanelCabezera.add(txtMonto, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 120, 280, 26));

        PanelPrincipal.add(PanelCabezera, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 750, 170));

        jPanel1.setBackground(new java.awt.Color(0, 153, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("DEBITO");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 20, 50, 32));

        txtDebito.setBackground(new java.awt.Color(237, 237, 237));
        txtDebito.setFont(new java.awt.Font("Calibri Light", 0, 16)); // NOI18N
        txtDebito.setBorder(null);
        txtDebito.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtDebitoKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDebitoKeyTyped(evt);
            }
        });
        jPanel1.add(txtDebito, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 20, 250, 26));

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel4.setText("COMENTARIO");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 120, 105, 30));

        txtDescripcionC.setBackground(new java.awt.Color(237, 237, 237));
        txtDescripcionC.setFont(new java.awt.Font("Calibri Light", 0, 16)); // NOI18N
        txtDescripcionC.setBorder(null);
        txtDescripcionC.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtDescripcionCKeyPressed(evt);
            }
        });
        jPanel1.add(txtDescripcionC, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 70, 230, 26));

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
        txtNcuenta.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNcuentaKeyTyped(evt);
            }
        });
        jPanel1.add(txtNcuenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 30, 230, 26));

        jLabel9.setBackground(new java.awt.Color(255, 255, 255));
        jLabel9.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("CREDITO");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 70, 70, 32));

        txtCredito.setBackground(new java.awt.Color(237, 237, 237));
        txtCredito.setFont(new java.awt.Font("Calibri Light", 0, 16)); // NOI18N
        txtCredito.setBorder(null);
        txtCredito.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtCreditoKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCreditoKeyTyped(evt);
            }
        });
        jPanel1.add(txtCredito, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 70, 250, 26));

        jLabel10.setBackground(new java.awt.Color(255, 255, 255));
        jLabel10.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel10.setText("DESCRIPCION");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 105, 30));

        txtComentario.setBackground(new java.awt.Color(237, 237, 237));
        txtComentario.setFont(new java.awt.Font("Calibri Light", 0, 16)); // NOI18N
        txtComentario.setBorder(null);
        txtComentario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtComentarioKeyPressed(evt);
            }
        });
        jPanel1.add(txtComentario, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 120, 250, 26));

        BtnAgregar.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        BtnAgregar.setText("AGREGAR");
        BtnAgregar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnAgregarActionPerformed(evt);
            }
        });
        jPanel1.add(BtnAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 120, 140, 40));

        PanelPrincipal.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 170, 750, 190));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TablaRegistros.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        TablaRegistros.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "SEC", "CUENTA", "DESCRIPCION", "DEBITO", "CREDITO", "COMENTARIO"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(TablaRegistros);
        if (TablaRegistros.getColumnModel().getColumnCount() > 0) {
            TablaRegistros.getColumnModel().getColumn(0).setPreferredWidth(1);
            TablaRegistros.getColumnModel().getColumn(1).setPreferredWidth(2);
            TablaRegistros.getColumnModel().getColumn(2).setResizable(false);
            TablaRegistros.getColumnModel().getColumn(2).setPreferredWidth(160);
            TablaRegistros.getColumnModel().getColumn(3).setResizable(false);
            TablaRegistros.getColumnModel().getColumn(3).setPreferredWidth(15);
            TablaRegistros.getColumnModel().getColumn(4).setResizable(false);
            TablaRegistros.getColumnModel().getColumn(4).setPreferredWidth(15);
            TablaRegistros.getColumnModel().getColumn(5).setResizable(false);
            TablaRegistros.getColumnModel().getColumn(5).setPreferredWidth(50);
        }

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 750, 152));

        BtnSalir.setBackground(new java.awt.Color(160, 171, 176));
        BtnSalir.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        BtnSalir.setForeground(new java.awt.Color(255, 255, 255));
        BtnSalir.setText("SALIR");
        BtnSalir.setBorder(null);
        BtnSalir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtnSalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BtnSalirMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BtnSalirMouseExited(evt);
            }
        });
        BtnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnSalirActionPerformed(evt);
            }
        });
        jPanel2.add(BtnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 170, 110, 40));

        BtnGuardar.setBackground(new java.awt.Color(160, 171, 176));
        BtnGuardar.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        BtnGuardar.setForeground(new java.awt.Color(255, 255, 255));
        BtnGuardar.setText("GUARDAR");
        BtnGuardar.setBorder(null);
        BtnGuardar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtnGuardar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BtnGuardarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BtnGuardarMouseExited(evt);
            }
        });
        BtnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnGuardarActionPerformed(evt);
            }
        });
        jPanel2.add(BtnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 170, 110, 40));

        BtnLimpiar.setBackground(new java.awt.Color(160, 171, 176));
        BtnLimpiar.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        BtnLimpiar.setForeground(new java.awt.Color(255, 255, 255));
        BtnLimpiar.setText("LIMPIAR");
        BtnLimpiar.setBorder(null);
        BtnLimpiar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtnLimpiar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BtnLimpiarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BtnLimpiarMouseExited(evt);
            }
        });
        BtnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnLimpiarActionPerformed(evt);
            }
        });
        jPanel2.add(BtnLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 170, 110, 40));

        PanelPrincipal.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 360, 750, 230));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(PanelPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 589, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNdocumentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNdocumentoActionPerformed

        String doc = txtNdocumento.getText();

        try {

            boolean encontrado = false;
            Scanner s;
            File t = new File("Cabecera Transacciones.txt");

            s = new Scanner(t);

            while (s.hasNextLine() && !encontrado) {

                String linea = s.nextLine();
                Scanner s1 = new Scanner(linea);

                s1.useDelimiter("\\s*;\\s*");

                if (doc.equals(s1.next())) {
                    estatus = true;
                } else {
                    estatus = false;
                }
            }
        } catch (FileNotFoundException e) {

        }

        if (estatus == true) {
            JOptionPane.showMessageDialog(this, "Esta transaccion ya esta Actualizada");
        } else {

            if (txtNdocumento.getText().isEmpty()) {
                JOptionPane.showMessageDialog(this, "Debe ingresar el Código del Documento para continuar");
                txtNdocumento.grabFocus();
            } else {
                CbTipoDoc.requestFocus();
            }

            try {
                String auxn = txtNdocumento.getText();
                int codigo = Integer.parseInt(auxn);
                String desc;

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

                            if (codigo == Integer.parseInt(s1.next())) {

                                txtNdocumento.setText(auxn);
                                txtDescripcion.setText(s1.next());
                                encontrado = true;
                            }
                        }

                        if (!encontrado) {
                            JOptionPane.showMessageDialog(this, "Este No. de Documento no existe");
                            txtNdocumento.setText("");
                            txtNdocumento.requestFocus();
                        }
                    }
                } catch (FileNotFoundException e) {
                    JOptionPane.showMessageDialog(this, "No se encontró el archivo", "Error", JOptionPane.ERROR_MESSAGE);
                }
            } catch (HeadlessException | NumberFormatException e) {
                JOptionPane.showMessageDialog(rootPane, "Error al Abrir el Archivo...");
                BtnLimpiarActionPerformed(evt);
            }
        }
    }//GEN-LAST:event_txtNdocumentoActionPerformed

    private void txtNcuentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNcuentaActionPerformed
        if (txtNcuenta.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Debe ingresar el Código del Documento para continuar");
            txtNcuenta.grabFocus();
        } else {
            txtDebito.requestFocus();
        }

        String auxc = txtNcuenta.getText();
        int tipo;
        int cuenta = Integer.parseInt(auxc);

        boolean encontrado = false;
        Scanner s;

        try {

            File f = new File("Catalogo.txt");
            if (!f.exists()) {

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
                    JOptionPane.showMessageDialog(this, "Este No. de cuenta no existe");
                    txtNcuenta.setText("");
                    txtNcuenta.requestFocus();
                }
            }
        } catch (FileNotFoundException e) {
            JOptionPane.showMessageDialog(this, "No se encontró el archivo", "Error", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_txtNcuentaActionPerformed

    private void BtnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnGuardarActionPerformed
        if (txtNdocumento.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Debe ingresar el Código del Documento para Guardar");
            txtNdocumento.requestFocus();
        } else if (CbTipoDoc.getSelectedItem() == null) {
            JOptionPane.showMessageDialog(this, "Debe ingresar el Código del Documento para Guardar");
        } else if (txtMonto.getText().isEmpty() && secuencia < 2) {
            JOptionPane.showMessageDialog(this, "Debe realizar transacciones para Guardar");
            txtNcuenta.requestFocus();
        } else if (txtNcuenta.getText().isEmpty() && txtCredito.getText().isEmpty() && txtDebito.getText().isEmpty() && secuencia < 2) {
            JOptionPane.showMessageDialog(this, "Debe realizar transacciones para Guardar");
            txtNcuenta.grabFocus();
        }

        if (secuencia < 2) {
            JOptionPane.showMessageDialog(rootPane, "Para guardar Debe al menos involucrar dos cuentas", "ERROR", HEIGHT);
            txtNcuenta.grabFocus();
        } else {

            double totaldb = 0, totalcr = 0;
            String fechaAc = "**/**/****";
            String monto;

            try {

                for (int i = 0; i < TablaM.getRowCount(); i++) {
                    double debito = Double.parseDouble(TablaM.getValueAt(i, 3).toString());
                    double credito = Double.parseDouble(TablaM.getValueAt(i, 4).toString());

                    totaldb += debito;
                    totalcr += credito;
                }

                if (totaldb == totalcr) {

                    monto = Double.toString(totaldb);
                    txtMonto.setText(monto);

                    File d = new File("Detalle Transacciones.txt");
                    if (!d.exists()) {
                        d.createNewFile();
                    }

                    BufferedWriter writer = new BufferedWriter(new FileWriter(d, true));
                    for (int i = 0; i < TablaM.getRowCount(); i++) {
                        for (int j = 0; j < TablaM.getColumnCount(); j++) {

                            writer.write(TablaM.getValueAt(i, j).toString());

                            if (j < TablaM.getColumnCount() - 1) {
                                writer.write(";");
                            }
                        }
                        writer.newLine();
                    }
                    writer.close();
                    JOptionPane.showMessageDialog(rootPane, "Registro guardado");

                    File f = new File("Cabecera Transacciones.txt");
                    ManejoArchivos file = new ManejoArchivos();

                    if (!f.exists()) {
                        f.createNewFile();
                    }

                    String LineaActual = txtNdocumento.getText() + ";" + txtFecha.getText() + CbTipoDoc.getSelectedIndex() + ";"
                            + txtDescripcion.getText() + ";" + usuario + ";" + txtMonto.getText() + ";" + fechaAc
                            + ";" + estatus;

                    file.GuardarDatos(LineaActual, f);
                    LimpiarAll();
                    txtNdocumento.requestFocus();

                } else {
                    JOptionPane.showMessageDialog(rootPane, "La cantidad de Debitos y Creditos deben ser iguales", "ERROR", HEIGHT);
                    txtNcuenta.requestFocus();
                }
            } catch (IOException | NumberFormatException e) {
                JOptionPane.showMessageDialog(rootPane, "Error al guardar los Datos");
            }
        }
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
    }//GEN-LAST:event_BtnLimpiarActionPerformed

    private void txtCreditoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCreditoKeyPressed
        if (!txtCredito.getText().isEmpty() && txtDebito.getText().isEmpty()) {
            txtDebito.setEditable(false);
        } else {
            txtDebito.setEditable(true);
        }

        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            txtComentario.requestFocus();
        }
    }//GEN-LAST:event_txtCreditoKeyPressed

    private void txtDebitoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDebitoKeyPressed
        if (!txtDebito.getText().isEmpty() && txtCredito.getText().isEmpty()) {
            txtCredito.setEditable(false);
            if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
                txtComentario.requestFocus();
            }
        } else {
            txtCredito.setEditable(true);
            if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
                txtCredito.requestFocus();
            }
        }
    }//GEN-LAST:event_txtDebitoKeyPressed

    private void BtnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnAgregarActionPerformed

        if (txtNcuenta.getText().isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "Por Favor Rellene el No. de cuenta antes de agregar", "ERROR", HEIGHT);
            txtNcuenta.grabFocus();
        } else if (txtCredito.getText().isEmpty() && txtDebito.getText().isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "Por Favor Rellene Creditos o Debitos antes de agregar", "ERROR", HEIGHT);
        } else {

            secuencia++;

            String debito, credito;
            String cuenta = txtNcuenta.getText();
            String descrip = txtDescripcionC.getText();

            if (txtDebito.getText().isEmpty()) {
                debito = "0";
                txtMonto.setText(txtCredito.getText());
            } else {
                debito = txtDebito.getText();
            }

            if (txtCredito.getText().isEmpty()) {
                credito = "0";
                txtMonto.setText(txtDebito.getText());
            } else {
                credito = txtCredito.getText();
            }

            String coment = txtComentario.getText();

            TablaM.addRow(new Object[]{secuencia, cuenta, descrip, debito, credito, coment});
            BtnLimpiarActionPerformed(evt);
            txtNcuenta.requestFocus();
        }
    }//GEN-LAST:event_BtnAgregarActionPerformed

    private void CbTipoDocItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_CbTipoDocItemStateChanged
        txtNcuenta.requestFocus();
    }//GEN-LAST:event_CbTipoDocItemStateChanged

    private void txtDescripcionCKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDescripcionCKeyPressed
        txtDebito.requestFocus();
    }//GEN-LAST:event_txtDescripcionCKeyPressed

    private void txtComentarioKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtComentarioKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            BtnAgregar.doClick();
        }
    }//GEN-LAST:event_txtComentarioKeyPressed

    private void txtNdocumentoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNdocumentoKeyTyped
        String allowedCharacters = "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ-";
        char c = evt.getKeyChar();

        if ((allowedCharacters.indexOf(c) == -1) && (c != KeyEvent.VK_BACK_SPACE) && (c != KeyEvent.VK_ENTER)) {
            evt.consume();
        }
    }//GEN-LAST:event_txtNdocumentoKeyTyped

    private void txtNcuentaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNcuentaKeyTyped
        char c = evt.getKeyChar();
        if (((c < '0' || c > '9')) && (c != KeyEvent.VK_BACK_SPACE)) {
            evt.consume();
        }
    }//GEN-LAST:event_txtNcuentaKeyTyped

    private void txtDebitoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDebitoKeyTyped
        char c = evt.getKeyChar();

        if (((c < '0' || c > '9')) && (c != KeyEvent.VK_BACK_SPACE) && (c != '.' || txtDebito.getText().contains("."))) {
            evt.consume();
        }
    }//GEN-LAST:event_txtDebitoKeyTyped

    private void txtCreditoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCreditoKeyTyped
        char c = evt.getKeyChar();

        if (((c < '0' || c > '9')) && (c != KeyEvent.VK_BACK_SPACE) && (c != '.' || txtCredito.getText().contains("."))) {
            evt.consume();
        }
    }//GEN-LAST:event_txtCreditoKeyTyped

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        int resp = JOptionPane.showConfirmDialog(rootPane, "Desea cerrar la ventana de Mantenimiento de Catalogo", "Cerrar Ventana", JOptionPane.YES_NO_OPTION);

        if (resp == JOptionPane.YES_OPTION) {
            this.dispose();
        } else {
            this.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        }
    }//GEN-LAST:event_formWindowClosing

    private void BtnGuardarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnGuardarMouseEntered
        BtnGuardar.setBackground(new Color(0, 51, 204));
    }//GEN-LAST:event_BtnGuardarMouseEntered

    private void BtnGuardarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnGuardarMouseExited
        BtnGuardar.setBackground(new Color(160, 171, 176));
    }//GEN-LAST:event_BtnGuardarMouseExited

    private void BtnLimpiarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnLimpiarMouseEntered
        BtnLimpiar.setBackground(new Color(0, 51, 204));
    }//GEN-LAST:event_BtnLimpiarMouseEntered

    private void BtnLimpiarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnLimpiarMouseExited
        BtnLimpiar.setBackground(new Color(160, 171, 176));
    }//GEN-LAST:event_BtnLimpiarMouseExited

    private void BtnSalirMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnSalirMouseEntered
        BtnSalir.setBackground(Color.red);
    }//GEN-LAST:event_BtnSalirMouseEntered

    private void BtnSalirMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnSalirMouseExited
        BtnSalir.setBackground(new Color(160, 171, 176));
    }//GEN-LAST:event_BtnSalirMouseExited

    public void LimpiarAll() {
        txtNdocumento.setText("");
        CbTipoDoc.setSelectedItem(null);
        txtDescripcion.setText("");
        txtMonto.setText("");
        txtNcuenta.setText("");
        txtDescripcionC.setText("");
        txtDebito.setText("");
        txtCredito.setText("");
        txtComentario.setText("");
        TablaM.setRowCount(0);
    }

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
