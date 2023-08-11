package MENU_PRINCIPAL;

import CONSULTAS.CONSULTA_USUARIO;
import MANTENIMIENTO.DE_CATALOGO;
import MANTENIMIENTO.DE_DOCUMENTO;
import MANTENIMIENTO.DE_USUARIOS_NEW;
import MOVIMIENTOS.DE_TRANSACCIONES11;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import static javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE;
import javax.swing.plaf.FontUIResource;

public class MENU_PRINCIPAL1 extends javax.swing.JFrame {

    public MENU_PRINCIPAL1() {
        initComponents();
        this.setExtendedState(MENU_PRINCIPAL1.MAXIMIZED_BOTH);
        
        UIManager.put("OptionPane.messageFont", new FontUIResource(new Font("Century Gothic", Font.PLAIN, 14)));
        UIManager.put("OptionPane.messageForeground", Color.black);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        PanelPrincipal = new javax.swing.JPanel();
        Bsalir = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        Mantenimientos = new javax.swing.JMenu();
        m_usuarios = new javax.swing.JMenuItem();
        m_cuentas = new javax.swing.JMenuItem();
        m_documentos = new javax.swing.JMenuItem();
        Movimiento = new javax.swing.JMenu();
        m_transacciones = new javax.swing.JMenuItem();
        Procesos = new javax.swing.JMenu();
        jMenu5 = new javax.swing.JMenu();
        jMenu6 = new javax.swing.JMenu();
        Consultas = new javax.swing.JMenu();
        c_usuarios = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();

        jMenuItem1.setText("jMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        PanelPrincipal.setBackground(new java.awt.Color(0, 153, 255));
        PanelPrincipal.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        PanelPrincipal.setLayout(null);

        Bsalir.setBackground(new java.awt.Color(0, 153, 255));
        Bsalir.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        Bsalir.setForeground(new java.awt.Color(255, 255, 255));
        Bsalir.setIcon(new javax.swing.ImageIcon("C:\\Users\\garci\\Documents\\Imagenes Proyecto\\cerrar-sesionrojo.png")); // NOI18N
        Bsalir.setText("SALIR");
        Bsalir.setBorder(null);
        Bsalir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Bsalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BsalirActionPerformed(evt);
            }
        });
        PanelPrincipal.add(Bsalir);
        Bsalir.setBounds(500, 520, 120, 40);

        Mantenimientos.setIcon(new javax.swing.ImageIcon("C:\\Users\\garci\\Documents\\Imagenes Proyecto\\mantenimiento.png")); // NOI18N
        Mantenimientos.setText("MANTENIMIENTOS");
        Mantenimientos.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        Mantenimientos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MantenimientosActionPerformed(evt);
            }
        });

        m_usuarios.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        m_usuarios.setText("USUARIOS");
        m_usuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                m_usuariosActionPerformed(evt);
            }
        });
        Mantenimientos.add(m_usuarios);

        m_cuentas.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        m_cuentas.setText("CUENTAS");
        m_cuentas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                m_cuentasActionPerformed(evt);
            }
        });
        Mantenimientos.add(m_cuentas);

        m_documentos.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        m_documentos.setText("DOCUMENTOS");
        m_documentos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                m_documentosActionPerformed(evt);
            }
        });
        Mantenimientos.add(m_documentos);

        jMenuBar1.add(Mantenimientos);

        Movimiento.setIcon(new javax.swing.ImageIcon("C:\\Users\\garci\\Documents\\Imagenes Proyecto\\transaccion (1).png")); // NOI18N
        Movimiento.setText("MOVIMIENTO");
        Movimiento.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N

        m_transacciones.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        m_transacciones.setText("TRANSACCIONES");
        m_transacciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                m_transaccionesActionPerformed(evt);
            }
        });
        Movimiento.add(m_transacciones);

        jMenuBar1.add(Movimiento);

        Procesos.setIcon(new javax.swing.ImageIcon("C:\\Users\\garci\\Documents\\Imagenes Proyecto\\flujo-de-trabajo.png")); // NOI18N
        Procesos.setText("PROCESOS");
        Procesos.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N

        jMenu5.setText("CIERRE DIARIO");
        jMenu5.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        Procesos.add(jMenu5);

        jMenu6.setText("jMenu6");
        jMenu6.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        Procesos.add(jMenu6);

        jMenuBar1.add(Procesos);

        Consultas.setIcon(new javax.swing.ImageIcon("C:\\Users\\garci\\Documents\\Imagenes Proyecto\\consulta.png")); // NOI18N
        Consultas.setText("CONSULTAS");
        Consultas.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N

        c_usuarios.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        c_usuarios.setText("USUARIOS");
        c_usuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c_usuariosActionPerformed(evt);
            }
        });
        Consultas.add(c_usuarios);

        jMenuItem3.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jMenuItem3.setText("jMenuItem3");
        Consultas.add(jMenuItem3);

        jMenuItem4.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jMenuItem4.setText("jMenuItem4");
        Consultas.add(jMenuItem4);

        jMenuBar1.add(Consultas);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, 632, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, 568, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void MantenimientosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MantenimientosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MantenimientosActionPerformed

    private void m_usuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_m_usuariosActionPerformed
        DE_USUARIOS_NEW u = new DE_USUARIOS_NEW();
        u.setVisible(true);
    }//GEN-LAST:event_m_usuariosActionPerformed

    private void m_cuentasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_m_cuentasActionPerformed
        DE_CATALOGO c = new DE_CATALOGO();
        c.setVisible(true);
    }//GEN-LAST:event_m_cuentasActionPerformed

    private void m_documentosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_m_documentosActionPerformed
        DE_DOCUMENTO d = new DE_DOCUMENTO();
        d.setVisible(true);
    }//GEN-LAST:event_m_documentosActionPerformed

    private void m_transaccionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_m_transaccionesActionPerformed
        DE_TRANSACCIONES11 t = new DE_TRANSACCIONES11();
        t.setVisible(true);
    }//GEN-LAST:event_m_transaccionesActionPerformed

    private void c_usuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c_usuariosActionPerformed
        CONSULTA_USUARIO cu = new CONSULTA_USUARIO();
        cu.setVisible(true);
    }//GEN-LAST:event_c_usuariosActionPerformed

    private void BsalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BsalirActionPerformed
        this.dispose();
    }//GEN-LAST:event_BsalirActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        int resp = JOptionPane.showConfirmDialog(rootPane, "Desea volver a la ventana del Login?","Cerrar Ventana",JOptionPane.YES_NO_CANCEL_OPTION);

        if (resp == JOptionPane.YES_OPTION) {
            LOgin l = new LOgin();
            l.setVisible(true);
            this.dispose();
        } else if(resp == JOptionPane.NO_OPTION){
            this.dispose();
        } else {
            this.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        }
    }//GEN-LAST:event_formWindowClosing

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MENU_PRINCIPAL1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Bsalir;
    private javax.swing.JMenu Consultas;
    private javax.swing.JMenu Mantenimientos;
    private javax.swing.JMenu Movimiento;
    private javax.swing.JPanel PanelPrincipal;
    private javax.swing.JMenu Procesos;
    private javax.swing.JMenuItem c_usuarios;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem m_cuentas;
    private javax.swing.JMenuItem m_documentos;
    private javax.swing.JMenuItem m_transacciones;
    private javax.swing.JMenuItem m_usuarios;
    // End of variables declaration//GEN-END:variables
}
