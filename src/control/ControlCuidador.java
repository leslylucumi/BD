/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.sql.ResultSet;
import modelo.ConnectBD;
import modelo.Cuidador;


/**
 *
 * @author Acer
 */
public class ControlCuidador {
      public boolean insertarCuidador(Cuidador objc) {
       String sql = "{ call agregarCuidador(?,?,?,?,?,?,?,?,?,?) }";
        boolean f = false;
         f=objc.insertarCuidador(sql, objc);
        return f;
  
       
    }
      
      public Cuidador ModificarVeterinario(int id_Cuidador) {
          ConnectBD objCon = new ConnectBD();
          String sql = "select * from veterinarios where id_cuidador=" + id_Cuidador + "";
        ResultSet rs = null;
        Cuidador objv = null;
      
      }
}
