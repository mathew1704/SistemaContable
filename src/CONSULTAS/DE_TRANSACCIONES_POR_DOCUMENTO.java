/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package CONSULTAS;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.KeyEvent;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Scanner;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.plaf.FontUIResource;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;

/**
 *
 * @author garci
 */
public class DE_TRANSACCIONES_POR_DOCUMENTO extends javax.swing.JFrame {

    public DefaultTableModel TablaM;

    public DE_TRANSACCIONES_POR_DOCUMENTO() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setTitle("Consulta Transacciones Tipo de Documento");
        PanelPrincipal.requestFocusInWindow();

        UIManager.put("OptionPane.messageFont", new FontUIResource(new Font("Century Gothic", Font.PLAIN, 14)));
        UIManager.put("OptionPane.messageForeground", Color.black);

        TablaM = (DefaultTableModel) TablaDoc.getModel();

        JTableHeader tableHeader = TablaDoc.getTableHeader();
        Font headerFont = new Font("Century Gothic", Font.PLAIN, 14); // Cambiar el tipo de letra
        tableHeader.setFont(headerFont);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelPrincipal = new javax.swing.JPanel();
        PanelAzul = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaRegistro = new javax.swing.JTable();
        btnconsultar = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        CbTipoDoc = new javax.swing.JComboBox<>();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        PanelPrincipal1 = new javax.swing.JPanel();
        PanelAzul1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        btnconsultar1 = new javax.swing.JButton();
        btnSalir1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        txtNdocumento = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        TablaDoc = new javax.swing.JTable();

        PanelPrincipal.setBackground(new java.awt.Color(255, 255, 255));
        PanelPrincipal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        PanelAzul.setBackground(new java.awt.Color(0, 153, 255));

        jLabel1.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("CONSULTA DE TRANSACCIONES DE TIPO DE DOCUMENTOS");

        javax.swing.GroupLayout PanelAzulLayout = new javax.swing.GroupLayout(PanelAzul);
        PanelAzul.setLayout(PanelAzulLayout);
        PanelAzulLayout.setHorizontalGroup(
            PanelAzulLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelAzulLayout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 911, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        PanelAzulLayout.setVerticalGroup(
            PanelAzulLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelAzulLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        PanelPrincipal.add(PanelAzul, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 70));

        tablaRegistro.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        tablaRegistro.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Title 1", "Title 2"
            }
        ));
        tablaRegistro.setGridColor(new java.awt.Color(255, 255, 255));
        tablaRegistro.setSelectionBackground(new java.awt.Color(255, 255, 255));
        jScrollPane1.setViewportView(tablaRegistro);

        PanelPrincipal.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 180, 910, 370));

        btnconsultar.setBackground(new java.awt.Color(160, 171, 176));
        btnconsultar.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        btnconsultar.setForeground(new java.awt.Color(255, 255, 255));
        btnconsultar.setText("CONSULTAR");
        btnconsultar.setBorder(null);
        btnconsultar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnconsultar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnconsultarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnconsultarMouseExited(evt);
            }
        });
        btnconsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnconsultarActionPerformed(evt);
            }
        });
        PanelPrincipal.add(btnconsultar, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 100, 130, 50));

        btnSalir.setBackground(new java.awt.Color(160, 171, 176));
        btnSalir.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        btnSalir.setForeground(new java.awt.Color(255, 255, 255));
        btnSalir.setText("SALIR");
        btnSalir.setBorder(null);
        btnSalir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnSalirMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnSalirMouseExited(evt);
            }
        });
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        PanelPrincipal.add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 100, 130, 50));

        jLabel3.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel3.setText("TIPO DE DOCUMENTO");
        PanelPrincipal.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 152, 32));

        CbTipoDoc.setBackground(new java.awt.Color(237, 237, 237));
        CbTipoDoc.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        CbTipoDoc.setToolTipText("");
        CbTipoDoc.setBorder(null);
        CbTipoDoc.setName(""); // NOI18N
        CbTipoDoc.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                CbTipoDocItemStateChanged(evt);
            }
        });
        CbTipoDoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CbTipoDocActionPerformed(evt);
            }
        });
        PanelPrincipal.add(CbTipoDoc, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 110, 330, -1));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 427, Short.MAX_VALUE)
        );

        PanelPrincipal1.setBackground(new java.awt.Color(255, 255, 255));
        PanelPrincipal1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        PanelAzul1.setBackground(new java.awt.Color(0, 153, 255));

        jLabel2.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("CONSULTA DE TRANSACCIONES DE DOCUMENTOS");

        javax.swing.GroupLayout PanelAzul1Layout = new javax.swing.GroupLayout(PanelAzul1);
        PanelAzul1.setLayout(PanelAzul1Layout);
        PanelAzul1Layout.setHorizontalGroup(
            PanelAzul1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelAzul1Layout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 911, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        PanelAzul1Layout.setVerticalGroup(
            PanelAzul1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelAzul1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        PanelPrincipal1.add(PanelAzul1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 70));

        btnconsultar1.setBackground(new java.awt.Color(160, 171, 176));
        btnconsultar1.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        btnconsultar1.setForeground(new java.awt.Color(255, 255, 255));
        btnconsultar1.setText("CONSULTAR");
        btnconsultar1.setBorder(null);
        btnconsultar1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnconsultar1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnconsultar1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnconsultar1MouseExited(evt);
            }
        });
        btnconsultar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnconsultar1ActionPerformed(evt);
            }
        });
        PanelPrincipal1.add(btnconsultar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 80, 130, 50));

        btnSalir1.setBackground(new java.awt.Color(160, 171, 176));
        btnSalir1.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        btnSalir1.setForeground(new java.awt.Color(255, 255, 255));
        btnSalir1.setText("SALIR");
        btnSalir1.setBorder(null);
        btnSalir1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSalir1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnSalir1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnSalir1MouseExited(evt);
            }
        });
        btnSalir1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalir1ActionPerformed(evt);
            }
        });
        PanelPrincipal1.add(btnSalir1, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 80, 130, 50));

        jLabel4.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel4.setText("NO. DOCUMENTO");
        PanelPrincipal1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 152, 32));

        txtNdocumento.setBackground(new java.awt.Color(237, 237, 237));
        txtNdocumento.setFont(new java.awt.Font("Calibri Light", 0, 16)); // NOI18N
        txtNdocumento.setBorder(null);
        PanelPrincipal1.add(txtNdocumento, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 90, 290, 30));

        TablaDoc.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        TablaDoc.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "No. Doc", "Fecha ", "Hecho Por", "#", "Cuenta", "Descripcion C", "Debitos", "Creditos"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(TablaDoc);

        PanelPrincipal1.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 160, 910, 420));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelPrincipal1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(PanelPrincipal1, javax.swing.GroupLayout.PREFERRED_SIZE, 549, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(139, 139, 139))
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 555, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnconsultarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnconsultarMouseEntered
        btnconsultar.setBackground(new Color(0, 51, 204));
    }//GEN-LAST:event_btnconsultarMouseEntered

    private void btnconsultarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnconsultarMouseExited
        btnconsultar.setBackground(new Color(160, 171, 176));
    }//GEN-LAST:event_btnconsultarMouseExited

    private void btnconsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnconsultarActionPerformed


    }//GEN-LAST:event_btnconsultarActionPerformed

    private void btnSalirMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSalirMouseEntered
        btnSalir.setBackground(Color.red);
    }//GEN-LAST:event_btnSalirMouseEntered

    private void btnSalirMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSalirMouseExited
        btnSalir.setBackground(new Color(160, 171, 176));
    }//GEN-LAST:event_btnSalirMouseExited

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        //        DE_USUARIOS e = new DE_USUARIOS();
        //        e.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void CbTipoDocItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_CbTipoDocItemStateChanged

    }//GEN-LAST:event_CbTipoDocItemStateChanged

    private void CbTipoDocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CbTipoDocActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CbTipoDocActionPerformed

    private void btnconsultar1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnconsultar1MouseEntered
        btnconsultar.setBackground(new Color(0, 51, 204));
    }//GEN-LAST:event_btnconsultar1MouseEntered

    private void btnconsultar1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnconsultar1MouseExited
        btnconsultar.setBackground(new Color(160, 171, 176));
    }//GEN-LAST:event_btnconsultar1MouseExited

    private void btnconsultar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnconsultar1ActionPerformed
      
         String searchTerm = txtNdocumento.getText();
         if (txtNdocumento.getText().isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "Debe Ingresar el Numero de Documento");
            return;
        }

        TablaM.setRowCount(0);
        boolean filas = false;

        String Ndoc, tipo, desc, nombH, monto, fechaA, estado;
        String numDoc, sec, cuenta, descC, deb, cred, comt;

        File f = new File("Cabecera Transacciones.txt");
        File d = new File("Detalle Transacciones.txt");

        try {
            if (!f.exists()) {
                JOptionPane.showMessageDialog(rootPane, "El archivo no existe");
            } else {
                Scanner s = new Scanner(f);
                Scanner w = new Scanner(d);

                while (s.hasNextLine()) {
                    String linea = s.nextLine();
                    Scanner s1 = new Scanner(linea);

                    s1.useDelimiter("\\s*;\\s*");

                    Ndoc = s1.next();
                    String fechaArchivo = s1.next();
                    tipo = s1.next();
                    desc = s1.next();
                    nombH = s1.next();
                    monto = s1.next();
                    fechaA = s1.next();
                    estado = s1.next();

                    if (Ndoc.equals(searchTerm)) {

                        while (w.hasNextLine()) {
                            String line = w.nextLine();
                            Scanner s2 = new Scanner(line);

                            s2.useDelimiter("\\s*;\\s*");

                            numDoc = s2.next();
                            sec = s2.next();
                            cuenta = s2.next();
                            descC = s2.next();
                            deb = s2.next();
                            cred = s2.next();
//                        comt = s2.next();

                            TablaM.addRow(new Object[]{Ndoc, fechaArchivo, nombH, sec, cuenta, descC, deb, cred});
                            filas = true;
                        }
                    }
                }
                s.close();

                if (!filas) {
                    JOptionPane.showMessageDialog(rootPane, "No se encontró ningún registro con el Documento Ingresado.");
                }
            }
        } catch (IOException e) {
            System.out.println("Error al abrir el archivo");
        }

    }//GEN-LAST:event_btnconsultar1ActionPerformed

    private void btnSalir1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSalir1MouseEntered
        btnSalir.setBackground(Color.red);
    }//GEN-LAST:event_btnSalir1MouseEntered

    private void btnSalir1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSalir1MouseExited
        btnSalir.setBackground(new Color(160, 171, 176));
    }//GEN-LAST:event_btnSalir1MouseExited

    private void btnSalir1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalir1ActionPerformed
        //        DE_USUARIOS e = new DE_USUARIOS();
        //        e.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnSalir1ActionPerformed

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
            java.util.logging.Logger.getLogger(DE_TRANSACCIONES_POR_DOCUMENTO.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DE_TRANSACCIONES_POR_DOCUMENTO.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DE_TRANSACCIONES_POR_DOCUMENTO.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DE_TRANSACCIONES_POR_DOCUMENTO.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DE_TRANSACCIONES_POR_DOCUMENTO().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> CbTipoDoc;
    private javax.swing.JPanel PanelAzul;
    private javax.swing.JPanel PanelAzul1;
    private javax.swing.JPanel PanelPrincipal;
    private javax.swing.JPanel PanelPrincipal1;
    private javax.swing.JTable TablaDoc;
    private javax.swing.JButton btnSalir;
    private javax.swing.JButton btnSalir1;
    private javax.swing.JButton btnconsultar;
    private javax.swing.JButton btnconsultar1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable tablaRegistro;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtCodigo1;
    private javax.swing.JTextField txtCodigo2;
    private javax.swing.JTextField txtNdocumento;
    // End of variables declaration//GEN-END:variables
}
