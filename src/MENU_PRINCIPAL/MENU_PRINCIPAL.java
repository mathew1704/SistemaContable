package MENU_PRINCIPAL;

import CONSULTAS.GENERAL_CONSULTAS;
import MANTENIMIENTO.GENERAL_MATENIMIENTOS;
import MOVIMIENTOS.DE_TRANSACCIONES11;
import PROCESOS.GENERAL_CIERRES;
import java.awt.Color;

public class MENU_PRINCIPAL extends javax.swing.JFrame {

    public MENU_PRINCIPAL() {
        initComponents();
        initComponents();
        jLabel1.requestFocusInWindow();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelPrincipal = new javax.swing.JPanel();
        Bmantenimientos = new javax.swing.JButton();
        Bmovimientos = new javax.swing.JButton();
        Bprocesos = new javax.swing.JButton();
        Bconsultas = new javax.swing.JButton();
        Bsalir = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Principal");
        setLocationByPlatform(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        PanelPrincipal.setBackground(new java.awt.Color(255, 255, 255));
        PanelPrincipal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Bmantenimientos.setBackground(new java.awt.Color(0, 153, 255));
        Bmantenimientos.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        Bmantenimientos.setForeground(new java.awt.Color(255, 255, 255));
        Bmantenimientos.setText("MANTENIMIENTOS");
        Bmantenimientos.setBorder(null);
        Bmantenimientos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Bmantenimientos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BmantenimientosMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BmantenimientosMouseExited(evt);
            }
        });
        Bmantenimientos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BmantenimientosActionPerformed(evt);
            }
        });
        PanelPrincipal.add(Bmantenimientos, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 349, 52));

        Bmovimientos.setBackground(new java.awt.Color(0, 153, 255));
        Bmovimientos.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        Bmovimientos.setForeground(new java.awt.Color(255, 255, 255));
        Bmovimientos.setText("MOVIMIENTO");
        Bmovimientos.setBorder(null);
        Bmovimientos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Bmovimientos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BmovimientosMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BmovimientosMouseExited(evt);
            }
        });
        Bmovimientos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BmovimientosActionPerformed(evt);
            }
        });
        PanelPrincipal.add(Bmovimientos, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, 349, 52));

        Bprocesos.setBackground(new java.awt.Color(0, 153, 255));
        Bprocesos.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        Bprocesos.setForeground(new java.awt.Color(255, 255, 255));
        Bprocesos.setText("PROCESOS");
        Bprocesos.setBorder(null);
        Bprocesos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Bprocesos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BprocesosMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BprocesosMouseExited(evt);
            }
        });
        Bprocesos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BprocesosActionPerformed(evt);
            }
        });
        PanelPrincipal.add(Bprocesos, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, 349, 52));

        Bconsultas.setBackground(new java.awt.Color(0, 153, 255));
        Bconsultas.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        Bconsultas.setForeground(new java.awt.Color(255, 255, 255));
        Bconsultas.setText("CONSULTAS");
        Bconsultas.setBorder(null);
        Bconsultas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Bconsultas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BconsultasMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BconsultasMouseExited(evt);
            }
        });
        Bconsultas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BconsultasActionPerformed(evt);
            }
        });
        PanelPrincipal.add(Bconsultas, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 330, 349, 52));

        Bsalir.setBackground(new java.awt.Color(255, 0, 51));
        Bsalir.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        Bsalir.setForeground(new java.awt.Color(255, 255, 255));
        Bsalir.setText("SALIR");
        Bsalir.setBorder(null);
        Bsalir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Bsalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BsalirActionPerformed(evt);
            }
        });
        PanelPrincipal.add(Bsalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 410, 349, 52));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 153, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("PRINCIPAL");
        jLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 255)));
        PanelPrincipal.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 349, 46));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, 370, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, 555, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BmovimientosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BmovimientosActionPerformed
        DE_TRANSACCIONES11 tran = new DE_TRANSACCIONES11();
        tran.setVisible(true);
    }//GEN-LAST:event_BmovimientosActionPerformed

    private void BmantenimientosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BmantenimientosActionPerformed
        GENERAL_MATENIMIENTOS mant = new GENERAL_MATENIMIENTOS();
        mant.setVisible(true);
    }//GEN-LAST:event_BmantenimientosActionPerformed

    private void BprocesosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BprocesosActionPerformed
        GENERAL_CIERRES cierres = new GENERAL_CIERRES();
        cierres.setVisible(true);
    }//GEN-LAST:event_BprocesosActionPerformed

    private void BconsultasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BconsultasActionPerformed
        GENERAL_CONSULTAS consultas = new GENERAL_CONSULTAS();
        consultas.setVisible(true);
    }//GEN-LAST:event_BconsultasActionPerformed

    private void BsalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BsalirActionPerformed
        this.dispose();
    }//GEN-LAST:event_BsalirActionPerformed

    private void BmantenimientosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BmantenimientosMouseEntered
        Bmantenimientos.setBackground(new Color(0, 51, 204));
    }//GEN-LAST:event_BmantenimientosMouseEntered

    private void BmantenimientosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BmantenimientosMouseExited
        Bmantenimientos.setBackground(new Color(0, 153, 255));
    }//GEN-LAST:event_BmantenimientosMouseExited

    private void BmovimientosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BmovimientosMouseEntered
        Bmovimientos.setBackground(new Color(0, 51, 204));
    }//GEN-LAST:event_BmovimientosMouseEntered

    private void BmovimientosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BmovimientosMouseExited
        Bmovimientos.setBackground(new Color(0, 153, 255));
    }//GEN-LAST:event_BmovimientosMouseExited

    private void BprocesosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BprocesosMouseEntered
       Bprocesos.setBackground(new Color(0, 51, 204));
    }//GEN-LAST:event_BprocesosMouseEntered

    private void BprocesosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BprocesosMouseExited
        Bprocesos.setBackground(new Color(0, 153, 255));
    }//GEN-LAST:event_BprocesosMouseExited

    private void BconsultasMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BconsultasMouseEntered
       Bconsultas.setBackground(new Color(0, 51, 204)); 
    }//GEN-LAST:event_BconsultasMouseEntered

    private void BconsultasMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BconsultasMouseExited
        Bconsultas.setBackground(new Color(0, 153, 255));
    }//GEN-LAST:event_BconsultasMouseExited

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
     
    }//GEN-LAST:event_formWindowClosing

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MENU_PRINCIPAL().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Bconsultas;
    private javax.swing.JButton Bmantenimientos;
    private javax.swing.JButton Bmovimientos;
    private javax.swing.JButton Bprocesos;
    private javax.swing.JButton Bsalir;
    private javax.swing.JPanel PanelPrincipal;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
