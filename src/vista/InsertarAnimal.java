/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import control.ControlAlimentacion;
import control.ControlAnimal;
import control.ControlEspecie;
import control.ControlHabitat;
import java.io.File;
import java.util.LinkedList;
import javax.swing.JFileChooser;
import modelo.Alimentacion;
import modelo.Animal;
import modelo.Especie;
import modelo.Habitat;

/**
 *
 * @author Acer
 */
public class InsertarAnimal extends javax.swing.JFrame {

    /**
     * Creates new form InsertarAnimal
     */
    LinkedList<Especie> le;
    LinkedList<Habitat> lh;
    LinkedList<Alimentacion> lA;
    String esp;
    String habi;
    String alim;

    public InsertarAnimal() {
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

        jComboBox2 = new javax.swing.JComboBox();
        Jedada5 = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox();
        Batrasanimal = new javax.swing.JButton();
        Bcerraranimal = new javax.swing.JButton();
        Bagregaranimal = new javax.swing.JButton();
        Blimpiaranimal = new javax.swing.JButton();
        jComboBox3 = new javax.swing.JComboBox();
        jComboBox4 = new javax.swing.JComboBox();
        Jedada = new javax.swing.JTextField();
        rutaimgcara = new javax.swing.JTextField();
        rutaimgcuerpo = new javax.swing.JTextField();
        Jid = new javax.swing.JTextField();
        rutaimgopcional = new javax.swing.JTextField();
        Jdescripa = new javax.swing.JTextField();
        Jgeneroa = new javax.swing.JTextField();
        Jpesoa = new javax.swing.JTextField();
        Jnombre = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
<<<<<<< HEAD
        Babririmgcara = new javax.swing.JButton();
        Babririmgcuerpo = new javax.swing.JButton();
        Babririmgopcional = new javax.swing.JButton();
=======
        jLabel13 = new javax.swing.JLabel();

        jLabel12.setText("Especie");
>>>>>>> a269ce45d184f425bbf9d305f2ed9b43f6f03248

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel1.setText("Edad");

        jLabel2.setText("img");

        jLabel3.setText("img2");

        jLabel4.setText("img3");

        jLabel5.setText("Género");

        jLabel6.setText("Descripción");

        jLabel7.setText("Nombre");

        jLabel8.setText("Peso");

        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        Batrasanimal.setText("Atras");
        Batrasanimal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BatrasanimalActionPerformed(evt);
            }
        });

        Bcerraranimal.setText("Cerrar");
        Bcerraranimal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BcerraranimalActionPerformed(evt);
            }
        });

        Bagregaranimal.setText("Agregar");
        Bagregaranimal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BagregaranimalActionPerformed(evt);
            }
        });

        Blimpiaranimal.setText("Limpiar");
        Blimpiaranimal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BlimpiaranimalActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel9.setText("INSERTAR ANIMAL");

        jLabel10.setText("Especie");

        jLabel11.setText("Alimentación");

<<<<<<< HEAD
        Babririmgcara.setText("Abrir");
        Babririmgcara.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BabririmgcaraActionPerformed(evt);
            }
        });

        Babririmgcuerpo.setText("Abrir");
        Babririmgcuerpo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BabririmgcuerpoActionPerformed(evt);
            }
        });

        Babririmgopcional.setText("Abrir");
        Babririmgopcional.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BabririmgopcionalActionPerformed(evt);
            }
        });
=======
        jLabel13.setText("Habitad");
>>>>>>> a269ce45d184f425bbf9d305f2ed9b43f6f03248

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(248, 248, 248)
                        .addComponent(jLabel9))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel3)
                            .addComponent(jLabel8)
                            .addComponent(jLabel6)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4)
                            .addComponent(jLabel7)
                            .addComponent(jLabel1))
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
<<<<<<< HEAD
                                    .addComponent(Jid, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Jedada, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(rutaimgopcional, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(rutaimgcuerpo, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(Jdescripa, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(Jgeneroa, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(Jnombre, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(Jpesoa, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(Babririmgcuerpo)
                                            .addComponent(Babririmgopcional))))
                                .addGap(24, 24, 24)
=======
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel11)
                                    .addComponent(jLabel13))
                                .addGap(23, 23, 23)
>>>>>>> a269ce45d184f425bbf9d305f2ed9b43f6f03248
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel10)
                                            .addComponent(jLabel11))
                                        .addGap(23, 23, 23)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jComboBox4, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(Bagregaranimal)
                                            .addComponent(Batrasanimal))
                                        .addGap(53, 53, 53)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(Bcerraranimal)
                                            .addComponent(Blimpiaranimal)))))
                            .addGroup(layout.createSequentialGroup()
<<<<<<< HEAD
                                .addComponent(rutaimgcara, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Babririmgcara)))))
                .addContainerGap(42, Short.MAX_VALUE))
=======
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Bagregaranimal)
                                    .addComponent(Batrasanimal))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(6, 6, 6)
                                        .addComponent(Bcerraranimal))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(1, 1, 1)
                                        .addComponent(Blimpiaranimal)))))))
                .addContainerGap(55, Short.MAX_VALUE))
>>>>>>> a269ce45d184f425bbf9d305f2ed9b43f6f03248
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(35, 35, 35)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jComboBox4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13))
                        .addGap(44, 44, 44)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Bagregaranimal)
                            .addComponent(Blimpiaranimal)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(Jid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(Jedada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(rutaimgcara, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Babririmgcara))
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(rutaimgcuerpo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Babririmgcuerpo))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(rutaimgopcional, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Babririmgopcional))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Jgeneroa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(Jdescripa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6))))
                        .addGap(8, 8, 8)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(Jnombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Jpesoa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Bcerraranimal)
                    .addComponent(Batrasanimal))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened

        ControlEspecie objce = new ControlEspecie();
        le = objce.consultarEspecies();

        for (int i = 0; i < le.size(); i++) {
            jComboBox1.addItem(le.get(i).getNombreE());

        }

        ControlHabitat objch = new ControlHabitat();
        lh = objch.consultarHabitat();

        for (int i = 0; i < lh.size(); i++) {
            jComboBox4.addItem(lh.get(i).getNombreH());

        }

        ///////////
        ControlAlimentacion objcA = new ControlAlimentacion();
        lA = objcA.consultarAlimentacion();

        for (int i = 0; i < lA.size(); i++) {
            jComboBox3.addItem(lA.get(i).getNombreA());

        }
    }//GEN-LAST:event_formWindowOpened

    private void BatrasanimalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BatrasanimalActionPerformed
        Menu abrir = new Menu();
        abrir.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_BatrasanimalActionPerformed

    private void BcerraranimalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BcerraranimalActionPerformed
        System.exit(0);
    }//GEN-LAST:event_BcerraranimalActionPerformed

    private void BlimpiaranimalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BlimpiaranimalActionPerformed
        //cajadetexto1.setText(null);
        //cajadetexto2.setText("");
    }//GEN-LAST:event_BlimpiaranimalActionPerformed

    private void BagregaranimalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BagregaranimalActionPerformed

        String temp;
        String temp2;
        String temp3;
        int id_animal;
        int edad;
        String imganimalcara;
        String imganimalcuerpo;
        String imganimal;
        String genero;
        String descripcion;
        String nombre;
        double peso;
        int id_Especie;
        int id_Habitat;
        int id_Alimentacion;
        id_Alimentacion = 0;
        id_Especie = 0;
        id_Habitat = 0;

        for (int i = 0; i < le.size(); i++) {
            if (esp.equals(le.get(i).getNombreE())) {
                id_Especie = le.get(i).getId();
            }
        }

        for (int i = 0; i < lA.size(); i++) {
            if (alim.equals(lA.get(i).getNombreA())) {
            id_Alimentacion = lA.get(i).getId();
            }
        }

        for (int i = 0; i < lh.size(); i++) {
            if (habi.equals(lh.get(i).getNombreH())) {
                id_Habitat = lh.get(i).getId();
            }
        }
        ///// 
        id_animal = Integer.parseInt(Jid.getText());
        edad = Integer.parseInt(Jedada.getText());
        imganimalcara = rutaimgcara.getText();
        imganimalcuerpo = rutaimgcuerpo.getText();
        imganimal = rutaimgopcional.getText();
        genero = Jgeneroa.getText();
        descripcion = Jdescripa.getText();
        nombre = Jnombre.getText();
        peso = Double.parseDouble(Jpesoa.getText());

        ControlAnimal objca = new ControlAnimal();
        Animal obje = new Animal(id_animal, edad, imganimalcara, imganimalcuerpo, imganimal, genero, descripcion, nombre, peso, id_Especie, id_Habitat, id_Alimentacion);
        boolean f = objca.insertarAnimal(obje);

        if (f) {

            System.out.println("Se inserto el Animal");
        } else {
            System.out.println("No se inserto el Animal");
        }

    }//GEN-LAST:event_BagregaranimalActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        esp = (String) jComboBox1.getSelectedItem();
        alim = (String) jComboBox3.getSelectedItem();
        habi = (String) jComboBox4.getSelectedItem();
        // System.out.println("iten seleccionado "+jComboBox1.getSelectedItem());
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void BabririmgcaraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BabririmgcaraActionPerformed
        JFileChooser jf = new JFileChooser();
        jf.showOpenDialog(this);
        File archivo = jf.getSelectedFile();
        
        if(archivo != null){
            rutaimgcara.setText(archivo.getAbsolutePath());
        }
        
    }//GEN-LAST:event_BabririmgcaraActionPerformed

    private void BabririmgcuerpoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BabririmgcuerpoActionPerformed
        JFileChooser jf = new JFileChooser();
        jf.showOpenDialog(this);
        File archivo = jf.getSelectedFile();
        
        if(archivo != null){
            rutaimgcuerpo.setText(archivo.getAbsolutePath());
        }
    }//GEN-LAST:event_BabririmgcuerpoActionPerformed

    private void BabririmgopcionalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BabririmgopcionalActionPerformed
        JFileChooser jf = new JFileChooser();
        jf.showOpenDialog(this);
        File archivo = jf.getSelectedFile();
        
        if(archivo != null){
            rutaimgopcional.setText(archivo.getAbsolutePath());
        }  
        
    }//GEN-LAST:event_BabririmgopcionalActionPerformed

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
            java.util.logging.Logger.getLogger(InsertarAnimal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InsertarAnimal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InsertarAnimal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InsertarAnimal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InsertarAnimal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Babririmgcara;
    private javax.swing.JButton Babririmgcuerpo;
    private javax.swing.JButton Babririmgopcional;
    private javax.swing.JButton Bagregaranimal;
    private javax.swing.JButton Batrasanimal;
    private javax.swing.JButton Bcerraranimal;
    private javax.swing.JButton Blimpiaranimal;
    private javax.swing.JTextField Jdescripa;
    private javax.swing.JTextField Jedada;
    private javax.swing.JTextField Jedada5;
    private javax.swing.JTextField Jgeneroa;
    private javax.swing.JTextField Jid;
    private javax.swing.JTextField Jnombre;
    private javax.swing.JTextField Jpesoa;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JComboBox jComboBox2;
    private javax.swing.JComboBox jComboBox3;
    private javax.swing.JComboBox jComboBox4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField rutaimgcara;
    private javax.swing.JTextField rutaimgcuerpo;
    private javax.swing.JTextField rutaimgopcional;
    // End of variables declaration//GEN-END:variables
}
