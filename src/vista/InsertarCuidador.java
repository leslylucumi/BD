/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import control.ControlCuidador;
import modelo.Cuidador;

/**
 *
 * @author Acer
 */
public class InsertarCuidador extends javax.swing.JFrame {

    /**
     * Creates new form Insertarcuidador
     */
    public InsertarCuidador() {
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

        jTextField7 = new javax.swing.JTextField();
        jTextField8 = new javax.swing.JTextField();
        jTextField11 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        Jnombrec1 = new javax.swing.JTextField();
        Jnombrec2 = new javax.swing.JTextField();
        Japellidoc2 = new javax.swing.JTextField();
        Japellidoc1 = new javax.swing.JTextField();
        Jtelefonoc1 = new javax.swing.JTextField();
        Jcorreoc = new javax.swing.JTextField();
        Jdireccionc = new javax.swing.JTextField();
        Jtelefonoc2 = new javax.swing.JTextField();
        Jedadc = new javax.swing.JTextField();
        Bagregarcuidador = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        Jidcuidador = new javax.swing.JTextField();
        Batrascuidador = new javax.swing.JButton();
        Bcerrarcuidador = new javax.swing.JButton();
        Blimpiarcuidador = new javax.swing.JButton();

        jTextField7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField7ActionPerformed(evt);
            }
        });

        jTextField8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField8ActionPerformed(evt);
            }
        });

        jTextField11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField11ActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Primer nombre");

        jLabel2.setText("Segundo nombre");

        jLabel3.setText("Primer apellido");

        jLabel4.setText("Segundo apellido");

        jLabel5.setText("Dirección");

        jLabel6.setText("Telefono2");

        jLabel7.setText("Telefono1");

        jLabel8.setText("Correo");

        jLabel9.setText("Edad");

        Jnombrec1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Jnombrec1ActionPerformed(evt);
            }
        });

        Jnombrec2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Jnombrec2ActionPerformed(evt);
            }
        });

        Japellidoc2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Japellidoc2ActionPerformed(evt);
            }
        });

        Japellidoc1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Japellidoc1ActionPerformed(evt);
            }
        });

        Jtelefonoc1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Jtelefonoc1ActionPerformed(evt);
            }
        });

        Jcorreoc.setToolTipText("");
        Jcorreoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JJcorreocActionPerformed(evt);
            }
        });

        Jdireccionc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JdireccioncActionPerformed(evt);
            }
        });

        Jtelefonoc2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Jtelefonoc2ActionPerformed(evt);
            }
        });

        Jedadc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JedadcActionPerformed(evt);
            }
        });

        Bagregarcuidador.setText("Insertar");
        Bagregarcuidador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BagregarcuidadorActionPerformed(evt);
            }
        });

        jLabel10.setText("Identificación");

        Jidcuidador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JidcuidadorActionPerformed(evt);
            }
        });

        Batrascuidador.setText("Atras");
        Batrascuidador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BatrascuidadorActionPerformed(evt);
            }
        });

        Bcerrarcuidador.setText("Cerrar");
        Bcerrarcuidador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BcerrarcuidadorActionPerformed(evt);
            }
        });

        Blimpiarcuidador.setText("Limpiar");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(Jnombrec2, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel9))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Jedadc, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Japellidoc2, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Japellidoc1, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Jidcuidador, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Jnombrec1, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(jLabel7))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Jcorreoc, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Jtelefonoc1, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(18, 18, 18)
                        .addComponent(Jtelefonoc2, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(jLabel5)
                        .addGap(18, 18, 18)
                        .addComponent(Jdireccionc, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(49, 49, 49))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(134, 134, 134)
                        .addComponent(Bagregarcuidador)
                        .addGap(47, 47, 47)
                        .addComponent(Batrascuidador))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel10)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Blimpiarcuidador)
                    .addComponent(Bcerrarcuidador))
                .addGap(18, 18, 18))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(Jidcuidador, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addGap(37, 37, 37)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(Japellidoc1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel6)
                                    .addComponent(Jtelefonoc2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(Jnombrec1, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Jcorreoc, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel2)
                                    .addComponent(Jnombrec2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel7)
                                    .addComponent(Jtelefonoc1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4)
                        .addGap(15, 15, 15))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(Jdireccionc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Japellidoc2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(8, 8, 8)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addComponent(Jedadc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Bagregarcuidador)
                            .addComponent(Batrascuidador))
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Blimpiarcuidador)
                        .addGap(35, 35, 35)))
                .addComponent(Bcerrarcuidador)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Jnombrec1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Jnombrec1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Jnombrec1ActionPerformed

    private void Jnombrec2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Jnombrec2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Jnombrec2ActionPerformed

    private void Japellidoc2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Japellidoc2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Japellidoc2ActionPerformed

    private void Japellidoc1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Japellidoc1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Japellidoc1ActionPerformed

    private void Jtelefonoc1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Jtelefonoc1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Jtelefonoc1ActionPerformed

    private void JJcorreocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JJcorreocActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JJcorreocActionPerformed

    private void jTextField7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField7ActionPerformed

    private void jTextField8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField8ActionPerformed

    private void JdireccioncActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JdireccioncActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JdireccioncActionPerformed

    private void Jtelefonoc2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Jtelefonoc2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Jtelefonoc2ActionPerformed

    private void jTextField11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField11ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField11ActionPerformed

    private void JedadcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JedadcActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JedadcActionPerformed

    private void BagregarcuidadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BagregarcuidadorActionPerformed
     String nombrec1;
     String nombrec2;
     String apellidoc1;
     String apellidoc2;
     int edadc;
     String correoc;
     String telc1;
     String telc2;
     String dirc;
     int id_cuidador;
     
     id_cuidador=Integer.parseInt(Jidcuidador.getText());
     nombrec1=Jnombrec1.getText();
     nombrec2=Jnombrec2.getText();
     apellidoc1=Japellidoc1.getText();
     apellidoc2=Japellidoc2.getText();
     edadc=Integer.parseInt(Jedadc.getText());
     correoc=Jcorreoc.getText();
     telc1=Jtelefonoc1.getText();
     telc2=Jtelefonoc2.getText();
     dirc = Jdireccionc.getText();
     
       ControlCuidador objce=new ControlCuidador();
       Cuidador objc=new Cuidador(id_cuidador,nombrec1,nombrec2,apellidoc1,apellidoc2,edadc,correoc,telc1,telc2,dirc);
        boolean f=objce.insertarCuidador(objc);
        
        if(f){
            
            System.out.println("Se inserto el cuidador");
        }else{
            System.out.println("No se inserto el cuidador");
        }
                                         
    }//GEN-LAST:event_BagregarcuidadorActionPerformed

    private void JidcuidadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JidcuidadorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JidcuidadorActionPerformed

    private void BatrascuidadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BatrascuidadorActionPerformed
        Menu abrir = new Menu();
        abrir.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_BatrascuidadorActionPerformed

    private void BcerrarcuidadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BcerrarcuidadorActionPerformed
        System.exit(0);
    }//GEN-LAST:event_BcerrarcuidadorActionPerformed

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
            java.util.logging.Logger.getLogger(InsertarCuidador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InsertarCuidador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InsertarCuidador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InsertarCuidador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InsertarCuidador().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Bagregarcuidador;
    private javax.swing.JButton Batrascuidador;
    private javax.swing.JButton Bcerrarcuidador;
    private javax.swing.JButton Blimpiarcuidador;
    private javax.swing.JTextField Japellidoc1;
    private javax.swing.JTextField Japellidoc2;
    private javax.swing.JTextField Jcorreoc;
    private javax.swing.JTextField Jdireccionc;
    private javax.swing.JTextField Jedadc;
    private javax.swing.JTextField Jidcuidador;
    private javax.swing.JTextField Jnombrec1;
    private javax.swing.JTextField Jnombrec2;
    private javax.swing.JTextField Jtelefonoc1;
    private javax.swing.JTextField Jtelefonoc2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    // End of variables declaration//GEN-END:variables
}
