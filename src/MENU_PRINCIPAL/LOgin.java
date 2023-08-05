package MENU_PRINCIPAL;

import texto.TextPrompt;
import java.awt.Color;
import java.awt.Font;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.plaf.FontUIResource;

public class LOgin extends javax.swing.JFrame {

    public LOgin() {
        initComponents();
        UIManager.put("OptionPane.messageFont", new FontUIResource(new Font("Century Gothic", Font.PLAIN, 14)));
        UIManager.put("OptionPane.messageForeground", Color.black);
        jLabel1.requestFocusInWindow();

        TextPrompt usuario = new TextPrompt("Digite su usuario", txtUsuario, TextPrompt.Show.ALWAYS);
        usuario.setForeground(Color.gray);

        TextPrompt contr = new TextPrompt("*********", contraseña, TextPrompt.Show.ALWAYS);
        contr.setForeground(Color.gray);
    }
    public int Nivel;

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelPrincipal = new javax.swing.JPanel();
        txtUsuario = new javax.swing.JTextField();
        contraseña = new javax.swing.JPasswordField();
        BtnLogin = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        PanelAzul = new javax.swing.JPanel();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator1 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setPreferredSize(new java.awt.Dimension(495, 424));
        setResizable(false);

        PanelPrincipal.setBackground(new java.awt.Color(255, 255, 255));
        PanelPrincipal.setPreferredSize(new java.awt.Dimension(500, 430));
        PanelPrincipal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtUsuario.setFont(new java.awt.Font("Calibri Light", 0, 16)); // NOI18N
        txtUsuario.setAutoscrolls(false);
        txtUsuario.setBorder(null);
        txtUsuario.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        txtUsuario.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsuarioActionPerformed(evt);
            }
        });
        PanelPrincipal.add(txtUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 180, 210, -1));

        contraseña.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        contraseña.setBorder(null);
        contraseña.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        contraseña.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                contraseñaActionPerformed(evt);
            }
        });
        PanelPrincipal.add(contraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 260, 200, 20));

        BtnLogin.setBackground(new java.awt.Color(0, 153, 255));
        BtnLogin.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        BtnLogin.setForeground(new java.awt.Color(255, 255, 255));
        BtnLogin.setText("LOGIN");
        BtnLogin.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BtnLogin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtnLogin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BtnLoginMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BtnLoginMouseExited(evt);
            }
        });
        BtnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnLoginActionPerformed(evt);
            }
        });
        PanelPrincipal.add(BtnLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 330, 130, 40));

        jLabel1.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel1.setText("SISTEMA CONTABLE");
        PanelPrincipal.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 20, -1, -1));

        jLabel2.setFont(new java.awt.Font("Century Gothic", 1, 26)); // NOI18N
        jLabel2.setText("INICIAR SESIÓN");
        PanelPrincipal.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 70, -1, -1));

        jLabel3.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        jLabel3.setText("Username");
        PanelPrincipal.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 150, -1, -1));

        jLabel4.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        jLabel4.setText("Password");
        PanelPrincipal.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 230, -1, -1));

        PanelAzul.setBackground(new java.awt.Color(0, 153, 255));

        javax.swing.GroupLayout PanelAzulLayout = new javax.swing.GroupLayout(PanelAzul);
        PanelAzul.setLayout(PanelAzulLayout);
        PanelAzulLayout.setHorizontalGroup(
            PanelAzulLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 170, Short.MAX_VALUE)
        );
        PanelAzulLayout.setVerticalGroup(
            PanelAzulLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 430, Short.MAX_VALUE)
        );

        PanelPrincipal.add(PanelAzul, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 170, 430));

        jSeparator2.setForeground(new java.awt.Color(102, 102, 102));
        PanelPrincipal.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 280, 260, 10));

        jSeparator1.setForeground(new java.awt.Color(102, 102, 102));
        PanelPrincipal.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 200, 260, 10));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, 495, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsuarioActionPerformed
        if (evt.getSource() == txtUsuario) {
            contraseña.grabFocus();
        }
    }//GEN-LAST:event_txtUsuarioActionPerformed

    private void contraseñaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_contraseñaActionPerformed
// hola ndiowhfiofjefjwel
    }//GEN-LAST:event_contraseñaActionPerformed

    private void BtnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnLoginActionPerformed
        if (txtUsuario.getText().equals("") || contraseña.getText().equals("")) {

            if (txtUsuario.getText().isBlank()) {
                JOptionPane.showMessageDialog(rootPane, "Por Favor Rellene Todos los campos", "ERROR", HEIGHT);
                txtUsuario.requestFocus();
                txtUsuario.setText("");
            }
            if (contraseña.getText().isBlank()) {
                JOptionPane.showMessageDialog(rootPane, "Por Favor Rellene Todos los campos", "ERROR", HEIGHT);
                contraseña.requestFocus();
                contraseña.setText("");
            }

        } else {

            boolean encontrado = false;

            try {
                File f = new File("Usuarios.txt");
                if (!f.exists()) {
                    f.createNewFile();
                    JOptionPane.showMessageDialog(rootPane, "No se encontraron registros de Usuarios");
                } else {
                    Scanner s = new Scanner(f);
                    while (s.hasNextLine() && !encontrado) {
                        String linea = s.nextLine();
                        Scanner s1 = new Scanner(linea);

                        s1.useDelimiter("\\s*;\\s*");

                        String auxLogin = s1.next();
                        String auxPass = s1.next();

                        if (auxLogin.equals(txtUsuario.getText()) && auxPass.equals(contraseña.getText())) {
                            Nivel = Integer.parseInt(s1.next());
                            String Nombre = s1.next();
                            
                            Menu m = new Menu();

                            if (Nivel == 1) {
                                
                                // MENU_Mantenimiento.menuProcesos.setEnabled(false);
                                // MENU_Mantenimiento.usuario.setEnabled(false);

                                m.setVisible(true);

                                encontrado = true;
                                this.dispose();
                            } else if (Nivel == 0) {

                                Menu M = new Menu();
                                M.setVisible(true);
                                dispose();

                            }

                            JOptionPane.showMessageDialog(rootPane, "Bienvenido " + Nombre);

                        } else {
                            encontrado = false;
                            if (auxLogin.equals(txtUsuario.getText())) {
                                JOptionPane.showMessageDialog(null, "Contraseña Incorrecta", "Atención", 2);
                                txtUsuario.setText("");
                                contraseña.setText("");
                                return;
                            } else if (!s.hasNextLine()) {
                                JOptionPane.showMessageDialog(rootPane, "No hay registro de este usuario");
                                txtUsuario.setText("");
                                contraseña.setText("");
                            }
                        }
                    }
                    s.close();
                }

            } catch (IOException e) {
                System.out.println("Error: " + e);
            }
        }
    }//GEN-LAST:event_BtnLoginActionPerformed

    private void BtnLoginMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnLoginMouseEntered
        BtnLogin.setBackground(new Color(0, 102, 225));
    }//GEN-LAST:event_BtnLoginMouseEntered

    private void BtnLoginMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnLoginMouseExited
        BtnLogin.setBackground(new Color(0, 153, 225));
    }//GEN-LAST:event_BtnLoginMouseExited

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LOgin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnLogin;
    private javax.swing.JPanel PanelAzul;
    private javax.swing.JPanel PanelPrincipal;
    private javax.swing.JPasswordField contraseña;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
