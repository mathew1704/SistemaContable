package PROCESOS;

public class GENERAL_CIERRES extends javax.swing.JFrame {

    public GENERAL_CIERRES() {
        initComponents();
        PanelPrincipal.requestFocus();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelPrincipal = new javax.swing.JPanel();
        BcierreDiario = new javax.swing.JButton();
        BcierreAnual = new javax.swing.JButton();
        Bsalir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);

        PanelPrincipal.setBackground(new java.awt.Color(255, 255, 255));
        PanelPrincipal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BcierreDiario.setBackground(new java.awt.Color(0, 153, 255));
        BcierreDiario.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        BcierreDiario.setForeground(new java.awt.Color(255, 255, 255));
        BcierreDiario.setText("CIERRE DE DIARIO POR FECHAS");
        BcierreDiario.setBorder(null);
        BcierreDiario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BcierreDiarioActionPerformed(evt);
            }
        });
        PanelPrincipal.add(BcierreDiario, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 404, 75));

        BcierreAnual.setBackground(new java.awt.Color(0, 153, 255));
        BcierreAnual.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        BcierreAnual.setForeground(new java.awt.Color(255, 255, 255));
        BcierreAnual.setText("CIERRE DE FIN DE AÑO FISCAL POR FECHA ");
        BcierreAnual.setBorder(null);
        BcierreAnual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BcierreAnualActionPerformed(evt);
            }
        });
        PanelPrincipal.add(BcierreAnual, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, 404, 75));

        Bsalir.setBackground(new java.awt.Color(255, 0, 51));
        Bsalir.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        Bsalir.setForeground(new java.awt.Color(255, 255, 255));
        Bsalir.setText("SALIR");
        Bsalir.setBorder(null);
        Bsalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BsalirActionPerformed(evt);
            }
        });
        PanelPrincipal.add(Bsalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 270, 404, 75));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 461, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, 422, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BcierreDiarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BcierreDiarioActionPerformed
        CIERRE_DIARIO_FECHA diario = new CIERRE_DIARIO_FECHA();
        diario.setVisible(true);
    }//GEN-LAST:event_BcierreDiarioActionPerformed

    private void BcierreAnualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BcierreAnualActionPerformed
        CIERRE_FIN_ANUAL anual = new CIERRE_FIN_ANUAL();
        anual.setVisible(true);
    }//GEN-LAST:event_BcierreAnualActionPerformed

    private void BsalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BsalirActionPerformed
        this.dispose();
    }//GEN-LAST:event_BsalirActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GENERAL_CIERRES().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BcierreAnual;
    private javax.swing.JButton BcierreDiario;
    private javax.swing.JButton Bsalir;
    private javax.swing.JPanel PanelPrincipal;
    // End of variables declaration//GEN-END:variables
}
