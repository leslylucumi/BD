/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

/**
 *
 * @author Ángela
 */
public class OpcionesInsertar extends javax.swing.JFrame {

    /**
     * Creates new form Insertar
     */
    public OpcionesInsertar() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        Bcita = new javax.swing.JButton();
        Bcuidador = new javax.swing.JButton();
        Banimal = new javax.swing.JButton();
        Bcuidado = new javax.swing.JButton();
        Bveterinario = new javax.swing.JButton();
        Bconsultarcerrar = new javax.swing.JButton();
        Batrarconsultar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("INSERTAR");

        Bcita.setText("Cita");
        Bcita.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BcitaActionPerformed(evt);
            }
        });

        Bcuidador.setText("Cuidador");
        Bcuidador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BcuidadorActionPerformed(evt);
            }
        });

        Banimal.setText("Animal");
        Banimal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BanimalActionPerformed(evt);
            }
        });

        Bcuidado.setText("Cuidado");
        Bcuidado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BcuidadoActionPerformed(evt);
            }
        });

        Bveterinario.setText("Veterinario");
        Bveterinario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BveterinarioActionPerformed(evt);
            }
        });

        Bconsultarcerrar.setText("Cerrar");
        Bconsultarcerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BconsultarcerrarActionPerformed(evt);
            }
        });

        Batrarconsultar.setText("Atras");
        Batrarconsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BatrarconsultarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(145, 145, 145)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Bcuidado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Bveterinario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Banimal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Bcuidador, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Bcita, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(172, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(Batrarconsultar)
                .addGap(18, 18, 18)
                .addComponent(Bconsultarcerrar)
                .addGap(50, 50, 50))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(26, 26, 26)
                .addComponent(Bcita)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Bcuidador)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Banimal)
                .addGap(18, 18, 18)
                .addComponent(Bcuidado)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Bveterinario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Bconsultarcerrar)
                    .addComponent(Batrarconsultar))
                .addContainerGap(46, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BcitaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BcitaActionPerformed
        InsertarCita abrir = new InsertarCita();
        abrir.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_BcitaActionPerformed

    private void BconsultarcerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BconsultarcerrarActionPerformed
        System.exit(0);
    }//GEN-LAST:event_BconsultarcerrarActionPerformed

    private void BcuidadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BcuidadorActionPerformed
        InsertarCuidador abrir = new InsertarCuidador();
        abrir.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_BcuidadorActionPerformed

    private void BanimalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BanimalActionPerformed
        InsertarAnimal abrir = new InsertarAnimal();
        abrir.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_BanimalActionPerformed

    private void BcuidadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BcuidadoActionPerformed
        InsertarCuidados abrir = new InsertarCuidados();
        abrir.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_BcuidadoActionPerformed

    private void BveterinarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BveterinarioActionPerformed
        InsertarVeterinario abrir = new InsertarVeterinario();
        abrir.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_BveterinarioActionPerformed

    private void BatrarconsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BatrarconsultarActionPerformed
        Menu abrir = new Menu();
        abrir.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_BatrarconsultarActionPerformed

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
            java.util.logging.Logger.getLogger(OpcionesInsertar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(OpcionesInsertar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(OpcionesInsertar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(OpcionesInsertar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new OpcionesInsertar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Banimal;
    private javax.swing.JButton Batrarconsultar;
    private javax.swing.JButton Bcita;
    private javax.swing.JButton Bconsultarcerrar;
    private javax.swing.JButton Bcuidado;
    private javax.swing.JButton Bcuidador;
    private javax.swing.JButton Bveterinario;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
