package MANTENIMIENTO;

public class GENERAL_MATENIMIENTOS extends javax.swing.JFrame {

    public GENERAL_MATENIMIENTOS() {
        initComponents();
        PanelPrincipal.requestFocus();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelPrincipal = new javax.swing.JPanel();
        Busuario = new javax.swing.JButton();
        Bcatalogo = new javax.swing.JButton();
        Bdocumentos = new javax.swing.JButton();
        Bsalir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        setLocationByPlatform(true);

        PanelPrincipal.setBackground(new java.awt.Color(255, 255, 255));

        Busuario.setBackground(new java.awt.Color(0, 153, 255));
        Busuario.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        Busuario.setForeground(new java.awt.Color(255, 255, 255));
        Busuario.setText("USUARIOS");
        Busuario.setBorder(null);
        Busuario.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Busuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BusuarioActionPerformed(evt);
            }
        });

        Bcatalogo.setBackground(new java.awt.Color(0, 153, 255));
        Bcatalogo.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        Bcatalogo.setForeground(new java.awt.Color(255, 255, 255));
        Bcatalogo.setText("CATALOGO DE CUENTA");
        Bcatalogo.setBorder(null);
        Bcatalogo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Bcatalogo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BcatalogoActionPerformed(evt);
            }
        });

        Bdocumentos.setBackground(new java.awt.Color(0, 153, 255));
        Bdocumentos.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        Bdocumentos.setForeground(new java.awt.Color(255, 255, 255));
        Bdocumentos.setText("DOCUMENTOS");
        Bdocumentos.setBorder(null);
        Bdocumentos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Bdocumentos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BdocumentosActionPerformed(evt);
            }
        });

        Bsalir.setBackground(new java.awt.Color(255, 0, 51));
        Bsalir.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        Bsalir.setForeground(new java.awt.Color(255, 255, 255));
        Bsalir.setText("SALIR");
        Bsalir.setBorder(null);
        Bsalir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Bsalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BsalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PanelPrincipalLayout = new javax.swing.GroupLayout(PanelPrincipal);
        PanelPrincipal.setLayout(PanelPrincipalLayout);
        PanelPrincipalLayout.setHorizontalGroup(
            PanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelPrincipalLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(PanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Bsalir, javax.swing.GroupLayout.PREFERRED_SIZE, 404, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Bdocumentos, javax.swing.GroupLayout.PREFERRED_SIZE, 404, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Bcatalogo, javax.swing.GroupLayout.PREFERRED_SIZE, 404, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Busuario, javax.swing.GroupLayout.PREFERRED_SIZE, 404, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        PanelPrincipalLayout.setVerticalGroup(
            PanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelPrincipalLayout.createSequentialGroup()
                .addContainerGap(38, Short.MAX_VALUE)
                .addComponent(Busuario, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Bcatalogo, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Bdocumentos, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Bsalir, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BusuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BusuarioActionPerformed
       DE_USUARIOS_NEW user = new DE_USUARIOS_NEW();
       user.setVisible(true);
    }//GEN-LAST:event_BusuarioActionPerformed

    private void BcatalogoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BcatalogoActionPerformed
        DE_CATALOGO catalogos = new DE_CATALOGO();
        catalogos.setVisible(true);
    }//GEN-LAST:event_BcatalogoActionPerformed

    private void BdocumentosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BdocumentosActionPerformed
        DE_DOCUMENTO doc = new DE_DOCUMENTO();
        doc.setVisible(true);
    }//GEN-LAST:event_BdocumentosActionPerformed

    private void BsalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BsalirActionPerformed
        this.dispose();
    }//GEN-LAST:event_BsalirActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GENERAL_MATENIMIENTOS().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Bcatalogo;
    private javax.swing.JButton Bdocumentos;
    private javax.swing.JButton Bsalir;
    private javax.swing.JButton Busuario;
    private javax.swing.JPanel PanelPrincipal;
    // End of variables declaration//GEN-END:variables
}
