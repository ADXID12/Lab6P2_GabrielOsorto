package PackagePrincipal;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.SpinnerNumberModel;

public class NuevoJugador extends javax.swing.JFrame {

    ArrayList<Jugador> jugadores = new ArrayList<>();

    public NuevoJugador() {
        initComponents();
        SpinnerNumberModel sp = new SpinnerNumberModel(15, 15, 35, 1);
        sp_EdadJugador.setModel(sp);
    }
    public void NuevoJugador(ArrayList<Jugador> jugadores) {
        this.jugadores = jugadores;
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pn_CrearJugador = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        tf_NombreJugador = new javax.swing.JTextField();
        sp_EdadJugador = new javax.swing.JSpinner();
        cb_PosicionJugador = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pn_CrearJugador.setBackground(new java.awt.Color(51, 51, 255));
        pn_CrearJugador.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Crear Jugador");
        pn_CrearJugador.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 40, -1, -1));

        jLabel2.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Nombre");
        pn_CrearJugador.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, -1, -1));

        jLabel3.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Edad");
        pn_CrearJugador.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, -1, -1));

        jLabel4.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Posicion");
        pn_CrearJugador.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, -1, -1));
        pn_CrearJugador.add(tf_NombreJugador, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 100, 300, -1));
        pn_CrearJugador.add(sp_EdadJugador, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 140, 170, -1));

        cb_PosicionJugador.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Portero", "Defensa", "Mediocampista", "Delantero" }));
        pn_CrearJugador.add(cb_PosicionJugador, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 180, -1, -1));

        jButton1.setText("Agregar");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        pn_CrearJugador.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 230, 100, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pn_CrearJugador, javax.swing.GroupLayout.DEFAULT_SIZE, 473, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pn_CrearJugador, javax.swing.GroupLayout.DEFAULT_SIZE, 312, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        String NombreNuevoFutbolista = tf_NombreJugador.getText();
        String PosicionNuevoFutbolista = (String) cb_PosicionJugador.getSelectedItem();
        int EdadNuevoJugador = (int) sp_EdadJugador.getValue();
        Jugador nuevoJugador = (new Jugador(NombreNuevoFutbolista, PosicionNuevoFutbolista, EdadNuevoJugador));
        jugadores.add(nuevoJugador);
        JOptionPane.showMessageDialog(pn_CrearJugador, "Jugador Agregado Exitosamente");
        tf_NombreJugador.setText("");
        cb_PosicionJugador.setSelectedItem(0);
        sp_EdadJugador.setValue(15);
        Transferencias transfe = new Transferencias();
        transfe.Jugadores(jugadores);
        transfe.setVisible(true);
        transfe.Jugadores(jugadores);
        this.dispose();
    }//GEN-LAST:event_jButton1MouseClicked

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
            java.util.logging.Logger.getLogger(NuevoJugador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NuevoJugador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NuevoJugador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NuevoJugador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NuevoJugador().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cb_PosicionJugador;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel pn_CrearJugador;
    private javax.swing.JSpinner sp_EdadJugador;
    private javax.swing.JTextField tf_NombreJugador;
    // End of variables declaration//GEN-END:variables
}
