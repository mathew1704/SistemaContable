package MANTENIMIENTO;

import ARCHIVOS.Archivo_Documentos;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.plaf.FontUIResource;
import java.util.Scanner;

public class De_Documentos extends javax.swing.JFrame {

    boolean crear;
    boolean Modificar = false;
    boolean encontrado;
    String antigualinea;
    public static String LineaAntigua;

    public De_Documentos() {
        initComponents();
        this.setTitle("Mantenimiento de Documentos");
        UIManager.put("OptionPane.messageFont", new FontUIResource(new Font("Century Gothic", Font.PLAIN, 14)));
        UIManager.put("OptionPane.messageForeground", Color.black);
        txtCodigo.requestFocusInWindow();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelPrincipal = new javax.swing.JPanel();
        PanelAzul = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtDescripcion = new javax.swing.JTextField();
        txtCodigo = new javax.swing.JTextField();
        BtnGuardar = new javax.swing.JButton();
        BtnLimpiar = new javax.swing.JButton();
        BtnEliminar = new javax.swing.JButton();
        estado = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        PanelPrincipal.setBackground(new java.awt.Color(255, 255, 255));
        PanelPrincipal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        PanelAzul.setBackground(new java.awt.Color(0, 153, 255));

        jLabel1.setFont(new java.awt.Font("Century Gothic", 1, 20)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("MANTENIMIENTO DE DOCUMENTOS");

        javax.swing.GroupLayout PanelAzulLayout = new javax.swing.GroupLayout(PanelAzul);
        PanelAzul.setLayout(PanelAzulLayout);
        PanelAzulLayout.setHorizontalGroup(
            PanelAzulLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 540, Short.MAX_VALUE)
        );
        PanelAzulLayout.setVerticalGroup(
            PanelAzulLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelAzulLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        PanelPrincipal.add(PanelAzul, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 540, 70));

        jLabel2.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        jLabel2.setText("Código");
        PanelPrincipal.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 160, -1, -1));

        jLabel3.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        jLabel3.setText("Descripción");
        PanelPrincipal.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 220, -1, -1));

        txtDescripcion.setBackground(new java.awt.Color(237, 237, 237));
        txtDescripcion.setBorder(null);
        PanelPrincipal.add(txtDescripcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 210, 270, 30));

        txtCodigo.setBackground(new java.awt.Color(237, 237, 237));
        txtCodigo.setBorder(null);
        txtCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodigoActionPerformed(evt);
            }
        });
        PanelPrincipal.add(txtCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 160, 270, 30));

        BtnGuardar.setBackground(new java.awt.Color(160, 171, 176));
        BtnGuardar.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        BtnGuardar.setForeground(new java.awt.Color(255, 255, 255));
        BtnGuardar.setText("GUARDAR");
        BtnGuardar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnGuardarActionPerformed(evt);
            }
        });
        PanelPrincipal.add(BtnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 290, 110, 40));

        BtnLimpiar.setBackground(new java.awt.Color(160, 171, 176));
        BtnLimpiar.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        BtnLimpiar.setForeground(new java.awt.Color(255, 255, 255));
        BtnLimpiar.setText("LIMPIAR");
        BtnLimpiar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnLimpiarActionPerformed(evt);
            }
        });
        PanelPrincipal.add(BtnLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 290, 100, 40));

        BtnEliminar.setBackground(new java.awt.Color(160, 171, 176));
        BtnEliminar.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        BtnEliminar.setForeground(new java.awt.Color(255, 255, 255));
        BtnEliminar.setText("SALIR");
        BtnEliminar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnEliminarActionPerformed(evt);
            }
        });
        PanelPrincipal.add(BtnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 290, 100, 40));

        estado.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        estado.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        PanelPrincipal.add(estado, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 80, 100, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, 361, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnEliminarActionPerformed
        this.dispose();
    }//GEN-LAST:event_BtnEliminarActionPerformed

    private void BtnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnLimpiarActionPerformed
        txtCodigo.setText("");
        txtDescripcion.setText("");
        estado.setText("");
    }//GEN-LAST:event_BtnLimpiarActionPerformed

    private void txtCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodigoActionPerformed
        if (txtCodigo.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Debe ingresar el Código del Documento para continuar");
        } else {
            txtDescripcion.setText("");
            txtDescripcion.grabFocus();
        }

        String codigo = txtCodigo.getText();
        String descripcion = txtDescripcion.getText();

        Scanner s;
        String nv = "";
        boolean encontrado = false;

        try {
            File f = new File("Documentos.txt");

            if (!f.exists()) {
                f.createNewFile();
            } else {
                s = new Scanner(f);

                while (s.hasNextLine() && !encontrado) {
                    String linea = s.nextLine();
                    Scanner s1 = new Scanner(linea);

                    s1.useDelimiter("\\s*;\\s*");

                    try {
                        String auxcodigo = s1.next();
                        String auxdescrip = s1.next();
                        
                        if (codigo.equals(auxcodigo)) {

                            txtCodigo.setText(nv);
                            txtDescripcion.setText(s1.next());
                            encontrado = true;
                            crear = true;

                            antigualinea = txtCodigo.getText() + ";" + txtDescripcion.getText();
                            estado.setText("MODIFICANDO");

                        } else {

                            txtCodigo.setText("");
                            txtDescripcion.setText("");

                            encontrado = false;
                            crear = false;
                            estado.setText("CREANDO");
                        }
                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(this, "Error al leer el archivo", "Error", JOptionPane.ERROR_MESSAGE);
                    }
                }
                s.close();
            }

        } catch (FileNotFoundException e) {
            JOptionPane.showMessageDialog(this, "No se encontra el archivo", "Error", JOptionPane.ERROR_MESSAGE);
        } catch (IOException ex) {
            System.out.println("Error: " + ex);
        }
    }//GEN-LAST:event_txtCodigoActionPerformed

    private void BtnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnGuardarActionPerformed
        if (txtCodigo.getText().isEmpty() || txtDescripcion.getText().isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "Por Favor Rellene Todos los campos", "ERROR", HEIGHT);
        } else {

            String codigo = "";
            String descripcion = "";
            String nuevalinea = "";

            Archivo_Documentos archivo = new Archivo_Documentos();

            codigo = txtCodigo.getText();
            descripcion = txtDescripcion.getText();

            if (crear == false) {
                archivo.Guardar(codigo, descripcion);
            } else {
                nuevalinea = (codigo + ";" + descripcion);
                archivo.Modificar(antigualinea, nuevalinea);
            }
            txtCodigo.setText("");
            txtDescripcion.setText("");
            estado.setText("");

            JOptionPane.showMessageDialog(null, "Registro guardado");
        }
    }//GEN-LAST:event_BtnGuardarActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new De_Documentos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnEliminar;
    private javax.swing.JButton BtnGuardar;
    private javax.swing.JButton BtnLimpiar;
    private javax.swing.JPanel PanelAzul;
    private javax.swing.JPanel PanelPrincipal;
    private javax.swing.JLabel estado;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtDescripcion;
    // End of variables declaration//GEN-END:variables
}
