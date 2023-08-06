package MANTENIMIENTO;

import ARCHIVOS.ManejoArchivos;
import static MANTENIMIENTO.DE_DOCUMENTOS.LineaAntigua;
import java.awt.Color;
import java.awt.Font;
import java.awt.HeadlessException;
import java.awt.event.KeyEvent;
import static java.awt.image.ImageObserver.HEIGHT;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.plaf.FontUIResource;

public class DE_CATALOGO extends javax.swing.JFrame {

    boolean crear;
    boolean Modificar = false;
    boolean encontrado;
    String antigualinea;
    public static String LineaAntigua;

    public DE_CATALOGO() {
        initComponents();
        this.setTitle("Mantenimiento de Catalogo");
        UIManager.put("OptionPane.messageFont", new FontUIResource(new Font("Century Gothic", Font.PLAIN, 14)));
        UIManager.put("OptionPane.messageForeground", Color.black);
        txtfecha.setText(fecha());
        jPanel1.requestFocusInWindow();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSlider1 = new javax.swing.JSlider();
        PanelAzul = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        estado = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txtnumero = new javax.swing.JTextField();
        txtdescripcion = new javax.swing.JTextField();
        txttipo = new javax.swing.JTextField();
        txtnivel = new javax.swing.JTextField();
        txtpadre = new javax.swing.JTextField();
        txtdebito = new javax.swing.JTextField();
        txtcredito = new javax.swing.JTextField();
        txthora = new javax.swing.JTextField();
        txtbalance = new javax.swing.JTextField();
        BtnGuardar = new javax.swing.JButton();
        BtnLimpiar = new javax.swing.JButton();
        BtnSalir = new javax.swing.JButton();
        txtfecha = new javax.swing.JFormattedTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setResizable(false);

        PanelAzul.setBackground(new java.awt.Color(0, 153, 255));

        jLabel1.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("MANTENIMIENTO DE CATALOGO");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        jLabel2.setText("Numero_Cta");

        jLabel3.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        jLabel3.setText("Descripcion_Cta");

        estado.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        estado.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        jLabel4.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        jLabel4.setText("Tipo_Cta");

        jLabel5.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        jLabel5.setText("Nivel_Cta");

        jLabel6.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        jLabel6.setText("Cta_padre");

        jLabel7.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        jLabel7.setText("Hora");

        jLabel8.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        jLabel8.setText("Credito_Acumulado_Cta");

        jLabel9.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        jLabel9.setText("Debito_Acumulado_Cta");

        jLabel10.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        jLabel10.setText("Fecha");

        jLabel11.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        jLabel11.setText("Balance_Cta");

        txtnumero.setBackground(new java.awt.Color(237, 237, 237));
        txtnumero.setFont(new java.awt.Font("Calibri Light", 0, 18)); // NOI18N
        txtnumero.setBorder(null);
        txtnumero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnumeroActionPerformed(evt);
            }
        });
        txtnumero.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtnumeroKeyPressed(evt);
            }
        });

        txtdescripcion.setBackground(new java.awt.Color(237, 237, 237));
        txtdescripcion.setFont(new java.awt.Font("Calibri Light", 0, 18)); // NOI18N
        txtdescripcion.setBorder(null);
        txtdescripcion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtdescripcionKeyPressed(evt);
            }
        });

        txttipo.setBackground(new java.awt.Color(237, 237, 237));
        txttipo.setFont(new java.awt.Font("Calibri Light", 0, 18)); // NOI18N
        txttipo.setBorder(null);
        txttipo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txttipoKeyPressed(evt);
            }
        });

        txtnivel.setBackground(new java.awt.Color(237, 237, 237));
        txtnivel.setFont(new java.awt.Font("Calibri Light", 0, 18)); // NOI18N
        txtnivel.setBorder(null);
        txtnivel.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtnivelKeyPressed(evt);
            }
        });

        txtpadre.setBackground(new java.awt.Color(237, 237, 237));
        txtpadre.setFont(new java.awt.Font("Calibri Light", 0, 18)); // NOI18N
        txtpadre.setBorder(null);
        txtpadre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtpadreKeyPressed(evt);
            }
        });

        txtdebito.setBackground(new java.awt.Color(237, 237, 237));
        txtdebito.setFont(new java.awt.Font("Calibri Light", 0, 18)); // NOI18N
        txtdebito.setBorder(null);
        txtdebito.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtdebitoKeyPressed(evt);
            }
        });

        txtcredito.setBackground(new java.awt.Color(237, 237, 237));
        txtcredito.setFont(new java.awt.Font("Calibri Light", 0, 18)); // NOI18N
        txtcredito.setBorder(null);
        txtcredito.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtcreditoKeyPressed(evt);
            }
        });

        txthora.setBackground(new java.awt.Color(237, 237, 237));
        txthora.setFont(new java.awt.Font("Calibri Light", 0, 18)); // NOI18N
        txthora.setBorder(null);

        txtbalance.setBackground(new java.awt.Color(237, 237, 237));
        txtbalance.setFont(new java.awt.Font("Calibri Light", 0, 18)); // NOI18N
        txtbalance.setBorder(null);

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

        txtfecha.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(112, 112, 112)
                        .addComponent(BtnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(77, 77, 77)
                        .addComponent(BtnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(67, 67, 67)
                        .addComponent(BtnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(73, 73, 73)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING)))
                            .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(24, 24, 24)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtdebito, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtcredito, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtpadre, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtnivel, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txttipo, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtdescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtnumero, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtbalance, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(59, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel10)
                .addGap(18, 18, 18)
                .addComponent(txtfecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel7)
                .addGap(10, 10, 10)
                .addComponent(txthora, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(estado, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(txthora, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel7)
                                .addComponent(txtfecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(2, 2, 2)))
                    .addComponent(estado, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(txtnumero, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addComponent(txtdescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txttipo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtnivel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtpadre, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtdebito, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtcredito, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8))
                        .addGap(18, 18, 18)
                        .addComponent(txtbalance, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 53, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22))
        );

        javax.swing.GroupLayout PanelAzulLayout = new javax.swing.GroupLayout(PanelAzul);
        PanelAzul.setLayout(PanelAzulLayout);
        PanelAzulLayout.setHorizontalGroup(
            PanelAzulLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        PanelAzulLayout.setVerticalGroup(
            PanelAzulLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelAzulLayout.createSequentialGroup()
                .addContainerGap(31, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelAzul, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelAzul, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnGuardarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnGuardarMouseEntered
        BtnGuardar.setBackground(Color.red);
    }//GEN-LAST:event_BtnGuardarMouseEntered

    private void BtnGuardarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnGuardarMouseExited
        BtnGuardar.setBackground(new Color(160, 171, 176));
    }//GEN-LAST:event_BtnGuardarMouseExited

    private void BtnLimpiarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnLimpiarMouseEntered
        BtnLimpiar.setBackground(Color.red);
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

    private void BtnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnSalirActionPerformed
        dispose();
    }//GEN-LAST:event_BtnSalirActionPerformed

    private void BtnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnLimpiarActionPerformed
        txtbalance.setText("");
        txtcredito.setText("");
        txtdebito.setText("");
        txtdescripcion.setText("");
        txthora.setText("");
        txtnivel.setText("");
        txtnumero.setText("");
        txtpadre.setText("");
        txttipo.setText("");
    }//GEN-LAST:event_BtnLimpiarActionPerformed

    private void BtnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnGuardarActionPerformed
        if (txtnumero.getText().isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "Por Favor Rellene el Numero antes de guardar", "ERROR", HEIGHT);
            txtnumero.grabFocus();
        } else if (txtdescripcion.getText().isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "Por Favor Rellene la Descripcion antes de guardar", "ERROR", HEIGHT);
            txtdescripcion.grabFocus();

        } else if (txttipo.getText().isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "Por Favor Rellene el Tipo antes de guardar", "ERROR", HEIGHT);
            txttipo.grabFocus();

        } else if (txtnivel.getText().isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "Por Favor Rellene el Nivel De antes de guardar", "ERROR", HEIGHT);
            txtnivel.grabFocus();

        } else if (txtpadre.getText().isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "Por Favor Rellene el Padre De antes de guardar", "ERROR", HEIGHT);
            txtpadre.grabFocus();

        } else if (txtdebito.getText().isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "Por Favor Rellene el Debito De antes de guardar", "ERROR", HEIGHT);
            txtdebito.grabFocus();

        } else if (txtcredito.getText().isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "Por Favor Rellene el Credito De antes de guardar", "ERROR", HEIGHT);
            txtcredito.grabFocus();

        } else if (txtbalance.getText().isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "Por Favor Rellene el Balance De antes de guardar", "ERROR", HEIGHT);
            txtbalance.grabFocus();

        } else if (txtfecha.getText().isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "Por Favor Rellene la Fecha De antes de guardar", "ERROR", HEIGHT);
            txtfecha.grabFocus();

        } else if (txthora.getText().isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "Por Favor Rellene la Hora De antes de guardar", "ERROR", HEIGHT);
            txthora.grabFocus();

        } else {

            try {
                File f = new File("Catalogo.txt");

                if (!f.exists()) {
                    f.createNewFile();
                }

                String lineaActual = txtnumero.getText() + ";" + txtdescripcion.getText() + ";" + txttipo.getText() + ";"
                        + txtnivel.getText() + ";" + txtpadre.getText() + ";" + txtdebito.getText() + ";" + txtcredito.getText() + ";"
                        + txtbalance.getText() + ";" + txtfecha.getText() + ";" + txthora.getText();
                ManejoArchivos file = new ManejoArchivos();

                if (Modificar) {
                    file.Modificar(LineaAntigua, lineaActual, f);
                    BtnLimpiarActionPerformed(evt);
                    Modificar = false;
                } else {
                    file.GuardarDatos(lineaActual, f);
                    BtnLimpiarActionPerformed(evt);
                }

                JOptionPane.showMessageDialog(null, "Registro guardado");

            } catch (IOException e) {
            }
        }
    }//GEN-LAST:event_BtnGuardarActionPerformed

    private void txtnumeroKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtnumeroKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            txtdescripcion.requestFocus();
        }

        if (Character.isDigit(evt.getKeyChar())) {
            txtnumero.setEditable(true);
        } else {
            txtnumero.setEditable(false);
        }
    }//GEN-LAST:event_txtnumeroKeyPressed

    private void txtnumeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnumeroActionPerformed
        if (txtnumero.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Debe ingresar el Código del Documento para continuar");
        } else {
            txtdescripcion.setText("");
            txtdescripcion.grabFocus();
        }

        try {
            String auxid = txtnumero.getText();
            int cod = Integer.parseInt(auxid);

            if (cod <= 0) {
                JOptionPane.showMessageDialog(rootPane, "El Id debe ser un número positivo intente nuevamente");
                BtnLimpiarActionPerformed(evt);
            } else {

                boolean encontrado = false;
                Scanner s;

                try {
                    File f = new File("Catalogo.txt");

                    if (!f.exists()) {
                        f.createNewFile();
                        estado.setText("Creando");

                    } else {
                        s = new Scanner(f);

                        while (s.hasNextLine() && !encontrado) {

                            String linea = s.nextLine();
                            Scanner s1 = new Scanner(linea);

                            s1.useDelimiter("\\s*;\\s*");

                            try {
                                if (cod == Integer.parseInt(s1.next())) {
                                    txtnumero.setText(String.valueOf(cod));
                                    txtdescripcion.setText(s1.next());
                                    txtbalance.setText(s1.next());
                                    txtcredito.setText(s1.next());
                                    txtdebito.setText(s1.next());
                                    txtfecha.setText(s1.next());
                                    txthora.setText(s1.next());
                                    txtnivel.setText(s1.next());
                                    txtnumero.setText(s1.next());
                                    txtpadre.setText(s1.next());
                                    txttipo.setText(s1.next());
                                    
                                    LineaAntigua = txtnumero.getText() + ";" + txtdescripcion.getText() + ";" + txttipo.getText() + ";"
                        + txtnivel.getText() + ";" + txtpadre.getText() + ";" + txtdebito.getText() + ";" + txtcredito.getText() + ";"
                        + txtbalance.getText() + ";" + txtfecha.getText() + ";" + txthora.getText();
                                    estado.setText(" Modificando");

                                    Modificar = true;
                                    encontrado = true;
                                } else {
                                    BtnLimpiarActionPerformed(evt);
                                    txtnumero.setText(auxid);
                                    estado.setText(" Creando");
                                    Modificar = false;
                                    encontrado = false;
                                }
                            } catch (NumberFormatException e) {
                                JOptionPane.showMessageDialog(this, "Error al leer el archivo", "Error", JOptionPane.ERROR_MESSAGE);
                                System.out.println(e);
                            }
                        }
                        s.close();
                        txtdescripcion.grabFocus();
                    }
                } catch (FileNotFoundException e) {
                    JOptionPane.showMessageDialog(this, "No se encontró el archivo", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        } catch (HeadlessException | IOException | NumberFormatException e) {
            JOptionPane.showMessageDialog(rootPane, "El Id no permite carácteres, intente nuevamente...");
            BtnLimpiarActionPerformed(evt);
        }
    }//GEN-LAST:event_txtnumeroActionPerformed

    private void txtdescripcionKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtdescripcionKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            txtdescripcion.requestFocus();
        }
    }//GEN-LAST:event_txtdescripcionKeyPressed

    private void txttipoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txttipoKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            txttipo.requestFocus();
        }
    }//GEN-LAST:event_txttipoKeyPressed

    private void txtnivelKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtnivelKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            txtnivel.requestFocus();
        }
    }//GEN-LAST:event_txtnivelKeyPressed

    private void txtpadreKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtpadreKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            txtpadre.requestFocus();
        }
    }//GEN-LAST:event_txtpadreKeyPressed

    private void txtdebitoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtdebitoKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            txtdebito.requestFocus();
        }
    }//GEN-LAST:event_txtdebitoKeyPressed

    private void txtcreditoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtcreditoKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            txtcredito.requestFocus();
        }
    }//GEN-LAST:event_txtcreditoKeyPressed

    public static String fecha() {
        Date fecha = new Date();
        SimpleDateFormat formatoFecha = new SimpleDateFormat("dd/MM/YYYY");
        return formatoFecha.format(fecha);

    }

    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DE_CATALOGO().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnGuardar;
    private javax.swing.JButton BtnLimpiar;
    private javax.swing.JButton BtnSalir;
    private javax.swing.JPanel PanelAzul;
    private javax.swing.JLabel estado;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSlider jSlider1;
    private javax.swing.JTextField txtbalance;
    private javax.swing.JTextField txtcredito;
    private javax.swing.JTextField txtdebito;
    private javax.swing.JTextField txtdescripcion;
    private javax.swing.JFormattedTextField txtfecha;
    private javax.swing.JTextField txthora;
    private javax.swing.JTextField txtnivel;
    private javax.swing.JTextField txtnumero;
    private javax.swing.JTextField txtpadre;
    private javax.swing.JTextField txttipo;
    // End of variables declaration//GEN-END:variables
}
