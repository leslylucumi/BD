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

/**
 *
 * @author dacastro
 */
public class ControlEspecie {
    
    public LinkedList<Especie> consultarEspecies(){
        LinkedList<Especie> le=new LinkedList<>();
        ResultSet rs;
        Especie obje=new Especie();
        String sql="select * from especies";
        rs=obje.consultarEspecie(sql);
        int id;
        String e;
        
        if(rs!=null){
            try{
            while (rs.next()) {                
                id=rs.getInt("id_especie");
                e=rs.getString("nombre_especie");
                obje=new Especie(id, e);
                le.add(obje);
            }
            }catch(SQLException se){
                
            }
    
        }
        
        return le;
    }
    
}
