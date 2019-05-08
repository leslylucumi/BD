/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import modelo.Alimentacion;


/**
 *
 * @author Usuario
 */
public class ControlAlimentacion {
    public LinkedList<Alimentacion> consultarAlimentacion(){
        LinkedList<Alimentacion> le=new LinkedList<>();
        ResultSet rs;
        Alimentacion obje=new Alimentacion();
        String sql="select * from tipo_alimentacion";
        rs=obje.consultarAlimentacion(sql);
        int id;
        String e;
        
        if(rs!=null){
            try{
            while (rs.next()) {                
                id=rs.getInt("id_tipo_alimentacion");
                e=rs.getString("nombre_alimento");
                obje=new Alimentacion(id, e);
                le.add(obje);
            }
            }catch(SQLException se){
                
            }
    
        }
        
        return le;
    }
}
