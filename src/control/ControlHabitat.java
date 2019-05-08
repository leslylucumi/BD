/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import modelo.Especie;
import modelo.Habitat;

/**
 *
 * @author germanny.lezama
 */
public class ControlHabitat {
      public LinkedList<Habitat> consultarHabitat() {
           LinkedList<Habitat> le=new LinkedList<>();
        ResultSet rs;
        Habitat obje=new Habitat();
        String sql="select * from habitats";
        rs=obje.consultarhabitat(sql);
        int id;
        String e;
        
        if(rs!=null){
            try{
            while (rs.next()) {                
                id=rs.getInt("id_habitat");
                e=rs.getString("nombre_habitat");
                obje=new Habitat(id, e);
                le.add(obje);
            }
            }catch(SQLException se){
                
            }
    
        }
        
        return le;
    }
    
}
