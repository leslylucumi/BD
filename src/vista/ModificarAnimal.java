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
import java.util.LinkedList;
import modelo.Alimentacion;
import modelo.Animal;
import modelo.Especie;
import modelo.Habitat;

/**
 *
 * @author LeslyLC
 */
public class ModificarAnimal extends javax.swing.JFrame {

    LinkedList<Especie> le;
    LinkedList<Habitat> lh;
    LinkedList<Alimentacion> lA;
    String esp;
    String habi;
    String alim;
    int id_animal;

    /**
     * Creates new form ModificarAnimal
     */
    public ModificarAnimal() {
        initComponents();
        Jedad.setEnabled(false);
        Jimgca.setEnabled(false);
        Jimgcua.setEnabled(false);
        Jimga.setEnabled(false);
        Jgeneroa.setEnabled(false);
        Jdescripa.setEnabled(false);
        Jnombre.setEnabled(false);
        Jpesoa.setEnabled(false);
        jComboBoxEspecia.setEnabled(false);
        jComboBox3.setEnabled(false);
        JcomboboxHabitat.setEnabled(false);
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

        Bcerraranimal = new javax.swing.JButton();
        Baceptaranimal = new javax.swing.JButton();
        Blimpiaranimal = new javax.swing.JButton();
        jComboBox3 = new javax.swing.JComboBox();
        JcomboboxHabitat = new javax.swing.JComboBox();
        Jedad = new javax.swing.JTextField();
        Jimgca = new javax.swing.JTextField();
        Jimgcua = new javax.swing.JTextField();
        Jid = new javax.swing.JTextField();
        Jimga = new javax.swing.JTextField();
        Jdescripa = new javax.swing.JTextField();
        Jgeneroa = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        Jpesoa = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        Jnombre = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jComboBoxEspecia = new javax.swing.JComboBox();
        Batrasanimal = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        Bmodificaranimal1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Bcerraranimal.setText("Cerrar");
        Bcerraranimal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BcerraranimalActionPerformed(evt);
            }
        });

        Baceptaranimal.setText("Aceptar");
        Baceptaranimal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BaceptaranimalActionPerformed(evt);
            }
        });

        Blimpiaranimal.setText("Limpiar");
        Blimpiaranimal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BlimpiaranimalActionPerformed(evt);
            }
        });

        jLabel1.setText("Edad");

        jLabel2.setText("img");

        jLabel3.setText("img2");

        jLabel4.setText("img3");

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel9.setText("MODIFICAR ANIMAL");

        jLabel10.setText("Especie");

        jLabel5.setText("Género");

        jLabel11.setText("Alimentación");

        jLabel6.setText("Descripción");

        jLabel7.setText("Nombre");

        jLabel8.setText("Peso");

        jComboBoxEspecia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxEspeciaActionPerformed(evt);
            }
        });

        Batrasanimal.setText("Atras");
        Batrasanimal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BatrasanimalActionPerformed(evt);
            }
        });

        jLabel12.setText("Id");

        Bmodificaranimal1.setText("Modificar");
        Bmodificaranimal1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Bmodificaranimal1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel3)
                            .addComponent(jLabel8)
                            .addComponent(jLabel6)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4)
                            .addComponent(jLabel7)
                            .addComponent(jLabel1)
                            .addComponent(jLabel12))
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Jid, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(Jimga, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(Jimgcua, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(Jdescripa, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(Jgeneroa, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(Jnombre, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(Jpesoa, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(Jedad, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Jimgca, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(103, 103, 103)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel10)
                                            .addComponent(jLabel11))
                                        .addGap(23, 23, 23)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jComboBoxEspecia, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(JcomboboxHabitat, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(Baceptaranimal)
                                            .addComponent(Batrasanimal))
                                        .addGap(53, 53, 53)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(Bcerraranimal)
                                            .addComponent(Blimpiaranimal)))))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Bmodificaranimal1)
                                .addGap(124, 124, 124))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addGap(188, 188, 188)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Jid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(Jedad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(Jimgca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(9, 9, 9)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(Jimgcua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(Jimga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                            .addComponent(jLabel8))
                        .addGap(18, 18, 18))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel9)
                        .addGap(48, 48, 48)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(jComboBoxEspecia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(35, 35, 35)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(32, 32, 32)
                        .addComponent(JcomboboxHabitat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(44, 44, 44)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Baceptaranimal)
                            .addComponent(Blimpiaranimal))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Bmodificaranimal1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Bcerraranimal)
                    .addComponent(Batrasanimal))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {

        ControlEspecie objce = new ControlEspecie();
        le = objce.consultarEspecies();

        for (int i = 0; i < le.size(); i++) {
            jComboBoxEspecia.addItem(le.get(i).getNombreE());

        }

        ControlHabitat objch = new ControlHabitat();
        lh = objch.consultarHabitat();

        for (int i = 0; i < lh.size(); i++) {
            JcomboboxHabitat.addItem(lh.get(i).getNombreH());

        }

        ///////////
        ControlAlimentacion objcA = new ControlAlimentacion();
        lA = objcA.consultarAlimentacion();

        for (int i = 0; i < lA.size(); i++) {
            jComboBox3.addItem(lA.get(i).getNombreA());

        }
    }
    private void BcerraranimalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BcerraranimalActionPerformed
        System.exit(0);
    }//GEN-LAST:event_BcerraranimalActionPerformed

    private void BaceptaranimalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BaceptaranimalActionPerformed
        int id_animal;

        try {

            ControlAnimal obja = new ControlAnimal();
            id_animal = Integer.parseInt(Jid.getText());
            Animal objan = obja.ModificarAnimal(id_animal);
            Jedad.setText(objan.getEdad() + "");
            Jimgca.setText(objan.getImganimalcara());
            Jimgcua.setText(objan.getImganimalcuerpo());
            Jimga.setText(objan.getImganimal());
            Jgeneroa.setText(objan.getGenero());
            Jdescripa.setText(objan.getDescripcion());
            Jnombre.setText(objan.getNombre());
            Jpesoa.setText(objan.getPeso() + "");

            int id_Alimentacion = 0;
            int id_Especie = 0;
            int id_Habitat = 0;

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

            Jedad.setEnabled(true);
            Jimgca.setEnabled(true);
            Jimgcua.setEnabled(true);
            Jimga.setEnabled(true);
            Jgeneroa.setEnabled(true);
            Jdescripa.setEnabled(true);
            Jnombre.setEnabled(true);
            Jpesoa.setEnabled(true);
            jComboBoxEspecia.setEnabled(true);
            jComboBox3.setEnabled(true);
            JcomboboxHabitat.setEnabled(true);

        } catch (Exception e) {
            System.out.println("error" + e);
            e.printStackTrace();
        }


    }//GEN-LAST:event_BaceptaranimalActionPerformed

    private void BlimpiaranimalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BlimpiaranimalActionPerformed
        //cajadetexto1.setText(null);
        //cajadetexto2.setText("");
    }//GEN-LAST:event_BlimpiaranimalActionPerformed

    private void jComboBoxEspeciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxEspeciaActionPerformed

        // System.out.println("iten seleccionado "+jComboBox1.getSelectedItem());
    }//GEN-LAST:event_jComboBoxEspeciaActionPerformed

    private void BatrasanimalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BatrasanimalActionPerformed
        Menu abrir = new Menu();
        abrir.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_BatrasanimalActionPerformed

    private void Bmodificaranimal1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Bmodificaranimal1ActionPerformed
        id_animal = Integer.parseInt(Jid.getText());
        int edad = 0;
        String img_animalcara = null;
        String img_animalcuerpo = null;
        String img_animal = null;
        String genero = null;
        String descripcion = null;
        String nombre = null;
        Double peso = null;
        int id_especie_animal = 0;
        int id_habitat_animal = 0;
        int id_clasif_animal = 0;

        if (Jimga.getText() != "") {
            img_animal = Jimga.getText();
        }

        edad = Integer.parseInt(Jedad.getText());
        img_animalcara = Jimgca.getText();
        img_animalcuerpo = Jimgcua.getText();
        img_animal = Jimga.getText();
        genero = Jgeneroa.getText();
        descripcion = Jdescripa.getText();
        nombre = Jnombre.getText();
        peso = Double.parseDouble(Jpesoa.getText());
        int id_Alimentacion = 0;
        int id_Especie = 0;
        int id_Habitat = 0;

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

        ControlAnimal objm = new ControlAnimal();

        Animal obja = new Animal(edad, img_animalcara, img_animalcuerpo, img_animal, genero, descripcion, nombre, peso, id_Alimentacion,
        id_Especie, id_Habitat);

        try {
            boolean ch = objm.ModificarAnimales(obja, id_animal);
            if (ch) {
                System.out.println("Se modificó el animal");
            } else {
                System.out.println("No se modificó");
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }//GEN-LAST:event_Bmodificaranimal1ActionPerformed

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
            java.util.logging.Logger.getLogger(ModificarAnimal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ModificarAnimal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ModificarAnimal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ModificarAnimal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ModificarAnimal().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Baceptaranimal;
    private javax.swing.JButton Batrasanimal;
    private javax.swing.JButton Bcerraranimal;
    private javax.swing.JButton Blimpiaranimal;
    private javax.swing.JButton Bmodificaranimal1;
    private javax.swing.JComboBox JcomboboxHabitat;
    private javax.swing.JTextField Jdescripa;
    private javax.swing.JTextField Jedad;
    private javax.swing.JTextField Jgeneroa;
    private javax.swing.JTextField Jid;
    private javax.swing.JTextField Jimga;
    private javax.swing.JTextField Jimgca;
    private javax.swing.JTextField Jimgcua;
    private javax.swing.JTextField Jnombre;
    private javax.swing.JTextField Jpesoa;
    private javax.swing.JComboBox jComboBox3;
    private javax.swing.JComboBox jComboBoxEspecia;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    // End of variables declaration//GEN-END:variables
}
