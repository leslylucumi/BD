/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import modelo.Veterinario;

/**
 *
 * @author angela_maria.marin
 */
public class ControlVeterinario {
      public boolean insertarVeterinario(Veterinario obje) {
        String sql="Insert into veterinarios (id_verinario,nombrev1,nombrev2,apellidov1,apellidov2,edadv,correov,telv1,telv2,dirv)"+
                "value('"+obje.getId_veterinario()+"','"+obje.getNombrev1()+"', '"+obje.getNombrev2()+"', '"+obje.getApellidov1()+"', '"+
                obje.getApellidov2()+"', '"+obje.getEdadv()+"', '"+obje.getCorreov()+"', '"+obje.getTelv1()+"', '"+obje.getTelv2()+"', '"+obje.getDirv()+"')";
        
        boolean f=false;
        f=obje.insertarVeterinario(sql);
        
        return f;
    }
}
