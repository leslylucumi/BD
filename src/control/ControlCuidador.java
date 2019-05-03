/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import modelo.Cuidador;

/**
 *
 * @author Acer
 */
public class ControlCuidador {
      public boolean insertarCuidador(Cuidador obje) {
        String sql="Insert into cuidadores (id_cuidador,nombrec1,nombrec2,apellidoc1,apellidoc2,edadc,correoc,telc1,telc2,dirc)"+
                "value('"+obje.getId_cuidador()+"','"+obje.getNombrec1()+"', '"+obje.getNombrec2()+"', '"+obje.getApellidoc1()+"', '"+
                obje.getApellidoc2()+"', '"+obje.getEdadc()+"', '"+obje.getCorreoc()+"', '"+obje.getTelc1()+"', '"+obje.getTelc2()+"', '"+obje.getDirc()+"')";
        
        boolean f=false;
        f=obje.insertarCuidador(sql);
        
        return f;
    }
}
