package PackagePrincipal;

public class FormPrincipal extends javax.swing.JFrame {

    public FormPrincipal() {
        initComponents();
        this.setResizable(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        perdonMirey = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jToolBar1 = new javax.swing.JToolBar();
        jMenuBar2 = new javax.swing.JMenuBar();
        mb_Opciones = new javax.swing.JMenu();
        mi_CrearEquipos = new javax.swing.JMenuItem();
        mi_CrearJugadores = new javax.swing.JMenuItem();
        Transferencias = new javax.swing.JMenuItem();
        mb_Ayuda = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(51, 153, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        perdonMirey.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Portada Jueguit.png"))); // NOI18N
        jPanel1.add(perdonMirey, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 70, 210, 340));

        jLabel1.setFont(new java.awt.Font("Arial Narrow", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("BIENVENIDO A BOROA LEAGUE FANTASY");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 420, -1, -1));

        jToolBar1.setBackground(new java.awt.Color(51, 153, 255));
        jToolBar1.setRollover(true);
        jPanel1.add(jToolBar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 20, 330, 30));

        jMenuBar2.setBackground(new java.awt.Color(0, 0, 153));

        mb_Opciones.setBackground(new java.awt.Color(255, 255, 255));
        mb_Opciones.setText("Opciones");
        mb_Opciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mb_OpcionesActionPerformed(evt);
            }
        });

        mi_CrearEquipos.setText("Crear Equipos");
        mi_CrearEquipos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mi_CrearEquiposActionPerformed(evt);
            }
        });
        mb_Opciones.add(mi_CrearEquipos);

        mi_CrearJugadores.setText("Crear Jugadores");
        mi_CrearJugadores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mi_CrearJugadoresActionPerformed(evt);
            }
        });
        mb_Opciones.add(mi_CrearJugadores);

        Transferencias.setText("Transferencias");
        Transferencias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TransferenciasActionPerformed(evt);
            }
        });
        mb_Opciones.add(Transferencias);

        jMenuBar2.add(mb_Opciones);

        mb_Ayuda.setBackground(new java.awt.Color(255, 255, 255));
        mb_Ayuda.setText("Ayuda");
        jMenuBar2.add(mb_Ayuda);

        setJMenuBar(jMenuBar2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 497, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mb_OpcionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mb_OpcionesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mb_OpcionesActionPerformed

    private void mi_CrearEquiposActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mi_CrearEquiposActionPerformed
        NuevoEquipo ventana2= new NuevoEquipo();
        ventana2.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_mi_CrearEquiposActionPerformed

    private void mi_CrearJugadoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mi_CrearJugadoresActionPerformed
        NuevoJugador ventana3= new NuevoJugador();
        ventana3.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_mi_CrearJugadoresActionPerformed

    private void TransferenciasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TransferenciasActionPerformed
        Transferencias ventana4= new Transferencias();
        ventana4.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_TransferenciasActionPerformed

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
            java.util.logging.Logger.getLogger(FormPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem Transferencias;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JMenu mb_Ayuda;
    private javax.swing.JMenu mb_Opciones;
    private javax.swing.JMenuItem mi_CrearEquipos;
    private javax.swing.JMenuItem mi_CrearJugadores;
    private javax.swing.JLabel perdonMirey;
    // End of variables declaration//GEN-END:variables
}
