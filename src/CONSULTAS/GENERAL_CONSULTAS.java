package CONSULTAS;

public class GENERAL_CONSULTAS extends javax.swing.JFrame {

    public GENERAL_CONSULTAS() {
        initComponents();
        PanelPrincipal.requestFocus();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelPrincipal = new javax.swing.JPanel();
        BcatalogoCuenta = new javax.swing.JButton();
        BtransaccionFecha = new javax.swing.JButton();
        BtransaccionRangoFecha = new javax.swing.JButton();
        BtransaccionDocumento = new javax.swing.JButton();
        BtransaccionTipoDocumento = new javax.swing.JButton();
        BbalanzaGeneral = new javax.swing.JButton();
        BbalanzaComprobacion = new javax.swing.JButton();
        BresumenGastosGenerales = new javax.swing.JButton();
        BestadoGananciasPerdidas = new javax.swing.JButton();
        Bsalir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setResizable(false);

        PanelPrincipal.setBackground(new java.awt.Color(255, 255, 255));
        PanelPrincipal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BcatalogoCuenta.setBackground(new java.awt.Color(0, 153, 255));
        BcatalogoCuenta.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        BcatalogoCuenta.setForeground(new java.awt.Color(255, 255, 255));
        BcatalogoCuenta.setText("CATALOGO DE CUENTA");
        BcatalogoCuenta.setBorder(null);
        BcatalogoCuenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BcatalogoCuentaActionPerformed(evt);
            }
        });
        PanelPrincipal.add(BcatalogoCuenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 404, 30));

        BtransaccionFecha.setBackground(new java.awt.Color(0, 153, 255));
        BtransaccionFecha.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        BtransaccionFecha.setForeground(new java.awt.Color(255, 255, 255));
        BtransaccionFecha.setText("TRANSACCIONES POR FECHA");
        BtransaccionFecha.setBorder(null);
        BtransaccionFecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtransaccionFechaActionPerformed(evt);
            }
        });
        PanelPrincipal.add(BtransaccionFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 404, 30));

        BtransaccionRangoFecha.setBackground(new java.awt.Color(0, 153, 255));
        BtransaccionRangoFecha.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        BtransaccionRangoFecha.setForeground(new java.awt.Color(255, 255, 255));
        BtransaccionRangoFecha.setText("TRANSACCIONES POR RANGO DE FECHAS");
        BtransaccionRangoFecha.setBorder(null);
        BtransaccionRangoFecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtransaccionRangoFechaActionPerformed(evt);
            }
        });
        PanelPrincipal.add(BtransaccionRangoFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 404, 30));

        BtransaccionDocumento.setBackground(new java.awt.Color(0, 153, 255));
        BtransaccionDocumento.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        BtransaccionDocumento.setForeground(new java.awt.Color(255, 255, 255));
        BtransaccionDocumento.setText("TRANSACCIONES POR DOCUMENTO");
        BtransaccionDocumento.setBorder(null);
        BtransaccionDocumento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtransaccionDocumentoActionPerformed(evt);
            }
        });
        PanelPrincipal.add(BtransaccionDocumento, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 404, 30));

        BtransaccionTipoDocumento.setBackground(new java.awt.Color(0, 153, 255));
        BtransaccionTipoDocumento.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        BtransaccionTipoDocumento.setForeground(new java.awt.Color(255, 255, 255));
        BtransaccionTipoDocumento.setText("TRANSACCIONES POR TIPO DE DOCUMENTO");
        BtransaccionTipoDocumento.setBorder(null);
        BtransaccionTipoDocumento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtransaccionTipoDocumentoActionPerformed(evt);
            }
        });
        PanelPrincipal.add(BtransaccionTipoDocumento, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 404, 30));

        BbalanzaGeneral.setBackground(new java.awt.Color(0, 153, 255));
        BbalanzaGeneral.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        BbalanzaGeneral.setForeground(new java.awt.Color(255, 255, 255));
        BbalanzaGeneral.setText("BALANZA GENERAL (ACT,PAS,CAP)");
        BbalanzaGeneral.setBorder(null);
        BbalanzaGeneral.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BbalanzaGeneralActionPerformed(evt);
            }
        });
        PanelPrincipal.add(BbalanzaGeneral, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, 404, 30));

        BbalanzaComprobacion.setBackground(new java.awt.Color(0, 153, 255));
        BbalanzaComprobacion.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        BbalanzaComprobacion.setForeground(new java.awt.Color(255, 255, 255));
        BbalanzaComprobacion.setText("BALANZA DE COMPROBACION");
        BbalanzaComprobacion.setBorder(null);
        BbalanzaComprobacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BbalanzaComprobacionActionPerformed(evt);
            }
        });
        PanelPrincipal.add(BbalanzaComprobacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, 404, 30));

        BresumenGastosGenerales.setBackground(new java.awt.Color(0, 153, 255));
        BresumenGastosGenerales.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        BresumenGastosGenerales.setForeground(new java.awt.Color(255, 255, 255));
        BresumenGastosGenerales.setText("RESUMEN DE GASTOS GENERALES");
        BresumenGastosGenerales.setBorder(null);
        BresumenGastosGenerales.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BresumenGastosGeneralesActionPerformed(evt);
            }
        });
        PanelPrincipal.add(BresumenGastosGenerales, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 310, 404, 30));

        BestadoGananciasPerdidas.setBackground(new java.awt.Color(0, 153, 255));
        BestadoGananciasPerdidas.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        BestadoGananciasPerdidas.setForeground(new java.awt.Color(255, 255, 255));
        BestadoGananciasPerdidas.setText("ESTADO DE GANACIAS Y PERDIDAS");
        BestadoGananciasPerdidas.setBorder(null);
        BestadoGananciasPerdidas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BestadoGananciasPerdidasActionPerformed(evt);
            }
        });
        PanelPrincipal.add(BestadoGananciasPerdidas, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 350, 404, 30));

        Bsalir.setBackground(new java.awt.Color(255, 0, 51));
        Bsalir.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        Bsalir.setForeground(new java.awt.Color(255, 255, 255));
        Bsalir.setText("SALIR");
        Bsalir.setBorder(null);
        Bsalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BsalirActionPerformed(evt);
            }
        });
        PanelPrincipal.add(Bsalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 390, 404, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, 449, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 512, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtransaccionTipoDocumentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtransaccionTipoDocumentoActionPerformed
        DE_TRANSACCIONES_TIPO_DOCUMENTO ttipodoc = new DE_TRANSACCIONES_TIPO_DOCUMENTO();
        ttipodoc.setVisible(true);
    }//GEN-LAST:event_BtransaccionTipoDocumentoActionPerformed

    private void BcatalogoCuentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BcatalogoCuentaActionPerformed
        DE_CATALOGO_DE_CUENTA ccuenta = new DE_CATALOGO_DE_CUENTA();
        ccuenta.setVisible(true);
    }//GEN-LAST:event_BcatalogoCuentaActionPerformed

    private void BtransaccionFechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtransaccionFechaActionPerformed
        DE_TRANSACCIONES_POR_FECHA tfecha = new DE_TRANSACCIONES_POR_FECHA();
        tfecha.setVisible(true);
    }//GEN-LAST:event_BtransaccionFechaActionPerformed

    private void BtransaccionRangoFechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtransaccionRangoFechaActionPerformed
        DE_TRANSACCIONES_RANGO_FECHA trangof = new DE_TRANSACCIONES_RANGO_FECHA();
        trangof.setVisible(true);
    }//GEN-LAST:event_BtransaccionRangoFechaActionPerformed

    private void BtransaccionDocumentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtransaccionDocumentoActionPerformed
        DE_TRANSACCIONES_POR_DOCUMENTO tdoc = new DE_TRANSACCIONES_POR_DOCUMENTO();
        tdoc.setVisible(true);
    }//GEN-LAST:event_BtransaccionDocumentoActionPerformed

    private void BbalanzaGeneralActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BbalanzaGeneralActionPerformed
        BALANZA_GENERAL balanzag = new BALANZA_GENERAL();
        balanzag.setVisible(true);
    }//GEN-LAST:event_BbalanzaGeneralActionPerformed

    private void BbalanzaComprobacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BbalanzaComprobacionActionPerformed
        BALANZA_DE_COMPROBACION balanzac = new BALANZA_DE_COMPROBACION();
        balanzac.setVisible(true);
    }//GEN-LAST:event_BbalanzaComprobacionActionPerformed

    private void BresumenGastosGeneralesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BresumenGastosGeneralesActionPerformed
        RESUMEN_DE_GASTOS_GENERALES resumen = new RESUMEN_DE_GASTOS_GENERALES();
        resumen.setVisible(true);
    }//GEN-LAST:event_BresumenGastosGeneralesActionPerformed

    private void BestadoGananciasPerdidasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BestadoGananciasPerdidasActionPerformed
        ESTADO_DE_GANANCIAS_Y_PERDIDAS estado = new ESTADO_DE_GANANCIAS_Y_PERDIDAS();
        estado.setVisible(true);
    }//GEN-LAST:event_BestadoGananciasPerdidasActionPerformed

    private void BsalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BsalirActionPerformed
        this.dispose();
    }//GEN-LAST:event_BsalirActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GENERAL_CONSULTAS().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BbalanzaComprobacion;
    private javax.swing.JButton BbalanzaGeneral;
    private javax.swing.JButton BcatalogoCuenta;
    private javax.swing.JButton BestadoGananciasPerdidas;
    private javax.swing.JButton BresumenGastosGenerales;
    private javax.swing.JButton Bsalir;
    private javax.swing.JButton BtransaccionDocumento;
    private javax.swing.JButton BtransaccionFecha;
    private javax.swing.JButton BtransaccionRangoFecha;
    private javax.swing.JButton BtransaccionTipoDocumento;
    private javax.swing.JPanel PanelPrincipal;
    // End of variables declaration//GEN-END:variables
}
